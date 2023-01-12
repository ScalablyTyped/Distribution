package typings.videoReact.mod

import typings.react.mod.LegacyRef
import typings.react.mod.ReactNode
import typings.videoReact.videoReactStrings.auto
import typings.videoReact.videoReactStrings.metadata
import typings.videoReact.videoReactStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlayerProps extends StObject {
  
  /**
    * The aspect ratio is the width of the video divided by its height.
    * Possible values:
    *
    * - auto
    * - 16:9
    * - 4:3
    */
  var aspectRatio: js.UndefOr[String] = js.undefined
  
  /**
    * If specified, the video automatically begins to play back as soon as
    * it can do so without stopping to finish loading the data.
    */
  var autoPlay: js.UndefOr[Boolean] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * In fluid mode, it’s 100% wide all the time, the height will be
    * calculated by the video's ratio.
    */
  var fluid: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The height value of video, could be an number or percent or auto.
    * (This attribute is effective only if you set fluid as false)
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * A Boolean attribute which indicates the default setting of the audio
    * contained in the video. If set, the audio will be initially silenced.
    * Its default value is false, meaning that the audio will be played when
    * the video is played.
    */
  var muted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [iOS only] Determines whether HTML5 videos play inline or use the native
    * full-screen controller.
    */
  var playsInline: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A URL indicating a poster frame to show until the user plays or
    * seeks. If this attribute isn't specified, nothing is displayed
    * until the first frame is available; then the first frame is shown
    * as the poster frame.
    */
  var poster: js.UndefOr[String] = js.undefined
  
  /**
    * This enumerated attribute is intended to provide a hint to the
    * browser about what the author thinks will lead to the best user
    * experience. It may have one of the following values:
    *
    * - none: indicates that the video should not be preloaded.
    * - metadata: indicates that only video metadata should be preloaded.
    * - auto: indicates that both video and audio should be preloaded.
    * (even if the user is not interacting with the video)
    */
  var preload: js.UndefOr[none | metadata | auto] = js.undefined
  
  var ref: js.UndefOr[LegacyRef[PlayerReference]] = js.undefined
  
  /**
    * The URL of the video to embed. This is optional; you may instead
    * use the <source> element within the Player block to specify the
    * video to embed.
    */
  var src: js.UndefOr[String] = js.undefined
  
  /**
    * Seek the Video at A Specific Time On Load
    */
  var startTime: js.UndefOr[Double] = js.undefined
  
  /**
    * The width value of video, could be an number or percent or auto.
    * (This attribute is effective only if you set fluid as false)
    */
  var width: js.UndefOr[Double] = js.undefined
}
object PlayerProps {
  
  inline def apply(): PlayerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayerProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlayerProps] (val x: Self) extends AnyVal {
    
    inline def setAspectRatio(value: String): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    inline def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
    
    inline def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
    
    inline def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
    
    inline def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    inline def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
    
    inline def setPlaysInline(value: Boolean): Self = StObject.set(x, "playsInline", value.asInstanceOf[js.Any])
    
    inline def setPlaysInlineUndefined: Self = StObject.set(x, "playsInline", js.undefined)
    
    inline def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
    
    inline def setPosterUndefined: Self = StObject.set(x, "poster", js.undefined)
    
    inline def setPreload(value: none | metadata | auto): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
    
    inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
    
    inline def setRef(value: LegacyRef[PlayerReference]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ PlayerReference | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
