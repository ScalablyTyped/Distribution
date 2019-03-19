package typings
package typeDashFestLib.typeDashFestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObservableLike extends js.Object {
  @JSName(org.scalablytyped.runtime.Symbol.observable)
  var observable: js.Function0[ObservableLike]
  def subscribe(observer: js.Function1[/* value */ js.Any, scala.Unit]): scala.Unit
}

object ObservableLike {
  @scala.inline
  def apply(
    observable: () => ObservableLike,
    subscribe: js.Function1[/* value */ js.Any, scala.Unit] => scala.Unit
  ): ObservableLike = {
    val __obj = js.Dynamic.literal(observable = js.Any.fromFunction0(observable), subscribe = js.Any.fromFunction1(subscribe))
  
    __obj.asInstanceOf[ObservableLike]
  }
}

