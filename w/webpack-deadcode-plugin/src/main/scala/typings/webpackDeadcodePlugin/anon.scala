package typings.webpackDeadcodePlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Required<webpack-deadcode-plugin.webpack-deadcode-plugin.Options> */
  @js.native
  trait RequiredOptions extends StObject {
    
    var context: String = js.native
    
    var detectUnusedExport: Boolean = js.native
    
    var detectUnusedFiles: Boolean = js.native
    
    var exclude: js.Array[String] = js.native
    
    var failOnHint: Boolean = js.native
    
    var outputFile: String = js.native
    
    var patterns: js.Array[String] = js.native
  }
  object RequiredOptions {
    
    @scala.inline
    def apply(
      context: String,
      detectUnusedExport: Boolean,
      detectUnusedFiles: Boolean,
      exclude: js.Array[String],
      failOnHint: Boolean,
      outputFile: String,
      patterns: js.Array[String]
    ): RequiredOptions = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], detectUnusedExport = detectUnusedExport.asInstanceOf[js.Any], detectUnusedFiles = detectUnusedFiles.asInstanceOf[js.Any], exclude = exclude.asInstanceOf[js.Any], failOnHint = failOnHint.asInstanceOf[js.Any], outputFile = outputFile.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredOptions]
    }
    
    @scala.inline
    implicit class RequiredOptionsMutableBuilder[Self <: RequiredOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetectUnusedExport(value: Boolean): Self = StObject.set(x, "detectUnusedExport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetectUnusedFiles(value: Boolean): Self = StObject.set(x, "detectUnusedFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setFailOnHint(value: Boolean): Self = StObject.set(x, "failOnHint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputFile(value: String): Self = StObject.set(x, "outputFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatterns(value: js.Array[String]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternsVarargs(value: String*): Self = StObject.set(x, "patterns", js.Array(value :_*))
    }
  }
}
