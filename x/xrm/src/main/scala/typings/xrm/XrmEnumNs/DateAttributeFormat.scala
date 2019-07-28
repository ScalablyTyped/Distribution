package typings.xrm.XrmEnumNs

import typings.xrm.xrmStrings.date
import typings.xrm.xrmStrings.datetime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: Date attribute formats for Attributes.Attribute.getFormat(), used by {@link Attributes.DateAttribute DateAttribute}.
  * @see {@link Xrm.Attributes.DateAttributeFormat}
  */
/* Rewritten from type alias, can be one of: 
  - typings.xrm.xrmStrings.date
  - typings.xrm.xrmStrings.datetime
*/
trait DateAttributeFormat extends js.Object

object DateAttributeFormat {
  @scala.inline
  def Date: date = this.cast("date")
  @scala.inline
  def DateTime: datetime = this.cast("datetime")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

