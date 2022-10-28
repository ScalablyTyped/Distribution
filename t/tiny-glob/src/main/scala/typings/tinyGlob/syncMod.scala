package typings.tinyGlob

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object syncMod {
  
  inline def apply(str: String): js.Array[FilePath] = ^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[FilePath]]
  inline def apply(str: String, opts: Options): js.Array[FilePath] = (^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[FilePath]]
  
  @JSImport("tiny-glob/sync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type FilePath = String
  
  trait Options extends StObject {
    
    var absolute: js.UndefOr[Boolean] = js.undefined
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var dot: js.UndefOr[Boolean] = js.undefined
    
    var filesOnly: js.UndefOr[Boolean] = js.undefined
    
    var flush: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAbsolute(value: Boolean): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
      
      inline def setAbsoluteUndefined: Self = StObject.set(x, "absolute", js.undefined)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setDot(value: Boolean): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      inline def setDotUndefined: Self = StObject.set(x, "dot", js.undefined)
      
      inline def setFilesOnly(value: Boolean): Self = StObject.set(x, "filesOnly", value.asInstanceOf[js.Any])
      
      inline def setFilesOnlyUndefined: Self = StObject.set(x, "filesOnly", js.undefined)
      
      inline def setFlush(value: Boolean): Self = StObject.set(x, "flush", value.asInstanceOf[js.Any])
      
      inline def setFlushUndefined: Self = StObject.set(x, "flush", js.undefined)
    }
  }
}
