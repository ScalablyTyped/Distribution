package typings.uiDashRouterDashExtras.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ui {
  import typings.angular.angularMod.IPromise
  import typings.angular.angularMod.Injectable

  /**
    * `StateFactory` factories convert `FutureState` into a full UI-Router `state`, or `state` tree
    */
  type IFutureStateFactory = Injectable[
    js.Function1[
      /* repeated */ js.Any, 
      IPromise[
        js.UndefOr[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IState */ js.Any
        ]
      ]
    ]
  ]
  type IResolveFunction = Injectable[js.Function1[/* repeated */ js.Any, IPromise[js.Any]]]
}
