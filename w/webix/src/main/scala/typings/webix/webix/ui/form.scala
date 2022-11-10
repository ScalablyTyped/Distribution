package typings.webix.webix.ui

import typings.webix.webix.WebixCallback
import typings.webix.webix.obj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait form
  extends StObject
     with baseview {
  
  def addView(view: obj): String | Double = js.native
  def addView(view: obj, index: Double): String | Double = js.native
  
  def attachEvent(`type`: formEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: formEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  def clear(config: Any): Unit = js.native
  
  def clearValidation(): Unit = js.native
  
  @JSName("config")
  var config_form: formConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  var elements: obj = js.native
  
  def focus(item: String): Unit = js.native
  
  def getCleanValues(): obj = js.native
  
  def getDirtyValues(): obj = js.native
  
  def getScrollState(): obj = js.native
  
  def getValues(): obj = js.native
  def getValues(details: WebixCallback): obj = js.native
  def getValues(details: obj): obj = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def index(obj: obj): Double = js.native
  
  def isDirty(): Boolean = js.native
  
  def load(url: String): js.Promise[Any] = js.native
  def load(url: String, `type`: String): js.Promise[Any] = js.native
  def load(url: String, `type`: String, callback: Unit, clear: Boolean): js.Promise[Any] = js.native
  def load(url: String, `type`: String, callback: WebixCallback): js.Promise[Any] = js.native
  def load(url: String, `type`: String, callback: WebixCallback, clear: Boolean): js.Promise[Any] = js.native
  def load(url: String, `type`: Unit, callback: Unit, clear: Boolean): js.Promise[Any] = js.native
  def load(url: String, `type`: Unit, callback: WebixCallback): js.Promise[Any] = js.native
  def load(url: String, `type`: Unit, callback: WebixCallback, clear: Boolean): js.Promise[Any] = js.native
  
  def mapEvent(map: obj): Unit = js.native
  
  def markInvalid(name: String): Unit = js.native
  def markInvalid(name: String, state: String): Unit = js.native
  def markInvalid(name: String, state: Boolean): Unit = js.native
  
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
  
  def reconstruct(): Unit = js.native
  
  def refresh(): Unit = js.native
  
  def removeView(id: String): Unit = js.native
  def removeView(id: Double): Unit = js.native
  def removeView(id: obj): Unit = js.native
  
  def render(id: String, data: obj, `type`: String): Unit = js.native
  def render(id: Double, data: obj, `type`: String): Unit = js.native
  
  def resizeChildren(): Unit = js.native
  
  def restore(state: obj): Unit = js.native
  def restore(state: obj, factory: WebixCallback): Unit = js.native
  
  def scrollTo(x: Double, y: Double): Unit = js.native
  
  def serialize(): obj = js.native
  def serialize(serializer: WebixCallback): obj = js.native
  
  def setDirty(): Unit = js.native
  def setDirty(mark: Boolean): Unit = js.native
  
  def setValues(values: obj): Unit = js.native
  def setValues(values: obj, update: Boolean): Unit = js.native
  def setValues(values: obj, update: Boolean, config: Any): Unit = js.native
  def setValues(values: obj, update: Unit, config: Any): Unit = js.native
  
  def showBatch(name: String): Unit = js.native
  def showBatch(name: String, mode: Boolean): Unit = js.native
  
  def unblockEvent(): Unit = js.native
  
  def validate(): Boolean = js.native
  def validate(mode: obj): Boolean = js.native
}
