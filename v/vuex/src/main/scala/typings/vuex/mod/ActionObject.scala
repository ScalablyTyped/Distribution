package typings.vuex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionObject[S, R] extends js.Object {
  
  def handler(injectee: ActionContext[S, R]): js.Any = js.native
  def handler(injectee: ActionContext[S, R], payload: js.Any): js.Any = js.native
  @JSName("handler")
  var handler_Original: ActionHandler[S, R] = js.native
  
  var root: js.UndefOr[Boolean] = js.native
}
