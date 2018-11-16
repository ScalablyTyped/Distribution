package typings
package typesafeDashActionsLib.distCreateDashAsyncDashActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AsyncActionWithMappers[T1 /* <: typesafeDashActionsLib.distTypesMod.StringType */, T2 /* <: typesafeDashActionsLib.distTypesMod.StringType */, T3 /* <: typesafeDashActionsLib.distTypesMod.StringType */, A1, P1, A2, P2, A3, P3] extends js.Object {
  var failure: typesafeDashActionsLib.distTypesMod.MapBuilder[
    T3, 
    typesafeDashActionsLib.distTypesMod.B[A3], 
    typesafeDashActionsLib.distTypesMod.B[P3], 
    typesafeDashActionsLib.distTypesMod.B[scala.Unit]
  ]
  var request: typesafeDashActionsLib.distTypesMod.MapBuilder[
    T1, 
    typesafeDashActionsLib.distTypesMod.B[A1], 
    typesafeDashActionsLib.distTypesMod.B[P1], 
    typesafeDashActionsLib.distTypesMod.B[scala.Unit]
  ]
  var success: typesafeDashActionsLib.distTypesMod.MapBuilder[
    T2, 
    typesafeDashActionsLib.distTypesMod.B[A2], 
    typesafeDashActionsLib.distTypesMod.B[P2], 
    typesafeDashActionsLib.distTypesMod.B[scala.Unit]
  ]
}

