package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typescript.mod.TextRange because Already inherited
- typings.typescript.mod.Node because Already inherited
- typings.typescript.mod.Declaration because Already inherited
- typings.typescript.mod.Statement because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _statementBrand
- typings.typescript.mod.NamedDeclaration because Already inherited
- typings.typescript.mod.DeclarationStatement because var conflicts: _declarationBrand, decorators, end, flags, kind, modifiers, name, parent, pos. Inlined  */ @js.native
trait ClassDeclaration
  extends ClassLikeDeclarationBase
     with ClassLikeDeclaration {
  var _statementBrand: js.Any = js.native
  @JSName("kind")
  var kind_ClassDeclaration: typings.typescript.mod.SyntaxKind.ClassDeclaration = js.native
}

