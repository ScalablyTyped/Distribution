package typings.tabris.mod

import typings.tabris.tabrisStrings.down
import typings.tabris.tabrisStrings.up
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppKeyPressEvent[Target] extends EventObject[Target] {
  val action: up | down = js.native
  val altKey: Boolean = js.native
  val character: String = js.native
  val ctrlKey: Boolean = js.native
  val deviceId: Double = js.native
  val functionKey: Boolean = js.native
  val keyCode: Double = js.native
  val shiftKey: Boolean = js.native
  val time: Double = js.native
  def preventDefault(): Unit = js.native
}

