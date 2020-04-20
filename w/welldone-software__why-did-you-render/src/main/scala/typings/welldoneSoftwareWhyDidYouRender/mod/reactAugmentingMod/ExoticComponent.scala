package typings.welldoneSoftwareWhyDidYouRender.mod.reactAugmentingMod

import typings.welldoneSoftwareWhyDidYouRender.mod.WhyDidYouRenderComponentMember
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExoticComponent[P] extends js.Object {
  var whyDidYouRender: js.UndefOr[WhyDidYouRenderComponentMember] = js.undefined
}

object ExoticComponent {
  @scala.inline
  def apply[P](whyDidYouRender: WhyDidYouRenderComponentMember = null): ExoticComponent[P] = {
    val __obj = js.Dynamic.literal()
    if (whyDidYouRender != null) __obj.updateDynamic("whyDidYouRender")(whyDidYouRender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExoticComponent[P]]
  }
}

