package typings.theming.themingMod

import org.scalablytyped.runtime.TopLevel
import typings.react.reactMod.ValidationMap
import typings.theming.themingStrings.__THEMING__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeListener[C /* <: String */] extends js.Object {
  var contextTypes: ValidationMap[C]
  def initial(context: ContextWithTheme[C]): Theme
  def subscribe(context: ContextWithTheme[C], callback: js.Function1[/* theme */ Theme, Unit]): SubscriptionId
  def unsubscribe(context: ContextWithTheme[C], id: SubscriptionId): Unit
}

object ThemeListener {
  @scala.inline
  def apply[C /* <: String */](
    contextTypes: ValidationMap[C],
    initial: ContextWithTheme[C] => Theme,
    subscribe: (ContextWithTheme[C], js.Function1[/* theme */ Theme, Unit]) => SubscriptionId,
    unsubscribe: (ContextWithTheme[C], SubscriptionId) => Unit
  ): ThemeListener[C] = {
    val __obj = js.Dynamic.literal(contextTypes = contextTypes, initial = js.Any.fromFunction1(initial), subscribe = js.Any.fromFunction2(subscribe), unsubscribe = js.Any.fromFunction2(unsubscribe))
  
    __obj.asInstanceOf[ThemeListener[C]]
  }
}

@JSImport("theming", "themeListener")
@js.native
object themeListener extends TopLevel[ThemeListener[__THEMING__]]

