package typings
package typesafeDashActionsLib.distCreateDashStandardDashActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateStandardAction[T /* <: typesafeDashActionsLib.distTypesMod.StringType */] extends js.Object {
  def apply[P, M](): typesafeDashActionsLib.distTypesMod.FsaBuilder[
    T, 
    typesafeDashActionsLib.distTypesMod.B[P], 
    typesafeDashActionsLib.distTypesMod.B[M]
  ] = js.native
  def map[R, P, M](fn: js.Function2[/* payload */ js.UndefOr[P], /* meta */ js.UndefOr[M], R]): typesafeDashActionsLib.distTypesMod.MapBuilder[
    T, 
    typesafeDashActionsLib.distTypesMod.B[R], 
    typesafeDashActionsLib.distTypesMod.B[P], 
    typesafeDashActionsLib.distTypesMod.B[M]
  ] = js.native
}

