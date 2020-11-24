package typings.tizenCommonWeb.tvinfoMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CaptionFontSize extends js.Object
@JSImport("tizen-common-web/tvinfo", "CaptionFontSize")
@js.native
object CaptionFontSize extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CaptionFontSize with String] = js.native
  
  @js.native
  sealed trait CAPTION_SIZE_DEFAULT extends CaptionFontSize
  /* "CAPTION_SIZE_DEFAULT" */ @js.native
  object CAPTION_SIZE_DEFAULT extends TopLevel[CAPTION_SIZE_DEFAULT with String]
  
  @js.native
  sealed trait CAPTION_SIZE_EXTRA_LARGE extends CaptionFontSize
  /* "CAPTION_SIZE_EXTRA_LARGE" */ @js.native
  object CAPTION_SIZE_EXTRA_LARGE extends TopLevel[CAPTION_SIZE_EXTRA_LARGE with String]
  
  @js.native
  sealed trait CAPTION_SIZE_LARGE extends CaptionFontSize
  /* "CAPTION_SIZE_LARGE" */ @js.native
  object CAPTION_SIZE_LARGE extends TopLevel[CAPTION_SIZE_LARGE with String]
  
  @js.native
  sealed trait CAPTION_SIZE_SMALL extends CaptionFontSize
  /* "CAPTION_SIZE_SMALL" */ @js.native
  object CAPTION_SIZE_SMALL extends TopLevel[CAPTION_SIZE_SMALL with String]
  
  @js.native
  sealed trait CAPTION_SIZE_STANDARD extends CaptionFontSize
  /* "CAPTION_SIZE_STANDARD" */ @js.native
  object CAPTION_SIZE_STANDARD extends TopLevel[CAPTION_SIZE_STANDARD with String]
}
