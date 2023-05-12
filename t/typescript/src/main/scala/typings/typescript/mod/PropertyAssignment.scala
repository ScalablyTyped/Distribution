package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertyAssignment
  extends StObject
     with ObjectLiteralElement
     with JSDocContainer
     with HasExpressionInitializer
     with HasJSDoc
     with ObjectBindingOrAssignmentElement
     with ObjectLiteralElementLike
     with VariableLikeDeclaration {
  
  val initializer: Expression = js.native
  
  @JSName("kind")
  val kind_PropertyAssignment: typings.typescript.mod.SyntaxKind.PropertyAssignment = js.native
  
  @JSName("name")
  val name_PropertyAssignment: PropertyName = js.native
  
  @JSName("parent")
  val parent_PropertyAssignment: ObjectLiteralExpression = js.native
}
