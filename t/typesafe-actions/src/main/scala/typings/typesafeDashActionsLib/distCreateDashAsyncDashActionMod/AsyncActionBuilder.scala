package typings
package typesafeDashActionsLib.distCreateDashAsyncDashActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AsyncActionBuilder[T1 /* <: typesafeDashActionsLib.distTypesMod.StringType */, T2 /* <: typesafeDashActionsLib.distTypesMod.StringType */, T3 /* <: typesafeDashActionsLib.distTypesMod.StringType */, P1, P2, P3] extends js.Object {
  var failure: typesafeDashActionsLib.distTypesMod.FsaBuilder[
    T3, 
    typesafeDashActionsLib.distTypesMod.B[P3], 
    typesafeDashActionsLib.distTypesMod.B[scala.Unit]
  ]
  var request: typesafeDashActionsLib.distTypesMod.FsaBuilder[
    T1, 
    typesafeDashActionsLib.distTypesMod.B[P1], 
    typesafeDashActionsLib.distTypesMod.B[scala.Unit]
  ]
  var success: typesafeDashActionsLib.distTypesMod.FsaBuilder[
    T2, 
    typesafeDashActionsLib.distTypesMod.B[P2], 
    typesafeDashActionsLib.distTypesMod.B[scala.Unit]
  ]
}

