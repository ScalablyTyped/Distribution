package typings.tslint.mod

import typings.tslint.formatterMod.FormatterConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILinterOptions extends js.Object {
  var fix: Boolean = js.native
  var formatter: js.UndefOr[String | FormatterConstructor] = js.native
  var formattersDirectory: js.UndefOr[String] = js.native
  var quiet: js.UndefOr[Boolean] = js.native
  var rulesDirectory: js.UndefOr[String | js.Array[String]] = js.native
}

object ILinterOptions {
  @scala.inline
  def apply(fix: Boolean): ILinterOptions = {
    val __obj = js.Dynamic.literal(fix = fix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILinterOptions]
  }
  @scala.inline
  implicit class ILinterOptionsOps[Self <: ILinterOptions] (val x: Self) extends AnyVal {
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
    def setFix(value: Boolean): Self = this.set("fix", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormatter(value: String | FormatterConstructor): Self = this.set("formatter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    @scala.inline
    def setFormattersDirectory(value: String): Self = this.set("formattersDirectory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormattersDirectory: Self = this.set("formattersDirectory", js.undefined)
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
  }
  
}

