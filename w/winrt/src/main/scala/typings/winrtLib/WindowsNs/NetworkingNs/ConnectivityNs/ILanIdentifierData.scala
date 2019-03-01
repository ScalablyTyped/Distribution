package typings
package winrtLib.WindowsNs.NetworkingNs.ConnectivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILanIdentifierData extends js.Object {
  var `type`: scala.Double
  var value: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[scala.Double]
}

object ILanIdentifierData {
  @scala.inline
  def apply(
    `type`: scala.Double,
    value: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[scala.Double]
  ): ILanIdentifierData = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ILanIdentifierData]
  }
}

