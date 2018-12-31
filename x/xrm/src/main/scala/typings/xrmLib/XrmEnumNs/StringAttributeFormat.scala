package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StringAttributeFormat extends js.Object

/**
  * Constant Enum: String attribute formats for Attributes.Attribute.getFormat(), used by {@link Attributes.StringAttribute StringAttribute}.
  * @see {@link Xrm.Attributes.StringAttributeFormat}
  */
@JSGlobal("XrmEnum.StringAttributeFormat")
@js.native
object StringAttributeFormat extends js.Object {
  @js.native
  sealed trait Email
    extends xrmLib.XrmEnumNs.StringAttributeFormat
  
  @js.native
  sealed trait Phone
    extends xrmLib.XrmEnumNs.StringAttributeFormat
  
  @js.native
  sealed trait Text
    extends xrmLib.XrmEnumNs.StringAttributeFormat
  
  @js.native
  sealed trait TextArea
    extends xrmLib.XrmEnumNs.StringAttributeFormat
  
  @js.native
  sealed trait TickerSymbol
    extends xrmLib.XrmEnumNs.StringAttributeFormat
  
  @js.native
  sealed trait URL
    extends xrmLib.XrmEnumNs.StringAttributeFormat
  
  /* "email" */ val Email: Email with java.lang.String = js.native
  /* "phone" */ val Phone: Phone with java.lang.String = js.native
  /* "text" */ val Text: Text with java.lang.String = js.native
  /* "textarea" */ val TextArea: TextArea with java.lang.String = js.native
  /* "tickersymbol" */ val TickerSymbol: TickerSymbol with java.lang.String = js.native
  /* "url" */ val URL: URL with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[xrmLib.XrmEnumNs.StringAttributeFormat with java.lang.String] = js.native
}

