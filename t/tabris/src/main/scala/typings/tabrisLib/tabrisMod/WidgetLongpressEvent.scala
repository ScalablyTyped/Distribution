package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WidgetLongpressEvent extends EventObject[Widget] {
  val state: tabrisLib.tabrisLibStrings.start | tabrisLib.tabrisLibStrings.end | tabrisLib.tabrisLibStrings.cancel = js.native
  val touches: js.Array[tabrisLib.Anon_X] = js.native
}

