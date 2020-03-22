package typings.winrtUwp

import typings.winrtUwp.Windows.Media.Protection.PlayReady.IPlayReadyDomain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemsIPlayReadyDomain extends js.Object {
  /** The items in the collection. */ var items: IPlayReadyDomain
  /** The number of items in the collection. */ var returnValue: Double
}

object AnonItemsIPlayReadyDomain {
  @scala.inline
  def apply(items: IPlayReadyDomain, returnValue: Double): AnonItemsIPlayReadyDomain = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonItemsIPlayReadyDomain]
  }
}

