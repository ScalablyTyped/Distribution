package typings.vscode.vscodeMod

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "commands")
@js.native
object commands extends js.Object {
  def executeCommand[T](command: String, rest: js.Any*): Thenable[js.UndefOr[T]] = js.native
  def getCommands(): Thenable[js.Array[String]] = js.native
  def getCommands(filterInternal: Boolean): Thenable[js.Array[String]] = js.native
  def registerCommand(command: String, callback: js.Function1[/* repeated */ js.Any, _]): Disposable = js.native
  def registerCommand(command: String, callback: js.Function1[/* repeated */ js.Any, _], thisArg: js.Any): Disposable = js.native
  def registerTextEditorCommand(
    command: String,
    callback: js.Function3[/* textEditor */ TextEditor, /* edit */ TextEditorEdit, /* repeated */ js.Any, Unit]
  ): Disposable = js.native
  def registerTextEditorCommand(
    command: String,
    callback: js.Function3[/* textEditor */ TextEditor, /* edit */ TextEditorEdit, /* repeated */ js.Any, Unit],
    thisArg: js.Any
  ): Disposable = js.native
}

