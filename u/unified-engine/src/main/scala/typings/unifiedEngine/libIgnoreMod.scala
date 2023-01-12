package typings.unifiedEngine

import typings.unifiedEngine.libFindUpMod.FindUp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIgnoreMod {
  
  @JSImport("unified-engine/lib/ignore", "Ignore")
  @js.native
  open class Ignore protected () extends StObject {
    /**
      * @param {Options} options
      */
    def this(options: Options) = this()
    
    /**
      * @param {string} filePath
      * @param {Callback} callback
      */
    def check(filePath: String, callback: Callback): Unit = js.native
    
    /** @type {string} */
    var cwd: String = js.native
    
    /** @type {FindUp<IgnoreConfig>} */
    var findUp: FindUp[IgnoreConfig] = js.native
    
    /** @type {ResolveFrom|undefined} */
    var ignorePathResolveFrom: js.UndefOr[ResolveFrom] = js.native
  }
  
  type Callback = js.Function2[/* error */ js.Error | Null, /* result */ js.UndefOr[Boolean], Any]
  
  @js.native
  trait IgnoreConfig extends Ignore {
    
    var filePath: String = js.native
  }
  
  trait Options extends StObject {
    
    var cwd: String
    
    var detectIgnore: js.UndefOr[Boolean] = js.undefined
    
    var ignoreName: js.UndefOr[String] = js.undefined
    
    var ignorePath: js.UndefOr[String] = js.undefined
    
    var ignorePathResolveFrom: js.UndefOr[ResolveFrom] = js.undefined
  }
  object Options {
    
    inline def apply(cwd: String): Options = {
      val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setDetectIgnore(value: Boolean): Self = StObject.set(x, "detectIgnore", value.asInstanceOf[js.Any])
      
      inline def setDetectIgnoreUndefined: Self = StObject.set(x, "detectIgnore", js.undefined)
      
      inline def setIgnoreName(value: String): Self = StObject.set(x, "ignoreName", value.asInstanceOf[js.Any])
      
      inline def setIgnoreNameUndefined: Self = StObject.set(x, "ignoreName", js.undefined)
      
      inline def setIgnorePath(value: String): Self = StObject.set(x, "ignorePath", value.asInstanceOf[js.Any])
      
      inline def setIgnorePathResolveFrom(value: ResolveFrom): Self = StObject.set(x, "ignorePathResolveFrom", value.asInstanceOf[js.Any])
      
      inline def setIgnorePathResolveFromUndefined: Self = StObject.set(x, "ignorePathResolveFrom", js.undefined)
      
      inline def setIgnorePathUndefined: Self = StObject.set(x, "ignorePath", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.unifiedEngine.unifiedEngineStrings.cwd
    - typings.unifiedEngine.unifiedEngineStrings.dir
  */
  trait ResolveFrom extends StObject
  object ResolveFrom {
    
    inline def cwd: typings.unifiedEngine.unifiedEngineStrings.cwd = "cwd".asInstanceOf[typings.unifiedEngine.unifiedEngineStrings.cwd]
    
    inline def dir: typings.unifiedEngine.unifiedEngineStrings.dir = "dir".asInstanceOf[typings.unifiedEngine.unifiedEngineStrings.dir]
  }
}
