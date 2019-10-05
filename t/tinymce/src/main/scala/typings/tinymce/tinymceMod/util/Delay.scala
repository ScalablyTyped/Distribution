package typings.tinymce.tinymceMod.util

import typings.std.HTMLElement
import typings.tinymce.tinymceMod.Editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Delay extends js.Object {
  def clearInterval(interval: Double): Unit = js.native
  def clearTimeout(timeout: Double): Unit = js.native
  def debounce(callback: js.Function0[Unit], time: Double): js.Function0[Unit] = js.native
  def requestAnimationFrame(callback: js.Function0[Unit]): Unit = js.native
  def requestAnimationFrame(callback: js.Function0[Unit], element: HTMLElement): Unit = js.native
  def setEditorInterval(callback: js.Function0[Unit], time: Double): Double = js.native
  def setEditorTimeout(editor: Editor, callback: js.Function0[Unit], time: Double): Double = js.native
  def setInterval(callback: js.Function0[Unit], time: Double): Double = js.native
  def setTimeout(callback: js.Function0[Unit], time: Double): Double = js.native
}

