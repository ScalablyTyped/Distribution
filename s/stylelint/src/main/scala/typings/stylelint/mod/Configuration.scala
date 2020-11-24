package typings.stylelint.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Configuration extends js.Object {
  
  var defaultSeverity: Severity = js.native
  
  var `extends`: String | js.Array[String] = js.native
  
  var ignoreFiles: String | js.Array[String] = js.native
  
  var plugins: js.Array[String] = js.native
  
  var processors: js.Array[String] = js.native
  
  var rules: Record[String, _] = js.native
}
object Configuration {
  
  @scala.inline
  def apply(
    defaultSeverity: Severity,
    `extends`: String | js.Array[String],
    ignoreFiles: String | js.Array[String],
    plugins: js.Array[String],
    processors: js.Array[String],
    rules: Record[String, _]
  ): Configuration = {
    val __obj = js.Dynamic.literal(defaultSeverity = defaultSeverity.asInstanceOf[js.Any], ignoreFiles = ignoreFiles.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], processors = processors.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
  
  @scala.inline
  implicit class ConfigurationOps[Self <: Configuration] (val x: Self) extends AnyVal {
    
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
    def setDefaultSeverity(value: Severity): Self = this.set("defaultSeverity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendsVarargs(value: String*): Self = this.set("extends", js.Array(value :_*))
    
    @scala.inline
    def setExtends(value: String | js.Array[String]): Self = this.set("extends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreFilesVarargs(value: String*): Self = this.set("ignoreFiles", js.Array(value :_*))
    
    @scala.inline
    def setIgnoreFiles(value: String | js.Array[String]): Self = this.set("ignoreFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginsVarargs(value: String*): Self = this.set("plugins", js.Array(value :_*))
    
    @scala.inline
    def setPlugins(value: js.Array[String]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessorsVarargs(value: String*): Self = this.set("processors", js.Array(value :_*))
    
    @scala.inline
    def setProcessors(value: js.Array[String]): Self = this.set("processors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRules(value: Record[String, _]): Self = this.set("rules", value.asInstanceOf[js.Any])
  }
}
