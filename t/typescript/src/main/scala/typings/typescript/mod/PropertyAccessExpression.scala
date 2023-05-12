package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertyAccessExpression
  extends StObject
     with MemberExpression
     with NamedDeclaration
     with JSDocContainer
     with FlowContainer
     with AccessExpression
     with BindingOrAssignmentElementTarget
     with HasJSDoc
     with _ArrayBindingOrAssignmentElement {
  
  val expression: LeftHandSideExpression = js.native
  
  @JSName("kind")
  val kind_PropertyAccessExpression: typings.typescript.mod.SyntaxKind.PropertyAccessExpression = js.native
  
  @JSName("name")
  val name_PropertyAccessExpression: MemberName = js.native
  
  val questionDotToken: js.UndefOr[QuestionDotToken] = js.native
}
