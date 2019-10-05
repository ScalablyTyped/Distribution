package typings.xrm.XrmEnum

import typings.xrm.xrmStrings.language
import typings.xrm.xrmStrings.timezone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: OptionSet attribute formats for Attributes.Attribute.getFormat(), used by {@link Attributes.OptionSetAttribute OptionSetAttribute}.
  * @see {@link Xrm.Attributes.OptionSetAttributeFormat}
  */
/* Rewritten from type alias, can be one of: 
  - typings.xrm.xrmStrings.language
  - typings.xrm.xrmStrings.timezone
*/
trait OptionSetAttributeFormat extends js.Object

object OptionSetAttributeFormat {
  @scala.inline
  def Language: language = this.cast("language")
  @scala.inline
  def TimeZone: timezone = this.cast("timezone")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

