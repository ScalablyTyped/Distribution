package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WithStatement
  extends StObject
     with Statement {
  
  val expression: Expression = js.native
  
  @JSName("kind")
  val kind_WithStatement: typings.typescript.mod.SyntaxKind.WithStatement = js.native
  
  val statement: Statement = js.native
}
