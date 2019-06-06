package typings
package atUifabricUtilitiesLib.libSelectionSelectionDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionMode extends js.Object

@JSImport("@uifabric/utilities/lib/selection/Selection.types", "SelectionMode")
@js.native
object SelectionMode extends js.Object {
  @js.native
  sealed trait multiple
    extends atUifabricUtilitiesLib.libSelectionSelectionDotTypesMod.SelectionMode
  
  @js.native
  sealed trait none
    extends atUifabricUtilitiesLib.libSelectionSelectionDotTypesMod.SelectionMode
  
  @js.native
  sealed trait single
    extends atUifabricUtilitiesLib.libSelectionSelectionDotTypesMod.SelectionMode
  
  /* 2 */ val multiple: multiple with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 1 */ val single: single with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    atUifabricUtilitiesLib.libSelectionSelectionDotTypesMod.SelectionMode with scala.Double
  ] = js.native
}

