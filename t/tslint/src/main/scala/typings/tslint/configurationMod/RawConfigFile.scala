package typings.tslint.configurationMod

import typings.tslint.anon.PartialexcludeArraystring
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RawConfigFile extends js.Object {
  var defaultSeverity: js.UndefOr[String] = js.native
  var `extends`: js.UndefOr[String | js.Array[String]] = js.native
  var jsRules: js.UndefOr[RawRulesConfig | Boolean] = js.native
  var linterOptions: js.UndefOr[PartialexcludeArraystring] = js.native
  var rules: js.UndefOr[RawRulesConfig] = js.native
  var rulesDirectory: js.UndefOr[String | js.Array[String]] = js.native
}

object RawConfigFile {
  @scala.inline
  def apply(): RawConfigFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RawConfigFile]
  }
  @scala.inline
  implicit class RawConfigFileOps[Self <: RawConfigFile] (val x: Self) extends AnyVal {
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
    def setDefaultSeverity(value: String): Self = this.set("defaultSeverity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSeverity: Self = this.set("defaultSeverity", js.undefined)
    @scala.inline
    def setExtendsVarargs(value: String*): Self = this.set("extends", js.Array(value :_*))
    @scala.inline
    def setExtends(value: String | js.Array[String]): Self = this.set("extends", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtends: Self = this.set("extends", js.undefined)
    @scala.inline
    def setJsRules(value: RawRulesConfig | Boolean): Self = this.set("jsRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJsRules: Self = this.set("jsRules", js.undefined)
    @scala.inline
    def setLinterOptions(value: PartialexcludeArraystring): Self = this.set("linterOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinterOptions: Self = this.set("linterOptions", js.undefined)
    @scala.inline
    def setRules(value: RawRulesConfig): Self = this.set("rules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
    @scala.inline
    def setRulesDirectoryVarargs(value: String*): Self = this.set("rulesDirectory", js.Array(value :_*))
    @scala.inline
    def setRulesDirectory(value: String | js.Array[String]): Self = this.set("rulesDirectory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRulesDirectory: Self = this.set("rulesDirectory", js.undefined)
  }
  
}

