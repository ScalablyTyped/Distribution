package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typescript.mod.TextRange because Already inherited
- typings.typescript.mod.Node because Already inherited
- typings.typescript.mod.Declaration because Already inherited
- typings.typescript.mod.NamedDeclaration because Already inherited
- typings.typescript.mod.ObjectLiteralElement because var conflicts: _declarationBrand, decorators, end, flags, kind, modifiers, name, parent, pos. Inlined _objectLiteralBrand
- typings.typescript.mod.ClassElement because var conflicts: _declarationBrand, decorators, end, flags, kind, modifiers, name, parent, pos. Inlined _classElementBrand */ @js.native
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
  var kind_MethodDeclaration: typings.typescript.mod.SyntaxKind.MethodDeclaration = js.native
  @JSName("name")
  var name_MethodDeclaration: PropertyName = js.native
  @JSName("parent")
  var parent_MethodDeclaration: ClassLikeDeclaration | ObjectLiteralExpression = js.native
}

