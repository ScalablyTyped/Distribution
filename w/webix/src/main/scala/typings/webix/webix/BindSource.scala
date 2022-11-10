package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BindSource extends StObject {
  
  def addBind(source: obj, rule: String, format: String): Unit = js.native
  
  def getBindData(key: String): Unit = js.native
  def getBindData(key: String, update: Boolean): Unit = js.native
  def getBindData(key: Double): Unit = js.native
  def getBindData(key: Double, update: Boolean): Unit = js.native
  
  def removeBind(source: obj): Unit = js.native
  
  def saveBatch(handler: WebixCallback): Unit = js.native
  
  def setBindData(data: obj, key: String): Unit = js.native
  def setBindData(data: obj, key: Double): Unit = js.native
}
