package typings
package typesafeDashActionsLib.distCreateDashAsyncDashActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncActionWithMappers[T1 /* <: typesafeDashActionsLib.distTypesMod.StringType */, T2 /* <: typesafeDashActionsLib.distTypesMod.StringType */, T3 /* <: typesafeDashActionsLib.distTypesMod.StringType */, A1, P1, A2, P2, A3, P3] extends js.Object {
  var failure: typesafeDashActionsLib.distTypesMod.FsaMapBuilder[
    T3, 
    typesafeDashActionsLib.distTypesMod.Box[A3], 
    typesafeDashActionsLib.distTypesMod.Box[P3], 
    typesafeDashActionsLib.distTypesMod.Box[scala.Unit]
  ]
  var request: typesafeDashActionsLib.distTypesMod.FsaMapBuilder[
    T1, 
    typesafeDashActionsLib.distTypesMod.Box[A1], 
    typesafeDashActionsLib.distTypesMod.Box[P1], 
    typesafeDashActionsLib.distTypesMod.Box[scala.Unit]
  ]
  var success: typesafeDashActionsLib.distTypesMod.FsaMapBuilder[
    T2, 
    typesafeDashActionsLib.distTypesMod.Box[A2], 
    typesafeDashActionsLib.distTypesMod.Box[P2], 
    typesafeDashActionsLib.distTypesMod.Box[scala.Unit]
  ]
}

