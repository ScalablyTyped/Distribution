package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: Integer attribute formats for Attributes.Attribute.getFormat(), used by {@link Attributes.NumberAttribute NumberAttribute}.
  * @see {@link Xrm.Attributes.IntegerAttributeFormat}
  */
/* Rewritten from type alias, can be one of: 
  - xrmLib.xrmLibStrings.duration
  - xrmLib.xrmLibStrings.none
*/
trait IntegerAttributeFormat extends js.Object

object IntegerAttributeFormat {
  @scala.inline
  def Duration: xrmLib.xrmLibStrings.duration = this.cast("duration")
  @scala.inline
  def None: xrmLib.xrmLibStrings.none = this.cast("none")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

