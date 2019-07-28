package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typescript.typescriptMod.ObjectLiteralElement because var conflicts: _declarationBrand, decorators, end, flags, kind, modifiers, name, parent, pos. Inlined _objectLiteralBrand- typings.typescript.typescriptMod.ClassElement because var conflicts: _declarationBrand, decorators, end, flags, kind, modifiers, name, parent, pos. Inlined _classElementBrand */ @js.native
trait MethodDeclaration
  extends FunctionLikeDeclarationBase
     with FunctionLikeDeclaration
     with ObjectLiteralElementLike
     with SignatureDeclaration
     with _HasJSDoc {
  var _classElementBrand: js.Any = js.native
  var _objectLiteralBrand: js.Any = js.native
  @JSName("body")
  var body_MethodDeclaration: js.UndefOr[FunctionBody] = js.native
  @JSName("kind")
  var kind_MethodDeclaration: typings.typescript.typescriptMod.SyntaxKind.MethodDeclaration = js.native
  @JSName("name")
  var name_MethodDeclaration: PropertyName = js.native
  @JSName("parent")
  var parent_MethodDeclaration: ClassLikeDeclaration | ObjectLiteralExpression = js.native
}

