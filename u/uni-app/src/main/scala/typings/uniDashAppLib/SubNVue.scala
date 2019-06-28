package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubNVue extends js.Object {
  /**
    * 隐藏原生子窗体
    */
  def hide(): scala.Unit = js.native
  @JSName("hide")
  def hide_fadeout(options: uniDashAppLib.uniDashAppLibStrings.`fade-out`): scala.Unit = js.native
  @JSName("hide")
  def hide_popout(options: uniDashAppLib.uniDashAppLibStrings.`pop-out`): scala.Unit = js.native
  @JSName("hide")
  def hide_slideoutbottom(options: uniDashAppLib.uniDashAppLibStrings.`slide-out-bottom`): scala.Unit = js.native
  @JSName("hide")
  def hide_slideoutleft(options: uniDashAppLib.uniDashAppLibStrings.`slide-out-left`): scala.Unit = js.native
  @JSName("hide")
  def hide_slideoutright(options: uniDashAppLib.uniDashAppLibStrings.`slide-out-right`): scala.Unit = js.native
  @JSName("hide")
  def hide_slideouttop(options: uniDashAppLib.uniDashAppLibStrings.`slide-out-top`): scala.Unit = js.native
  @JSName("hide")
  def hide_zoomfadein(options: uniDashAppLib.uniDashAppLibStrings.`zoom-fade-in`): scala.Unit = js.native
  @JSName("hide")
  def hide_zoomin(options: uniDashAppLib.uniDashAppLibStrings.`zoom-in`): scala.Unit = js.native
  /**
    * 监听消息
    */
  def onMessage(): scala.Unit = js.native
  def onMessage(success: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * 发送消息
    */
  def postMessage(): scala.Unit = js.native
  /**
    * 设置原生子窗体的样式
    */
  def setStyle(): scala.Unit = js.native
  def setStyle(options: SubNVuesSetStyleOptions): scala.Unit = js.native
  /**
    * 显示原生子窗体
    */
  def show(): scala.Unit = js.native
  @JSName("show")
  def show_fadein(options: uniDashAppLib.uniDashAppLibStrings.`fade-in`): scala.Unit = js.native
  @JSName("show")
  def show_popin(options: uniDashAppLib.uniDashAppLibStrings.`pop-in`): scala.Unit = js.native
  @JSName("show")
  def show_slideinbottom(options: uniDashAppLib.uniDashAppLibStrings.`slide-in-bottom`): scala.Unit = js.native
  @JSName("show")
  def show_slideinleft(options: uniDashAppLib.uniDashAppLibStrings.`slide-in-left`): scala.Unit = js.native
  @JSName("show")
  def show_slideinright(options: uniDashAppLib.uniDashAppLibStrings.`slide-in-right`): scala.Unit = js.native
  @JSName("show")
  def show_slideintop(options: uniDashAppLib.uniDashAppLibStrings.`slide-in-top`): scala.Unit = js.native
  @JSName("show")
  def show_zoomfadeout(options: uniDashAppLib.uniDashAppLibStrings.`zoom-fade-out`): scala.Unit = js.native
  @JSName("show")
  def show_zoomout(options: uniDashAppLib.uniDashAppLibStrings.`zoom-out`): scala.Unit = js.native
}

