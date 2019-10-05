package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "visitFunctionBody")
@js.native
object visitFunctionBody extends js.Object {
  def apply(node: js.UndefOr[scala.Nothing], visitor: Visitor, context: TransformationContext): js.UndefOr[FunctionBody] = js.native
  /**
    * Resumes a suspended lexical environment and visits a function body, ending the lexical
    * environment and merging hoisted declarations upon completion.
    */
  def apply(node: FunctionBody, visitor: Visitor, context: TransformationContext): js.UndefOr[FunctionBody] = js.native
}

