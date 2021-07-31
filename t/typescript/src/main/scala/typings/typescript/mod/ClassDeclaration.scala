package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typescript.mod.ReadonlyTextRange because Already inherited
- typings.typescript.mod.Node because Already inherited
- typings.typescript.mod.Declaration because Already inherited
- typings.typescript.mod.NamedDeclaration because Already inherited
- typings.typescript.mod.DeclarationStatement because var conflicts: _declarationBrand. Inlined  */ @js.native
trait ClassDeclaration
  extends StObject
     with ClassLikeDeclarationBase
     with ClassLikeDeclaration
     with Statement {
  
  @JSName("kind")
  val kind_ClassDeclaration: typings.typescript.mod.SyntaxKind.ClassDeclaration = js.native
}
