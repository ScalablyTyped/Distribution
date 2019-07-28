package typings.vimeo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VimeoPlayer extends js.Object {
  @JSName("api")
  var api_Original: VimeoPlayerAPI = js.native
  def addEvent(eventName: String, callback: js.Function1[/* e */ js.Any, Unit]): js.Any = js.native
  def api(method: String): js.Any = js.native
  def api(method: String, callback: js.Function2[/* value */ js.Any, /* player_id */ js.Any, Unit]): js.Any = js.native
  def api(method: String, value: js.Any): js.Any = js.native
  def api(method: String, value: js.Array[VimeoParams]): js.Any = js.native
  def getCallback(eventName: String, target_id: String): js.Any = js.native
  def getDomainFromUrl(url: String): String = js.native
  def onMessageReceived(event: js.Any): js.Any = js.native
  def postMessage(method: String, params: js.Array[VimeoParams], target: js.Any): Unit = js.native
  def removeCallback(eventName: String, target_id: String): js.Any = js.native
  def removeEvent(eventName: String): Unit = js.native
  def storeCallback(eventName: String, callback: js.Any, target_id: String): js.Any = js.native
}

