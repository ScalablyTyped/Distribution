package typings.tabris

import typings.tabris.mod.ConstraintLikeObject
import typings.tabris.mod.Offset
import typings.tabris.mod.PercentValue
import typings.tabris.mod.SiblingReferenceValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOffset extends ConstraintLikeObject {
  var offset: js.UndefOr[Offset] = js.undefined
  var reference: SiblingReferenceValue | PercentValue
}

object AnonOffset {
  @scala.inline
  def apply(reference: SiblingReferenceValue | PercentValue, offset: Int | Double = null): AnonOffset = {
    val __obj = js.Dynamic.literal(reference = reference.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOffset]
  }
}

