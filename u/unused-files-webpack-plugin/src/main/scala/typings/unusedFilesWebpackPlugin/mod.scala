package typings.unusedFilesWebpackPlugin

import typings.std.Plugin
import typings.unusedFilesWebpackPlugin.anon.Ignore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unused-files-webpack-plugin", "UnusedFilesWebpackPlugin")
  @js.native
  class UnusedFilesWebpackPlugin protected () extends Plugin {
    def this(options: Options) = this()
  }
  
  @js.native
  trait Options extends StObject {
    
    var cwd: js.UndefOr[String] = js.native
    
    var failOnUnused: Boolean = js.native
    
    var globOptions: js.UndefOr[Ignore] = js.native
    
    var ignore: js.UndefOr[String | js.Array[String]] = js.native
    
    var patterns: js.UndefOr[js.Array[String]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(failOnUnused: Boolean): Options = {
      val __obj = js.Dynamic.literal(failOnUnused = failOnUnused.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setFailOnUnused(value: Boolean): Self = StObject.set(x, "failOnUnused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobOptions(value: Ignore): Self = StObject.set(x, "globOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobOptionsUndefined: Self = StObject.set(x, "globOptions", js.undefined)
      
      @scala.inline
      def setIgnore(value: String | js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value :_*))
      
      @scala.inline
      def setPatterns(value: js.Array[String]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternsUndefined: Self = StObject.set(x, "patterns", js.undefined)
      
      @scala.inline
      def setPatternsVarargs(value: String*): Self = StObject.set(x, "patterns", js.Array(value :_*))
    }
  }
}
