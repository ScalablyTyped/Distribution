package typings.winrtDashUwp

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueAny extends js.Object {
  /** The items in the map view. */ var items: IKeyValuePair[_, _]
  /** The number of items in the map view. */ var returnValue: Double
}

object Anon_ItemsReturnValueAny {
  @scala.inline
  def apply(items: IKeyValuePair[_, _], returnValue: Double): Anon_ItemsReturnValueAny = {
    val __obj = js.Dynamic.literal(items = items, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_ItemsReturnValueAny]
  }
}

