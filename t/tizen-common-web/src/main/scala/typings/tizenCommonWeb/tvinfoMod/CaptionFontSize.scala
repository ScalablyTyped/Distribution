package typings.tizenCommonWeb.tvinfoMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CaptionFontSize extends js.Object

@JSImport("tizen-common-web/tvinfo", "CaptionFontSize")
@js.native
object CaptionFontSize extends js.Object {
  @js.native
  sealed trait CAPTION_SIZE_DEFAULT extends CaptionFontSize
  
  @js.native
  sealed trait CAPTION_SIZE_EXTRA_LARGE extends CaptionFontSize
  
  @js.native
  sealed trait CAPTION_SIZE_LARGE extends CaptionFontSize
  
  @js.native
  sealed trait CAPTION_SIZE_SMALL extends CaptionFontSize
  
  @js.native
  sealed trait CAPTION_SIZE_STANDARD extends CaptionFontSize
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CaptionFontSize with String] = js.native
  /* "CAPTION_SIZE_DEFAULT" */ @js.native
  object CAPTION_SIZE_DEFAULT extends TopLevel[CAPTION_SIZE_DEFAULT with String]
  
  /* "CAPTION_SIZE_EXTRA_LARGE" */ @js.native
  object CAPTION_SIZE_EXTRA_LARGE extends TopLevel[CAPTION_SIZE_EXTRA_LARGE with String]
  
  /* "CAPTION_SIZE_LARGE" */ @js.native
  object CAPTION_SIZE_LARGE extends TopLevel[CAPTION_SIZE_LARGE with String]
  
  /* "CAPTION_SIZE_SMALL" */ @js.native
  object CAPTION_SIZE_SMALL extends TopLevel[CAPTION_SIZE_SMALL with String]
  
  /* "CAPTION_SIZE_STANDARD" */ @js.native
  object CAPTION_SIZE_STANDARD extends TopLevel[CAPTION_SIZE_STANDARD with String]
  
}

