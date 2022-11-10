package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait cookie
  extends StObject
     with WebixStorage {
  
  def clear(): Unit = js.native
  def clear(domain: String): Unit = js.native
  
  def getRaw(name: String): String = js.native
  
  def put(name: String, value: Any, domain: String): Unit = js.native
  def put(name: String, value: Any, domain: String, expires: js.Date): Unit = js.native
  def put(name: String, value: Any, domain: Unit, expires: js.Date): Unit = js.native
  
  def remove(name: String, domain: String): Unit = js.native
}
