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
    b: js.Array[Boolean] = null,
    f: js.Array[Double] = null,
    func: js.Array[INameAttrList] = null,
    i: js.Array[Double | String] = null,
    s: js.Array[String] = null,
    shape: js.Array[ITensorShape] = null,
    tensor: js.Array[ITensor] = null,
    `type`: js.Array[DataType] = null
  ): IListValue = {
    val __obj = js.Dynamic.literal()
    if (b != null) __obj.updateDynamic("b")(b.asInstanceOf[js.Any])
    if (f != null) __obj.updateDynamic("f")(f.asInstanceOf[js.Any])
    if (func != null) __obj.updateDynamic("func")(func.asInstanceOf[js.Any])
    if (i != null) __obj.updateDynamic("i")(i.asInstanceOf[js.Any])
    if (s != null) __obj.updateDynamic("s")(s.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (tensor != null) __obj.updateDynamic("tensor")(tensor.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListValue]
  }
}

