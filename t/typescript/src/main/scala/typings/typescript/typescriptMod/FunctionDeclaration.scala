package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typescript.typescriptMod.TextRange because Already inherited
- typings.typescript.typescriptMod.Node because Already inherited
- typings.typescript.typescriptMod.Declaration because Already inherited
- typings.typescript.typescriptMod.Statement because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _statementBrand
- typings.typescript.typescriptMod.NamedDeclaration because Already inherited
- typings.typescript.typescriptMod.DeclarationStatement because var conflicts: _declarationBrand, decorators, end, flags, kind, modifiers, name, parent, pos. Inlined  */ @js.native
trait FunctionDeclaration
  extends FunctionLikeDeclarationBase
     with FunctionLikeDeclaration
     with SignatureDeclaration
     with _HasJSDoc {
  var _statementBrand: js.Any = js.native
  @JSName("body")
  var body_FunctionDeclaration: js.UndefOr[FunctionBody] = js.native
  @JSName("kind")
  var kind_FunctionDeclaration: typings.typescript.typescriptMod.SyntaxKind.FunctionDeclaration = js.native
  @JSName("name")
  var name_FunctionDeclaration: js.UndefOr[Identifier] = js.native
}

