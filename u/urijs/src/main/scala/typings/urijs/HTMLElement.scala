package typings.urijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLElement extends js.Object {
  var innerText: String = js.native
}

object HTMLElement {
  @scala.inline
  def apply(innerText: String): HTMLElement = {
    val __obj = js.Dynamic.literal(innerText = innerText.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLElement]
  }
  @scala.inline
  implicit class HTMLElementOps[Self <: HTMLElement] (val x: Self) extends AnyVal {
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
    def setInnerText(value: String): Self = this.set("innerText", value.asInstanceOf[js.Any])
  }
  
}

