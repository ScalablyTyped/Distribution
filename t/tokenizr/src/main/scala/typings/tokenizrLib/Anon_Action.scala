package typings
package tokenizrLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Action extends js.Object {
  @JSName("action")
  var action_Original: RuleAction = js.native
  var name: java.lang.String = js.native
  var pattern: stdLib.RegExp = js.native
  var state: java.lang.String = js.native
  def action(
    `this`: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionContext */ js.Any,
    ctx: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionContext */ js.Any,
    found: stdLib.RegExpExecArray
  ): scala.Unit = js.native
}

