package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: String attribute formats for Attributes.Attribute.getFormat(), used by {@link Attributes.StringAttribute StringAttribute}.
  * @see {@link Xrm.Attributes.StringAttributeFormat}
  */
/* Rewritten from type alias, can be one of: 
  - xrmLib.xrmLibStrings.email
  - xrmLib.xrmLibStrings.phone
  - xrmLib.xrmLibStrings.text
  - xrmLib.xrmLibStrings.textarea
  - xrmLib.xrmLibStrings.tickersymbol
  - xrmLib.xrmLibStrings.url
*/
trait StringAttributeFormat extends js.Object

object StringAttributeFormat {
  @scala.inline
  def Email: xrmLib.xrmLibStrings.email = this.cast("email")
  @scala.inline
  def Phone: xrmLib.xrmLibStrings.phone = this.cast("phone")
  @scala.inline
  def Text: xrmLib.xrmLibStrings.text = this.cast("text")
  @scala.inline
  def TextArea: xrmLib.xrmLibStrings.textarea = this.cast("textarea")
  @scala.inline
  def TickerSymbol: xrmLib.xrmLibStrings.tickersymbol = this.cast("tickersymbol")
  @scala.inline
  def URL: xrmLib.xrmLibStrings.url = this.cast("url")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

