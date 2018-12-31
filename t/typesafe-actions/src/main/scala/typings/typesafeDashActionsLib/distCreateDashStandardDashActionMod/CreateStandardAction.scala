package typings
package typesafeDashActionsLib.distCreateDashStandardDashActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateStandardAction[T /* <: typesafeDashActionsLib.distTypesMod.StringType */] extends js.Object {
  def apply[P, M](): typesafeDashActionsLib.distTypesMod.FsaBuilder[
    T, 
    typesafeDashActionsLib.distTypesMod.Box[P], 
    typesafeDashActionsLib.distTypesMod.Box[M]
  ] = js.native
  def map[R, P, M](fn: js.Function2[/* payload */ P, /* meta */ M, R]): typesafeDashActionsLib.distTypesMod.FsaMapBuilder[
    T, 
    typesafeDashActionsLib.distTypesMod.Box[R], 
    typesafeDashActionsLib.distTypesMod.Box[P], 
    typesafeDashActionsLib.distTypesMod.Box[M]
  ] = js.native
}

