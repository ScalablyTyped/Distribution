package typings.tslint.runnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Path to a configuration file.
    */
  var config: js.UndefOr[String] = js.native
  
  /**
    * Exclude globs from path expansion.
    */
  var exclude: js.Array[String] = js.native
  
  /**
    * File paths to lint.
    */
  var files: js.Array[String] = js.native
  
  /**
    * Whether to fixes linting errors for select rules. This may overwrite linted files.
    */
  var fix: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to return status code 0 even if there are lint errors.
    */
  var force: js.UndefOr[Boolean] = js.native
  
  /**
    * Output format.
    */
  var format: js.UndefOr[String] = js.native
  
  /**
    * Formatters directory path.
    */
  var formattersDirectory: js.UndefOr[String] = js.native
  
  /**
    * Whether to generate a tslint.json config file in the current working directory.
    */
  var init: js.UndefOr[Boolean] = js.native
  
  /**
    * Output file path.
    */
  var out: js.UndefOr[String] = js.native
  
  /**
    * Whether to output absolute paths
    */
  var outputAbsolutePaths: js.UndefOr[Boolean] = js.native
  
  /**
    * Outputs the configuration to be used instead of linting.
    */
  var printConfig: js.UndefOr[Boolean] = js.native
  
  /**
    * tsconfig.json file.
    */
  var project: js.UndefOr[String] = js.native
  
  /**
    * Whether to hide warnings
    */
  var quiet: js.UndefOr[Boolean] = js.native
  
  /**
    * Rules directory paths.
    */
  var rulesDirectory: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * Run the tests in the given directories to ensure a (custom) TSLint rule's output matches the expected output.
    * When this property is `true` the `files` property is used to specify the directories from which the tests should be executed.
    */
  var test: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to enable type checking when linting a project.
    */
  var typeCheck: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(exclude: js.Array[String], files: js.Array[String]): Options = {
    val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any])
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
    def setExcludeVarargs(value: String*): Self = this.set("exclude", js.Array(value :_*))
    
    @scala.inline
    def setExclude(value: js.Array[String]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesVarargs(value: String*): Self = this.set("files", js.Array(value :_*))
    
    @scala.inline
    def setFiles(value: js.Array[String]): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfig(value: String): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setFix(value: Boolean): Self = this.set("fix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFix: Self = this.set("fix", js.undefined)
    
    @scala.inline
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setFormattersDirectory(value: String): Self = this.set("formattersDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormattersDirectory: Self = this.set("formattersDirectory", js.undefined)
    
    @scala.inline
    def setInit(value: Boolean): Self = this.set("init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    
    @scala.inline
    def setOut(value: String): Self = this.set("out", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOut: Self = this.set("out", js.undefined)
    
    @scala.inline
    def setOutputAbsolutePaths(value: Boolean): Self = this.set("outputAbsolutePaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputAbsolutePaths: Self = this.set("outputAbsolutePaths", js.undefined)
    
    @scala.inline
    def setPrintConfig(value: Boolean): Self = this.set("printConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrintConfig: Self = this.set("printConfig", js.undefined)
    
    @scala.inline
    def setProject(value: String): Self = this.set("project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProject: Self = this.set("project", js.undefined)
    
    @scala.inline
    def setQuiet(value: Boolean): Self = this.set("quiet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuiet: Self = this.set("quiet", js.undefined)
    
    @scala.inline
    def setRulesDirectoryVarargs(value: String*): Self = this.set("rulesDirectory", js.Array(value :_*))
    
    @scala.inline
    def setRulesDirectory(value: String | js.Array[String]): Self = this.set("rulesDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRulesDirectory: Self = this.set("rulesDirectory", js.undefined)
    
    @scala.inline
    def setTest(value: Boolean): Self = this.set("test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTest: Self = this.set("test", js.undefined)
    
    @scala.inline
    def setTypeCheck(value: Boolean): Self = this.set("typeCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeCheck: Self = this.set("typeCheck", js.undefined)
  }
}
