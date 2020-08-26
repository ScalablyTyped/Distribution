package typings.winrtUwp.Windows.Networking.Connectivity

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the port specific data that enables LAN locality capabilities. */
@js.native
trait LanIdentifierData extends js.Object {
  /** Gets a value indicating the type of data stored in the value field of the LanIdentifierData object according to the Link Layer Discovery Protocol (LLDP) protocol. */
  var `type`: Double = js.native
  /** Gets the serialized value. */
  var value: IVectorView[Double] = js.native
}

object LanIdentifierData {
  @scala.inline
  def apply(`type`: Double, value: IVectorView[Double]): LanIdentifierData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanIdentifierData]
  }
  @scala.inline
  implicit class LanIdentifierDataOps[Self <: LanIdentifierData] (val x: Self) extends AnyVal {
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
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: IVectorView[Double]): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

