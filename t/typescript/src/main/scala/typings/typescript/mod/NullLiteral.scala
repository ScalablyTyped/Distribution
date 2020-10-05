package typings.typescript.mod

import typings.typescript.mod.SyntaxKind.NullKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typescript.mod.TextRange because Already inherited
- typings.typescript.mod.Node because Already inherited
- typings.typescript.mod.TypeNode because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _typeNodeBrand */ @js.native
trait NullLiteral extends PrimaryExpression {
  var _typeNodeBrand: js.Any = js.native
  @JSName("kind")
  var kind_NullLiteral: NullKeyword = js.native
}

