package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WindowPositions extends js.Object

/**
  * An enumeration for window positions when opening a new window
  */
@JSGlobal("XrmEnum.WindowPositions")
@js.native
object WindowPositions extends js.Object {
  @js.native
  sealed trait Center
    extends xrmLib.XrmEnumNs.WindowPositions
  
  @js.native
  sealed trait Side
    extends xrmLib.XrmEnumNs.WindowPositions
  
  /* 1 */ val Center: Center with scala.Double = js.native
  /* 2 */ val Side: Side with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[xrmLib.XrmEnumNs.WindowPositions with scala.Double] = js.native
}

