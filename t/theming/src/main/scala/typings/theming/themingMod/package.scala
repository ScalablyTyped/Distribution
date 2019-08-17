package typings.theming

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object themingMod {
  import typings.std.Record

  type Channel = String
  type ContextWithTheme[C /* <: String */] = Record[C, Broadcast[Theme]]
  type SubscriptionId = Double
  type Theme = js.Object | (js.Function1[/* outerTheme */ js.Object, js.Object])
}
