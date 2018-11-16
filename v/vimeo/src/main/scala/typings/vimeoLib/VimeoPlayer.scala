package typings
package vimeoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VimeoPlayer extends js.Object {
  @JSName("api")
  var api_Original: VimeoPlayerAPI = js.native
  def addEvent(eventName: java.lang.String, callback: js.Function1[/* e */ js.Any, scala.Unit]): js.Any = js.native
  def api(method: java.lang.String): js.Any = js.native
  def api(
    method: java.lang.String,
    callback: js.Function2[/* value */ js.Any, /* player_id */ js.Any, scala.Unit]
  ): js.Any = js.native
  def api(method: java.lang.String, value: js.Any): js.Any = js.native
  def api(method: java.lang.String, value: js.Array[VimeoParams]): js.Any = js.native
  def getCallback(eventName: java.lang.String, target_id: java.lang.String): js.Any = js.native
  def getDomainFromUrl(url: java.lang.String): java.lang.String = js.native
  def onMessageReceived(event: js.Any): js.Any = js.native
  def postMessage(method: java.lang.String, params: js.Array[VimeoParams], target: js.Any): scala.Unit = js.native
  def removeCallback(eventName: java.lang.String, target_id: java.lang.String): js.Any = js.native
  def removeEvent(eventName: java.lang.String): scala.Unit = js.native
  def storeCallback(eventName: java.lang.String, callback: js.Any, target_id: java.lang.String): js.Any = js.native
}

