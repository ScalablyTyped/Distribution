package typings.tizenCommonWeb.tvinfoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CaptionOpacity extends StObject
@JSImport("tizen-common-web/tvinfo", "CaptionOpacity")
@js.native
object CaptionOpacity extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CaptionOpacity & String] = js.native
  
  @js.native
  sealed trait CAPTION_OPACITY_DEFAULT
    extends StObject
       with CaptionOpacity
  /* "CAPTION_OPACITY_DEFAULT" */ val CAPTION_OPACITY_DEFAULT: typings.tizenCommonWeb.tvinfoMod.CaptionOpacity.CAPTION_OPACITY_DEFAULT & String = js.native
  
  @js.native
  sealed trait CAPTION_OPACITY_FLASHING
    extends StObject
       with CaptionOpacity
  /* "CAPTION_OPACITY_FLASHING" */ val CAPTION_OPACITY_FLASHING: typings.tizenCommonWeb.tvinfoMod.CaptionOpacity.CAPTION_OPACITY_FLASHING & String = js.native
  
  @js.native
  sealed trait CAPTION_OPACITY_SOLID
    extends StObject
       with CaptionOpacity
  /* "CAPTION_OPACITY_SOLID" */ val CAPTION_OPACITY_SOLID: typings.tizenCommonWeb.tvinfoMod.CaptionOpacity.CAPTION_OPACITY_SOLID & String = js.native
  
  @js.native
  sealed trait CAPTION_OPACITY_TRANSLUCENT
    extends StObject
       with CaptionOpacity
  /* "CAPTION_OPACITY_TRANSLUCENT" */ val CAPTION_OPACITY_TRANSLUCENT: typings.tizenCommonWeb.tvinfoMod.CaptionOpacity.CAPTION_OPACITY_TRANSLUCENT & String = js.native
  
  @js.native
  sealed trait CAPTION_OPACITY_TRANSPARENT
    extends StObject
       with CaptionOpacity
  /* "CAPTION_OPACITY_TRANSPARENT" */ val CAPTION_OPACITY_TRANSPARENT: typings.tizenCommonWeb.tvinfoMod.CaptionOpacity.CAPTION_OPACITY_TRANSPARENT & String = js.native
}
