package typings.winrt.Windows.Storage.FileProperties

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IThumbnailProperties extends js.Object {
  var originalHeight: Double
  var originalWidth: Double
  var returnedSmallerCachedSize: Boolean
  var `type`: ThumbnailType
}

object IThumbnailProperties {
  @scala.inline
  def apply(
    originalHeight: Double,
    originalWidth: Double,
    returnedSmallerCachedSize: Boolean,
    `type`: ThumbnailType
  ): IThumbnailProperties = {
    val __obj = js.Dynamic.literal(originalHeight = originalHeight.asInstanceOf[js.Any], originalWidth = originalWidth.asInstanceOf[js.Any], returnedSmallerCachedSize = returnedSmallerCachedSize.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThumbnailProperties]
  }
}

