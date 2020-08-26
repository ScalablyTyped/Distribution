package typings.tizenCommonWeb.tvinfoMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CaptionOpacity extends js.Object

@JSImport("tizen-common-web/tvinfo", "CaptionOpacity")
@js.native
object CaptionOpacity extends js.Object {
  @js.native
  sealed trait CAPTION_OPACITY_DEFAULT extends CaptionOpacity
  
  @js.native
  sealed trait CAPTION_OPACITY_FLASHING extends CaptionOpacity
  
  @js.native
  sealed trait CAPTION_OPACITY_SOLID extends CaptionOpacity
  
  @js.native
  sealed trait CAPTION_OPACITY_TRANSLUCENT extends CaptionOpacity
  
  @js.native
  sealed trait CAPTION_OPACITY_TRANSPARENT extends CaptionOpacity
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CaptionOpacity with String] = js.native
  /* "CAPTION_OPACITY_DEFAULT" */ @js.native
  object CAPTION_OPACITY_DEFAULT extends TopLevel[CAPTION_OPACITY_DEFAULT with String]
  
  /* "CAPTION_OPACITY_FLASHING" */ @js.native
  object CAPTION_OPACITY_FLASHING extends TopLevel[CAPTION_OPACITY_FLASHING with String]
  
  /* "CAPTION_OPACITY_SOLID" */ @js.native
  object CAPTION_OPACITY_SOLID extends TopLevel[CAPTION_OPACITY_SOLID with String]
  
  /* "CAPTION_OPACITY_TRANSLUCENT" */ @js.native
  object CAPTION_OPACITY_TRANSLUCENT extends TopLevel[CAPTION_OPACITY_TRANSLUCENT with String]
  
  /* "CAPTION_OPACITY_TRANSPARENT" */ @js.native
  object CAPTION_OPACITY_TRANSPARENT extends TopLevel[CAPTION_OPACITY_TRANSPARENT with String]
  
}

