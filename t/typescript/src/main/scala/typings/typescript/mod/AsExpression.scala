package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsExpression
  extends StObject
     with Expression {
  
  val expression: Expression = js.native
  
  @JSName("kind")
  val kind_AsExpression: typings.typescript.mod.SyntaxKind.AsExpression = js.native
  
  val `type`: TypeNode = js.native
}
