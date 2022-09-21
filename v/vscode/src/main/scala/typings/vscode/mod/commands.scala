package typings.vscode.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commands {
  
  @JSImport("vscode", "commands")
  @js.native
  val ^ : js.Any = js.native
  
  inline def executeCommand[T](command: String, rest: Any*): Thenable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("executeCommand")(List(command.asInstanceOf[js.Any]).`++`(rest.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Thenable[T]]
  
  inline def getCommands(): Thenable[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCommands")().asInstanceOf[Thenable[js.Array[String]]]
  inline def getCommands(filterInternal: Boolean): Thenable[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCommands")(filterInternal.asInstanceOf[js.Any]).asInstanceOf[Thenable[js.Array[String]]]
  
  inline def registerCommand(command: String, callback: js.Function1[/* repeated */ Any, Any]): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCommand")(command.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  inline def registerCommand(command: String, callback: js.Function1[/* repeated */ Any, Any], thisArg: Any): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCommand")(command.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  inline def registerTextEditorCommand(
    command: String,
    callback: js.Function3[/* textEditor */ TextEditor, /* edit */ TextEditorEdit, /* repeated */ Any, Unit]
  ): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerTextEditorCommand")(command.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  inline def registerTextEditorCommand(
    command: String,
    callback: js.Function3[/* textEditor */ TextEditor, /* edit */ TextEditorEdit, /* repeated */ Any, Unit],
    thisArg: Any
  ): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerTextEditorCommand")(command.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Disposable]
}
