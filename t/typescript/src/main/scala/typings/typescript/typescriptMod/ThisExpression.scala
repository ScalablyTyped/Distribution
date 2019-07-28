package typings.typescript.typescriptMod

import typings.typescript.typescriptMod.SyntaxKind.ThisKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typescript.typescriptMod.KeywordTypeNode because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined  */ @js.native
trait ThisExpression
  extends PrimaryExpression
     with JsxTagNameExpression {
  @JSName("kind")
  var kind_ThisExpression: ThisKeyword = js.native
}

