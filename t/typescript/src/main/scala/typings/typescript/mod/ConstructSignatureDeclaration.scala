package typings.typescript.mod

import typings.typescript.mod.SyntaxKind.ConstructSignature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typescript.mod.ReadonlyTextRange because Already inherited
- typings.typescript.mod.Node because Already inherited
- typings.typescript.mod.Declaration because Already inherited
- typings.typescript.mod.NamedDeclaration because Already inherited
- typings.typescript.mod.TypeElement because var conflicts: _declarationBrand. Inlined _typeElementBrand, questionToken */ @js.native
trait ConstructSignatureDeclaration
  extends StObject
     with SignatureDeclarationBase
     with HasJSDoc
     with SignatureDeclaration {
  
  var _typeElementBrand: js.Any = js.native
  
  @JSName("kind")
  val kind_ConstructSignatureDeclaration: ConstructSignature = js.native
  
  val questionToken: js.UndefOr[QuestionToken] = js.native
}
