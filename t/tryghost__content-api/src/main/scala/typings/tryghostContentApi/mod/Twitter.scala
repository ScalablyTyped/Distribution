package typings.tryghostContentApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Twitter extends js.Object {
  var twitter_description: js.UndefOr[Nullable[String]] = js.undefined
  var twitter_image: js.UndefOr[Nullable[String]] = js.undefined
  var twitter_title: js.UndefOr[Nullable[String]] = js.undefined
}

object Twitter {
  @scala.inline
  def apply(
    twitter_description: js.UndefOr[Null | Nullable[String]] = js.undefined,
    twitter_image: js.UndefOr[Null | Nullable[String]] = js.undefined,
    twitter_title: js.UndefOr[Null | Nullable[String]] = js.undefined
  ): Twitter = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(twitter_description)) __obj.updateDynamic("twitter_description")(twitter_description.asInstanceOf[js.Any])
    if (!js.isUndefined(twitter_image)) __obj.updateDynamic("twitter_image")(twitter_image.asInstanceOf[js.Any])
    if (!js.isUndefined(twitter_title)) __obj.updateDynamic("twitter_title")(twitter_title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Twitter]
  }
}

