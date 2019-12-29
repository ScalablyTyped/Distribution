package typings.atUifabricUtilities.libSelectionSelectionDotTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionMode extends js.Object

@JSImport("@uifabric/utilities/lib/selection/Selection.types", "SelectionMode")
@js.native
object SelectionMode extends js.Object {
  @js.native
  sealed trait multiple extends SelectionMode
  
  @js.native
  sealed trait none extends SelectionMode
  
  @js.native
  sealed trait single extends SelectionMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectionMode with Double] = js.native
  /* 2 */ @js.native
  object multiple extends TopLevel[multiple with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 1 */ @js.native
  object single extends TopLevel[single with Double]
  
}

