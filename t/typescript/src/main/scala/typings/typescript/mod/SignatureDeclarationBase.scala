package typings.typescript.mod

import typings.typescript.mod.SyntaxKind.CallSignature
import typings.typescript.mod.SyntaxKind.ConstructSignature
import typings.typescript.mod.SyntaxKind.Constructor
import typings.typescript.mod.SyntaxKind.ConstructorType
import typings.typescript.mod.SyntaxKind.FunctionType
import typings.typescript.mod.SyntaxKind.GetAccessor
import typings.typescript.mod.SyntaxKind.IndexSignature
import typings.typescript.mod.SyntaxKind.SetAccessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignatureDeclarationBase
  extends StObject
     with NamedDeclaration
     with JSDocContainer {
  
  @JSName("kind")
  val kind_SignatureDeclarationBase: CallSignature | ConstructSignature | typings.typescript.mod.SyntaxKind.MethodSignature | IndexSignature | FunctionType | ConstructorType | typings.typescript.mod.SyntaxKind.JSDocFunctionType | typings.typescript.mod.SyntaxKind.FunctionDeclaration | typings.typescript.mod.SyntaxKind.MethodDeclaration | Constructor | GetAccessor | SetAccessor | typings.typescript.mod.SyntaxKind.FunctionExpression | typings.typescript.mod.SyntaxKind.ArrowFunction = js.native
  
  @JSName("name")
  val name_SignatureDeclarationBase: js.UndefOr[PropertyName] = js.native
  
  val parameters: NodeArray[ParameterDeclaration] = js.native
  
  val `type`: js.UndefOr[TypeNode] = js.native
  
  val typeParameters: js.UndefOr[NodeArray[TypeParameterDeclaration]] = js.native
}
