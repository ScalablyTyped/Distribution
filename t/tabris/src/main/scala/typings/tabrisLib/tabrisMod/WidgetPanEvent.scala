package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WidgetPanEvent extends EventObject[Widget] {
  val state: tabrisLib.tabrisLibStrings.start | tabrisLib.tabrisLibStrings.change | tabrisLib.tabrisLibStrings.end | tabrisLib.tabrisLibStrings.cancel = js.native
  val touches: js.Array[tabrisLib.Anon_X] = js.native
  val translationX: scala.Double = js.native
  val translationY: scala.Double = js.native
  val velocityX: scala.Double = js.native
  val velocityY: scala.Double = js.native
}

