package typings.wixUiCore

import typings.wixUiCore.componentsImageImageMod.ImageProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsImageMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/image", "FALLBACK_IMAGE")
  @js.native
  val FALLBACK_IMAGE: String = js.native
  
  @JSImport("wix-ui-core/dist/standalone/src/components/image", "Image")
  @js.native
  class Image protected ()
    extends typings.wixUiCore.componentsImageImageMod.Image {
    def this(props: ImageProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ImageProps, context: js.Any) = this()
  }
  
  @JSImport("wix-ui-core/dist/standalone/src/components/image", "ImageStatus")
  @js.native
  object ImageStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.wixUiCore.imageConstsMod.ImageStatus & String] = js.native
    
    /* "error" */ val error: typings.wixUiCore.imageConstsMod.ImageStatus.error & String = js.native
    
    /* "loaded" */ val loaded: typings.wixUiCore.imageConstsMod.ImageStatus.loaded & String = js.native
    
    /* "loading" */ val loading: typings.wixUiCore.imageConstsMod.ImageStatus.loading & String = js.native
  }
}
