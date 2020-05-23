package typings.wegameApi.global

import typings.wegameApi.anon.Duration
import typings.wegameApi.anon.ErrMsg
import typings.wegameApi.wegameApiStrings.contain
import typings.wegameApi.wegameApiStrings.cover
import typings.wegameApi.wegameApiStrings.fill
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Video")
@js.native
class Video ()
  extends typings.wegameApi.Video {
  /**
    * 视频是否自动播放，默认false
    */
  /* CompleteClass */
  override var autoplay: Boolean = js.native
  /**
    * 视频是否显示控件，默认true
    */
  /* CompleteClass */
  override var controls: Boolean = js.native
  /**
    * 默认值150
    */
  /* CompleteClass */
  override var height: Double = js.native
  /**
    * 视频的初始播放位置，单位为 s 秒，默认值0
    */
  /* CompleteClass */
  override var initialTime: Double = js.native
  /**
    * 视频是否是否循环播放，默认值false
    */
  /* CompleteClass */
  override var loop: Boolean = js.native
  /**
    * 视频是否禁音播放，默认值false
    */
  /* CompleteClass */
  override var muted: Boolean = js.native
  /**
    * 视频的缩放模式
    * fill - 填充，视频拉伸填满整个容器，不保证保持原有长宽比例
    * contain - 包含，保持原有长宽比例。保证视频尺寸一定可以在容器里面放得下。因此，可能会有部分空白
    * cover - 覆盖，保持原有长宽比例。保证视频尺寸一定大于容器尺寸，宽度和高度至少有一个和容器一致。因此，视频有部分会看不见
    */
  /* CompleteClass */
  override var objectFit: contain | cover | fill = js.native
  /**
    * 视频的播放速率，有效值有 0.5、0.8、1.0、1.25、1.5默认值1.0
    */
  /* CompleteClass */
  override var playbackRate: Double = js.native
  /**
    * 视频的封面
    */
  /* CompleteClass */
  override var poster: String = js.native
  /**
    * 视频的资源地址
    */
  /* CompleteClass */
  override var src: String = js.native
  /**
    * 视频的宽度，默认值300
    */
  /* CompleteClass */
  override var width: Double = js.native
  /**
    * 视频的左上角横坐标
    */
  /* CompleteClass */
  override var x: Double = js.native
  /**
    * 视频的左上角纵坐标
    */
  /* CompleteClass */
  override var y: Double = js.native
  /**
    * 销毁视频
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /**
    * 视频退出全屏
    */
  /* CompleteClass */
  override def exitFullScreen(): js.Promise[Unit] = js.native
  /**
    * 取消监听视频播放到末尾事件
    */
  /* CompleteClass */
  override def offEnded(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 取消监听视频错误事件
    */
  /* CompleteClass */
  override def offError(callback: js.Function1[/* res */ ErrMsg, Unit]): Unit = js.native
  /**
    * 取消监听视频暂停事件
    */
  /* CompleteClass */
  override def offPause(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 取消监听视频播放事件
    */
  /* CompleteClass */
  override def offPlay(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 取消监听视频播放进度更新事件
    */
  /* CompleteClass */
  override def offTimeUpdate(callback: js.Function1[/* res */ Duration, Unit]): Unit = js.native
  /**
    * 取消监听视频缓冲事件
    */
  /* CompleteClass */
  override def offWaiting(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 监听视频播放到末尾事件
    */
  /* CompleteClass */
  override def onEnded(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 监听视频错误事件
    * @param callback.res.errMsg 错误信息，有如下值
    *                            MEDIA_ERR_NETWORK - 当下载时发生错误
    *                            MEDIA_ERR_DECODE  - 当解码时发生错误
    *                            MEDIA_ERR_SRC_NOT_SUPPORTED - video 的 src 属性是不支持的资源类型
    */
  /* CompleteClass */
  override def onError(callback: js.Function1[/* res */ ErrMsg, Unit]): Unit = js.native
  /**
    * 监听视频暂停事件
    */
  /* CompleteClass */
  override def onPause(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 监听视频播放事件
    */
  /* CompleteClass */
  override def onPlay(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 监听视频播放进度更新事件
    * @param callback.res.position 当前的播放位置，单位为秒
    * @param callback.res.duration 视频的总时长，单位为秒
    */
  /* CompleteClass */
  override def onTimeUpdate(callback: js.Function1[/* res */ Duration, Unit]): Unit = js.native
  /**
    * 监听视频缓冲事件
    */
  /* CompleteClass */
  override def onWaiting(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 视频播放到末尾时触发的回调函数
    */
  /* CompleteClass */
  override def onended(): Unit = js.native
  /**
    * 视频发生错误时触发的回调函数
    */
  /* CompleteClass */
  override def onerror(): Unit = js.native
  /**
    * 视频暂停时触发的回调函数
    */
  /* CompleteClass */
  override def onpause(): Unit = js.native
  /**
    * 视频开始播放时触发的回调函数
    */
  /* CompleteClass */
  override def onplay(): Unit = js.native
  /**
    * 每当视频播放进度更新时触发的回调函数
    */
  /* CompleteClass */
  override def ontimeupdate(): Unit = js.native
  /**
    * 视频开始缓冲时触发的回调函数
    */
  /* CompleteClass */
  override def onwaiting(): Unit = js.native
  /**
    * 暂停视频
    */
  /* CompleteClass */
  override def pause(): js.Promise[Unit] = js.native
  /**
    * 播放视频
    */
  /* CompleteClass */
  override def play(): js.Promise[Unit] = js.native
  /**
    * 视频全屏
    */
  /* CompleteClass */
  override def requestFullScreen(): js.Promise[Unit] = js.native
  /**
    * 视频跳转
    * @param time 视频跳转到指定位置，单位为 s 秒
    */
  /* CompleteClass */
  override def seek(time: Double): js.Promise[Unit] = js.native
  /**
    * 停止视频
    */
  /* CompleteClass */
  override def stop(): js.Promise[Unit] = js.native
}

