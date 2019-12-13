package typings.atTensorflowTfjsDashConverter.distSrcOperationsTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.atTensorflowTfjsDashConverter.distSrcDataCompiledUnderscoreApiMod.IAttrValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  var attrParams: StringDictionary[ParamValue]
  var category: Category
  var children: js.Array[Node]
  var inputNames: js.Array[String]
  var inputParams: StringDictionary[InputParamValue]
  var inputs: js.Array[Node]
  var name: String
  var op: String
  var rawAttrs: js.UndefOr[StringDictionary[IAttrValue]] = js.undefined
  var signatureKey: js.UndefOr[String] = js.undefined
}

object Node {
  @scala.inline
  def apply(
    attrParams: StringDictionary[ParamValue],
    category: Category,
    children: js.Array[Node],
    inputNames: js.Array[String],
    inputParams: StringDictionary[InputParamValue],
    inputs: js.Array[Node],
    name: String,
    op: String,
    rawAttrs: StringDictionary[IAttrValue] = null,
    signatureKey: String = null
  ): Node = {
    val __obj = js.Dynamic.literal(attrParams = attrParams.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], inputNames = inputNames.asInstanceOf[js.Any], inputParams = inputParams.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any])
    if (rawAttrs != null) __obj.updateDynamic("rawAttrs")(rawAttrs.asInstanceOf[js.Any])
    if (signatureKey != null) __obj.updateDynamic("signatureKey")(signatureKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

