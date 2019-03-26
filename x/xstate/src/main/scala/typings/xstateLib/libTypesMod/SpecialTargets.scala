package typings
package xstateLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SpecialTargets extends js.Object

@JSImport("xstate/lib/types", "SpecialTargets")
@js.native
object SpecialTargets extends js.Object {
  @js.native
  sealed trait Internal
    extends xstateLib.libTypesMod.SpecialTargets
  
  @js.native
  sealed trait Parent
    extends xstateLib.libTypesMod.SpecialTargets
  
  /* "#_internal" */ val Internal: Internal with java.lang.String = js.native
  /* "#_parent" */ val Parent: Parent with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[xstateLib.libTypesMod.SpecialTargets with java.lang.String] = js.native
}

