package typings.wixUiCore

import typings.wixUiCore.anon.Config
import typings.wixUiCore.videoVideoMod.IVideoProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiCoreVideoMod {
  
  @JSImport("wix-ui-core/video", "Video")
  @js.native
  class Video protected ()
    extends typings.wixUiCore.videoMod.Video {
    def this(props: IVideoProps) = this()
  }
  /* static members */
  object Video {
    
    @JSImport("wix-ui-core/video", "Video")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/video", "Video.defaultProps")
    @js.native
    def defaultProps: Config = js.native
    inline def defaultProps_=(x: Config): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/video", "Video.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
}
