package typings.tokenizr.anon

import typings.std.RegExp
import typings.std.RegExpExecArray
import typings.tokenizr.mod.ActionContext
import typings.tokenizr.mod.RuleAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Action extends js.Object {
  
  def action(ctx: ActionContext, found: RegExpExecArray): Unit = js.native
  @JSName("action")
  var action_Original: RuleAction = js.native
  
  var name: String = js.native
  
  var pattern: RegExp = js.native
  
  var state: String = js.native
}
