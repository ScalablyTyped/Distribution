package typings.tensorflowTfjsConverter.compiledApiMod.CollectionDef

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a NodeList. */
trait INodeList extends js.Object {
  /** NodeList value */
  var value: js.UndefOr[js.Array[String] | Null] = js.undefined
}

object INodeList {
  @scala.inline
  def apply(value: js.Array[String] = null): INodeList = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[INodeList]
  }
}

