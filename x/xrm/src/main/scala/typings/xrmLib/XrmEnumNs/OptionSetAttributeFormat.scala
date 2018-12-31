package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OptionSetAttributeFormat extends js.Object

/**
  * Constant Enum: OptionSet attribute formats for Attributes.Attribute.getFormat(), used by {@link Attributes.OptionSetAttribute OptionSetAttribute}.
  * @see {@link Xrm.Attributes.OptionSetAttributeFormat}
  */
@JSGlobal("XrmEnum.OptionSetAttributeFormat")
@js.native
object OptionSetAttributeFormat extends js.Object {
  @js.native
  sealed trait Language
    extends xrmLib.XrmEnumNs.OptionSetAttributeFormat
  
  @js.native
  sealed trait TimeZone
    extends xrmLib.XrmEnumNs.OptionSetAttributeFormat
  
  /* "language" */ val Language: Language with java.lang.String = js.native
  /* "timezone" */ val TimeZone: TimeZone with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[xrmLib.XrmEnumNs.OptionSetAttributeFormat with java.lang.String] = js.native
}

