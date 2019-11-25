package typings.xrm.Xrm.Attributes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * String attribute formats for Attributes.Attribute.getFormat(), used by {@link Attributes.StringAttribute StringAttribute}.
  * @see {@link XrmEnum.StringAttributeFormat}
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
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def email: typings.xrm.xrmStrings.email = this.cast("email")
  @scala.inline
  def phone: typings.xrm.xrmStrings.phone = this.cast("phone")
  @scala.inline
  def text: typings.xrm.xrmStrings.text = this.cast("text")
  @scala.inline
  def textarea: typings.xrm.xrmStrings.textarea = this.cast("textarea")
  @scala.inline
  def tickersymbol: typings.xrm.xrmStrings.tickersymbol = this.cast("tickersymbol")
  @scala.inline
  def url: typings.xrm.xrmStrings.url = this.cast("url")
}

