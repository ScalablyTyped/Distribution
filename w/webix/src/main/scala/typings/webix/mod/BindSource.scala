package typings.webix.mod

import typings.webix.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BindSource extends StObject {
  
  def addBind(source: js.Any, rule: String, format: String): Unit = js.native
  
  def getBindData(key: String, update: Boolean): Unit = js.native
  def getBindData(key: Double, update: Boolean): Unit = js.native
  
  def removeBind(source: js.Any): Unit = js.native
  
  def saveBatch(handler: WebixCallback): Unit = js.native
  
  def setBindData(data: js.Any, key: String): Unit = js.native
  def setBindData(data: js.Any, key: Double): Unit = js.native
}
object BindSource {
  
  inline def apply: BindSource = ^.asInstanceOf[js.Dynamic].selectDynamic("BindSource").asInstanceOf[BindSource]
}
