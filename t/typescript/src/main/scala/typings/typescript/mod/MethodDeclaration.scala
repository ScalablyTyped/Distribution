package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typescript.mod.ReadonlyTextRange because Already inherited
- typings.typescript.mod.Node because Already inherited
- typings.typescript.mod.Declaration because Already inherited
- typings.typescript.mod.NamedDeclaration because Already inherited
- typings.typescript.mod.ObjectLiteralElement because var conflicts: _declarationBrand. Inlined _objectLiteralBrand
- typings.typescript.mod.ClassElement because var conflicts: _declarationBrand. Inlined _classElementBrand */ @js.native
trait MethodDeclaration
  extends StObject
     with FunctionLikeDeclarationBase
     with FunctionLikeDeclaration
     with HasDecorators
     with HasJSDoc
     with HasModifiers
     with ObjectLiteralElementLike
     with SignatureDeclaration {
  
  var _classElementBrand: Any = js.native
  
  var _objectLiteralBrand: Any = js.native
  
  @JSName("body")
  val body_MethodDeclaration: js.UndefOr[FunctionBody] = js.native
  
  @JSName("kind")
  val kind_MethodDeclaration: typings.typescript.mod.SyntaxKind.MethodDeclaration = js.native
  
  @JSName("name")
  val name_MethodDeclaration: PropertyName = js.native
  
  @JSName("parent")
  val parent_MethodDeclaration: ClassLikeDeclaration | ObjectLiteralExpression = js.native
}
