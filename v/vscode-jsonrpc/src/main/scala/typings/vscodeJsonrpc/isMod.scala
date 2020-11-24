package typings.vscodeJsonrpc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-jsonrpc/lib/is", JSImport.Namespace)
@js.native
object isMod extends js.Object {
  
  def array[T](value: js.Any): /* is std.Array<T> */ Boolean = js.native
  
  def boolean(value: js.Any): /* is boolean */ Boolean = js.native
  
  def error(value: js.Any): /* is std.Error */ Boolean = js.native
  
  def func(value: js.Any): /* is std.Function */ Boolean = js.native
  
  def number(value: js.Any): /* is number */ Boolean = js.native
  
  def string(value: js.Any): /* is string */ Boolean = js.native
  
  def stringArray(value: js.Any): /* is std.Array<string> */ Boolean = js.native
}
