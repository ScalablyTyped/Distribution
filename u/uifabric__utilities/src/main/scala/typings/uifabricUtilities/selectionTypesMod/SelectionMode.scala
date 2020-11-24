package typings.uifabricUtilities.selectionTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SelectionMode extends js.Object
@JSImport("@uifabric/utilities/lib/selection/Selection.types", "SelectionMode")
@js.native
object SelectionMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectionMode with Double] = js.native
  
  @js.native
  sealed trait multiple extends SelectionMode
  /* 2 */ @js.native
  object multiple extends TopLevel[multiple with Double]
  
  @js.native
  sealed trait none extends SelectionMode
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  @js.native
  sealed trait single extends SelectionMode
  /* 1 */ @js.native
  object single extends TopLevel[single with Double]
}
