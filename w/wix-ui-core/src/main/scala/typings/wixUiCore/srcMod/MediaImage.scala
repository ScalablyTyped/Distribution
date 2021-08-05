package typings.wixUiCore.srcMod

import typings.wixUiCore.anon.Scale
import typings.wixUiCore.mediaImageMediaImageMod.MediaProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-ui-core/dist/src", "MediaImage")
@js.native
class MediaImage protected ()
  extends typings.wixUiCore.mediaImageMod.MediaImage {
  def this(props: MediaProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: MediaProps, context: js.Any) = this()
}
/* static members */
object MediaImage {
  
  @JSImport("wix-ui-core/dist/src", "MediaImage")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-ui-core/dist/src", "MediaImage.defaultProps")
  @js.native
  def defaultProps: Scale = js.native
  inline def defaultProps_=(x: Scale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-ui-core/dist/src", "MediaImage.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
