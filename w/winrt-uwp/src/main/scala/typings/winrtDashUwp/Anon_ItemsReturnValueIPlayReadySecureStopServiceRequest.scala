package typings.winrtDashUwp

import typings.winrtDashUwp.Windows.Media.Protection.PlayReady.IPlayReadySecureStopServiceRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueIPlayReadySecureStopServiceRequest extends js.Object {
  /** The items in the collection. */ var items: IPlayReadySecureStopServiceRequest
  /** The number of items in the collection. */ var returnValue: Double
}

object Anon_ItemsReturnValueIPlayReadySecureStopServiceRequest {
  @scala.inline
  def apply(items: IPlayReadySecureStopServiceRequest, returnValue: Double): Anon_ItemsReturnValueIPlayReadySecureStopServiceRequest = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ItemsReturnValueIPlayReadySecureStopServiceRequest]
  }
}

