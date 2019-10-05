package typings.winrt.Windows.Devices.Enumeration

import typings.winrt.Windows.Foundation.Collections.IIterator
import typings.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Enumeration.DeviceInformationCollection")
@js.native
class DeviceInformationCollection () extends IVectorView[DeviceInformation] {
  /* CompleteClass */
  override def first(): IIterator[DeviceInformation] = js.native
}

