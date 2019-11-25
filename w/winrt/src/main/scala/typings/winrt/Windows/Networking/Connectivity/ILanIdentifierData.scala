package typings.winrt.Windows.Networking.Connectivity

import typings.winrt.Windows.Foundation.Collections.IVectorView
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
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILanIdentifierData]
  }
}

