package typings.wegameApi.anon

import typings.wegameApi.wegameApiStrings.contain
import typings.wegameApi.wegameApiStrings.cover
import typings.wegameApi.wegameApiStrings.fill
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Autoplay extends StObject {
  
  /**
    * 视频是否自动播放，默认false
    */
  var autoplay: js.UndefOr[Boolean] = js.native
  
  /**
    * 视频是否显示控件，默认true
    */
  var controls: js.UndefOr[Boolean] = js.native
  
  /**
    * 默认值150
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * 视频的初始播放位置，单位为 s 秒，默认值0
    */
  var initialTime: js.UndefOr[Double] = js.native
  
  /**
    * 视频是否为直播，默认值0
    */
  var live: js.UndefOr[Double] = js.native
  
  /**
    * 视频是否是否循环播放，默认值false
    */
  var loop: js.UndefOr[Boolean] = js.native
  
  /**
    * 视频是否禁音播放，默认值false
    */
  var muted: js.UndefOr[Boolean] = js.native
  
  /**
    * 视频的缩放模式
    * fill - 填充，视频拉伸填满整个容器，不保证保持原有长宽比例
    * contain - 包含，保持原有长宽比例。保证视频尺寸一定可以在容器里面放得下。因此，可能会有部分空白
    * cover - 覆盖，保持原有长宽比例。保证视频尺寸一定大于容器尺寸，宽度和高度至少有一个和容器一致。因此，视频有部分会看不见
    */
  var objectFit: js.UndefOr[contain | cover | fill] = js.native
  
  /**
    * 视频的播放速率，有效值有 0.5、0.8、1.0、1.25、1.5默认值1.0
    */
  var playbackRate: js.UndefOr[Double] = js.native
  
  /**
    * 视频的封面
    */
  var poster: js.UndefOr[String] = js.native
  
  /**
    * 视频的资源地址
    */
  var src: String = js.native
  
  /**
    * 视频的宽度，默认值300
    */
  var width: js.UndefOr[Double] = js.native
  
  /**
    * 视频的左上角横坐标
    */
  var x: js.UndefOr[Double] = js.native
  
  /**
    * 视频的左上角纵坐标
    */
  var y: js.UndefOr[Double] = js.native
}
object Autoplay {
  
  @scala.inline
  def apply(src: String): Autoplay = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[Autoplay]
  }
  
  @scala.inline
  implicit class AutoplayMutableBuilder[Self <: Autoplay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
    
    @scala.inline
    def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setInitialTime(value: Double): Self = StObject.set(x, "initialTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialTimeUndefined: Self = StObject.set(x, "initialTime", js.undefined)
    
    @scala.inline
    def setLive(value: Double): Self = StObject.set(x, "live", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiveUndefined: Self = StObject.set(x, "live", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    @scala.inline
    def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
    
    @scala.inline
    def setObjectFit(value: contain | cover | fill): Self = StObject.set(x, "objectFit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectFitUndefined: Self = StObject.set(x, "objectFit", js.undefined)
    
    @scala.inline
    def setPlaybackRate(value: Double): Self = StObject.set(x, "playbackRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaybackRateUndefined: Self = StObject.set(x, "playbackRate", js.undefined)
    
    @scala.inline
    def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosterUndefined: Self = StObject.set(x, "poster", js.undefined)
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
