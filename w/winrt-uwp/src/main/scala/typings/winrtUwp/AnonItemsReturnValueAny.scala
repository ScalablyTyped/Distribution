package typings.winrtUwp

import typings.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemsReturnValueAny extends js.Object {
  /** The items in the map view. */ var items: IKeyValuePair[_, _]
  /** The number of items in the map view. */ var returnValue: Double
}

object AnonItemsReturnValueAny {
  @scala.inline
  def apply(items: IKeyValuePair[_, _], returnValue: Double): AnonItemsReturnValueAny = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonItemsReturnValueAny]
  }
}

