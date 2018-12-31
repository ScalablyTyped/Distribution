package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OpenFileOptions extends js.Object

/**
  * An enumeration for open file dialog options
  */
@JSGlobal("XrmEnum.OpenFileOptions")
@js.native
object OpenFileOptions extends js.Object {
  @js.native
  sealed trait Open
    extends xrmLib.XrmEnumNs.OpenFileOptions
  
  @js.native
  sealed trait Save
    extends xrmLib.XrmEnumNs.OpenFileOptions
  
  /* 1 */ val Open: Open with scala.Double = js.native
  /* 2 */ val Save: Save with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[xrmLib.XrmEnumNs.OpenFileOptions with scala.Double] = js.native
}

