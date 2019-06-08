package typings
package atWordpressDataLib.atWordpressDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Store[S, A /* <: reduxLib.reduxMod.AnyAction */] extends js.Object {
  var subscribe: Subscriber
  def dispatch(action: A): A
  def getState(): S
}

object Store {
  @scala.inline
  def apply[S, A /* <: reduxLib.reduxMod.AnyAction */](dispatch: A => A, getState: () => S, subscribe: Subscriber): Store[S, A] = {
    val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch), getState = js.Any.fromFunction0(getState), subscribe = subscribe)
  
    __obj.asInstanceOf[Store[S, A]]
  }
}

