package typings.tensorflowTfjsConverter.compiledApiMod.AttrValue

import typings.tensorflowTfjsConverter.compiledApiMod.DataType
import typings.tensorflowTfjsConverter.compiledApiMod.INameAttrList
import typings.tensorflowTfjsConverter.compiledApiMod.ITensor
import typings.tensorflowTfjsConverter.compiledApiMod.ITensorShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ListValue. */
trait IListValue extends js.Object {
  /** ListValue b */
  var b: js.UndefOr[js.Array[Boolean] | Null] = js.undefined
  /** ListValue f */
  var f: js.UndefOr[js.Array[Double] | Null] = js.undefined
  /** ListValue func */
  var func: js.UndefOr[js.Array[INameAttrList] | Null] = js.undefined
  /** ListValue i */
  var i: js.UndefOr[(js.Array[Double | String]) | Null] = js.undefined
  /** ListValue s */
  var s: js.UndefOr[js.Array[String] | Null] = js.undefined
  /** ListValue shape */
  var shape: js.UndefOr[js.Array[ITensorShape] | Null] = js.undefined
  /** ListValue tensor */
  var tensor: js.UndefOr[js.Array[ITensor] | Null] = js.undefined
  /** ListValue type */
  var `type`: js.UndefOr[js.Array[DataType] | Null] = js.undefined
}

object IListValue {
  @scala.inline
  def apply(
    b: js.UndefOr[Null | js.Array[Boolean]] = js.undefined,
    f: js.UndefOr[Null | js.Array[Double]] = js.undefined,
    func: js.UndefOr[Null | js.Array[INameAttrList]] = js.undefined,
    i: js.UndefOr[Null | (js.Array[Double | String])] = js.undefined,
    s: js.UndefOr[Null | js.Array[String]] = js.undefined,
    shape: js.UndefOr[Null | js.Array[ITensorShape]] = js.undefined,
    tensor: js.UndefOr[Null | js.Array[ITensor]] = js.undefined,
    `type`: js.UndefOr[Null | js.Array[DataType]] = js.undefined
  ): IListValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(b)) __obj.updateDynamic("b")(b.asInstanceOf[js.Any])
    if (!js.isUndefined(f)) __obj.updateDynamic("f")(f.asInstanceOf[js.Any])
    if (!js.isUndefined(func)) __obj.updateDynamic("func")(func.asInstanceOf[js.Any])
    if (!js.isUndefined(i)) __obj.updateDynamic("i")(i.asInstanceOf[js.Any])
    if (!js.isUndefined(s)) __obj.updateDynamic("s")(s.asInstanceOf[js.Any])
    if (!js.isUndefined(shape)) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (!js.isUndefined(tensor)) __obj.updateDynamic("tensor")(tensor.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListValue]
  }
}

