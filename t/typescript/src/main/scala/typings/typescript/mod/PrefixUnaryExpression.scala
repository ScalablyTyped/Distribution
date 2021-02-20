package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrefixUnaryExpression extends UpdateExpression {
  
  @JSName("kind")
  val kind_PrefixUnaryExpression: typings.typescript.mod.SyntaxKind.PrefixUnaryExpression = js.native
  
  val operand: UnaryExpression = js.native
  
  val operator: PrefixUnaryOperator = js.native
}
