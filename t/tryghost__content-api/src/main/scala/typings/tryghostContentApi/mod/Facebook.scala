package typings.tryghostContentApi.mod

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
    og_description: js.UndefOr[Null | Nullable[String]] = js.undefined,
    og_image: js.UndefOr[Null | Nullable[String]] = js.undefined,
    og_title: js.UndefOr[Null | Nullable[String]] = js.undefined
  ): Facebook = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(og_description)) __obj.updateDynamic("og_description")(og_description.asInstanceOf[js.Any])
    if (!js.isUndefined(og_image)) __obj.updateDynamic("og_image")(og_image.asInstanceOf[js.Any])
    if (!js.isUndefined(og_title)) __obj.updateDynamic("og_title")(og_title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Facebook]
  }
}

