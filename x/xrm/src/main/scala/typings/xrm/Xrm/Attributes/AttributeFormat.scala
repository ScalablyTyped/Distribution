package typings.xrm.Xrm.Attributes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Attribute formats for {@link Attributes.Attribute.getFormat Attributes.Attribute.getFormat()}.
  * @see {@link XrmEnum.DateAttributeFormat}
  * @see {@link XrmEnum.IntegerAttributeFormat}
  * @see {@link XrmEnum.OptionSetAttributeFormat}
  * @see {@link XrmEnum.StringAttributeFormat}
  */
/* Rewritten from type alias, can be one of: 
  - typings.xrm.xrmStrings.date
  - typings.xrm.xrmStrings.datetime
  - typings.xrm.xrmStrings.duration
  - typings.xrm.xrmStrings.none
  - typings.xrm.xrmStrings.language
  - typings.xrm.xrmStrings.timezone
  - typings.xrm.xrmStrings.email
  - typings.xrm.xrmStrings.phone
  - typings.xrm.xrmStrings.text
  - typings.xrm.xrmStrings.textarea
  - typings.xrm.xrmStrings.tickersymbol
  - typings.xrm.xrmStrings.url
*/
trait AttributeFormat extends js.Object

object AttributeFormat {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def date: typings.xrm.xrmStrings.date = this.cast("date")
  @scala.inline
  def datetime: typings.xrm.xrmStrings.datetime = this.cast("datetime")
  @scala.inline
  def duration: typings.xrm.xrmStrings.duration = this.cast("duration")
  @scala.inline
  def email: typings.xrm.xrmStrings.email = this.cast("email")
  @scala.inline
  def language: typings.xrm.xrmStrings.language = this.cast("language")
  @scala.inline
  def none: typings.xrm.xrmStrings.none = this.cast("none")
  @scala.inline
  def phone: typings.xrm.xrmStrings.phone = this.cast("phone")
  @scala.inline
  def text: typings.xrm.xrmStrings.text = this.cast("text")
  @scala.inline
  def textarea: typings.xrm.xrmStrings.textarea = this.cast("textarea")
  @scala.inline
  def tickersymbol: typings.xrm.xrmStrings.tickersymbol = this.cast("tickersymbol")
  @scala.inline
  def timezone: typings.xrm.xrmStrings.timezone = this.cast("timezone")
  @scala.inline
  def url: typings.xrm.xrmStrings.url = this.cast("url")
}

