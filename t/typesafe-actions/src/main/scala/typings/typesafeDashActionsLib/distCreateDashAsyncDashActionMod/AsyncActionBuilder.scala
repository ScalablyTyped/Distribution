package typings
package typesafeDashActionsLib.distCreateDashAsyncDashActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncActionBuilder[T1 /* <: typesafeDashActionsLib.distTypesMod.StringType */, T2 /* <: typesafeDashActionsLib.distTypesMod.StringType */, T3 /* <: typesafeDashActionsLib.distTypesMod.StringType */, P1, P2, P3] extends js.Object {
  var failure: typesafeDashActionsLib.distTypesMod.FsaBuilder[
    T3, 
    typesafeDashActionsLib.distTypesMod.Box[P3], 
    typesafeDashActionsLib.distTypesMod.Box[scala.Unit]
  ]
  var request: typesafeDashActionsLib.distTypesMod.FsaBuilder[
    T1, 
    typesafeDashActionsLib.distTypesMod.Box[P1], 
    typesafeDashActionsLib.distTypesMod.Box[scala.Unit]
  ]
  var success: typesafeDashActionsLib.distTypesMod.FsaBuilder[
    T2, 
    typesafeDashActionsLib.distTypesMod.Box[P2], 
    typesafeDashActionsLib.distTypesMod.Box[scala.Unit]
  ]
}

