package typings.tensorflowTfjsConverter.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attrs extends js.Object {
  var attrs: Items
  var category: Ref
  var customExecutor: Ref
  var inputs: Items
  var tfOpName: Type
}

object Attrs {
  @scala.inline
  def apply(attrs: Items, category: Ref, customExecutor: Ref, inputs: Items, tfOpName: Type): Attrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], customExecutor = customExecutor.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], tfOpName = tfOpName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attrs]
  }
}

