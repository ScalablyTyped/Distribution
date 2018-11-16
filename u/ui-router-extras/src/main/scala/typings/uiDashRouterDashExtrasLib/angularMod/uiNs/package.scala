package typings
package uiDashRouterDashExtrasLib.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object uiNs {
  /**
           * `StateFactory` factories convert `FutureState` into a full UI-Router `state`, or `state` tree
           */
  type IFutureStateFactory = angularLib.angularMod.angularNs.Injectable[
    js.Function1[/* repeated */js.Any, angularLib.angularMod.angularNs.IPromise[js.UndefOr[js.Any]]]
  ]
  type IResolveFunction = angularLib.angularMod.angularNs.Injectable[
    js.Function1[/* repeated */js.Any, angularLib.angularMod.angularNs.IPromise[js.Any]]
  ]
}
