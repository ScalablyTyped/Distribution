package typings.xrm.XrmEnumNs

import typings.xrm.xrmStrings.always
import typings.xrm.xrmStrings.dirty
import typings.xrm.xrmStrings.never
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: Submit Modes for {@link Attributes.Attribute.setSubmitMode} Attributes.Attribute.setSubmitMode().
  * @see {@link Xrm.SubmitMode}
  */
/* Rewritten from type alias, can be one of: 
  - typings.xrm.xrmStrings.always
  - typings.xrm.xrmStrings.dirty
  - typings.xrm.xrmStrings.never
*/
trait SubmitMode extends js.Object

object SubmitMode {
  @scala.inline
  def Always: always = this.cast("always")
  @scala.inline
  def Dirty: dirty = this.cast("dirty")
  @scala.inline
  def Never: never = this.cast("never")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

