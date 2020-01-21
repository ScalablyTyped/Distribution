package typings.userEvent.mod

import typings.std.Element
import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("user-event", JSImport.Default)
@js.native
object default extends js.Object {
  def click(element: Element): Unit = js.native
  def click(element: Window_): Unit = js.native
  def dblClick(element: Element): Unit = js.native
  def dblClick(element: Window_): Unit = js.native
  def selectOptions(element: Element, values: String): Unit = js.native
  def selectOptions(element: Element, values: js.Array[String]): Unit = js.native
  def selectOptions(element: Window_, values: String): Unit = js.native
  def selectOptions(element: Window_, values: js.Array[String]): Unit = js.native
  def `type`(element: Element, text: String): js.Promise[Unit] = js.native
  def `type`(element: Element, text: String, userOpts: UserOpts): js.Promise[Unit] = js.native
  def `type`(element: Window_, text: String): js.Promise[Unit] = js.native
  def `type`(element: Window_, text: String, userOpts: UserOpts): js.Promise[Unit] = js.native
}

