package typings
package subscriptionsDashTransportDashWsLib.distClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observable[T] extends js.Object {
  def subscribe(observer: Observer[T]): subscriptionsDashTransportDashWsLib.Anon_Unsubscribe
}

object Observable {
  @scala.inline
  def apply[T](subscribe: js.Function1[Observer[T], subscriptionsDashTransportDashWsLib.Anon_Unsubscribe]): Observable[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("subscribe")(subscribe)
    __obj.asInstanceOf[Observable[T]]
  }
}

