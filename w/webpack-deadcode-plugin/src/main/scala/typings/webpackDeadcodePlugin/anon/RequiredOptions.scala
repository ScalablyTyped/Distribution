package typings.webpackDeadcodePlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<webpack-deadcode-plugin.webpack-deadcode-plugin.Options> */
@js.native
trait RequiredOptions extends js.Object {
  
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
  implicit class RequiredOptionsOps[Self <: RequiredOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectUnusedExport(value: Boolean): Self = this.set("detectUnusedExport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectUnusedFiles(value: Boolean): Self = this.set("detectUnusedFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeVarargs(value: String*): Self = this.set("exclude", js.Array(value :_*))
    
    @scala.inline
    def setExclude(value: js.Array[String]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailOnHint(value: Boolean): Self = this.set("failOnHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputFile(value: String): Self = this.set("outputFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternsVarargs(value: String*): Self = this.set("patterns", js.Array(value :_*))
    
    @scala.inline
    def setPatterns(value: js.Array[String]): Self = this.set("patterns", value.asInstanceOf[js.Any])
  }
}
