package typings.subscriptionsDashTransportDashWs.distClientMod

import typings.subscriptionsDashTransportDashWs.Anon_Unsubscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observable[T] extends js.Object {
  def subscribe(observer: Observer[T]): Anon_Unsubscribe
}

object Observable {
  @scala.inline
  def apply[T](subscribe: Observer[T] => Anon_Unsubscribe): Observable[T] = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1(subscribe))
  
    __obj.asInstanceOf[Observable[T]]
  }
}

