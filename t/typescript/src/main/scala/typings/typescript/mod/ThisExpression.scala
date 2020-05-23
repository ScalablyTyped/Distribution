package typings.typescript.mod

import typings.typescript.mod.SyntaxKind.ThisKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typescript.mod.TextRange because Already inherited
- typings.typescript.mod.Node because Already inherited
- typings.typescript.mod.TypeNode because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _typeNodeBrand
- typings.typescript.mod.KeywordTypeNode because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined  */ @js.native
trait ThisExpression
  extends PrimaryExpression
     with JsxTagNameExpression {
  var _typeNodeBrand: js.Any = js.native
  @JSName("kind")
  var kind_ThisExpression: ThisKeyword = js.native
}

