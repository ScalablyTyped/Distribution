package typings.winrt

import typings.winrt.Windows.Devices.Enumeration.Pnp.PnpObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueArrayNumberPnpObject extends js.Object {
  var items: js.Array[PnpObject]
  var returnValue: Double
}

object Anon_ItemsReturnValueArrayNumberPnpObject {
  @scala.inline
  def apply(items: js.Array[PnpObject], returnValue: Double): Anon_ItemsReturnValueArrayNumberPnpObject = {
    val __obj = js.Dynamic.literal(items = items, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_ItemsReturnValueArrayNumberPnpObject]
  }
}

