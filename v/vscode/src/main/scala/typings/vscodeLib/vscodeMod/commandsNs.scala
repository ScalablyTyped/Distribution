package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "commands")
@js.native
object commandsNs extends js.Object {
  def executeCommand[T](command: java.lang.String, rest: js.Any*): vscodeLib.Thenable[js.UndefOr[T]] = js.native
  def getCommands(): vscodeLib.Thenable[js.Array[java.lang.String]] = js.native
  def getCommands(filterInternal: scala.Boolean): vscodeLib.Thenable[js.Array[java.lang.String]] = js.native
  def registerCommand(command: java.lang.String, callback: js.Function1[/* repeated */ js.Any, _]): vscodeLib.vscodeMod.Disposable = js.native
  def registerCommand(command: java.lang.String, callback: js.Function1[/* repeated */ js.Any, _], thisArg: js.Any): vscodeLib.vscodeMod.Disposable = js.native
  def registerTextEditorCommand(
    command: java.lang.String,
    callback: js.Function3[
      /* textEditor */ vscodeLib.vscodeMod.TextEditor, 
      /* edit */ vscodeLib.vscodeMod.TextEditorEdit, 
      /* repeated */ js.Any, 
      scala.Unit
    ]
  ): vscodeLib.vscodeMod.Disposable = js.native
  def registerTextEditorCommand(
    command: java.lang.String,
    callback: js.Function3[
      /* textEditor */ vscodeLib.vscodeMod.TextEditor, 
      /* edit */ vscodeLib.vscodeMod.TextEditorEdit, 
      /* repeated */ js.Any, 
      scala.Unit
    ],
    thisArg: js.Any
  ): vscodeLib.vscodeMod.Disposable = js.native
}

