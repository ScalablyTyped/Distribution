package typings
package winrtLib.WindowsNs.StorageNs.FilePropertiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IThumbnailProperties extends js.Object {
  var originalHeight: scala.Double
  var originalWidth: scala.Double
  var returnedSmallerCachedSize: scala.Boolean
  var `type`: ThumbnailType
}

object IThumbnailProperties {
  @scala.inline
  def apply(
    originalHeight: scala.Double,
    originalWidth: scala.Double,
    returnedSmallerCachedSize: scala.Boolean,
    `type`: ThumbnailType
  ): IThumbnailProperties = {
    val __obj = js.Dynamic.literal(originalHeight = originalHeight, originalWidth = originalWidth, returnedSmallerCachedSize = returnedSmallerCachedSize)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IThumbnailProperties]
  }
}

