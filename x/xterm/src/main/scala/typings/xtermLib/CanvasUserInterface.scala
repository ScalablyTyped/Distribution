package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasUserInterface extends js.Object {
  def drawFocusIfNeeded(element: Element): scala.Unit = js.native
  def drawFocusIfNeeded(path: Path2D, element: Element): scala.Unit = js.native
  def scrollPathIntoView(): scala.Unit = js.native
  def scrollPathIntoView(path: Path2D): scala.Unit = js.native
}

