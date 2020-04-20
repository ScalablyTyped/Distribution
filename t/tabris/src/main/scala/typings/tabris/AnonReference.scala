package typings.tabris

import typings.tabris.mod.ConstraintLikeObject
import typings.tabris.mod.Offset
import typings.tabris.mod.PercentValue
import typings.tabris.mod.SiblingReferenceValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReference extends ConstraintLikeObject {
  var offset: Offset
  var reference: js.UndefOr[SiblingReferenceValue | PercentValue] = js.undefined
}

object AnonReference {
  @scala.inline
  def apply(offset: Offset, reference: SiblingReferenceValue | PercentValue = null): AnonReference = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
    if (reference != null) __obj.updateDynamic("reference")(reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReference]
  }
}

