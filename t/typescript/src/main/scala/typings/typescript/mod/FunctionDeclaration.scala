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
trait FunctionDeclaration
  extends StObject
     with FunctionLikeDeclarationBase
     with Statement {
  
  @JSName("body")
  val body_FunctionDeclaration: js.UndefOr[FunctionBody] = js.native
  
  @JSName("kind")
  val kind_FunctionDeclaration: typings.typescript.mod.SyntaxKind.FunctionDeclaration = js.native
  
  @JSName("modifiers")
  val modifiers_FunctionDeclaration: js.UndefOr[NodeArray[Modifier]] = js.native
  
  @JSName("name")
  val name_FunctionDeclaration: js.UndefOr[Identifier] = js.native
}
