package typings
package tinymceLib.tinymceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UndoManager extends js.Object {
  def add(): js.Object = js.native
  def add(level: js.Object): js.Object = js.native
  def add(level: js.Object, event: stdLib.DocumentEvent): js.Object = js.native
  def beforeChange(): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  def extra(callback1: js.Function0[scala.Unit], callback2: js.Function0[scala.Unit]): scala.Unit = js.native
  def hasRedo(): scala.Boolean = js.native
  def hasUndo(): scala.Boolean = js.native
  def ignore(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def redo(): js.Object = js.native
  def transact(callback: js.Function0[scala.Unit]): js.Object = js.native
  def undo(): js.Object = js.native
}

