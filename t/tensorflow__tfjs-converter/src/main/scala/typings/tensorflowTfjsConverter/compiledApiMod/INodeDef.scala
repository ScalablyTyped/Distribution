package typings.tensorflowTfjsConverter.compiledApiMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INodeDef extends js.Object {
  /** NodeDef attr */
  var attr: js.UndefOr[StringDictionary[IAttrValue] | Null] = js.undefined
  /** NodeDef device */
  var device: js.UndefOr[String | Null] = js.undefined
  /** NodeDef input */
  var input: js.UndefOr[js.Array[String] | Null] = js.undefined
  /** NodeDef name */
  var name: js.UndefOr[String | Null] = js.undefined
  /** NodeDef op */
  var op: js.UndefOr[String | Null] = js.undefined
}

object INodeDef {
  @scala.inline
  def apply(
    attr: StringDictionary[IAttrValue] = null,
    device: String = null,
    input: js.Array[String] = null,
    name: String = null,
    op: String = null
  ): INodeDef = {
    val __obj = js.Dynamic.literal()
    if (attr != null) __obj.updateDynamic("attr")(attr.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (op != null) __obj.updateDynamic("op")(op.asInstanceOf[js.Any])
    __obj.asInstanceOf[INodeDef]
  }
}

