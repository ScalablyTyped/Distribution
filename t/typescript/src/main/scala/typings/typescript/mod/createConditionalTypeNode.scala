package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createConditionalTypeNode")
@js.native
object createConditionalTypeNode extends js.Object {
  
  /** @deprecated Use `factory.createConditionalTypeNode` or the factory supplied by your transformation context instead. */
  def apply(checkType: TypeNode, extendsType: TypeNode, trueType: TypeNode, falseType: TypeNode): ConditionalTypeNode = js.native
}
