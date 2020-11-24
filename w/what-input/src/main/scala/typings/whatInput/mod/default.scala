package typings.whatInput.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("what-input", JSImport.Default)
@js.native
object default extends js.Object {
  
  def ask(): InputMethod = js.native
  def ask(strategy: Strategy): InputMethod = js.native
  
  def clearStorage(): Unit = js.native
  
  def element(): String | Null = js.native
  
  def ignoreKeys(keyCodes: js.Array[Double]): Unit = js.native
  
  def registerOnChange(callback: js.Function1[/* type */ InputMethod, Unit]): Unit = js.native
  def registerOnChange(callback: js.Function1[/* type */ InputMethod, Unit], strategy: Strategy): Unit = js.native
  
  def specificKeys(keyCodes: js.Array[Double]): Unit = js.native
  
  def unRegisterOnChange(callback: js.Function1[/* type */ InputMethod, Unit]): Unit = js.native
}
