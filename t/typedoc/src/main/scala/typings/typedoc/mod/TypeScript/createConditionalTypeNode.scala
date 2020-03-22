package typings.typedoc.mod.TypeScript

import typings.typescript.mod.ConditionalTypeNode
import typings.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createConditionalTypeNode")
@js.native
object createConditionalTypeNode extends js.Object {
  def apply(checkType: TypeNode, extendsType: TypeNode, trueType: TypeNode, falseType: TypeNode): ConditionalTypeNode = js.native
}

