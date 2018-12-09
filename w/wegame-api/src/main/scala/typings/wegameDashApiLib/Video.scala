package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Video")
@js.native
class Video () extends js.Object {
  /**
       * 视频是否自动播放，默认false
       */
  var autoplay: scala.Boolean = js.native
  /**
       * 视频是否显示控件，默认true
       */
  var controls: scala.Boolean = js.native
  /**
       * 默认值150
       */
  var height: scala.Double = js.native
  /**
       * 视频的初始播放位置，单位为 s 秒，默认值0
       */
  var initialTime: scala.Double = js.native
  /**
       * 视频是否为直播，默认值0
       */
  var live: js.UndefOr[scala.Double] = js.native
  /**
       * 视频是否是否循环播放，默认值false
       */
  var loop: scala.Boolean = js.native
  /**
       * 视频是否禁音播放，默认值false
       */
  var muted: scala.Boolean = js.native
  /**
       * 视频的缩放模式
       * fill - 填充，视频拉伸填满整个容器，不保证保持原有长宽比例
       * contain - 包含，保持原有长宽比例。保证视频尺寸一定可以在容器里面放得下。因此，可能会有部分空白
       * cover - 覆盖，保持原有长宽比例。保证视频尺寸一定大于容器尺寸，宽度和高度至少有一个和容器一致。因此，视频有部分会看不见
       */
  var objectFit: wegameDashApiLib.wegameDashApiLibStrings.contain | wegameDashApiLib.wegameDashApiLibStrings.cover | wegameDashApiLib.wegameDashApiLibStrings.fill = js.native
  /**
       * 视频的播放速率，有效值有 0.5、0.8、1.0、1.25、1.5默认值1.0
       */
  var playbackRate: scala.Double = js.native
  /**
       * 视频的封面
       */
  var poster: java.lang.String = js.native
  /**
       * 视频的资源地址
       */
  var src: java.lang.String = js.native
  /**
       * 视频的宽度，默认值300
       */
  var width: scala.Double = js.native
  /**
       * 视频的左上角横坐标
       */
  var x: scala.Double = js.native
  /**
       * 视频的左上角纵坐标
       */
  var y: scala.Double = js.native
  /**
       * 销毁视频
       */
  def destroy(): scala.Unit = js.native
  /**
       * 视频退出全屏
       */
  def exitFullScreen(): js.Promise[scala.Unit] = js.native
  /**
       * 取消监听视频播放到末尾事件
       */
  def offEnded(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
       * 取消监听视频错误事件
       */
  def offError(callback: js.Function1[/* res */ Anon_ErrMsgString, scala.Unit]): scala.Unit = js.native
  /**
       * 取消监听视频暂停事件
       */
  def offPause(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
       * 取消监听视频播放事件
       */
  def offPlay(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
       * 取消监听视频播放进度更新事件
       */
  def offTimeUpdate(callback: js.Function1[/* res */ Anon_Position, scala.Unit]): scala.Unit = js.native
  /**
       * 取消监听视频缓冲事件
       */
  def offWaiting(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
       * 监听视频播放到末尾事件
       */
  def onEnded(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
       * 监听视频错误事件
       * @param callback.res.errMsg 错误信息，有如下值
       *                            MEDIA_ERR_NETWORK - 当下载时发生错误
       *                            MEDIA_ERR_DECODE  - 当解码时发生错误
       *                            MEDIA_ERR_SRC_NOT_SUPPORTED - video 的 src 属性是不支持的资源类型
       */
  def onError(callback: js.Function1[/* res */ Anon_ErrMsgString, scala.Unit]): scala.Unit = js.native
  /**
       * 监听视频暂停事件
       */
  def onPause(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
       * 监听视频播放事件
       */
  def onPlay(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
       * 监听视频播放进度更新事件
       * @param callback.res.position 当前的播放位置，单位为秒
       * @param callback.res.duration 视频的总时长，单位为秒
       */
  def onTimeUpdate(callback: js.Function1[/* res */ Anon_Position, scala.Unit]): scala.Unit = js.native
  /**
       * 监听视频缓冲事件
       */
  def onWaiting(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
       * 视频播放到末尾时触发的回调函数
       */
  def onended(): scala.Unit = js.native
  /**
       * 视频发生错误时触发的回调函数
       */
  def onerror(): scala.Unit = js.native
  /**
       * 视频暂停时触发的回调函数
       */
  def onpause(): scala.Unit = js.native
  /**
       * 视频开始播放时触发的回调函数
       */
  def onplay(): scala.Unit = js.native
  /**
       * 每当视频播放进度更新时触发的回调函数
       */
  def ontimeupdate(): scala.Unit = js.native
  /**
       * 视频开始缓冲时触发的回调函数
       */
  def onwaiting(): scala.Unit = js.native
  /**
       * 暂停视频
       */
  def pause(): js.Promise[scala.Unit] = js.native
  /**
       * 播放视频
       */
  def play(): js.Promise[scala.Unit] = js.native
  /**
       * 视频全屏
       */
  def requestFullScreen(): js.Promise[scala.Unit] = js.native
  /**
       * 视频跳转
       * @param time 视频跳转到指定位置，单位为 s 秒
       */
  def seek(time: scala.Double): js.Promise[scala.Unit] = js.native
  /**
       * 停止视频
       */
  def stop(): js.Promise[scala.Unit] = js.native
}

