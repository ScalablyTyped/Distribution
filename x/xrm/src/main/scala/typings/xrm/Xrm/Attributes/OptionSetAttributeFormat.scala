package typings.xrm.Xrm.Attributes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * OptionSet attribute formats for Attributes.Attribute.getFormat(), used by {@link Attributes.OptionSetAttribute OptionSetAttribute}.
  * @see {@link XrmEnum.OptionSetAttributeFormat}
  */
/* Rewritten from type alias, can be one of: 
  - typings.xrm.xrmStrings.language
  - typings.xrm.xrmStrings.timezone
*/
trait OptionSetAttributeFormat extends js.Object

object OptionSetAttributeFormat {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def language: typings.xrm.xrmStrings.language = this.cast("language")
  @scala.inline
  def timezone: typings.xrm.xrmStrings.timezone = this.cast("timezone")
}

