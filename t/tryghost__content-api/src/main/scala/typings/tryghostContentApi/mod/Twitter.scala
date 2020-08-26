package typings.tryghostContentApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Twitter extends js.Object {
  var twitter_description: js.UndefOr[Nullable[String]] = js.native
  var twitter_image: js.UndefOr[Nullable[String]] = js.native
  var twitter_title: js.UndefOr[Nullable[String]] = js.native
}

object Twitter {
  @scala.inline
  def apply(): Twitter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Twitter]
  }
  @scala.inline
  implicit class TwitterOps[Self <: Twitter] (val x: Self) extends AnyVal {
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
    def setTwitter_description(value: Nullable[String]): Self = this.set("twitter_description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTwitter_description: Self = this.set("twitter_description", js.undefined)
    @scala.inline
    def setTwitter_descriptionNull: Self = this.set("twitter_description", null)
    @scala.inline
    def setTwitter_image(value: Nullable[String]): Self = this.set("twitter_image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTwitter_image: Self = this.set("twitter_image", js.undefined)
    @scala.inline
    def setTwitter_imageNull: Self = this.set("twitter_image", null)
    @scala.inline
    def setTwitter_title(value: Nullable[String]): Self = this.set("twitter_title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTwitter_title: Self = this.set("twitter_title", js.undefined)
    @scala.inline
    def setTwitter_titleNull: Self = this.set("twitter_title", null)
  }
  
}

