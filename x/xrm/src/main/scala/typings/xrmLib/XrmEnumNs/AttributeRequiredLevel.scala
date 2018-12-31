package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AttributeRequiredLevel extends js.Object

/**
  * An enumeration for Attribute required level metadata
  */
@JSGlobal("XrmEnum.AttributeRequiredLevel")
@js.native
object AttributeRequiredLevel extends js.Object {
  @js.native
  sealed trait ApplicationRequired
    extends xrmLib.XrmEnumNs.AttributeRequiredLevel
  
  @js.native
  sealed trait None
    extends xrmLib.XrmEnumNs.AttributeRequiredLevel
  
  @js.native
  sealed trait Recommended
    extends xrmLib.XrmEnumNs.AttributeRequiredLevel
  
  @js.native
  sealed trait SystemRequired
    extends xrmLib.XrmEnumNs.AttributeRequiredLevel
  
  /* 2 */ val ApplicationRequired: ApplicationRequired with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 3 */ val Recommended: Recommended with scala.Double = js.native
  /* 1 */ val SystemRequired: SystemRequired with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[xrmLib.XrmEnumNs.AttributeRequiredLevel with scala.Double] = js.native
}

