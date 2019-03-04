package typings
package webcolaLib.distSrcLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Link[NodeRefType] extends js.Object {
  var length: js.UndefOr[scala.Double] = js.undefined
  var source: NodeRefType
  var target: NodeRefType
  var weight: js.UndefOr[scala.Double] = js.undefined
}

object Link {
  @scala.inline
  def apply[NodeRefType](
    source: NodeRefType,
    target: NodeRefType,
    length: scala.Int | scala.Double = null,
    weight: scala.Int | scala.Double = null
  ): Link[NodeRefType] = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Link[NodeRefType]]
  }
}

