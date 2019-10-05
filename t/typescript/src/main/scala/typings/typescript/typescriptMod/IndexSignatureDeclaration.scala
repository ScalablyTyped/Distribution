package typings.typescript.typescriptMod

import typings.typescript.typescriptMod.SyntaxKind.IndexSignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typescript.typescriptMod.TextRange because Already inherited
- typings.typescript.typescriptMod.Node because Already inherited
- typings.typescript.typescriptMod.Declaration because Already inherited
- typings.typescript.typescriptMod.NamedDeclaration because Already inherited
- typings.typescript.typescriptMod.TypeElement because var conflicts: _declarationBrand, decorators, end, flags, kind, modifiers, name, parent, pos. Inlined _typeElementBrand, questionToken
- typings.typescript.typescriptMod.ClassElement because var conflicts: _declarationBrand, decorators, end, flags, kind, modifiers, name, parent, pos. Inlined _classElementBrand */ @js.native
trait IndexSignatureDeclaration
  extends SignatureDeclarationBase
     with SignatureDeclaration
     with _HasJSDoc {
  var _classElementBrand: js.Any = js.native
  var _typeElementBrand: js.Any = js.native
  @JSName("kind")
  var kind_IndexSignatureDeclaration: IndexSignature = js.native
  @JSName("parent")
  var parent_IndexSignatureDeclaration: ObjectTypeDeclaration = js.native
  var questionToken: js.UndefOr[QuestionToken] = js.native
}

