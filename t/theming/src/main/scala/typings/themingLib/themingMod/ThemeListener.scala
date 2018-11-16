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

