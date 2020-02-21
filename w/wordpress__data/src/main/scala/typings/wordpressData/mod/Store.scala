package typings.wordpressData.mod

import typings.redux.mod.AnyAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Store[S, A /* <: AnyAction */] extends js.Object {
  var subscribe: Subscriber
  def dispatch(action: A): A
  def getState(): S
}

object Store {
  @scala.inline
  def apply[S, A /* <: AnyAction */](
    dispatch: A => A,
    getState: () => S,
    subscribe: /* callback */ js.Function0[Unit] => js.Function0[Unit]
  ): Store[S, A] = {
    val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch), getState = js.Any.fromFunction0(getState), subscribe = js.Any.fromFunction1(subscribe))
  
    __obj.asInstanceOf[Store[S, A]]
  }
}

