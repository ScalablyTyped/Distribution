package typings.tizenCommonWeb.tvinfoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CaptionOpacity extends StObject
@JSImport("tizen-common-web/tvinfo", "CaptionOpacity")
@js.native
object CaptionOpacity extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CaptionOpacity with String] = js.native
  
  @js.native
  sealed trait CAPTION_OPACITY_DEFAULT extends CaptionOpacity
  /* "CAPTION_OPACITY_DEFAULT" */ val CAPTION_OPACITY_DEFAULT: typings.tizenCommonWeb.tvinfoMod.CaptionOpacity.CAPTION_OPACITY_DEFAULT with String = js.native
  
  @js.native
  sealed trait CAPTION_OPACITY_FLASHING extends CaptionOpacity
  /* "CAPTION_OPACITY_FLASHING" */ val CAPTION_OPACITY_FLASHING: typings.tizenCommonWeb.tvinfoMod.CaptionOpacity.CAPTION_OPACITY_FLASHING with String = js.native
  
  @js.native
  sealed trait CAPTION_OPACITY_SOLID extends CaptionOpacity
  /* "CAPTION_OPACITY_SOLID" */ val CAPTION_OPACITY_SOLID: typings.tizenCommonWeb.tvinfoMod.CaptionOpacity.CAPTION_OPACITY_SOLID with String = js.native
  
  @js.native
  sealed trait CAPTION_OPACITY_TRANSLUCENT extends CaptionOpacity
  /* "CAPTION_OPACITY_TRANSLUCENT" */ val CAPTION_OPACITY_TRANSLUCENT: typings.tizenCommonWeb.tvinfoMod.CaptionOpacity.CAPTION_OPACITY_TRANSLUCENT with String = js.native
  
  @js.native
  sealed trait CAPTION_OPACITY_TRANSPARENT extends CaptionOpacity
  /* "CAPTION_OPACITY_TRANSPARENT" */ val CAPTION_OPACITY_TRANSPARENT: typings.tizenCommonWeb.tvinfoMod.CaptionOpacity.CAPTION_OPACITY_TRANSPARENT with String = js.native
}
