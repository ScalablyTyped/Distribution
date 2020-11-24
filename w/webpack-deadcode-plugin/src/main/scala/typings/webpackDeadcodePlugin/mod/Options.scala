package typings.webpackDeadcodePlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /** Current working directoy for patterns above. If you don't set explicitly, your webpack context will be used. */
  var context: js.UndefOr[String] = js.native
  
  /** Whether to run unsed export detection or not. */
  var detectUnusedExport: js.UndefOr[Boolean] = js.native
  
  /** Whether to run unused files detection or not. */
  var detectUnusedFiles: js.UndefOr[Boolean] = js.native
  
  /** The array of patterns to not look at. */
  var exclude: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Deadcode does not interrupt the compilation by default.
    * If you want to cancel the compilation, set it `true`, it throws a fatal error and stops the compilation.
    */
  var failOnHint: js.UndefOr[Boolean] = js.native
  
  var outputFile: js.UndefOr[String] = js.native
  
  /**
    * The array of patterns to look for unused files and unused export in used files.
    * Directly passed to [`fast-glob`](https://github.com/mrmlnc/fast-glob).
    */
  var patterns: js.UndefOr[js.Array[String]] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setDetectUnusedExport(value: Boolean): Self = this.set("detectUnusedExport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectUnusedExport: Self = this.set("detectUnusedExport", js.undefined)
    
    @scala.inline
    def setDetectUnusedFiles(value: Boolean): Self = this.set("detectUnusedFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectUnusedFiles: Self = this.set("detectUnusedFiles", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: String*): Self = this.set("exclude", js.Array(value :_*))
    
    @scala.inline
    def setExclude(value: js.Array[String]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    
    @scala.inline
    def setFailOnHint(value: Boolean): Self = this.set("failOnHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailOnHint: Self = this.set("failOnHint", js.undefined)
    
    @scala.inline
    def setOutputFile(value: String): Self = this.set("outputFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputFile: Self = this.set("outputFile", js.undefined)
    
    @scala.inline
    def setPatternsVarargs(value: String*): Self = this.set("patterns", js.Array(value :_*))
    
    @scala.inline
    def setPatterns(value: js.Array[String]): Self = this.set("patterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatterns: Self = this.set("patterns", js.undefined)
  }
}
