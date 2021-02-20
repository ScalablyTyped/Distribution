package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForOfStatement
  extends IterationStatement
     with ForInOrOfStatement
     with HasInitializer {
  
  val awaitModifier: js.UndefOr[AwaitKeywordToken] = js.native
  
  val expression: Expression = js.native
  
  val initializer: ForInitializer = js.native
  
  @JSName("kind")
  val kind_ForOfStatement: typings.typescript.mod.SyntaxKind.ForOfStatement = js.native
}
