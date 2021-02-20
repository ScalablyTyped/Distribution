package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.mod.AnyFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddListener extends StObject {
  
  def addListener(eventType: String, cb: AnyFunction): Unit = js.native
  
  def emit(eventType: String): Unit = js.native
  
  def removeAllListeners(): Unit = js.native
  def removeAllListeners(eventType: String): Unit = js.native
  
  def removeListener(eventType: String, cb: AnyFunction): Unit = js.native
}
