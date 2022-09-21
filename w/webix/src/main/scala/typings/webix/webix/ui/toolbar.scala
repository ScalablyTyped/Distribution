package typings.webix.webix.ui

import typings.webix.webix.WebixCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait toolbar
  extends StObject
     with baseview {
  
  def addView(view: Any): String | Double = js.native
  def addView(view: Any, index: Double): String | Double = js.native
  
  def attachEvent(`type`: toolbarEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: toolbarEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  def clear(): Unit = js.native
  
  def clearValidation(): Unit = js.native
  
  @JSName("config")
  var config_toolbar: toolbarConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def focus(item: String): Unit = js.native
  
  def getCleanValues(): Any = js.native
  
  def getDirtyValues(): Any = js.native
  
  def getScrollState(): Any = js.native
  
  def getValues(): Any = js.native
  def getValues(details: Any): Any = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def index(obj: Any): Double = js.native
  
  def isDirty(): Boolean = js.native
  
  def load(url: String): js.Promise[Any] = js.native
  def load(url: String, `type`: String): js.Promise[Any] = js.native
  def load(url: String, `type`: String, callback: WebixCallback): js.Promise[Any] = js.native
  def load(url: String, `type`: Unit, callback: WebixCallback): js.Promise[Any] = js.native
  
  def mapEvent(map: Any): Unit = js.native
  
  def markInvalid(name: String): Unit = js.native
  def markInvalid(name: String, state: String): Unit = js.native
  def markInvalid(name: String, state: Boolean): Unit = js.native
  
  def parse(data: Any, `type`: String): Unit = js.native
  
  def reconstruct(): Unit = js.native
  
  def refresh(): Unit = js.native
  
  def removeView(id: Any): Unit = js.native
  
  def render(id: String, data: Any, `type`: String): Unit = js.native
  def render(id: Double, data: Any, `type`: String): Unit = js.native
  
  def resizeChildren(): Unit = js.native
  
  def restore(state: Any): Unit = js.native
  def restore(state: Any, factory: WebixCallback): Unit = js.native
  
  def scrollTo(x: Double, y: Double): Unit = js.native
  
  def serialize(): Any = js.native
  def serialize(serializer: WebixCallback): Any = js.native
  
  def setDirty(): Unit = js.native
  def setDirty(mark: Boolean): Unit = js.native
  
  def setValues(values: Any): Unit = js.native
  def setValues(values: Any, update: Boolean): Unit = js.native
  
  def showBatch(name: String): Unit = js.native
  def showBatch(name: String, mode: Boolean): Unit = js.native
  
  def unblockEvent(): Unit = js.native
  
  def validate(): Boolean = js.native
  def validate(mode: Any): Boolean = js.native
}
