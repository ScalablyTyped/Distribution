package typings.tensorflowTfjsConverter.compiledApiMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFunctionDef extends js.Object {
  /** FunctionDef attr */
  var attr: js.UndefOr[StringDictionary[IAttrValue] | Null] = js.undefined
  /** FunctionDef nodeDef */
  var nodeDef: js.UndefOr[js.Array[INodeDef] | Null] = js.undefined
  /** FunctionDef ret */
  var ret: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  /** FunctionDef signature */
  var signature: js.UndefOr[IOpDef | Null] = js.undefined
}

object IFunctionDef {
  @scala.inline
  def apply(
    attr: js.UndefOr[Null | StringDictionary[IAttrValue]] = js.undefined,
    nodeDef: js.UndefOr[Null | js.Array[INodeDef]] = js.undefined,
    ret: js.UndefOr[Null | StringDictionary[String]] = js.undefined,
    signature: js.UndefOr[Null | IOpDef] = js.undefined
  ): IFunctionDef = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(attr)) __obj.updateDynamic("attr")(attr.asInstanceOf[js.Any])
    if (!js.isUndefined(nodeDef)) __obj.updateDynamic("nodeDef")(nodeDef.asInstanceOf[js.Any])
    if (!js.isUndefined(ret)) __obj.updateDynamic("ret")(ret.asInstanceOf[js.Any])
    if (!js.isUndefined(signature)) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFunctionDef]
  }
}

