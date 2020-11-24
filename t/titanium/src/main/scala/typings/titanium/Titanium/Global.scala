package typings.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Global extends js.Object {
  
  def L(key: String): String = js.native
  def L(key: String, hint: String): String = js.native
  
  def alert(message: String): Unit = js.native
  
  def clearInterval(): Unit = js.native
  def clearInterval(timerId: Double): Unit = js.native
  
  def clearTimeout(): Unit = js.native
  def clearTimeout(timerId: Double): Unit = js.native
  
  def decodeURIComponent(encodedURI: String): String = js.native
  
  def encodeURIComponent(string: String): String = js.native
  
  def require(moduleId: String): js.Any = js.native
  
  def setInterval(func: js.Function1[/* repeated */ js.Any, Unit]): Double = js.native
  def setInterval(func: js.Function1[/* repeated */ js.Any, Unit], delay: Double): Double = js.native
  
  def setTimeout(func: js.Function1[/* repeated */ js.Any, Unit]): Double = js.native
  def setTimeout(func: js.Function1[/* repeated */ js.Any, Unit], delay: Double): Double = js.native
}
