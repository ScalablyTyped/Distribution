package typings.uifabricUtilities.irendercomponentMod

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRenderComponent[TProps] extends js.Object {
  /**
    * JSX.Element to return in this component's render() function.
    */
  def children(props: TProps): Element = js.native
}

object IRenderComponent {
  @scala.inline
  def apply[TProps](children: TProps => Element): IRenderComponent[TProps] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[IRenderComponent[TProps]]
  }
  @scala.inline
  implicit class IRenderComponentOps[Self <: IRenderComponent[_], TProps] (val x: Self with IRenderComponent[TProps]) extends AnyVal {
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
    def setChildren(value: TProps => Element): Self = this.set("children", js.Any.fromFunction1(value))
  }
  
}

