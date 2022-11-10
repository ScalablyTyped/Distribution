package typings.webix.mod

import typings.webix.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataRecord extends StObject {
  
  def attachEvent(`type`: String, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: String, functor: WebixCallback, id: String): String | Double = js.native
  
  def bind(target: obj): Unit = js.native
  def bind(target: obj, rule: Unit, format: String): Unit = js.native
  def bind(target: obj, rule: WebixCallback): Unit = js.native
  def bind(target: obj, rule: WebixCallback, format: String): Unit = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  var config: obj = js.native
  
  def define(property: String, value: Any): Unit = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def getValues(): obj = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def isVisible(): Boolean = js.native
  
  def load(url: String): js.Promise[Any] = js.native
  def load(url: String, `type`: String): js.Promise[Any] = js.native
  def load(url: String, `type`: String, callback: Unit, clear: Boolean): js.Promise[Any] = js.native
  def load(url: String, `type`: String, callback: WebixCallback): js.Promise[Any] = js.native
  def load(url: String, `type`: String, callback: WebixCallback, clear: Boolean): js.Promise[Any] = js.native
  def load(url: String, `type`: Unit, callback: Unit, clear: Boolean): js.Promise[Any] = js.native
  def load(url: String, `type`: Unit, callback: WebixCallback): js.Promise[Any] = js.native
  def load(url: String, `type`: Unit, callback: WebixCallback, clear: Boolean): js.Promise[Any] = js.native
  
  def mapEvent(map: obj): Unit = js.native
  
  var name: String = js.native
  
  def parse(data: String): Unit = js.native
  def parse(data: String, `type`: String): Unit = js.native
  def parse(data: String, `type`: String, clear: Boolean): Unit = js.native
  def parse(data: String, `type`: Unit, clear: Boolean): Unit = js.native
  def parse(data: js.Array[Any]): Unit = js.native
  def parse(data: js.Array[Any], `type`: String): Unit = js.native
  def parse(data: js.Array[Any], `type`: String, clear: Boolean): Unit = js.native
  def parse(data: js.Array[Any], `type`: Unit, clear: Boolean): Unit = js.native
  def parse(data: js.Promise[Any]): Unit = js.native
  def parse(data: js.Promise[Any], `type`: String): Unit = js.native
  def parse(data: js.Promise[Any], `type`: String, clear: Boolean): Unit = js.native
  def parse(data: js.Promise[Any], `type`: Unit, clear: Boolean): Unit = js.native
  def parse(data: obj): Unit = js.native
  def parse(data: obj, `type`: String): Unit = js.native
  def parse(data: obj, `type`: String, clear: Boolean): Unit = js.native
  def parse(data: obj, `type`: Unit, clear: Boolean): Unit = js.native
  
  def refresh(): Unit = js.native
  def refresh(id: String): Unit = js.native
  def refresh(id: Double): Unit = js.native
  
  def setValues(values: obj): Unit = js.native
  def setValues(values: obj, update: Boolean): Unit = js.native
  def setValues(values: obj, update: Boolean, config: Any): Unit = js.native
  def setValues(values: obj, update: Unit, config: Any): Unit = js.native
  
  def unbind(): Unit = js.native
  
  def unblockEvent(): Unit = js.native
}
object DataRecord {
  
  inline def apply: DataRecordFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("DataRecord").asInstanceOf[DataRecordFactory]
}
