package typings.tgfancy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmojificationOptions extends js.Object {
  def emojify(text: String): String = js.native
}

object EmojificationOptions {
  @scala.inline
  def apply(emojify: String => String): EmojificationOptions = {
    val __obj = js.Dynamic.literal(emojify = js.Any.fromFunction1(emojify))
    __obj.asInstanceOf[EmojificationOptions]
  }
  @scala.inline
  implicit class EmojificationOptionsOps[Self <: EmojificationOptions] (val x: Self) extends AnyVal {
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
    def setEmojify(value: String => String): Self = this.set("emojify", js.Any.fromFunction1(value))
  }
  
}

