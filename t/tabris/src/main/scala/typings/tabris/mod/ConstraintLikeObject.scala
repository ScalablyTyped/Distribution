package typings.tabris.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.tabris.AnonOffset
  - typings.tabris.AnonReference
*/
trait ConstraintLikeObject extends _ConstraintValue

object ConstraintLikeObject {
  @scala.inline
  def AnonOffset(reference: SiblingReferenceValue | PercentValue, offset: Int | Double = null): ConstraintLikeObject = {
    val __obj = js.Dynamic.literal(reference = reference.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstraintLikeObject]
  }
  @scala.inline
  def AnonReference(offset: Offset, reference: SiblingReferenceValue | PercentValue = null): ConstraintLikeObject = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
    if (reference != null) __obj.updateDynamic("reference")(reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstraintLikeObject]
  }
}

