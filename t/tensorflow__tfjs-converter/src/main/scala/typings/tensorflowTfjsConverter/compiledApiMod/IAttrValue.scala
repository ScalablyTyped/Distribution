package typings.tensorflowTfjsConverter.compiledApiMod

import typings.tensorflowTfjsConverter.compiledApiMod.AttrValue.IListValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAttrValue extends js.Object {
  /** AttrValue b */
  var b: js.UndefOr[Boolean | Null] = js.undefined
  /** AttrValue f */
  var f: js.UndefOr[Double | Null] = js.undefined
  /** AttrValue func */
  var func: js.UndefOr[INameAttrList | Null] = js.undefined
  /** AttrValue i */
  var i: js.UndefOr[Double | String | Null] = js.undefined
  /** AttrValue list */
  var list: js.UndefOr[IListValue | Null] = js.undefined
  /** AttrValue placeholder */
  var placeholder: js.UndefOr[String | Null] = js.undefined
  /** AttrValue s */
  var s: js.UndefOr[String | Null] = js.undefined
  /** AttrValue shape */
  var shape: js.UndefOr[ITensorShape | Null] = js.undefined
  /** AttrValue tensor */
  var tensor: js.UndefOr[ITensor | Null] = js.undefined
  /** AttrValue type */
  var `type`: js.UndefOr[DataType | Null] = js.undefined
}

object IAttrValue {
  @scala.inline
  def apply(
    b: js.UndefOr[Null | Boolean] = js.undefined,
    f: js.UndefOr[Null | Double] = js.undefined,
    func: js.UndefOr[Null | INameAttrList] = js.undefined,
    i: js.UndefOr[Null | Double | String] = js.undefined,
    list: js.UndefOr[Null | IListValue] = js.undefined,
    placeholder: js.UndefOr[Null | String] = js.undefined,
    s: js.UndefOr[Null | String] = js.undefined,
    shape: js.UndefOr[Null | ITensorShape] = js.undefined,
    tensor: js.UndefOr[Null | ITensor] = js.undefined,
    `type`: js.UndefOr[Null | DataType] = js.undefined
  ): IAttrValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(b)) __obj.updateDynamic("b")(b.asInstanceOf[js.Any])
    if (!js.isUndefined(f)) __obj.updateDynamic("f")(f.asInstanceOf[js.Any])
    if (!js.isUndefined(func)) __obj.updateDynamic("func")(func.asInstanceOf[js.Any])
    if (!js.isUndefined(i)) __obj.updateDynamic("i")(i.asInstanceOf[js.Any])
    if (!js.isUndefined(list)) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (!js.isUndefined(placeholder)) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(s)) __obj.updateDynamic("s")(s.asInstanceOf[js.Any])
    if (!js.isUndefined(shape)) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (!js.isUndefined(tensor)) __obj.updateDynamic("tensor")(tensor.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAttrValue]
  }
}

