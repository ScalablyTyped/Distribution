package typings
package atTensorflowTfjsDashConverterLib.distSrcOperationsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  var attrParams: org.scalablytyped.runtime.StringDictionary[ParamValue]
  var category: Category
  var children: js.Array[Node]
  var inputNames: js.Array[java.lang.String]
  var inputParams: org.scalablytyped.runtime.StringDictionary[InputParamValue]
  var inputs: js.Array[Node]
  var name: java.lang.String
  var op: java.lang.String
  var rawAttrs: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify tensorflow.IAttrValue */ js.Any
    ]
  ] = js.undefined
}

object Node {
  @scala.inline
  def apply(
    attrParams: org.scalablytyped.runtime.StringDictionary[ParamValue],
    category: Category,
    children: js.Array[Node],
    inputNames: js.Array[java.lang.String],
    inputParams: org.scalablytyped.runtime.StringDictionary[InputParamValue],
    inputs: js.Array[Node],
    name: java.lang.String,
    op: java.lang.String,
    rawAttrs: org.scalablytyped.runtime.StringDictionary[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify tensorflow.IAttrValue */ js.Any
    ] = null
  ): Node = {
    val __obj = js.Dynamic.literal(attrParams = attrParams, category = category, children = children, inputNames = inputNames, inputParams = inputParams, inputs = inputs, name = name, op = op)
    if (rawAttrs != null) __obj.updateDynamic("rawAttrs")(rawAttrs)
    __obj.asInstanceOf[Node]
  }
}

