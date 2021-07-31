package typings.wixUiCore.srcMod

import typings.wixUiCore.anon.Config
import typings.wixUiCore.videoVideoMod.IVideoProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-ui-core/dist/src", "Video")
@js.native
class Video protected ()
  extends typings.wixUiCore.videoMod.Video {
  def this(props: IVideoProps) = this()
}
/* static members */
object Video {
  
  @JSImport("wix-ui-core/dist/src", "Video")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-ui-core/dist/src", "Video.defaultProps")
  @js.native
  def defaultProps: Config = js.native
  @scala.inline
  def defaultProps_=(x: Config): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-ui-core/dist/src", "Video.displayName")
  @js.native
  def displayName: String = js.native
  @scala.inline
  def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
