package typings.tensorflowTfjsConverter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttrs extends js.Object {
  var attrs: AnonItems
  var category: AnonRef
  var customExecutor: AnonRef
  var inputs: AnonItems
  var tfOpName: AnonType
}

object AnonAttrs {
  @scala.inline
  def apply(
    attrs: AnonItems,
    category: AnonRef,
    customExecutor: AnonRef,
    inputs: AnonItems,
    tfOpName: AnonType
  ): AnonAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], customExecutor = customExecutor.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], tfOpName = tfOpName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAttrs]
  }
}

