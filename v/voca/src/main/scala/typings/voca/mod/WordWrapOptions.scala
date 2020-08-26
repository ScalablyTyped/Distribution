package typings.voca.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WordWrapOptions extends js.Object {
  var cut: js.UndefOr[Boolean] = js.native
  var indent: js.UndefOr[String] = js.native
  var newLine: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
}

object WordWrapOptions {
  @scala.inline
  def apply(): WordWrapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WordWrapOptions]
  }
  @scala.inline
  implicit class WordWrapOptionsOps[Self <: WordWrapOptions] (val x: Self) extends AnyVal {
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
    def setCut(value: Boolean): Self = this.set("cut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCut: Self = this.set("cut", js.undefined)
    @scala.inline
    def setIndent(value: String): Self = this.set("indent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndent: Self = this.set("indent", js.undefined)
    @scala.inline
    def setNewLine(value: String): Self = this.set("newLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewLine: Self = this.set("newLine", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

