package typings.webpackBlocksPostcss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Plugin extends js.Object {
  var parser: js.UndefOr[String | FunctionType] = js.native
  var stringifier: js.UndefOr[String | FunctionType] = js.native
  var syntax: js.UndefOr[String | FunctionType] = js.native
}

object Plugin {
  @scala.inline
  def apply(): Plugin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Plugin]
  }
  @scala.inline
  implicit class PluginOps[Self <: Plugin] (val x: Self) extends AnyVal {
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
    def setParserFunction0(value: () => String): Self = this.set("parser", js.Any.fromFunction0(value))
    @scala.inline
    def setParser(value: String | FunctionType): Self = this.set("parser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParser: Self = this.set("parser", js.undefined)
    @scala.inline
    def setStringifierFunction0(value: () => String): Self = this.set("stringifier", js.Any.fromFunction0(value))
    @scala.inline
    def setStringifier(value: String | FunctionType): Self = this.set("stringifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStringifier: Self = this.set("stringifier", js.undefined)
    @scala.inline
    def setSyntaxFunction0(value: () => String): Self = this.set("syntax", js.Any.fromFunction0(value))
    @scala.inline
    def setSyntax(value: String | FunctionType): Self = this.set("syntax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSyntax: Self = this.set("syntax", js.undefined)
  }
  
}

