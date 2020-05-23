package typings.wegameApi.global

import typings.wegameApi.anon.ErrMsg
import typings.wegameApi.anon.IsEnded
import typings.wegameApi.anon.Width
import typings.wegameApi.wx.types.AdStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("RewardedVideoAd")
@js.native
class RewardedVideoAd ()
  extends typings.wegameApi.InterstitialAd {
  /**
    * 广告单元 id
    */
  /* CompleteClass */
  override var adUnitId: String = js.native
  /**
    * banner 广告组件的样式。style 上的属性的值仅为开发者设置的值，banner 广告会根据开发者设置的宽度进行等比缩放，缩放后的真实尺寸需要通过 BannerAd.onResize() 事件获得。
    */
  /* CompleteClass */
  override var style: AdStyle = js.native
  /**
    * 销毁 banner 广告
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /**
    * 隐藏 banner 广告
    */
  /* CompleteClass */
  override def hide(): Unit = js.native
  /**
    * 加载视频广告
    */
  /* CompleteClass */
  override def load(): js.Promise[Unit] = js.native
  /**
    * 监听用户点击 关闭广告 按钮的事件
    */
  /* CompleteClass */
  override def offClose(callback: js.Function1[/* res */ IsEnded, Unit]): Unit = js.native
  /**
    * 取消监听banner 广告错误事件
    */
  /* CompleteClass */
  override def offError(callback: js.Function1[/* res */ ErrMsg, Unit]): Unit = js.native
  /**
    * 取消监听banner 广告加载事件
    */
  /* CompleteClass */
  override def offLoad(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 取消监听隐藏 banner 广告缩放
    */
  /* CompleteClass */
  override def offResize(callback: js.Function1[/* res */ Width, Unit]): Unit = js.native
  /**
    * 监听用户点击 关闭广告 按钮的事件
    */
  /* CompleteClass */
  override def onClose(callback: js.Function1[/* res */ IsEnded, Unit]): Unit = js.native
  /**
    * 监听banner 广告错误事件
    */
  /* CompleteClass */
  override def onError(callback: js.Function1[/* res */ ErrMsg, Unit]): Unit = js.native
  /**
    * 监听banner 广告加载事件
    */
  /* CompleteClass */
  override def onLoad(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 监听 banner 广告缩放
    */
  /* CompleteClass */
  override def onResize(callback: js.Function1[/* res */ Width, Unit]): Unit = js.native
  /**
    * 显示 banner 广告。
    */
  /* CompleteClass */
  override def show(): js.Promise[Unit] = js.native
}

