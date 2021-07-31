package typings.wixUiCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsImageConstsMod {
  
  @JSImport("wix-ui-core/src/components/image/consts", "FALLBACK_IMAGE")
  @js.native
  val FALLBACK_IMAGE: String = js.native
  
  @js.native
  sealed trait ImageStatus extends StObject
  @JSImport("wix-ui-core/src/components/image/consts", "ImageStatus")
  @js.native
  object ImageStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ImageStatus & String] = js.native
    
    @js.native
    sealed trait error
      extends StObject
         with ImageStatus
    /* "error" */ val error: typings.wixUiCore.componentsImageConstsMod.ImageStatus.error & String = js.native
    
    @js.native
    sealed trait loaded
      extends StObject
         with ImageStatus
    /* "loaded" */ val loaded: typings.wixUiCore.componentsImageConstsMod.ImageStatus.loaded & String = js.native
    
    @js.native
    sealed trait loading
      extends StObject
         with ImageStatus
    /* "loading" */ val loading: typings.wixUiCore.componentsImageConstsMod.ImageStatus.loading & String = js.native
  }
}
