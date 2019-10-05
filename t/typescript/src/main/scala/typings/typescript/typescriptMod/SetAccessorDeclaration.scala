package typings.typescript.typescriptMod

import typings.typescript.typescriptMod.SyntaxKind.SetAccessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typescript.typescriptMod.TextRange because Already inherited
- typings.typescript.typescriptMod.Node because Already inherited
- typings.typescript.typescriptMod.Declaration because Already inherited
- typings.typescript.typescriptMod.NamedDeclaration because Already inherited
- typings.typescript.typescriptMod.ObjectLiteralElement because var conflicts: _declarationBrand, decorators, end, flags, kind, modifiers, name, parent, pos. Inlined _objectLiteralBrand
- typings.typescript.typescriptMod.ClassElement because var conflicts: _declarationBrand, decorators, end, flags, kind, modifiers, name, parent, pos. Inlined _classElementBrand */ @js.native
trait SetAccessorDeclaration
  extends FunctionLikeDeclarationBase
     with AccessorDeclaration
     with FunctionLikeDeclaration {
  var _classElementBrand: js.Any = js.native
  var _objectLiteralBrand: js.Any = js.native
  @JSName("body")
  var body_SetAccessorDeclaration: js.UndefOr[FunctionBody] = js.native
  @JSName("kind")
  var kind_SetAccessorDeclaration: SetAccessor = js.native
  @JSName("name")
  var name_SetAccessorDeclaration: PropertyName = js.native
  @JSName("parent")
  var parent_SetAccessorDeclaration: ClassLikeDeclaration | ObjectLiteralExpression = js.native
}

