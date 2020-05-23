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
    attr: js.UndefOr[Null | StringDictionary[IAttrValue]] = js.undefined,
    device: js.UndefOr[Null | String] = js.undefined,
    input: js.UndefOr[Null | js.Array[String]] = js.undefined,
    name: js.UndefOr[Null | String] = js.undefined,
    op: js.UndefOr[Null | String] = js.undefined
  ): INodeDef = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(attr)) __obj.updateDynamic("attr")(attr.asInstanceOf[js.Any])
    if (!js.isUndefined(device)) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (!js.isUndefined(input)) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(op)) __obj.updateDynamic("op")(op.asInstanceOf[js.Any])
    __obj.asInstanceOf[INodeDef]
  }
}

