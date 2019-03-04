package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Autoplay extends js.Object {
  /**
    * 视频是否自动播放，默认false
    */
  var autoplay: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 视频是否显示控件，默认true
    */
  var controls: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 默认值150
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * 视频的初始播放位置，单位为 s 秒，默认值0
    */
  var initialTime: js.UndefOr[scala.Double] = js.undefined
  /**
    * 视频是否为直播，默认值0
    */
  var live: js.UndefOr[scala.Double] = js.undefined
  /**
    * 视频是否是否循环播放，默认值false
    */
  var loop: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 视频是否禁音播放，默认值false
    */
  var muted: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 视频的缩放模式
    * fill - 填充，视频拉伸填满整个容器，不保证保持原有长宽比例
    * contain - 包含，保持原有长宽比例。保证视频尺寸一定可以在容器里面放得下。因此，可能会有部分空白
    * cover - 覆盖，保持原有长宽比例。保证视频尺寸一定大于容器尺寸，宽度和高度至少有一个和容器一致。因此，视频有部分会看不见
    */
  var objectFit: js.UndefOr[
    wegameDashApiLib.wegameDashApiLibStrings.contain | wegameDashApiLib.wegameDashApiLibStrings.cover | wegameDashApiLib.wegameDashApiLibStrings.fill
  ] = js.undefined
  /**
    * 视频的播放速率，有效值有 0.5、0.8、1.0、1.25、1.5默认值1.0
    */
  var playbackRate: js.UndefOr[scala.Double] = js.undefined
  /**
    * 视频的封面
    */
  var poster: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 视频的资源地址
    */
  var src: java.lang.String
  /**
    * 视频的宽度，默认值300
    */
  var width: js.UndefOr[scala.Double] = js.undefined
  /**
    * 视频的左上角横坐标
    */
  var x: js.UndefOr[scala.Double] = js.undefined
  /**
    * 视频的左上角纵坐标
    */
  var y: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Autoplay {
  @scala.inline
  def apply(
    src: java.lang.String,
    autoplay: js.UndefOr[scala.Boolean] = js.undefined,
    controls: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    initialTime: scala.Int | scala.Double = null,
    live: scala.Int | scala.Double = null,
    loop: js.UndefOr[scala.Boolean] = js.undefined,
    muted: js.UndefOr[scala.Boolean] = js.undefined,
    objectFit: wegameDashApiLib.wegameDashApiLibStrings.contain | wegameDashApiLib.wegameDashApiLibStrings.cover | wegameDashApiLib.wegameDashApiLibStrings.fill = null,
    playbackRate: scala.Int | scala.Double = null,
    poster: java.lang.String = null,
    width: scala.Int | scala.Double = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): Anon_Autoplay = {
    val __obj = js.Dynamic.literal(src = src)
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay)
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (initialTime != null) __obj.updateDynamic("initialTime")(initialTime.asInstanceOf[js.Any])
    if (live != null) __obj.updateDynamic("live")(live.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (!js.isUndefined(muted)) __obj.updateDynamic("muted")(muted)
    if (objectFit != null) __obj.updateDynamic("objectFit")(objectFit.asInstanceOf[js.Any])
    if (playbackRate != null) __obj.updateDynamic("playbackRate")(playbackRate.asInstanceOf[js.Any])
    if (poster != null) __obj.updateDynamic("poster")(poster)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Autoplay]
  }
}

