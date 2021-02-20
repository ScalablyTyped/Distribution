package typings.vscodeLanguageclient

import typings.vscodeJsonrpc.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isMod {
  
  @JSImport("vscode-languageclient/lib/utils/is", "array")
  @js.native
  def array[T](value: js.Any): /* is std.Array<T> */ Boolean = js.native
  
  @JSImport("vscode-languageclient/lib/utils/is", "asPromise")
  @js.native
  def asPromise[T](value: T): js.Promise[T] = js.native
  @JSImport("vscode-languageclient/lib/utils/is", "asPromise")
  @js.native
  def asPromise[T](value: js.Promise[T]): js.Promise[T] = js.native
  @JSImport("vscode-languageclient/lib/utils/is", "asPromise")
  @js.native
  def asPromise[T](value: Thenable[T]): js.Promise[T] = js.native
  
  @JSImport("vscode-languageclient/lib/utils/is", "boolean")
  @js.native
  def boolean(value: js.Any): /* is boolean */ Boolean = js.native
  
  @JSImport("vscode-languageclient/lib/utils/is", "error")
  @js.native
  def error(value: js.Any): /* is std.Error */ Boolean = js.native
  
  @JSImport("vscode-languageclient/lib/utils/is", "func")
  @js.native
  def func(value: js.Any): /* is std.Function */ Boolean = js.native
  
  @JSImport("vscode-languageclient/lib/utils/is", "number")
  @js.native
  def number(value: js.Any): /* is number */ Boolean = js.native
  
  @JSImport("vscode-languageclient/lib/utils/is", "string")
  @js.native
  def string(value: js.Any): /* is string */ Boolean = js.native
  
  @JSImport("vscode-languageclient/lib/utils/is", "stringArray")
  @js.native
  def stringArray(value: js.Any): /* is std.Array<string> */ Boolean = js.native
  
  @JSImport("vscode-languageclient/lib/utils/is", "thenable")
  @js.native
  def thenable[T](value: js.Any): /* is vscode-jsonrpc.Thenable<T> */ Boolean = js.native
  
  @JSImport("vscode-languageclient/lib/utils/is", "typedArray")
  @js.native
  def typedArray[T](value: js.Any, check: js.Function1[/* value */ js.Any, Boolean]): /* is std.Array<T> */ Boolean = js.native
}
