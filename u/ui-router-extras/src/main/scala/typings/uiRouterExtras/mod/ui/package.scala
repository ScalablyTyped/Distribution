package typings.uiRouterExtras.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object ui {
  
  /**
    * `StateFactory` factories convert `FutureState` into a full UI-Router `state`, or `state` tree
    */
  type IFutureStateFactory = typings.angular.mod.Injectable[
    js.Function1[
      /* repeated */ js.Any, 
      typings.angular.mod.IPromise[
        js.UndefOr[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IState */ js.Any
        ]
      ]
    ]
  ]
  
  type IResolveFunction = typings.angular.mod.Injectable[js.Function1[/* repeated */ js.Any, typings.angular.mod.IPromise[js.Any]]]
}
