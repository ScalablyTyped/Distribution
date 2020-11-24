package typings.typedoc.mod.TypeScript

import typings.typescript.mod.ConditionalTypeNode
import typings.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createConditionalTypeNode")
@js.native
object createConditionalTypeNode extends js.Object {
  
  /** @deprecated Use `factory.createConditionalTypeNode` or the factory supplied by your transformation context instead. */
  def apply(checkType: TypeNode, extendsType: TypeNode, trueType: TypeNode, falseType: TypeNode): ConditionalTypeNode = js.native
}
