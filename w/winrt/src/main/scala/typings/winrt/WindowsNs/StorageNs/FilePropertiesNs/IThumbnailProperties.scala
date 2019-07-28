package typings.winrt.WindowsNs.StorageNs.FilePropertiesNs

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
    val __obj = js.Dynamic.literal(originalHeight = originalHeight, originalWidth = originalWidth, returnedSmallerCachedSize = returnedSmallerCachedSize)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IThumbnailProperties]
  }
}

