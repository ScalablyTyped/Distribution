package typings.atUifabricUtilities.libSelectionSelectionDotTypesMod

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
  
  /* 2 */ val multiple: typings.atUifabricUtilities.libSelectionSelectionDotTypesMod.SelectionMode.multiple with Double = js.native
  /* 0 */ val none: typings.atUifabricUtilities.libSelectionSelectionDotTypesMod.SelectionMode.none with Double = js.native
  /* 1 */ val single: typings.atUifabricUtilities.libSelectionSelectionDotTypesMod.SelectionMode.single with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectionMode with Double] = js.native
}

