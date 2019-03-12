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
  def apply[T](subscribe: Observer[T] => subscriptionsDashTransportDashWsLib.Anon_Unsubscribe): Observable[T] = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1(subscribe))
  
    __obj.asInstanceOf[Observable[T]]
  }
}

