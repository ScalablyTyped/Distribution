package typings.theming

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object themingMod {
  type Channel = String
  type ContextWithTheme[C /* <: String */] = Record[C, Broadcast[Theme]]
  type SubscriptionId = Double
  type Theme = js.Object | (js.Function1[/* outerTheme */ js.Object, js.Object])
}
