package typings.tizenCommonWeb.tvinfoMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CaptionColor extends js.Object
@JSImport("tizen-common-web/tvinfo", "CaptionColor")
@js.native
object CaptionColor extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CaptionColor with String] = js.native
  
  @js.native
  sealed trait CAPTION_COLOR_BLACK extends CaptionColor
  /* "CAPTION_COLOR_BLACK" */ @js.native
  object CAPTION_COLOR_BLACK extends TopLevel[CAPTION_COLOR_BLACK with String]
  
  @js.native
  sealed trait CAPTION_COLOR_BLUE extends CaptionColor
  /* "CAPTION_COLOR_BLUE" */ @js.native
  object CAPTION_COLOR_BLUE extends TopLevel[CAPTION_COLOR_BLUE with String]
  
  @js.native
  sealed trait CAPTION_COLOR_CYAN extends CaptionColor
  /* "CAPTION_COLOR_CYAN" */ @js.native
  object CAPTION_COLOR_CYAN extends TopLevel[CAPTION_COLOR_CYAN with String]
  
  @js.native
  sealed trait CAPTION_COLOR_DEFAULT extends CaptionColor
  /* "CAPTION_COLOR_DEFAULT" */ @js.native
  object CAPTION_COLOR_DEFAULT extends TopLevel[CAPTION_COLOR_DEFAULT with String]
  
  @js.native
  sealed trait CAPTION_COLOR_GREEN extends CaptionColor
  /* "CAPTION_COLOR_GREEN" */ @js.native
  object CAPTION_COLOR_GREEN extends TopLevel[CAPTION_COLOR_GREEN with String]
  
  @js.native
  sealed trait CAPTION_COLOR_MAGENTA extends CaptionColor
  /* "CAPTION_COLOR_MAGENTA" */ @js.native
  object CAPTION_COLOR_MAGENTA extends TopLevel[CAPTION_COLOR_MAGENTA with String]
  
  @js.native
  sealed trait CAPTION_COLOR_RED extends CaptionColor
  /* "CAPTION_COLOR_RED" */ @js.native
  object CAPTION_COLOR_RED extends TopLevel[CAPTION_COLOR_RED with String]
  
  @js.native
  sealed trait CAPTION_COLOR_WHITE extends CaptionColor
  /* "CAPTION_COLOR_WHITE" */ @js.native
  object CAPTION_COLOR_WHITE extends TopLevel[CAPTION_COLOR_WHITE with String]
  
  @js.native
  sealed trait CAPTION_COLOR_YELLOW extends CaptionColor
  /* "CAPTION_COLOR_YELLOW" */ @js.native
  object CAPTION_COLOR_YELLOW extends TopLevel[CAPTION_COLOR_YELLOW with String]
}
