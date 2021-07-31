package typings.wixUiCore

import typings.react.mod.Component
import typings.wixUiCore.anon.Config
import typings.wixUiCore.componentsVideoTypesMod.ICommonProps
import typings.wixUiCore.componentsVideoTypesMod.IConfig
import typings.wixUiCore.componentsVideoTypesMod.PlayerNameType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsVideoVideoMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/video/Video", "Video")
  @js.native
  class Video protected ()
    extends Component[IVideoProps, IVideoState, js.Any] {
    def this(props: IVideoProps) = this()
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MVideo(nextProps: IVideoProps): Unit = js.native
  }
  /* static members */
  object Video {
    
    @JSImport("wix-ui-core/dist/standalone/src/components/video/Video", "Video")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/standalone/src/components/video/Video", "Video.defaultProps")
    @js.native
    def defaultProps: Config = js.native
    @scala.inline
    def defaultProps_=(x: Config): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/standalone/src/components/video/Video", "Video.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait IVideoProps
    extends StObject
       with ICommonProps {
    
    var config: js.UndefOr[IConfig] = js.undefined
    
    var fillAllSpace: js.UndefOr[Boolean] = js.undefined
    
    var height: js.UndefOr[Double | String] = js.undefined
    
    var playerRef: js.UndefOr[js.Function] = js.undefined
    
    var width: js.UndefOr[Double | String] = js.undefined
  }
  object IVideoProps {
    
    @scala.inline
    def apply(id: String, src: String | js.Array[String]): IVideoProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[IVideoProps]
    }
    
    @scala.inline
    implicit class IVideoPropsMutableBuilder[Self <: IVideoProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: IConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setFillAllSpace(value: Boolean): Self = StObject.set(x, "fillAllSpace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillAllSpaceUndefined: Self = StObject.set(x, "fillAllSpace", js.undefined)
      
      @scala.inline
      def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setPlayerRef(value: js.Function): Self = StObject.set(x, "playerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlayerRefUndefined: Self = StObject.set(x, "playerRef", js.undefined)
      
      @scala.inline
      def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait IVideoState extends StObject {
    
    var playerName: PlayerNameType
  }
  object IVideoState {
    
    @scala.inline
    def apply(playerName: PlayerNameType): IVideoState = {
      val __obj = js.Dynamic.literal(playerName = playerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[IVideoState]
    }
    
    @scala.inline
    implicit class IVideoStateMutableBuilder[Self <: IVideoState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlayerName(value: PlayerNameType): Self = StObject.set(x, "playerName", value.asInstanceOf[js.Any])
    }
  }
}
