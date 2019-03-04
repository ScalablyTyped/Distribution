package typings
package themingLib.themingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeListener[C /* <: java.lang.String */] extends js.Object {
  var contextTypes: reactLib.reactMod.ReactNs.ValidationMap[C]
  def initial(context: ContextWithTheme[C]): Theme
  def subscribe(context: ContextWithTheme[C], callback: js.Function1[/* theme */ Theme, scala.Unit]): SubscriptionId
  def unsubscribe(context: ContextWithTheme[C], id: SubscriptionId): scala.Unit
}

object ThemeListener {
  @scala.inline
  def apply[C /* <: java.lang.String */](
    contextTypes: reactLib.reactMod.ReactNs.ValidationMap[C],
    initial: js.Function1[ContextWithTheme[C], Theme],
    subscribe: js.Function2[ContextWithTheme[C], js.Function1[/* theme */ Theme, scala.Unit], SubscriptionId],
    unsubscribe: js.Function2[ContextWithTheme[C], SubscriptionId, scala.Unit]
  ): ThemeListener[C] = {
    val __obj = js.Dynamic.literal(contextTypes = contextTypes, initial = initial, subscribe = subscribe, unsubscribe = unsubscribe)
  
    __obj.asInstanceOf[ThemeListener[C]]
  }
}

