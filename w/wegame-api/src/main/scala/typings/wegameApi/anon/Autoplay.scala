package typings.wegameApi.anon

import typings.wegameApi.wegameApiStrings.contain
import typings.wegameApi.wegameApiStrings.cover
import typings.wegameApi.wegameApiStrings.fill
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Autoplay extends js.Object {
  /**
    * 视频是否自动播放，默认false
    */
  var autoplay: js.UndefOr[Boolean] = js.undefined
  /**
    * 视频是否显示控件，默认true
    */
  var controls: js.UndefOr[Boolean] = js.undefined
  /**
    * 默认值150
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * 视频的初始播放位置，单位为 s 秒，默认值0
    */
  var initialTime: js.UndefOr[Double] = js.undefined
  /**
    * 视频是否为直播，默认值0
    */
  var live: js.UndefOr[Double] = js.undefined
  /**
    * 视频是否是否循环播放，默认值false
    */
  var loop: js.UndefOr[Boolean] = js.undefined
  /**
    * 视频是否禁音播放，默认值false
    */
  var muted: js.UndefOr[Boolean] = js.undefined
  /**
    * 视频的缩放模式
    * fill - 填充，视频拉伸填满整个容器，不保证保持原有长宽比例
    * contain - 包含，保持原有长宽比例。保证视频尺寸一定可以在容器里面放得下。因此，可能会有部分空白
    * cover - 覆盖，保持原有长宽比例。保证视频尺寸一定大于容器尺寸，宽度和高度至少有一个和容器一致。因此，视频有部分会看不见
    */
  var objectFit: js.UndefOr[contain | cover | fill] = js.undefined
  /**
    * 视频的播放速率，有效值有 0.5、0.8、1.0、1.25、1.5默认值1.0
    */
  var playbackRate: js.UndefOr[Double] = js.undefined
  /**
    * 视频的封面
    */
  var poster: js.UndefOr[String] = js.undefined
  /**
    * 视频的资源地址
    */
  var src: String
  /**
    * 视频的宽度，默认值300
    */
  var width: js.UndefOr[Double] = js.undefined
  /**
    * 视频的左上角横坐标
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * 视频的左上角纵坐标
    */
  var y: js.UndefOr[Double] = js.undefined
}

object Autoplay {
  @scala.inline
  def apply(
    src: String,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    controls: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    initialTime: js.UndefOr[Double] = js.undefined,
    live: js.UndefOr[Double] = js.undefined,
    loop: js.UndefOr[Boolean] = js.undefined,
    muted: js.UndefOr[Boolean] = js.undefined,
    objectFit: contain | cover | fill = null,
    playbackRate: js.UndefOr[Double] = js.undefined,
    poster: String = null,
    width: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): Autoplay = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(initialTime)) __obj.updateDynamic("initialTime")(initialTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(live)) __obj.updateDynamic("live")(live.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(muted)) __obj.updateDynamic("muted")(muted.get.asInstanceOf[js.Any])
    if (objectFit != null) __obj.updateDynamic("objectFit")(objectFit.asInstanceOf[js.Any])
    if (!js.isUndefined(playbackRate)) __obj.updateDynamic("playbackRate")(playbackRate.get.asInstanceOf[js.Any])
    if (poster != null) __obj.updateDynamic("poster")(poster.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Autoplay]
  }
}

