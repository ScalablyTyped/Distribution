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
    initial: ContextWithTheme[C] => Theme,
    subscribe: (ContextWithTheme[C], js.Function1[/* theme */ Theme, scala.Unit]) => SubscriptionId,
    unsubscribe: (ContextWithTheme[C], SubscriptionId) => scala.Unit
  ): ThemeListener[C] = {
    val __obj = js.Dynamic.literal(contextTypes = contextTypes, initial = js.Any.fromFunction1(initial), subscribe = js.Any.fromFunction2(subscribe), unsubscribe = js.Any.fromFunction2(unsubscribe))
  
    __obj.asInstanceOf[ThemeListener[C]]
  }
}

