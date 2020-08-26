package typings.wordpressData.mod

import typings.redux.mod.AnyAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Store[S, A /* <: AnyAction */] extends js.Object {
  var subscribe: Subscriber = js.native
  def dispatch(action: A): A = js.native
  def getState(): S = js.native
}

object Store {
  @scala.inline
  def apply[S, /* <: typings.redux.mod.AnyAction */ A](
    dispatch: A => A,
    getState: () => S,
    subscribe: /* callback */ js.Function0[Unit] => js.Function0[Unit]
  ): Store[S, A] = {
    val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch), getState = js.Any.fromFunction0(getState), subscribe = js.Any.fromFunction1(subscribe))
    __obj.asInstanceOf[Store[S, A]]
  }
  @scala.inline
  implicit class StoreOps[Self <: Store[_, _], S, /* <: typings.redux.mod.AnyAction */ A] (val x: Self with (Store[S, A])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDispatch(value: A => A): Self = this.set("dispatch", js.Any.fromFunction1(value))
    @scala.inline
    def setGetState(value: () => S): Self = this.set("getState", js.Any.fromFunction0(value))
    @scala.inline
    def setSubscribe(value: /* callback */ js.Function0[Unit] => js.Function0[Unit]): Self = this.set("subscribe", js.Any.fromFunction1(value))
  }
  
}

