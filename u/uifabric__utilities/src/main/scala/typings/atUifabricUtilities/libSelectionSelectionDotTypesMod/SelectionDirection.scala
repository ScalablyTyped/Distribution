package typings.atUifabricUtilities.libSelectionSelectionDotTypesMod

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
  
  /* 0 */ val horizontal: typings.atUifabricUtilities.libSelectionSelectionDotTypesMod.SelectionDirection.horizontal with Double = js.native
  /* 1 */ val vertical: typings.atUifabricUtilities.libSelectionSelectionDotTypesMod.SelectionDirection.vertical with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectionDirection with Double] = js.native
}

