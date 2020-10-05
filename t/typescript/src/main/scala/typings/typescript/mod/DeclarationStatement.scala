package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typescript.mod.TextRange because Already inherited
- typings.typescript.mod.Node because Already inherited
- typings.typescript.mod.Statement because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _statementBrand */ @js.native
trait DeclarationStatement extends NamedDeclaration {
  var _statementBrand: js.Any = js.native
  @JSName("name")
  var name_DeclarationStatement: js.UndefOr[Identifier | StringLiteral | NumericLiteral] = js.native
}

