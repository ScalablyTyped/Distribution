package typings.tinymce.mod

import typings.std.DocumentEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UndoManager extends js.Object {
  def add(): js.Object = js.native
  def add(level: js.UndefOr[scala.Nothing], event: DocumentEvent): js.Object = js.native
  def add(level: js.Object): js.Object = js.native
  def add(level: js.Object, event: DocumentEvent): js.Object = js.native
  def beforeChange(): Unit = js.native
  def clear(): Unit = js.native
  def extra(callback1: js.Function0[Unit], callback2: js.Function0[Unit]): Unit = js.native
  def hasRedo(): Boolean = js.native
  def hasUndo(): Boolean = js.native
  def ignore(callback: js.Function0[Unit]): Unit = js.native
  def redo(): js.Object = js.native
  def transact(callback: js.Function0[Unit]): js.Object = js.native
  def undo(): js.Object = js.native
}

