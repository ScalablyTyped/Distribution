package typings
package uiDashRouterDashExtrasLib.angularMod.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IFutureStateProvider extends js.Object {
  /**
               * Adds a resolve function.
               * `$futureStateProvider` won't reject any state transitions or routes until all resolveFunction promises have been resolved.
               * Resolves may be used to defer routing until the states have been loaded via $http, for instance.
               */
  def addResolve(resolveFn: IResolveFunction): scala.Unit
  /**
               * Registers a `FutureState` object as a placeholder for a full UI-Router `state` or `state` tree.
               */
  def futureState(state: IFutureState): scala.Unit
  /**
               * Registers a `StateFactory` function for `FutureState` of type `type`.
               */
  def stateFactory(`type`: java.lang.String, stateFactory: IFutureStateFactory): scala.Unit
}

