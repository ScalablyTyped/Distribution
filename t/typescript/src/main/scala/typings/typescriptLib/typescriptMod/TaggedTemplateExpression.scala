package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaggedTemplateExpression
  extends MemberExpression
     with CallLikeExpression {
  var tag: LeftHandSideExpression = js.native
  var template: TemplateLiteral = js.native
  var typeArguments: js.UndefOr[NodeArray[TypeNode]] = js.native
}

