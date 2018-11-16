package typings
package themingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object themingMod {
  type Channel = java.lang.String
  type ContextWithTheme[C /* <: java.lang.String */] = stdLib.Record[C, Broadcast[Theme]]
  type SubscriptionId = scala.Double
  type Theme = js.Object | (js.Function1[/* outerTheme */ js.Object, js.Object])
}
