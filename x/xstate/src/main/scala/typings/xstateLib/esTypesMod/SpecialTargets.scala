package typings
package xstateLib.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SpecialTargets extends js.Object

@JSImport("xstate/es/types", "SpecialTargets")
@js.native
object SpecialTargets extends js.Object {
  @js.native
  sealed trait Internal
    extends xstateLib.esTypesMod.SpecialTargets
  
  @js.native
  sealed trait Parent
    extends xstateLib.esTypesMod.SpecialTargets
  
  /* "#_internal" */ val Internal: Internal with java.lang.String = js.native
  /* "#_parent" */ val Parent: Parent with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[xstateLib.esTypesMod.SpecialTargets with java.lang.String] = js.native
}

