package typings.winrtUwp.Windows.Devices.WiFiDirect

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents information elements in a Wi-Fi Direct packet. */
@js.native
trait WiFiDirectInformationElement extends js.Object {
  /** A three-byte organization identifier used to indicate the organization which defined a vendor extension information element (IE). */
  var oui: IBuffer = js.native
  /** A one byte type value used in a vendor extension information element (IE) to distinguish between different IE formats defined by the same organization. */
  var ouiType: Double = js.native
  /** The value of the information element. */
  var value: IBuffer = js.native
}

object WiFiDirectInformationElement {
  @scala.inline
  def apply(oui: IBuffer, ouiType: Double, value: IBuffer): WiFiDirectInformationElement = {
    val __obj = js.Dynamic.literal(oui = oui.asInstanceOf[js.Any], ouiType = ouiType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WiFiDirectInformationElement]
  }
  @scala.inline
  implicit class WiFiDirectInformationElementOps[Self <: WiFiDirectInformationElement] (val x: Self) extends AnyVal {
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
    def setOui(value: IBuffer): Self = this.set("oui", value.asInstanceOf[js.Any])
    @scala.inline
    def setOuiType(value: Double): Self = this.set("ouiType", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: IBuffer): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

