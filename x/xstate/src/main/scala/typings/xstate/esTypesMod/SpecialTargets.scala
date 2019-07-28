package typings.xstate.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SpecialTargets extends js.Object

@JSImport("xstate/es/types", "SpecialTargets")
@js.native
object SpecialTargets extends js.Object {
  @js.native
  sealed trait Internal extends SpecialTargets
  
  @js.native
  sealed trait Parent extends SpecialTargets
  
  /* "#_internal" */ val Internal: typings.xstate.esTypesMod.SpecialTargets.Internal with String = js.native
  /* "#_parent" */ val Parent: typings.xstate.esTypesMod.SpecialTargets.Parent with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SpecialTargets with String] = js.native
}

