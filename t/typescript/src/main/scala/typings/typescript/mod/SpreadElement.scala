package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpreadElement
  extends Expression
     with _ArrayBindingOrAssignmentElement
     with _BindingOrAssignmentElementRestIndicator {
  
  val expression: Expression = js.native
  
  @JSName("kind")
  val kind_SpreadElement: typings.typescript.mod.SyntaxKind.SpreadElement = js.native
  
  @JSName("parent")
  val parent_SpreadElement: ArrayLiteralExpression | CallExpression | NewExpression = js.native
}
