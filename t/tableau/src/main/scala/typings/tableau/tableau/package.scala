package typings.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tableau {
  type ListenerFunction[T /* <: TableauEvent */] = js.Function1[/* event */ T, Unit]
}
