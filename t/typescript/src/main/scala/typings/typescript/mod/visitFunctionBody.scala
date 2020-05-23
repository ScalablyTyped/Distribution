package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "visitFunctionBody")
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
  def apply(node: FunctionBody, visitor: Visitor, context: TransformationContext): FunctionBody = js.native
}

