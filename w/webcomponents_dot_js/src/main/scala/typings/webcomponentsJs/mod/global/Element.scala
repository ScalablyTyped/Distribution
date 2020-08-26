package typings.webcomponentsJs.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Element extends js.Object {
  val shadowRoot: ShadowRoot | Null = js.native
  def createShadowRoot(): ShadowRoot = js.native
}

object Element {
  @scala.inline
  def apply(createShadowRoot: () => ShadowRoot): Element = {
    val __obj = js.Dynamic.literal(createShadowRoot = js.Any.fromFunction0(createShadowRoot))
    __obj.asInstanceOf[Element]
  }
  @scala.inline
  implicit class ElementOps[Self <: Element] (val x: Self) extends AnyVal {
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
    def setCreateShadowRoot(value: () => ShadowRoot): Self = this.set("createShadowRoot", js.Any.fromFunction0(value))
    @scala.inline
    def setShadowRoot(value: ShadowRoot): Self = this.set("shadowRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def setShadowRootNull: Self = this.set("shadowRoot", null)
  }
  
}

