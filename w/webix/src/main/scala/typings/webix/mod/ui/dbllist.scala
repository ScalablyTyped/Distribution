package typings.webix.mod.ui

import typings.webix.mod.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webix", "ui.dbllist")
@js.native
class dbllist ()
  extends typings.webix.webix.ui.baseview {
  
  @JSName("$onLoad")
  def $onLoad(args: js.Any*): js.Any = js.native
  @JSName("$onLoad")
  var $onLoad_Original: WebixCallback = js.native
  
  @JSName("$skin")
  var $skin_Original_dbllist: WebixCallback = js.native
  
  @JSName("$$")
  var DollarDollar: js.Any = js.native
  
  def attachEvent(`type`: dbllistEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: dbllistEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[_]): Boolean = js.native
  
  @JSName("config")
  var config_dbllist: dbllistConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def focus(): Unit = js.native
  
  def getValue(): String = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def innerId(id: String): Double | String = js.native
  def innerId(id: Double): Double | String = js.native
  
  def load(url: String): js.Promise[_] = js.native
  def load(url: String, `type`: js.UndefOr[scala.Nothing], callback: WebixCallback): js.Promise[_] = js.native
  def load(url: String, `type`: String): js.Promise[_] = js.native
  def load(url: String, `type`: String, callback: WebixCallback): js.Promise[_] = js.native
  
  def mapEvent(map: js.Any): Unit = js.native
  
  def parse(data: js.Any, `type`: String): Unit = js.native
  
  def select(id: String, mode: Boolean): Unit = js.native
  def select(id: js.Array[_], mode: Boolean): Unit = js.native
  
  def setValue(ids: String): Unit = js.native
  def setValue(ids: js.Array[_]): Unit = js.native
  
  def ui(view: js.Any): typings.webix.webix.ui.baseview = js.native
  
  def unblockEvent(): Unit = js.native
}
