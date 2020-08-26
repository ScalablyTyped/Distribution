package typings.timelinejs.knightlab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITimeLineAsset extends js.Object {
  var caption: String = js.native
  var credit: String = js.native
  var media: String = js.native
  var thumbnail: js.UndefOr[String] = js.native
}

object ITimeLineAsset {
  @scala.inline
  def apply(caption: String, credit: String, media: String): ITimeLineAsset = {
    val __obj = js.Dynamic.literal(caption = caption.asInstanceOf[js.Any], credit = credit.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimeLineAsset]
  }
  @scala.inline
  implicit class ITimeLineAssetOps[Self <: ITimeLineAsset] (val x: Self) extends AnyVal {
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
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    @scala.inline
    def setCredit(value: String): Self = this.set("credit", value.asInstanceOf[js.Any])
    @scala.inline
    def setMedia(value: String): Self = this.set("media", value.asInstanceOf[js.Any])
    @scala.inline
    def setThumbnail(value: String): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbnail: Self = this.set("thumbnail", js.undefined)
  }
  
}

