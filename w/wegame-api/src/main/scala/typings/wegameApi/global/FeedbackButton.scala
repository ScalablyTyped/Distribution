package typings.wegameApi.global

import typings.wegameApi.wx.types.ButtonStyle
import typings.wegameApi.wx.types.ButtonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FeedbackButton")
@js.native
class FeedbackButton ()
  extends typings.wegameApi.FeedbackButton {
  /* CompleteClass */
  override var image: String = js.native
  /* CompleteClass */
  override var style: ButtonStyle = js.native
  /* CompleteClass */
  override var text: String = js.native
  /* CompleteClass */
  override var `type`: ButtonType = js.native
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /* CompleteClass */
  override def hide(): Unit = js.native
     // res参数会被具体按钮的API定义覆盖为具体信息
  /* CompleteClass */
  override def offTap(callback: js.Function1[/* res */ js.UndefOr[js.Any], Unit]): Unit = js.native
  /* CompleteClass */
  override def onTap(callback: js.Function1[/* res */ js.UndefOr[js.Any], Unit]): Unit = js.native
  /* CompleteClass */
  override def show(): Unit = js.native
}

