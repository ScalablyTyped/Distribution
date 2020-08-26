package typings.welldoneSoftwareWhyDidYouRender.mod.reactAugmentingMod

import typings.welldoneSoftwareWhyDidYouRender.mod.WhyDidYouRenderComponentMember
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionComponent[P] extends js.Object {
  var whyDidYouRender: js.UndefOr[WhyDidYouRenderComponentMember] = js.native
}

object FunctionComponent {
  @scala.inline
  def apply[P](): FunctionComponent[P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionComponent[P]]
  }
  @scala.inline
  implicit class FunctionComponentOps[Self <: FunctionComponent[_], P] (val x: Self with FunctionComponent[P]) extends AnyVal {
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
    def setWhyDidYouRender(value: WhyDidYouRenderComponentMember): Self = this.set("whyDidYouRender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhyDidYouRender: Self = this.set("whyDidYouRender", js.undefined)
  }
  
}

