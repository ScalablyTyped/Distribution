package typings.webix.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataProcessor extends js.Object {
  
  def attachEvent(`type`: String, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: String, functor: WebixCallback, id: String): String | Double = js.native
  
  def attachProgress(start: WebixCallback, end: WebixCallback, error: WebixCallback): Unit = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[_]): Boolean = js.native
  
  def clearValidation(): Unit = js.native
  
  var config: StringDictionary[js.Any] = js.native
  
  def define(property: String, value: js.Any): Unit = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def escape(value: String): String = js.native
  
  def getItemState(itemId: String): js.Any = js.native
  def getItemState(itemId: Double): js.Any = js.native
  
  def getState(): String | Boolean = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def ignore(code: WebixCallback, master: js.Any): Unit = js.native
  
  def mapEvent(map: js.Any): Unit = js.native
  
  var name: String = js.native
  
  def off(): Unit = js.native
  
  def on(): Unit = js.native
  
  def processResult(data: js.Any): Unit = js.native
  
  def reset(): Unit = js.native
  
  def save(id: String): js.Promise[_] = js.native
  def save(id: String, operation: js.UndefOr[scala.Nothing], obj: js.Any): js.Promise[_] = js.native
  def save(id: String, operation: String): js.Promise[_] = js.native
  def save(id: String, operation: String, obj: js.Any): js.Promise[_] = js.native
  def save(id: Double): js.Promise[_] = js.native
  def save(id: Double, operation: js.UndefOr[scala.Nothing], obj: js.Any): js.Promise[_] = js.native
  def save(id: Double, operation: String): js.Promise[_] = js.native
  def save(id: Double, operation: String, obj: js.Any): js.Promise[_] = js.native
  
  def send(): js.Promise[_] = js.native
  
  def setItemState(itemId: String, state: Boolean): Unit = js.native
  def setItemState(itemId: Double, state: Boolean): Unit = js.native
  
  def unblockEvent(): Unit = js.native
  
  def validate(): Boolean = js.native
  def validate(mode: js.Any): Boolean = js.native
}
@JSImport("webix", "DataProcessor")
@js.native
object DataProcessor extends TopLevel[DataProcessor]
