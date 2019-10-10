package typings.atTryghostContentDashApi.atTryghostContentDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Facebook extends js.Object {
  var og_description: js.UndefOr[Nullable[String]] = js.undefined
  var og_image: js.UndefOr[Nullable[String]] = js.undefined
  var og_title: js.UndefOr[Nullable[String]] = js.undefined
}

object Facebook {
  @scala.inline
  def apply(
    og_description: Nullable[String] = null,
    og_image: Nullable[String] = null,
    og_title: Nullable[String] = null
  ): Facebook = {
    val __obj = js.Dynamic.literal()
    if (og_description != null) __obj.updateDynamic("og_description")(og_description.asInstanceOf[js.Any])
    if (og_image != null) __obj.updateDynamic("og_image")(og_image.asInstanceOf[js.Any])
    if (og_title != null) __obj.updateDynamic("og_title")(og_title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Facebook]
  }
}

