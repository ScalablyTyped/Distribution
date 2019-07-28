package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typescript.typescriptMod.DeclarationStatement because var conflicts: _declarationBrand, decorators, end, flags, kind, modifiers, name, parent, pos. Inlined  */ @js.native
trait FunctionDeclaration
  extends FunctionLikeDeclarationBase
     with FunctionLikeDeclaration
     with SignatureDeclaration
     with _HasJSDoc {
  @JSName("body")
  var body_FunctionDeclaration: js.UndefOr[FunctionBody] = js.native
  @JSName("kind")
  var kind_FunctionDeclaration: typings.typescript.typescriptMod.SyntaxKind.FunctionDeclaration = js.native
  @JSName("name")
  var name_FunctionDeclaration: js.UndefOr[Identifier] = js.native
}

