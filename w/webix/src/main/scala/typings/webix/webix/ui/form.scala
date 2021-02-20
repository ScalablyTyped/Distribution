package typings.webix.webix.ui

import typings.webix.webix.WebixCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait form extends baseview {
  
  def addView(view: js.Any): String | Double = js.native
  def addView(view: js.Any, index: Double): String | Double = js.native
  
  def attachEvent(`type`: formEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: formEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[_]): Boolean = js.native
  
  def clear(): Unit = js.native
  
  def clearValidation(): Unit = js.native
  
  @JSName("config")
  var config_form: formConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  var elements: js.Any = js.native
  
  def focus(item: String): Unit = js.native
  
  def getCleanValues(): js.Any = js.native
  
  def getDirtyValues(): js.Any = js.native
  
  def getScrollState(): js.Any = js.native
  
  def getValues(): js.Any = js.native
  def getValues(details: js.Any): js.Any = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def index(obj: js.Any): Double = js.native
  
  def isDirty(): Boolean = js.native
  
  def load(url: String): js.Promise[_] = js.native
  def load(url: String, `type`: js.UndefOr[scala.Nothing], callback: WebixCallback): js.Promise[_] = js.native
  def load(url: String, `type`: String): js.Promise[_] = js.native
  def load(url: String, `type`: String, callback: WebixCallback): js.Promise[_] = js.native
  
  def mapEvent(map: js.Any): Unit = js.native
  
  def markInvalid(name: String): Unit = js.native
  def markInvalid(name: String, state: String): Unit = js.native
  def markInvalid(name: String, state: Boolean): Unit = js.native
  
  def parse(data: js.Any, `type`: String): Unit = js.native
  
  def reconstruct(): Unit = js.native
  
  def refresh(): Unit = js.native
  
  def removeView(id: js.Any): Unit = js.native
  
  def render(id: String, data: js.Any, `type`: String): Unit = js.native
  def render(id: Double, data: js.Any, `type`: String): Unit = js.native
  
  def resizeChildren(): Unit = js.native
  
  def restore(state: js.Any): Unit = js.native
  def restore(state: js.Any, factory: WebixCallback): Unit = js.native
  
  def scrollTo(x: Double, y: Double): Unit = js.native
  
  def serialize(): js.Any = js.native
  def serialize(serializer: WebixCallback): js.Any = js.native
  
  def setDirty(): Unit = js.native
  def setDirty(mark: Boolean): Unit = js.native
  
  def setValues(values: js.Any): Unit = js.native
  def setValues(values: js.Any, update: Boolean): Unit = js.native
  
  def showBatch(name: String): Unit = js.native
  def showBatch(name: String, mode: Boolean): Unit = js.native
  
  def unblockEvent(): Unit = js.native
  
  def validate(): Boolean = js.native
  def validate(mode: js.Any): Boolean = js.native
}
