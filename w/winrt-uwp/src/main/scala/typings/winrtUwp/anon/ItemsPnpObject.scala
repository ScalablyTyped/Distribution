package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Devices.Enumeration.Pnp.PnpObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemsPnpObject extends js.Object {
  /** Provides the destination for the result. Size the initial array size as a "capacity" in order to specify how many results should be retrieved. */ var items: PnpObject
  /** The number of items retrieved. */ var returnValue: Double
}

object ItemsPnpObject {
  @scala.inline
  def apply(items: PnpObject, returnValue: Double): ItemsPnpObject = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsPnpObject]
  }
}

