package typings.wegameDashApi

import typings.wegameDashApi.wxNs.typesNs.ButtonStyle
import typings.wegameDashApi.wxNs.typesNs.ButtonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CreatedButton")
@js.native
class CreatedButton () extends js.Object {
  var image: String = js.native
  var style: ButtonStyle = js.native
  var text: String = js.native
  var `type`: ButtonType = js.native
  def destroy(): Unit = js.native
  def hide(): Unit = js.native
     // res参数会被具体按钮的API定义覆盖为具体信息
  def offTap(callback: js.Function1[/* res */ js.UndefOr[js.Any], Unit]): Unit = js.native
  def onTap(callback: js.Function1[/* res */ js.UndefOr[js.Any], Unit]): Unit = js.native
  def show(): Unit = js.native
}

