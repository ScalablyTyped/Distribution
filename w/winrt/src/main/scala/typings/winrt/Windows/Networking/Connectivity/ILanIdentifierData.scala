package typings.winrt.Windows.Networking.Connectivity

import typings.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILanIdentifierData extends js.Object {
  var `type`: Double = js.native
  var value: IVectorView[Double] = js.native
}

object ILanIdentifierData {
  @scala.inline
  def apply(`type`: Double, value: IVectorView[Double]): ILanIdentifierData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILanIdentifierData]
  }
  @scala.inline
  implicit class ILanIdentifierDataOps[Self <: ILanIdentifierData] (val x: Self) extends AnyVal {
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

