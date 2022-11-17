package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertyAssignment
  extends StObject
     with ObjectLiteralElement
     with JSDocContainer {
  
  /** @deprecated A property assignment cannot have an exclamation token */
  val exclamationToken: js.UndefOr[ExclamationToken] = js.native
  
  val initializer: Expression = js.native
  
  @JSName("kind")
  val kind_PropertyAssignment: typings.typescript.mod.SyntaxKind.PropertyAssignment = js.native
  
  @JSName("name")
  val name_PropertyAssignment: PropertyName = js.native
  
  @JSName("parent")
  val parent_PropertyAssignment: ObjectLiteralExpression = js.native
  
  /** @deprecated A property assignment cannot have a question token */
  val questionToken: js.UndefOr[QuestionToken] = js.native
}
