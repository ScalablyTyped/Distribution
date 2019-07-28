package typings.winrt.WindowsNs.NetworkingNs.ConnectivityNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILanIdentifierData extends js.Object {
  var `type`: Double
  var value: IVectorView[Double]
}

object ILanIdentifierData {
  @scala.inline
  def apply(`type`: Double, value: IVectorView[Double]): ILanIdentifierData = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ILanIdentifierData]
  }
}

