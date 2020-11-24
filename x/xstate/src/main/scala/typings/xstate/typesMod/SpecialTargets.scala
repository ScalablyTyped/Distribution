package typings.xstate.typesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SpecialTargets extends js.Object
@JSImport("xstate/lib/types", "SpecialTargets")
@js.native
object SpecialTargets extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SpecialTargets with String] = js.native
  
  @js.native
  sealed trait Internal extends SpecialTargets
  /* "#_internal" */ @js.native
  object Internal extends TopLevel[Internal with String]
  
  @js.native
  sealed trait Parent extends SpecialTargets
  /* "#_parent" */ @js.native
  object Parent extends TopLevel[Parent with String]
}
