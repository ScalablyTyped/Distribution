package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: Date attribute formats for Attributes.Attribute.getFormat(), used by {@link Attributes.DateAttribute DateAttribute}.
  * @see {@link Xrm.Attributes.DateAttributeFormat}
  */
/* Rewritten from type alias, can be one of: 
  - xrmLib.xrmLibStrings.date
  - xrmLib.xrmLibStrings.datetime
*/
trait DateAttributeFormat extends js.Object

object DateAttributeFormat {
  @scala.inline
  def Date: xrmLib.xrmLibStrings.date = this.cast("date")
  @scala.inline
  def DateTime: xrmLib.xrmLibStrings.datetime = this.cast("datetime")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

