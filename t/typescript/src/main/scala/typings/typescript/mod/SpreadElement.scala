package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpreadElement
  extends Expression
     with _BindingOrAssignmentElement
     with _BindingOrAssignmentElementRestIndicator {
  var expression: Expression = js.native
  @JSName("kind")
  var kind_SpreadElement: typings.typescript.mod.SyntaxKind.SpreadElement = js.native
  @JSName("parent")
  var parent_SpreadElement: ArrayLiteralExpression | CallExpression | NewExpression = js.native
}

