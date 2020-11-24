package typings.typedoc.mod.TypeScript

import typings.typescript.mod.ConciseBody
import typings.typescript.mod.FunctionBody
import typings.typescript.mod.TransformationContext
import typings.typescript.mod.Visitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.visitFunctionBody")
@js.native
object visitFunctionBody extends js.Object {
  
  /**
    * Resumes a suspended lexical environment and visits a concise body, ending the lexical
    * environment and merging hoisted declarations upon completion.
    */
  def apply(node: ConciseBody, visitor: Visitor, context: TransformationContext): ConciseBody = js.native
  /**
    * Resumes a suspended lexical environment and visits a function body, ending the lexical
    * environment and merging hoisted declarations upon completion.
    */
  def apply(node: FunctionBody, visitor: Visitor, context: TransformationContext): js.UndefOr[FunctionBody] = js.native
}
