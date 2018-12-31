package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DateAttributeFormat extends js.Object

/**
  * Constant Enum: Date attribute formats for Attributes.Attribute.getFormat(), used by {@link Attributes.DateAttribute DateAttribute}.
  * @see {@link Xrm.Attributes.DateAttributeFormat}
  */
@JSGlobal("XrmEnum.DateAttributeFormat")
@js.native
object DateAttributeFormat extends js.Object {
  @js.native
  sealed trait Date
    extends xrmLib.XrmEnumNs.DateAttributeFormat
  
  @js.native
  sealed trait DateTime
    extends xrmLib.XrmEnumNs.DateAttributeFormat
  
  /* "date" */ val Date: Date with java.lang.String = js.native
  /* "datetime" */ val DateTime: DateTime with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[xrmLib.XrmEnumNs.DateAttributeFormat with java.lang.String] = js.native
}

