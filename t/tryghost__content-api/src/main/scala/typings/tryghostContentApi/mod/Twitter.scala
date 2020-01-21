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
    twitter_description: Nullable[String] = null,
    twitter_image: Nullable[String] = null,
    twitter_title: Nullable[String] = null
  ): Twitter = {
    val __obj = js.Dynamic.literal()
    if (twitter_description != null) __obj.updateDynamic("twitter_description")(twitter_description.asInstanceOf[js.Any])
    if (twitter_image != null) __obj.updateDynamic("twitter_image")(twitter_image.asInstanceOf[js.Any])
    if (twitter_title != null) __obj.updateDynamic("twitter_title")(twitter_title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Twitter]
  }
}

