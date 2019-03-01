package typings
package w2uiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object W2UINs {
  type W2EventHandler = (js.Function1[/* e */ W2Event, scala.Unit]) | (js.Function2[/* id */ java.lang.String, /* e */ W2Event, scala.Unit])
}
