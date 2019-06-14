package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: Submit Modes for {@link Attributes.Attribute.setSubmitMode} Attributes.Attribute.setSubmitMode().
  * @see {@link Xrm.SubmitMode}
  */
/* Rewritten from type alias, can be one of: 
  - xrmLib.xrmLibStrings.always
  - xrmLib.xrmLibStrings.dirty
  - xrmLib.xrmLibStrings.never
*/
trait SubmitMode extends js.Object

object SubmitMode {
  @scala.inline
  def Always: xrmLib.xrmLibStrings.always = this.cast("always")
  @scala.inline
  def Dirty: xrmLib.xrmLibStrings.dirty = this.cast("dirty")
  @scala.inline
  def Never: xrmLib.xrmLibStrings.never = this.cast("never")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

