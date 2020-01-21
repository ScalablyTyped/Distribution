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
    b: js.UndefOr[Boolean] = js.undefined,
    f: Int | Double = null,
    func: INameAttrList = null,
    i: Double | String = null,
    list: IListValue = null,
    placeholder: String = null,
    s: String = null,
    shape: ITensorShape = null,
    tensor: ITensor = null,
    `type`: DataType = null
  ): IAttrValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(b)) __obj.updateDynamic("b")(b.asInstanceOf[js.Any])
    if (f != null) __obj.updateDynamic("f")(f.asInstanceOf[js.Any])
    if (func != null) __obj.updateDynamic("func")(func.asInstanceOf[js.Any])
    if (i != null) __obj.updateDynamic("i")(i.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (s != null) __obj.updateDynamic("s")(s.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (tensor != null) __obj.updateDynamic("tensor")(tensor.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAttrValue]
  }
}

