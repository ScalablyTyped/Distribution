package typings.atWelldoneDashSoftwareWhyDashDidDashYouDashRender.React

import typings.atWelldoneDashSoftwareWhyDashDidDashYouDashRender.WhyDidYouRender.WhyDidYouRenderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionComponent[P] extends js.Object {
  var whyDidYouRender: js.UndefOr[Boolean | WhyDidYouRenderOptions] = js.undefined
}

object FunctionComponent {
  @scala.inline
  def apply[P](whyDidYouRender: Boolean | WhyDidYouRenderOptions = null): FunctionComponent[P] = {
    val __obj = js.Dynamic.literal()
    if (whyDidYouRender != null) __obj.updateDynamic("whyDidYouRender")(whyDidYouRender.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionComponent[P]]
  }
}

