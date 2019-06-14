package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: Requirement Level for {@link Attributes.Attribute.getRequiredLevel Attributes.Attribute.getRequiredLevel()} and
  * {@link Attributes.Attribute.setRequiredLevel Attributes.Attribute.setRequiredLevel()}.
  * @see {@link Xrm.Attributes.RequirementLevel}
  */
/* Rewritten from type alias, can be one of: 
  - xrmLib.xrmLibStrings.none
  - xrmLib.xrmLibStrings.recommended
  - xrmLib.xrmLibStrings.required
*/
trait AttributeRequirementLevel extends js.Object

object AttributeRequirementLevel {
  @scala.inline
  def None: xrmLib.xrmLibStrings.none = this.cast("none")
  @scala.inline
  def Recommended: xrmLib.xrmLibStrings.recommended = this.cast("recommended")
  @scala.inline
  def Required: xrmLib.xrmLibStrings.required = this.cast("required")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

