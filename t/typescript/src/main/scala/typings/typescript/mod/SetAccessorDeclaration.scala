package typings.typescript.mod

import typings.typescript.mod.SyntaxKind.SetAccessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typescript.mod.ReadonlyTextRange because Already inherited
- typings.typescript.mod.Node because Already inherited
- typings.typescript.mod.Declaration because Already inherited
- typings.typescript.mod.NamedDeclaration because Already inherited
- typings.typescript.mod.ObjectLiteralElement because var conflicts: _declarationBrand. Inlined _objectLiteralBrand
- typings.typescript.mod.ClassElement because var conflicts: _declarationBrand. Inlined _classElementBrand */ @js.native
trait SetAccessorDeclaration
  extends FunctionLikeDeclarationBase
     with AccessorDeclaration
     with FunctionLikeDeclaration {
  
  var _classElementBrand: js.Any = js.native
  
  var _objectLiteralBrand: js.Any = js.native
  
  @JSName("body")
  val body_SetAccessorDeclaration: js.UndefOr[FunctionBody] = js.native
  
  @JSName("kind")
  val kind_SetAccessorDeclaration: SetAccessor = js.native
  
  @JSName("name")
  val name_SetAccessorDeclaration: PropertyName = js.native
  
  @JSName("parent")
  val parent_SetAccessorDeclaration: ClassLikeDeclaration | ObjectLiteralExpression = js.native
}
