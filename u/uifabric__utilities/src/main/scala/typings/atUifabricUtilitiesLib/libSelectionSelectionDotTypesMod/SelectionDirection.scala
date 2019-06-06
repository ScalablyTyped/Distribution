package typings
package atUifabricUtilitiesLib.libSelectionSelectionDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionDirection extends js.Object

@JSImport("@uifabric/utilities/lib/selection/Selection.types", "SelectionDirection")
@js.native
object SelectionDirection extends js.Object {
  @js.native
  sealed trait horizontal
    extends atUifabricUtilitiesLib.libSelectionSelectionDotTypesMod.SelectionDirection
  
  @js.native
  sealed trait vertical
    extends atUifabricUtilitiesLib.libSelectionSelectionDotTypesMod.SelectionDirection
  
  /* 0 */ val horizontal: horizontal with scala.Double = js.native
  /* 1 */ val vertical: vertical with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    atUifabricUtilitiesLib.libSelectionSelectionDotTypesMod.SelectionDirection with scala.Double
  ] = js.native
}

