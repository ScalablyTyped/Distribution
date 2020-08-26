package typings.wechatMiniprogram.WechatMiniprogram.Component

import typings.wechatMiniprogram.WechatMiniprogram.Page.IResizeOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageLifetimes extends js.Object {
  /** 页面生命周期回调—监听页面隐藏
    *
    * 页面隐藏/切入后台时触发。 如 `navigateTo` 或底部 `tab` 切换到其他页面，小程序切入后台等。
    */
  def hide(): Unit = js.native
  /** 页面生命周期回调—监听页面尺寸变化
    *
    * 所在页面尺寸变化时执行
    */
  def resize(size: IResizeOption): Unit = js.native
  /** 页面生命周期回调—监听页面显示
    *
    * 页面显示/切入前台时触发。
    */
  def show(): Unit = js.native
}

object PageLifetimes {
  @scala.inline
  def apply(hide: () => Unit, resize: IResizeOption => Unit, show: () => Unit): PageLifetimes = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), resize = js.Any.fromFunction1(resize), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[PageLifetimes]
  }
  @scala.inline
  implicit class PageLifetimesOps[Self <: PageLifetimes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    @scala.inline
    def setResize(value: IResizeOption => Unit): Self = this.set("resize", js.Any.fromFunction1(value))
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
  }
  
}

