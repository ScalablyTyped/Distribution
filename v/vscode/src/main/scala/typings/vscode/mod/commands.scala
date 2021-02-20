package typings.vscode.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commands {
  
  @JSImport("vscode", "commands.executeCommand")
  @js.native
  def executeCommand[T](command: String, rest: js.Any*): Thenable[js.UndefOr[T]] = js.native
  
  @JSImport("vscode", "commands.getCommands")
  @js.native
  def getCommands(): Thenable[js.Array[String]] = js.native
  @JSImport("vscode", "commands.getCommands")
  @js.native
  def getCommands(filterInternal: Boolean): Thenable[js.Array[String]] = js.native
  
  @JSImport("vscode", "commands.registerCommand")
  @js.native
  def registerCommand(command: String, callback: js.Function1[/* repeated */ js.Any, _]): Disposable = js.native
  @JSImport("vscode", "commands.registerCommand")
  @js.native
  def registerCommand(command: String, callback: js.Function1[/* repeated */ js.Any, _], thisArg: js.Any): Disposable = js.native
  
  @JSImport("vscode", "commands.registerTextEditorCommand")
  @js.native
  def registerTextEditorCommand(
    command: String,
    callback: js.Function3[/* textEditor */ TextEditor, /* edit */ TextEditorEdit, /* repeated */ js.Any, Unit]
  ): Disposable = js.native
  @JSImport("vscode", "commands.registerTextEditorCommand")
  @js.native
  def registerTextEditorCommand(
    command: String,
    callback: js.Function3[/* textEditor */ TextEditor, /* edit */ TextEditorEdit, /* repeated */ js.Any, Unit],
    thisArg: js.Any
  ): Disposable = js.native
}
