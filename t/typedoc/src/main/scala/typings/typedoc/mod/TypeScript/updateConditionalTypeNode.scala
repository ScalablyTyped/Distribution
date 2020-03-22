package typings.typedoc.mod.TypeScript

import typings.typescript.mod.ConditionalTypeNode
import typings.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.updateConditionalTypeNode")
@js.native
object updateConditionalTypeNode extends js.Object {
  def apply(
    node: ConditionalTypeNode,
    checkType: TypeNode,
    extendsType: TypeNode,
    trueType: TypeNode,
    falseType: TypeNode
  ): ConditionalTypeNode = js.native
}

