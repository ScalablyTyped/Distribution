package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateExpression
  extends PrimaryExpression
     with TemplateLiteral {
  var head: TemplateHead = js.native
  var templateSpans: NodeArray[TemplateSpan] = js.native
}

