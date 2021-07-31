package typings.wixUiCore

import typings.wixUiCore.imageImageMod.ImageProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiCoreImageMod {
  
  @JSImport("wix-ui-core/image", "FALLBACK_IMAGE")
  @js.native
  val FALLBACK_IMAGE: String = js.native
  
  @JSImport("wix-ui-core/image", "Image")
  @js.native
  class Image protected ()
    extends typings.wixUiCore.imageMod.Image {
    def this(props: ImageProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ImageProps, context: js.Any) = this()
  }
  
  @JSImport("wix-ui-core/image", "ImageStatus")
  @js.native
  object ImageStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.wixUiCore.constsMod.ImageStatus & String] = js.native
    
    /* "error" */ val error: typings.wixUiCore.constsMod.ImageStatus.error & String = js.native
    
    /* "loaded" */ val loaded: typings.wixUiCore.constsMod.ImageStatus.loaded & String = js.native
    
    /* "loading" */ val loading: typings.wixUiCore.constsMod.ImageStatus.loading & String = js.native
  }
}
