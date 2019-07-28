package typings.xrm.XrmEnumNs

import typings.xrm.xrmStrings.email
import typings.xrm.xrmStrings.phone
import typings.xrm.xrmStrings.text
import typings.xrm.xrmStrings.textarea
import typings.xrm.xrmStrings.tickersymbol
import typings.xrm.xrmStrings.url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: String attribute formats for Attributes.Attribute.getFormat(), used by {@link Attributes.StringAttribute StringAttribute}.
  * @see {@link Xrm.Attributes.StringAttributeFormat}
  */
/* Rewritten from type alias, can be one of: 
  - typings.xrm.xrmStrings.email
  - typings.xrm.xrmStrings.phone
  - typings.xrm.xrmStrings.text
  - typings.xrm.xrmStrings.textarea
  - typings.xrm.xrmStrings.tickersymbol
  - typings.xrm.xrmStrings.url
*/
trait StringAttributeFormat extends js.Object

object StringAttributeFormat {
  @scala.inline
  def Email: email = this.cast("email")
  @scala.inline
  def Phone: phone = this.cast("phone")
  @scala.inline
  def Text: text = this.cast("text")
  @scala.inline
  def TextArea: textarea = this.cast("textarea")
  @scala.inline
  def TickerSymbol: tickersymbol = this.cast("tickersymbol")
  @scala.inline
  def URL: url = this.cast("url")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

