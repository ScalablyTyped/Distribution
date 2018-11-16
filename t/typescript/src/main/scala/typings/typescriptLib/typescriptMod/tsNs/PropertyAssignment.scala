package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyAssignment
  extends ObjectLiteralElement
     with JSDocContainer {
  var initializer: Expression = js.native
  @JSName("name")
  var name_PropertyAssignment: PropertyName = js.native
  @JSName("parent")
  var parent_PropertyAssignment: ObjectLiteralExpression = js.native
  var questionToken: js.UndefOr[QuestionToken] = js.native
}

