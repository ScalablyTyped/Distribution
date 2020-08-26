package typings.stylelint.anon

import typings.std.Record
import typings.stylelint.mod.Severity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<stylelint.stylelint.Configuration> */
@js.native
trait PartialConfiguration extends js.Object {
  var defaultSeverity: js.UndefOr[Severity] = js.native
  var `extends`: js.UndefOr[String | js.Array[String]] = js.native
  var ignoreFiles: js.UndefOr[String | js.Array[String]] = js.native
  var plugins: js.UndefOr[js.Array[String]] = js.native
  var processors: js.UndefOr[js.Array[String]] = js.native
  var rules: js.UndefOr[Record[String, _]] = js.native
}

object PartialConfiguration {
  @scala.inline
  def apply(): PartialConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialConfiguration]
  }
  @scala.inline
  implicit class PartialConfigurationOps[Self <: PartialConfiguration] (val x: Self) extends AnyVal {
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
    def deleteDefaultSeverity: Self = this.set("defaultSeverity", js.undefined)
    @scala.inline
    def setExtendsVarargs(value: String*): Self = this.set("extends", js.Array(value :_*))
    @scala.inline
    def setExtends(value: String | js.Array[String]): Self = this.set("extends", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtends: Self = this.set("extends", js.undefined)
    @scala.inline
    def setIgnoreFilesVarargs(value: String*): Self = this.set("ignoreFiles", js.Array(value :_*))
    @scala.inline
    def setIgnoreFiles(value: String | js.Array[String]): Self = this.set("ignoreFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreFiles: Self = this.set("ignoreFiles", js.undefined)
    @scala.inline
    def setPluginsVarargs(value: String*): Self = this.set("plugins", js.Array(value :_*))
    @scala.inline
    def setPlugins(value: js.Array[String]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    @scala.inline
    def setProcessorsVarargs(value: String*): Self = this.set("processors", js.Array(value :_*))
    @scala.inline
    def setProcessors(value: js.Array[String]): Self = this.set("processors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessors: Self = this.set("processors", js.undefined)
    @scala.inline
    def setRules(value: Record[String, _]): Self = this.set("rules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
  }
  
}

