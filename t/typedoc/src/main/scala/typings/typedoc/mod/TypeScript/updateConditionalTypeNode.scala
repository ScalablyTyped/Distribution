package typings.typedoc.mod.TypeScript

import typings.typescript.mod.ConditionalTypeNode
import typings.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.updateConditionalTypeNode")
@js.native
object updateConditionalTypeNode extends js.Object {
  
  /** @deprecated Use `factory.updateConditionalTypeNode` or the factory supplied by your transformation context instead. */
  def apply(
    node: ConditionalTypeNode,
    checkType: TypeNode,
    extendsType: TypeNode,
    trueType: TypeNode,
    falseType: TypeNode
  ): ConditionalTypeNode = js.native
}
