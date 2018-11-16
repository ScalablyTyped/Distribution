package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ClientFormFactor extends js.Object

@JSGlobal("XrmEnum.ClientFormFactor")
@js.native
object ClientFormFactor extends js.Object {
  @js.native
  sealed trait Desktop
    extends xrmLib.XrmEnumNs.ClientFormFactor
  
  @js.native
  sealed trait Phone
    extends xrmLib.XrmEnumNs.ClientFormFactor
  
  @js.native
  sealed trait Tablet
    extends xrmLib.XrmEnumNs.ClientFormFactor
  
  @js.native
  sealed trait Unknown
    extends xrmLib.XrmEnumNs.ClientFormFactor
  
  /* 2 */ val Desktop: Desktop with scala.Double = js.native
  /* 4 */ val Phone: Phone with scala.Double = js.native
  /* 3 */ val Tablet: Tablet with scala.Double = js.native
  /* 1 */ val Unknown: Unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[xrmLib.XrmEnumNs.ClientFormFactor with scala.Double] = js.native
}

