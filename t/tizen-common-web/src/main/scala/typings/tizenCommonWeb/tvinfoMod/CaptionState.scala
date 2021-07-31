package typings.tizenCommonWeb.tvinfoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CaptionState extends StObject
@JSImport("tizen-common-web/tvinfo", "CaptionState")
@js.native
object CaptionState extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CaptionState & String] = js.native
  
  @js.native
  sealed trait CAPTION_OFF
    extends StObject
       with CaptionState
  /* "CAPTION_OFF" */ val CAPTION_OFF: typings.tizenCommonWeb.tvinfoMod.CaptionState.CAPTION_OFF & String = js.native
  
  @js.native
  sealed trait CAPTION_ON
    extends StObject
       with CaptionState
  /* "CAPTION_ON" */ val CAPTION_ON: typings.tizenCommonWeb.tvinfoMod.CaptionState.CAPTION_ON & String = js.native
}
