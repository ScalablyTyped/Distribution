package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueAny extends js.Object {
  /** The items in the map view. */ var items: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair[_, _]
  /** The number of items in the map view. */ var returnValue: scala.Double
}

object Anon_ItemsReturnValueAny {
  @scala.inline
  def apply(
    items: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair[_, _],
    returnValue: scala.Double
  ): Anon_ItemsReturnValueAny = {
    val __obj = js.Dynamic.literal(items = items, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_ItemsReturnValueAny]
  }
}

