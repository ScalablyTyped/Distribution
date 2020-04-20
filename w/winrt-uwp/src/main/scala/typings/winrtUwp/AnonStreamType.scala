package typings.winrtUwp

import typings.winrtUwp.Windows.Media.Protection.PlayReady.NDMediaStreamType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStreamType extends js.Object {
  /** The stream identifier for the media stream. */ var returnValue: Double
  /** The type of the media stream. This type can be either Audio or Video. */ var streamType: NDMediaStreamType
}

object AnonStreamType {
  @scala.inline
  def apply(returnValue: Double, streamType: NDMediaStreamType): AnonStreamType = {
    val __obj = js.Dynamic.literal(returnValue = returnValue.asInstanceOf[js.Any], streamType = streamType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStreamType]
  }
}

