package typings.atTensorflowTfjsDashConverter.distSrcDataCompiledUnderscoreApiMod

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
    attr: StringDictionary[IAttrValue] = null,
    nodeDef: js.Array[INodeDef] = null,
    ret: StringDictionary[String] = null,
    signature: IOpDef = null
  ): IFunctionDef = {
    val __obj = js.Dynamic.literal()
    if (attr != null) __obj.updateDynamic("attr")(attr.asInstanceOf[js.Any])
    if (nodeDef != null) __obj.updateDynamic("nodeDef")(nodeDef.asInstanceOf[js.Any])
    if (ret != null) __obj.updateDynamic("ret")(ret.asInstanceOf[js.Any])
    if (signature != null) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFunctionDef]
  }
}

