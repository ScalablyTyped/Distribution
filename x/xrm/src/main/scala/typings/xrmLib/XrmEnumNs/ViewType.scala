package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ViewType extends js.Object

/**
     * An enumeration for view types.
     */
@JSGlobal("XrmEnum.ViewType")
@js.native
object ViewType extends js.Object {
  @js.native
  sealed trait SystemView
    extends xrmLib.XrmEnumNs.ViewType
  
  @js.native
  sealed trait UserView
    extends xrmLib.XrmEnumNs.ViewType
  
  /* 1039 */ val SystemView: SystemView with scala.Double = js.native
  /* 4230 */ val UserView: UserView with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[xrmLib.XrmEnumNs.ViewType with scala.Double] = js.native
}

