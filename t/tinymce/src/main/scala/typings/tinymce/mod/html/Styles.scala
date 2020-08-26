package typings.tinymce.mod.html

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Styles extends js.Object {
  def parse(css: String): js.Object = js.native
  def serialize(styles: js.Object, elementName: String): String = js.native
  def toHex(color: String): String = js.native
}

object Styles {
  @scala.inline
  def apply(parse: String => js.Object, serialize: (js.Object, String) => String, toHex: String => String): Styles = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), serialize = js.Any.fromFunction2(serialize), toHex = js.Any.fromFunction1(toHex))
    __obj.asInstanceOf[Styles]
  }
  @scala.inline
  implicit class StylesOps[Self <: Styles] (val x: Self) extends AnyVal {
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
    def setParse(value: String => js.Object): Self = this.set("parse", js.Any.fromFunction1(value))
    @scala.inline
    def setSerialize(value: (js.Object, String) => String): Self = this.set("serialize", js.Any.fromFunction2(value))
    @scala.inline
    def setToHex(value: String => String): Self = this.set("toHex", js.Any.fromFunction1(value))
  }
  
}

