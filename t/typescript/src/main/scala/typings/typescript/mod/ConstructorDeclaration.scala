package typings.typescript.mod

import typings.typescript.mod.SyntaxKind.Constructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typescript.mod.ReadonlyTextRange because Already inherited
- typings.typescript.mod.Node because Already inherited
- typings.typescript.mod.Declaration because Already inherited
- typings.typescript.mod.NamedDeclaration because Already inherited
- typings.typescript.mod.ClassElement because var conflicts: _declarationBrand. Inlined _classElementBrand */ @js.native
trait ConstructorDeclaration
  extends StObject
     with FunctionLikeDeclarationBase
     with LocalsContainer
     with FunctionLikeDeclaration
     with HasJSDoc
     with HasModifiers
     with SignatureDeclaration {
  
  var _classElementBrand: Any = js.native
  
  @JSName("body")
  val body_ConstructorDeclaration: js.UndefOr[FunctionBody] = js.native
  
  @JSName("kind")
  val kind_ConstructorDeclaration: Constructor = js.native
  
  val modifiers: js.UndefOr[NodeArray[ModifierLike]] = js.native
  
  @JSName("parent")
  val parent_ConstructorDeclaration: ClassLikeDeclaration = js.native
}
