package typings.winrtDashUwp

import typings.winrtDashUwp.Windows.Devices.Enumeration.Pnp.PnpObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueNumberPnpObject extends js.Object {
  /** Provides the destination for the result. Size the initial array size as a "capacity" in order to specify how many results should be retrieved. */ var items: PnpObject
  /** The number of items retrieved. */ var returnValue: Double
}

object Anon_ItemsReturnValueNumberPnpObject {
  @scala.inline
  def apply(items: PnpObject, returnValue: Double): Anon_ItemsReturnValueNumberPnpObject = {
    val __obj = js.Dynamic.literal(items = items, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_ItemsReturnValueNumberPnpObject]
  }
}

