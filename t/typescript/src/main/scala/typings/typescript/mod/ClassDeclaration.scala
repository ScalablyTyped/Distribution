package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typescript.mod.ReadonlyTextRange because Already inherited
- typings.typescript.mod.Node because Already inherited
- typings.typescript.mod.JSDocContainer because Already inherited
- typings.typescript.mod.Declaration because Already inherited
- typings.typescript.mod.Statement because var conflicts: _jsdocContainerBrand. Inlined _statementBrand
- typings.typescript.mod.NamedDeclaration because Already inherited
- typings.typescript.mod.DeclarationStatement because var conflicts: _declarationBrand, _jsdocContainerBrand. Inlined  */ @js.native
trait ClassDeclaration
  extends StObject
     with ClassLikeDeclarationBase
     with ClassLikeDeclaration
     with HasDecorators
     with HasModifiers {
  
  var _statementBrand: Any = js.native
  
  @JSName("kind")
  val kind_ClassDeclaration: typings.typescript.mod.SyntaxKind.ClassDeclaration = js.native
  
  val modifiers: js.UndefOr[NodeArray[ModifierLike]] = js.native
}
