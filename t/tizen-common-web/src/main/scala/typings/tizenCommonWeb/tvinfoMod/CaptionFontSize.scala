package typings.tizenCommonWeb.tvinfoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CaptionFontSize extends StObject
@JSImport("tizen-common-web/tvinfo", "CaptionFontSize")
@js.native
object CaptionFontSize extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CaptionFontSize with String] = js.native
  
  @js.native
  sealed trait CAPTION_SIZE_DEFAULT extends CaptionFontSize
  /* "CAPTION_SIZE_DEFAULT" */ val CAPTION_SIZE_DEFAULT: typings.tizenCommonWeb.tvinfoMod.CaptionFontSize.CAPTION_SIZE_DEFAULT with String = js.native
  
  @js.native
  sealed trait CAPTION_SIZE_EXTRA_LARGE extends CaptionFontSize
  /* "CAPTION_SIZE_EXTRA_LARGE" */ val CAPTION_SIZE_EXTRA_LARGE: typings.tizenCommonWeb.tvinfoMod.CaptionFontSize.CAPTION_SIZE_EXTRA_LARGE with String = js.native
  
  @js.native
  sealed trait CAPTION_SIZE_LARGE extends CaptionFontSize
  /* "CAPTION_SIZE_LARGE" */ val CAPTION_SIZE_LARGE: typings.tizenCommonWeb.tvinfoMod.CaptionFontSize.CAPTION_SIZE_LARGE with String = js.native
  
  @js.native
  sealed trait CAPTION_SIZE_SMALL extends CaptionFontSize
  /* "CAPTION_SIZE_SMALL" */ val CAPTION_SIZE_SMALL: typings.tizenCommonWeb.tvinfoMod.CaptionFontSize.CAPTION_SIZE_SMALL with String = js.native
  
  @js.native
  sealed trait CAPTION_SIZE_STANDARD extends CaptionFontSize
  /* "CAPTION_SIZE_STANDARD" */ val CAPTION_SIZE_STANDARD: typings.tizenCommonWeb.tvinfoMod.CaptionFontSize.CAPTION_SIZE_STANDARD with String = js.native
}
