package typings.uiRouterExtras.mod.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFutureStateProvider extends js.Object {
  /**
    * Adds a resolve function.
    * `$futureStateProvider` won't reject any state transitions or routes until all resolveFunction promises have been resolved.
    * Resolves may be used to defer routing until the states have been loaded via $http, for instance.
    */
  def addResolve(resolveFn: IResolveFunction): Unit = js.native
  /**
    * Registers a `FutureState` object as a placeholder for a full UI-Router `state` or `state` tree.
    */
  def futureState(state: IFutureState): Unit = js.native
  /**
    * Registers a `StateFactory` function for `FutureState` of type `type`.
    */
  def stateFactory(`type`: String, stateFactory: IFutureStateFactory): Unit = js.native
}

object IFutureStateProvider {
  @scala.inline
  def apply(
    addResolve: IResolveFunction => Unit,
    futureState: IFutureState => Unit,
    stateFactory: (String, IFutureStateFactory) => Unit
  ): IFutureStateProvider = {
    val __obj = js.Dynamic.literal(addResolve = js.Any.fromFunction1(addResolve), futureState = js.Any.fromFunction1(futureState), stateFactory = js.Any.fromFunction2(stateFactory))
    __obj.asInstanceOf[IFutureStateProvider]
  }
  @scala.inline
  implicit class IFutureStateProviderOps[Self <: IFutureStateProvider] (val x: Self) extends AnyVal {
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
    def setAddResolve(value: IResolveFunction => Unit): Self = this.set("addResolve", js.Any.fromFunction1(value))
    @scala.inline
    def setFutureState(value: IFutureState => Unit): Self = this.set("futureState", js.Any.fromFunction1(value))
    @scala.inline
    def setStateFactory(value: (String, IFutureStateFactory) => Unit): Self = this.set("stateFactory", js.Any.fromFunction2(value))
  }
  
}

