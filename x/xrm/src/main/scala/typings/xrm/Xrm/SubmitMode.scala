package typings.xrm.Xrm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Submit Mode for {@link Attributes.Attribute.setSubmitMode} Attributes.Attribute.setSubmitMode().
  * @see {@link XrmEnum.SubmitMode}
  */
/* Rewritten from type alias, can be one of: 
  - typings.xrm.xrmStrings.always
  - typings.xrm.xrmStrings.dirty
  - typings.xrm.xrmStrings.never
*/
trait SubmitMode extends js.Object

object SubmitMode {
  @scala.inline
  def always: typings.xrm.xrmStrings.always = this.cast("always")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dirty: typings.xrm.xrmStrings.dirty = this.cast("dirty")
  @scala.inline
  def never: typings.xrm.xrmStrings.never = this.cast("never")
}

