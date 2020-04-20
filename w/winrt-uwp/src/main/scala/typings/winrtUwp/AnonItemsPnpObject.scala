package typings.winrtUwp

import typings.winrtUwp.Windows.Devices.Enumeration.Pnp.PnpObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemsPnpObject extends js.Object {
  /** Provides the destination for the result. Size the initial array size as a "capacity" in order to specify how many results should be retrieved. */ var items: PnpObject
  /** The number of items retrieved. */ var returnValue: Double
}

object AnonItemsPnpObject {
  @scala.inline
  def apply(items: PnpObject, returnValue: Double): AnonItemsPnpObject = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemsPnpObject]
  }
}

