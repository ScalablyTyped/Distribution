package typings.winrt.Windows.Devices.Enumeration

import typings.winrt.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDeviceInformationUpdate extends js.Object {
  var id: String = js.native
  var properties: IMapView[String, _] = js.native
}

object IDeviceInformationUpdate {
  @scala.inline
  def apply(id: String, properties: IMapView[String, _]): IDeviceInformationUpdate = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeviceInformationUpdate]
  }
  @scala.inline
  implicit class IDeviceInformationUpdateOps[Self <: IDeviceInformationUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: IMapView[String, _]): Self = this.set("properties", value.asInstanceOf[js.Any])
  }
  
}

