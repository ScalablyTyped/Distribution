package typings.winrt.anon

import typings.winrt.Windows.Devices.Enumeration.DeviceInformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `3` extends js.Object {
  var items: js.Array[DeviceInformation]
  var returnValue: Double
}

object `3` {
  @scala.inline
  def apply(items: js.Array[DeviceInformation], returnValue: Double): `3` = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`3`]
  }
}

