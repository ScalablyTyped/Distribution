package typings.tizenCommonWeb.tvinfoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CaptionColor extends StObject
@JSImport("tizen-common-web/tvinfo", "CaptionColor")
@js.native
object CaptionColor extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CaptionColor & String] = js.native
  
  @js.native
  sealed trait CAPTION_COLOR_BLACK
    extends StObject
       with CaptionColor
  /* "CAPTION_COLOR_BLACK" */ val CAPTION_COLOR_BLACK: typings.tizenCommonWeb.tvinfoMod.CaptionColor.CAPTION_COLOR_BLACK & String = js.native
  
  @js.native
  sealed trait CAPTION_COLOR_BLUE
    extends StObject
       with CaptionColor
  /* "CAPTION_COLOR_BLUE" */ val CAPTION_COLOR_BLUE: typings.tizenCommonWeb.tvinfoMod.CaptionColor.CAPTION_COLOR_BLUE & String = js.native
  
  @js.native
  sealed trait CAPTION_COLOR_CYAN
    extends StObject
       with CaptionColor
  /* "CAPTION_COLOR_CYAN" */ val CAPTION_COLOR_CYAN: typings.tizenCommonWeb.tvinfoMod.CaptionColor.CAPTION_COLOR_CYAN & String = js.native
  
  @js.native
  sealed trait CAPTION_COLOR_DEFAULT
    extends StObject
       with CaptionColor
  /* "CAPTION_COLOR_DEFAULT" */ val CAPTION_COLOR_DEFAULT: typings.tizenCommonWeb.tvinfoMod.CaptionColor.CAPTION_COLOR_DEFAULT & String = js.native
  
  @js.native
  sealed trait CAPTION_COLOR_GREEN
    extends StObject
       with CaptionColor
  /* "CAPTION_COLOR_GREEN" */ val CAPTION_COLOR_GREEN: typings.tizenCommonWeb.tvinfoMod.CaptionColor.CAPTION_COLOR_GREEN & String = js.native
  
  @js.native
  sealed trait CAPTION_COLOR_MAGENTA
    extends StObject
       with CaptionColor
  /* "CAPTION_COLOR_MAGENTA" */ val CAPTION_COLOR_MAGENTA: typings.tizenCommonWeb.tvinfoMod.CaptionColor.CAPTION_COLOR_MAGENTA & String = js.native
  
  @js.native
  sealed trait CAPTION_COLOR_RED
    extends StObject
       with CaptionColor
  /* "CAPTION_COLOR_RED" */ val CAPTION_COLOR_RED: typings.tizenCommonWeb.tvinfoMod.CaptionColor.CAPTION_COLOR_RED & String = js.native
  
  @js.native
  sealed trait CAPTION_COLOR_WHITE
    extends StObject
       with CaptionColor
  /* "CAPTION_COLOR_WHITE" */ val CAPTION_COLOR_WHITE: typings.tizenCommonWeb.tvinfoMod.CaptionColor.CAPTION_COLOR_WHITE & String = js.native
  
  @js.native
  sealed trait CAPTION_COLOR_YELLOW
    extends StObject
       with CaptionColor
  /* "CAPTION_COLOR_YELLOW" */ val CAPTION_COLOR_YELLOW: typings.tizenCommonWeb.tvinfoMod.CaptionColor.CAPTION_COLOR_YELLOW & String = js.native
}
