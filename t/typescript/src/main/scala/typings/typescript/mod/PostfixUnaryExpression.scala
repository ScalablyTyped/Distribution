package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostfixUnaryExpression
  extends StObject
     with UpdateExpression {
  
  @JSName("kind")
  val kind_PostfixUnaryExpression: typings.typescript.mod.SyntaxKind.PostfixUnaryExpression = js.native
  
  val operand: LeftHandSideExpression = js.native
  
  val operator: PostfixUnaryOperator = js.native
}
