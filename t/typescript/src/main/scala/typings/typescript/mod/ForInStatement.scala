package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForInStatement
  extends IterationStatement
     with ForInOrOfStatement
     with HasInitializer {
  
  val expression: Expression = js.native
  
  val initializer: ForInitializer = js.native
  
  @JSName("kind")
  val kind_ForInStatement: typings.typescript.mod.SyntaxKind.ForInStatement = js.native
}
