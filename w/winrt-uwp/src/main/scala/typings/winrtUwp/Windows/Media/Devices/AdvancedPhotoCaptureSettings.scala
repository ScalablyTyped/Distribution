package typings.winrtUwp.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents settings for an AdvancedPhotoControl object. */
trait AdvancedPhotoCaptureSettings extends js.Object {
  /** Gets or sets the advanced capture mode for which an AdvancedPhotoControl will be configured. */
  var mode: AdvancedPhotoMode
}

object AdvancedPhotoCaptureSettings {
  @scala.inline
  def apply(mode: AdvancedPhotoMode): AdvancedPhotoCaptureSettings = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvancedPhotoCaptureSettings]
  }
}

