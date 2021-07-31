package typings.wixUiCore

import typings.wixUiCore.anon.ScaleMediaImageScaling
import typings.wixUiCore.componentsMediaImageMediaImageMod.MediaProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsMediaImageMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/media-image", "MediaImage")
  @js.native
  class MediaImage protected ()
    extends typings.wixUiCore.componentsMediaImageMediaImageMod.MediaImage {
    def this(props: MediaProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MediaProps, context: js.Any) = this()
  }
  /* static members */
  object MediaImage {
    
    @JSImport("wix-ui-core/dist/standalone/src/components/media-image", "MediaImage")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/standalone/src/components/media-image", "MediaImage.defaultProps")
    @js.native
    def defaultProps: ScaleMediaImageScaling = js.native
    @scala.inline
    def defaultProps_=(x: ScaleMediaImageScaling): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/standalone/src/components/media-image", "MediaImage.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("wix-ui-core/dist/standalone/src/components/media-image", "MediaImageScaling")
  @js.native
  object MediaImageScaling extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.wixUiCore.componentsMediaImageMediaImageMod.MediaImageScaling & String] = js.native
    
    /* "fill" */ val FILL: typings.wixUiCore.componentsMediaImageMediaImageMod.MediaImageScaling.FILL & String = js.native
    
    /* "fit" */ val FIT: typings.wixUiCore.componentsMediaImageMediaImageMod.MediaImageScaling.FIT & String = js.native
  }
}
