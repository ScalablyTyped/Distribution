package typings.typescript.mod

import typings.typescript.mod.SyntaxKind.GetAccessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typescript.mod.ReadonlyTextRange because Already inherited
- typings.typescript.mod.Node because Already inherited
- typings.typescript.mod.Declaration because Already inherited
- typings.typescript.mod.NamedDeclaration because Already inherited
- typings.typescript.mod.ObjectLiteralElement because var conflicts: _declarationBrand. Inlined _objectLiteralBrand
- typings.typescript.mod.TypeElement because var conflicts: _declarationBrand. Inlined _typeElementBrand
- typings.typescript.mod.ClassElement because var conflicts: _declarationBrand. Inlined _classElementBrand */ @js.native
trait GetAccessorDeclaration
  extends StObject
     with FunctionLikeDeclarationBase {
  
  var _classElementBrand: Any = js.native
  
  var _objectLiteralBrand: Any = js.native
  
  var _typeElementBrand: Any = js.native
  
  @JSName("body")
  val body_GetAccessorDeclaration: js.UndefOr[FunctionBody] = js.native
  
  @JSName("kind")
  val kind_GetAccessorDeclaration: GetAccessor = js.native
  
  @JSName("name")
  val name_GetAccessorDeclaration: PropertyName = js.native
  
  @JSName("parent")
  val parent_GetAccessorDeclaration: ClassLikeDeclaration | ObjectLiteralExpression | TypeLiteralNode | InterfaceDeclaration = js.native
}
