package typings.tizenCommonWeb.tvinfoMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CaptionColor extends js.Object

@JSImport("tizen-common-web/tvinfo", "CaptionColor")
@js.native
object CaptionColor extends js.Object {
  @js.native
  sealed trait CAPTION_COLOR_BLACK extends CaptionColor
  
  @js.native
  sealed trait CAPTION_COLOR_BLUE extends CaptionColor
  
  @js.native
  sealed trait CAPTION_COLOR_CYAN extends CaptionColor
  
  @js.native
  sealed trait CAPTION_COLOR_DEFAULT extends CaptionColor
  
  @js.native
  sealed trait CAPTION_COLOR_GREEN extends CaptionColor
  
  @js.native
  sealed trait CAPTION_COLOR_MAGENTA extends CaptionColor
  
  @js.native
  sealed trait CAPTION_COLOR_RED extends CaptionColor
  
  @js.native
  sealed trait CAPTION_COLOR_WHITE extends CaptionColor
  
  @js.native
  sealed trait CAPTION_COLOR_YELLOW extends CaptionColor
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CaptionColor with String] = js.native
  /* "CAPTION_COLOR_BLACK" */ @js.native
  object CAPTION_COLOR_BLACK extends TopLevel[CAPTION_COLOR_BLACK with String]
  
  /* "CAPTION_COLOR_BLUE" */ @js.native
  object CAPTION_COLOR_BLUE extends TopLevel[CAPTION_COLOR_BLUE with String]
  
  /* "CAPTION_COLOR_CYAN" */ @js.native
  object CAPTION_COLOR_CYAN extends TopLevel[CAPTION_COLOR_CYAN with String]
  
  /* "CAPTION_COLOR_DEFAULT" */ @js.native
  object CAPTION_COLOR_DEFAULT extends TopLevel[CAPTION_COLOR_DEFAULT with String]
  
  /* "CAPTION_COLOR_GREEN" */ @js.native
  object CAPTION_COLOR_GREEN extends TopLevel[CAPTION_COLOR_GREEN with String]
  
  /* "CAPTION_COLOR_MAGENTA" */ @js.native
  object CAPTION_COLOR_MAGENTA extends TopLevel[CAPTION_COLOR_MAGENTA with String]
  
  /* "CAPTION_COLOR_RED" */ @js.native
  object CAPTION_COLOR_RED extends TopLevel[CAPTION_COLOR_RED with String]
  
  /* "CAPTION_COLOR_WHITE" */ @js.native
  object CAPTION_COLOR_WHITE extends TopLevel[CAPTION_COLOR_WHITE with String]
  
  /* "CAPTION_COLOR_YELLOW" */ @js.native
  object CAPTION_COLOR_YELLOW extends TopLevel[CAPTION_COLOR_YELLOW with String]
  
}

