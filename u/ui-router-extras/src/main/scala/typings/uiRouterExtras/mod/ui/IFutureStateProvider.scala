package typings.uiRouterExtras.mod.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFutureStateProvider extends js.Object {
  /**
    * Adds a resolve function.
    * `$futureStateProvider` won't reject any state transitions or routes until all resolveFunction promises have been resolved.
    * Resolves may be used to defer routing until the states have been loaded via $http, for instance.
    */
  def addResolve(resolveFn: IResolveFunction): Unit
  /**
    * Registers a `FutureState` object as a placeholder for a full UI-Router `state` or `state` tree.
    */
  def futureState(state: IFutureState): Unit
  /**
    * Registers a `StateFactory` function for `FutureState` of type `type`.
    */
  def stateFactory(`type`: String, stateFactory: IFutureStateFactory): Unit
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
}

