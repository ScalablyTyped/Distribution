package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsExpression
  extends Expression
     with AssertionExpression {
  var expression: Expression = js.native
  @JSName("kind")
  var kind_AsExpression: typings.typescript.mod.SyntaxKind.AsExpression = js.native
  var `type`: TypeNode = js.native
}

