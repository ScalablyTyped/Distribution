package typings.webix.mod

import typings.webix.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataProcessor extends StObject {
  
  def attachEvent(`type`: String, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: String, functor: WebixCallback, id: String): String | Double = js.native
  
  def attachProgress(start: WebixCallback, end: WebixCallback, error: WebixCallback): Unit = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  def clearValidation(): Unit = js.native
  
  var config: obj = js.native
  
  def define(property: String): Unit = js.native
  def define(property: String, value: Any): Unit = js.native
  def define(property: obj): Unit = js.native
  def define(property: obj, value: Any): Unit = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def escape(value: String): String = js.native
  
  def getItemState(itemId: String): obj = js.native
  def getItemState(itemId: Double): obj = js.native
  
  def getState(): String | Boolean = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def ignore(code: WebixCallback, master: obj): Unit = js.native
  
  def mapEvent(map: obj): Unit = js.native
  
  var name: String = js.native
  
  def off(): Unit = js.native
  
  def on(): Unit = js.native
  
  def processResult(data: obj): Unit = js.native
  
  def reset(): Unit = js.native
  
  def save(id: String): js.Promise[Any] = js.native
  def save(id: String, operation: String): js.Promise[Any] = js.native
  def save(id: String, operation: String, obj: obj): js.Promise[Any] = js.native
  def save(id: String, operation: Unit, obj: obj): js.Promise[Any] = js.native
  def save(id: Double): js.Promise[Any] = js.native
  def save(id: Double, operation: String): js.Promise[Any] = js.native
  def save(id: Double, operation: String, obj: obj): js.Promise[Any] = js.native
  def save(id: Double, operation: Unit, obj: obj): js.Promise[Any] = js.native
  
  def send(): js.Promise[Any] = js.native
  
  def setItemState(itemId: String, state: Boolean): Unit = js.native
  def setItemState(itemId: Double, state: Boolean): Unit = js.native
  
  def unblockEvent(): Unit = js.native
  
  def validate(): Boolean = js.native
  def validate(mode: obj): Boolean = js.native
}
object DataProcessor {
  
  inline def apply: DataProcessor = ^.asInstanceOf[js.Dynamic].selectDynamic("DataProcessor").asInstanceOf[DataProcessor]
}
