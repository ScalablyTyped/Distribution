package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CreatedButton")
@js.native
class CreatedButton () extends js.Object {
  var image: java.lang.String = js.native
  var style: wegameDashApiLib.wxNs.typesNs.ButtonStyle = js.native
  var text: java.lang.String = js.native
  var `type`: wegameDashApiLib.wxNs.typesNs.ButtonType = js.native
  def destroy(): scala.Unit = js.native
  def hide(): scala.Unit = js.native
     // res参数会被具体按钮的API定义覆盖为具体信息
  def offTap(callback: js.Function1[/* res */ js.UndefOr[js.Any], scala.Unit]): scala.Unit = js.native
  def onTap(callback: js.Function1[/* res */ js.UndefOr[js.Any], scala.Unit]): scala.Unit = js.native
  def show(): scala.Unit = js.native
}

