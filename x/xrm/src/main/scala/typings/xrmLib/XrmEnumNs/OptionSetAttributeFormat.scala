package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: OptionSet attribute formats for Attributes.Attribute.getFormat(), used by {@link Attributes.OptionSetAttribute OptionSetAttribute}.
  * @see {@link Xrm.Attributes.OptionSetAttributeFormat}
  */
/* Rewritten from type alias, can be one of: 
  - xrmLib.xrmLibStrings.language
  - xrmLib.xrmLibStrings.timezone
*/
trait OptionSetAttributeFormat extends js.Object

object OptionSetAttributeFormat {
  @scala.inline
  def Language: xrmLib.xrmLibStrings.language = this.cast("language")
  @scala.inline
  def TimeZone: xrmLib.xrmLibStrings.timezone = this.cast("timezone")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

