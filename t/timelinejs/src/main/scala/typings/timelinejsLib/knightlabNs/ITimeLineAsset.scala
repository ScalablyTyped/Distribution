package typings
package timelinejsLib.knightlabNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimeLineAsset extends js.Object {
  var caption: java.lang.String
  var credit: java.lang.String
  var media: java.lang.String
  var thumbnail: js.UndefOr[java.lang.String] = js.undefined
}

object ITimeLineAsset {
  @scala.inline
  def apply(
    caption: java.lang.String,
    credit: java.lang.String,
    media: java.lang.String,
    thumbnail: java.lang.String = null
  ): ITimeLineAsset = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("caption")(caption)
    __obj.updateDynamic("credit")(credit)
    __obj.updateDynamic("media")(media)
    if (thumbnail != null) __obj.updateDynamic("thumbnail")(thumbnail)
    __obj.asInstanceOf[ITimeLineAsset]
  }
}

