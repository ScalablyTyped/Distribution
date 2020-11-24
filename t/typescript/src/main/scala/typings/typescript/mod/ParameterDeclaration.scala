package typings.typescript.mod

import typings.typescript.mod.SyntaxKind.Parameter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParameterDeclaration
  extends NamedDeclaration
     with JSDocContainer
     with HasExpressionInitializer
     with HasType
     with VariableLikeDeclaration
     with _BindingOrAssignmentElement
     with _HasJSDoc {
  
  val dotDotDotToken: js.UndefOr[DotDotDotToken] = js.native
  
  val initializer: js.UndefOr[Expression] = js.native
  
  @JSName("kind")
  val kind_ParameterDeclaration: Parameter = js.native
  
  @JSName("name")
  val name_ParameterDeclaration: BindingName = js.native
  
  @JSName("parent")
  val parent_ParameterDeclaration: SignatureDeclaration = js.native
  
  val questionToken: js.UndefOr[QuestionToken] = js.native
  
  val `type`: js.UndefOr[TypeNode] = js.native
}
