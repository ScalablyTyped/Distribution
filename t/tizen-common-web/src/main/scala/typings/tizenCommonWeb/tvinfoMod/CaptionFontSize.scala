package typings.tizenCommonWeb.tvinfoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CaptionFontSize extends StObject
@JSImport("tizen-common-web/tvinfo", "CaptionFontSize")
@js.native
object CaptionFontSize extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CaptionFontSize & String] = js.native
  
  @js.native
  sealed trait CAPTION_SIZE_DEFAULT
    extends StObject
       with CaptionFontSize
  /* "CAPTION_SIZE_DEFAULT" */ val CAPTION_SIZE_DEFAULT: typings.tizenCommonWeb.tvinfoMod.CaptionFontSize.CAPTION_SIZE_DEFAULT & String = js.native
  
  @js.native
  sealed trait CAPTION_SIZE_EXTRA_LARGE
    extends StObject
       with CaptionFontSize
  /* "CAPTION_SIZE_EXTRA_LARGE" */ val CAPTION_SIZE_EXTRA_LARGE: typings.tizenCommonWeb.tvinfoMod.CaptionFontSize.CAPTION_SIZE_EXTRA_LARGE & String = js.native
  
  @js.native
  sealed trait CAPTION_SIZE_LARGE
    extends StObject
       with CaptionFontSize
  /* "CAPTION_SIZE_LARGE" */ val CAPTION_SIZE_LARGE: typings.tizenCommonWeb.tvinfoMod.CaptionFontSize.CAPTION_SIZE_LARGE & String = js.native
  
  @js.native
  sealed trait CAPTION_SIZE_SMALL
    extends StObject
       with CaptionFontSize
  /* "CAPTION_SIZE_SMALL" */ val CAPTION_SIZE_SMALL: typings.tizenCommonWeb.tvinfoMod.CaptionFontSize.CAPTION_SIZE_SMALL & String = js.native
  
  @js.native
  sealed trait CAPTION_SIZE_STANDARD
    extends StObject
       with CaptionFontSize
  /* "CAPTION_SIZE_STANDARD" */ val CAPTION_SIZE_STANDARD: typings.tizenCommonWeb.tvinfoMod.CaptionFontSize.CAPTION_SIZE_STANDARD & String = js.native
}
