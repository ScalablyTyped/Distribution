package typings.vscode.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commands {
  
  @JSImport("vscode", "commands")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def executeCommand[T](command: String, rest: js.Any*): Thenable[js.UndefOr[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeCommand")(command.asInstanceOf[js.Any], rest.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[T]]]
  
  @scala.inline
  def getCommands(): Thenable[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCommands")().asInstanceOf[Thenable[js.Array[String]]]
  @scala.inline
  def getCommands(filterInternal: Boolean): Thenable[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCommands")(filterInternal.asInstanceOf[js.Any]).asInstanceOf[Thenable[js.Array[String]]]
  
  @scala.inline
  def registerCommand(command: String, callback: js.Function1[/* repeated */ js.Any, js.Any]): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCommand")(command.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  @scala.inline
  def registerCommand(command: String, callback: js.Function1[/* repeated */ js.Any, js.Any], thisArg: js.Any): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCommand")(command.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  @scala.inline
  def registerTextEditorCommand(
    command: String,
    callback: js.Function3[/* textEditor */ TextEditor, /* edit */ TextEditorEdit, /* repeated */ js.Any, Unit]
  ): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerTextEditorCommand")(command.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  @scala.inline
  def registerTextEditorCommand(
    command: String,
    callback: js.Function3[/* textEditor */ TextEditor, /* edit */ TextEditorEdit, /* repeated */ js.Any, Unit],
    thisArg: js.Any
  ): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerTextEditorCommand")(command.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Disposable]
}
