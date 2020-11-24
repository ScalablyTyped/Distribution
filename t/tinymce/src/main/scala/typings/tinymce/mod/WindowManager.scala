package typings.tinymce.mod

import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowManager extends js.Object {
  
  def alert(message: String, callback: js.Function0[Unit]): Unit = js.native
  def alert(message: String, callback: js.Function0[Unit], scope: js.Object): Unit = js.native
  
  def close(): Unit = js.native
  
  def confirm(message: String, callback: js.Function0[Unit]): Unit = js.native
  def confirm(message: String, callback: js.Function0[Unit], scope: js.Object): Unit = js.native
  
  def getParams(): js.Object = js.native
  
  def getWindows(): js.Array[Window] = js.native
  
  def open(args: js.Object, params: js.Object): Unit = js.native
  
  def setParams(params: js.Object): Unit = js.native
}
