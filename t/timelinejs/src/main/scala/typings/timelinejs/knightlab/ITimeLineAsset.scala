package typings.timelinejs.knightlab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimeLineAsset extends js.Object {
  var caption: String
  var credit: String
  var media: String
  var thumbnail: js.UndefOr[String] = js.undefined
}

object ITimeLineAsset {
  @scala.inline
  def apply(caption: String, credit: String, media: String, thumbnail: String = null): ITimeLineAsset = {
    val __obj = js.Dynamic.literal(caption = caption.asInstanceOf[js.Any], credit = credit.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any])
    if (thumbnail != null) __obj.updateDynamic("thumbnail")(thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimeLineAsset]
  }
}

