package typings.wixUiCore

import typings.wixUiCore.anon.Scale
import typings.wixUiCore.mediaImageMediaImageMod.MediaProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaImageMod {
  
  @JSImport("wix-ui-core/dist/src/components/media-image", "MediaImage")
  @js.native
  class MediaImage protected ()
    extends typings.wixUiCore.mediaImageMediaImageMod.MediaImage {
    def this(props: MediaProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MediaProps, context: js.Any) = this()
  }
  /* static members */
  object MediaImage {
    
    @JSImport("wix-ui-core/dist/src/components/media-image", "MediaImage")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/src/components/media-image", "MediaImage.defaultProps")
    @js.native
    def defaultProps: Scale = js.native
    inline def defaultProps_=(x: Scale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/src/components/media-image", "MediaImage.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("wix-ui-core/dist/src/components/media-image", "MediaImageScaling")
  @js.native
  object MediaImageScaling extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.wixUiCore.mediaImageMediaImageMod.MediaImageScaling & String] = js.native
    
    /* "fill" */ val FILL: typings.wixUiCore.mediaImageMediaImageMod.MediaImageScaling.FILL & String = js.native
    
    /* "fit" */ val FIT: typings.wixUiCore.mediaImageMediaImageMod.MediaImageScaling.FIT & String = js.native
  }
}
