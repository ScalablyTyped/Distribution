package typings
package winrtLib.WindowsNs.GraphicsNs.ImagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBitmapTypedValue extends js.Object {
  var `type`: winrtLib.WindowsNs.FoundationNs.PropertyType
  var value: js.Any
}

object IBitmapTypedValue {
  @scala.inline
  def apply(`type`: winrtLib.WindowsNs.FoundationNs.PropertyType, value: js.Any): IBitmapTypedValue = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IBitmapTypedValue]
  }
}

