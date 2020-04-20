package typings.tabris.mod

import typings.tabris.AnonX
import typings.tabris.tabrisStrings.cancel
import typings.tabris.tabrisStrings.change
import typings.tabris.tabrisStrings.end
import typings.tabris.tabrisStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WidgetPanEvent[Target] extends EventObject[Target] {
  val state: start | change | end | cancel = js.native
  val touches: js.Array[AnonX] = js.native
  val translationX: Double = js.native
  val translationY: Double = js.native
  val velocityX: Double = js.native
  val velocityY: Double = js.native
}

