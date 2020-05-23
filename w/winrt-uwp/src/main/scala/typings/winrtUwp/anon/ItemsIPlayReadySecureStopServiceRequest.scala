package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Media.Protection.PlayReady.IPlayReadySecureStopServiceRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemsIPlayReadySecureStopServiceRequest extends js.Object {
  /** The items in the collection. */ var items: IPlayReadySecureStopServiceRequest
  /** The number of items in the collection. */ var returnValue: Double
}

object ItemsIPlayReadySecureStopServiceRequest {
  @scala.inline
  def apply(items: IPlayReadySecureStopServiceRequest, returnValue: Double): ItemsIPlayReadySecureStopServiceRequest = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsIPlayReadySecureStopServiceRequest]
  }
}

