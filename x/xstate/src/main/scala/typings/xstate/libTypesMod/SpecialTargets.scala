package typings.xstate.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SpecialTargets extends StObject
@JSImport("xstate/lib/types", "SpecialTargets")
@js.native
object SpecialTargets extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SpecialTargets & String] = js.native
  
  @js.native
  sealed trait Internal
    extends StObject
       with SpecialTargets
  /* "#_internal" */ val Internal: typings.xstate.libTypesMod.SpecialTargets.Internal & String = js.native
  
  @js.native
  sealed trait Parent
    extends StObject
       with SpecialTargets
  /* "#_parent" */ val Parent: typings.xstate.libTypesMod.SpecialTargets.Parent & String = js.native
}
