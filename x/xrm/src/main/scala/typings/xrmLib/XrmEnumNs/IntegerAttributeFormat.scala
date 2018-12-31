package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IntegerAttributeFormat extends js.Object

/**
  * Constant Enum: Integer attribute formats for Attributes.Attribute.getFormat(), used by {@link Attributes.NumberAttribute NumberAttribute}.
  * @see {@link Xrm.Attributes.IntegerAttributeFormat}
  */
@JSGlobal("XrmEnum.IntegerAttributeFormat")
@js.native
object IntegerAttributeFormat extends js.Object {
  @js.native
  sealed trait Duration
    extends xrmLib.XrmEnumNs.IntegerAttributeFormat
  
  @js.native
  sealed trait None
    extends xrmLib.XrmEnumNs.IntegerAttributeFormat
  
  /* "duration" */ val Duration: Duration with java.lang.String = js.native
  /* "none" */ val None: None with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[xrmLib.XrmEnumNs.IntegerAttributeFormat with java.lang.String] = js.native
}

