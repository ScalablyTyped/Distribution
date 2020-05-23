package typings.tryghostContentApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocialMedia
  extends Facebook
     with Twitter

object SocialMedia {
  @scala.inline
  def apply(
    og_description: js.UndefOr[Null | Nullable[String]] = js.undefined,
    og_image: js.UndefOr[Null | Nullable[String]] = js.undefined,
    og_title: js.UndefOr[Null | Nullable[String]] = js.undefined,
    twitter_description: js.UndefOr[Null | Nullable[String]] = js.undefined,
    twitter_image: js.UndefOr[Null | Nullable[String]] = js.undefined,
    twitter_title: js.UndefOr[Null | Nullable[String]] = js.undefined
  ): SocialMedia = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(og_description)) __obj.updateDynamic("og_description")(og_description.asInstanceOf[js.Any])
    if (!js.isUndefined(og_image)) __obj.updateDynamic("og_image")(og_image.asInstanceOf[js.Any])
    if (!js.isUndefined(og_title)) __obj.updateDynamic("og_title")(og_title.asInstanceOf[js.Any])
    if (!js.isUndefined(twitter_description)) __obj.updateDynamic("twitter_description")(twitter_description.asInstanceOf[js.Any])
    if (!js.isUndefined(twitter_image)) __obj.updateDynamic("twitter_image")(twitter_image.asInstanceOf[js.Any])
    if (!js.isUndefined(twitter_title)) __obj.updateDynamic("twitter_title")(twitter_title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocialMedia]
  }
}

