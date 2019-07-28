package typings.atTensorflowTfjsDashConverter.distSrcOperationsTypesMod

import org.scalablytyped.runtime.StringDictionary
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
  var rawAttrs: js.UndefOr[
    StringDictionary[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify tensorflow.IAttrValue */ js.Any
    ]
  ] = js.undefined
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
    rawAttrs: StringDictionary[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify tensorflow.IAttrValue */ js.Any
    ] = null
  ): Node = {
    val __obj = js.Dynamic.literal(attrParams = attrParams, category = category, children = children, inputNames = inputNames, inputParams = inputParams, inputs = inputs, name = name, op = op)
    if (rawAttrs != null) __obj.updateDynamic("rawAttrs")(rawAttrs)
    __obj.asInstanceOf[Node]
  }
}

