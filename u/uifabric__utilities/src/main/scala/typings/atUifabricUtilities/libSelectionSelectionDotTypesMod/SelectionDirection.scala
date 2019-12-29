package typings.atUifabricUtilities.libSelectionSelectionDotTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionDirection extends js.Object

@JSImport("@uifabric/utilities/lib/selection/Selection.types", "SelectionDirection")
@js.native
object SelectionDirection extends js.Object {
  @js.native
  sealed trait horizontal extends SelectionDirection
  
  @js.native
  sealed trait vertical extends SelectionDirection
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectionDirection with Double] = js.native
  /* 0 */ @js.native
  object horizontal extends TopLevel[horizontal with Double]
  
  /* 1 */ @js.native
  object vertical extends TopLevel[vertical with Double]
  
}

