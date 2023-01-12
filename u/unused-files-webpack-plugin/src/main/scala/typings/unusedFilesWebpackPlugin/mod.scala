package typings.unusedFilesWebpackPlugin

import typings.unusedFilesWebpackPlugin.anon.Ignore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped webpack.anon.Apply | (this : webpack.webpack.Resolver, arg1 : webpack.webpack.Resolver): void */ @JSImport("unused-files-webpack-plugin", "UnusedFilesWebpackPlugin")
  @js.native
  open class UnusedFilesWebpackPlugin protected () extends StObject {
    def this(options: Options) = this()
  }
  
  trait Options extends StObject {
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var failOnUnused: Boolean
    
    var globOptions: js.UndefOr[Ignore] = js.undefined
    
    var ignore: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var patterns: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Options {
    
    inline def apply(failOnUnused: Boolean): Options = {
      val __obj = js.Dynamic.literal(failOnUnused = failOnUnused.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setFailOnUnused(value: Boolean): Self = StObject.set(x, "failOnUnused", value.asInstanceOf[js.Any])
      
      inline def setGlobOptions(value: Ignore): Self = StObject.set(x, "globOptions", value.asInstanceOf[js.Any])
      
      inline def setGlobOptionsUndefined: Self = StObject.set(x, "globOptions", js.undefined)
      
      inline def setIgnore(value: String | js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setPatterns(value: js.Array[String]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
      
      inline def setPatternsUndefined: Self = StObject.set(x, "patterns", js.undefined)
      
      inline def setPatternsVarargs(value: String*): Self = StObject.set(x, "patterns", js.Array(value*))
    }
  }
}
