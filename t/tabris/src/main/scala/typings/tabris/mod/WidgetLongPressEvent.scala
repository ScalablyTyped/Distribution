package typings.tabris.mod

import typings.tabris.AnonX
import typings.tabris.tabrisStrings.cancel
import typings.tabris.tabrisStrings.end
import typings.tabris.tabrisStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WidgetLongPressEvent[Target] extends EventObject[Target] {
  val state: start | end | cancel = js.native
  val touches: js.Array[AnonX] = js.native
}

