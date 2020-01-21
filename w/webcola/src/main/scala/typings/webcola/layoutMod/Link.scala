package typings.webcola.layoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Link[NodeRefType] extends js.Object {
  var length: js.UndefOr[Double] = js.undefined
  var source: NodeRefType
  var target: NodeRefType
  var weight: js.UndefOr[Double] = js.undefined
}

object Link {
  @scala.inline
  def apply[NodeRefType](source: NodeRefType, target: NodeRefType, length: Int | Double = null, weight: Int | Double = null): Link[NodeRefType] = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Link[NodeRefType]]
  }
}

