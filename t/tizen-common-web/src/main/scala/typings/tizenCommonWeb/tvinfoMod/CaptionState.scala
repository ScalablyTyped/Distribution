package typings.tizenCommonWeb.tvinfoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CaptionState extends StObject
@JSImport("tizen-common-web/tvinfo", "CaptionState")
@js.native
object CaptionState extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CaptionState with String] = js.native
  
  @js.native
  sealed trait CAPTION_OFF extends CaptionState
  /* "CAPTION_OFF" */ val CAPTION_OFF: typings.tizenCommonWeb.tvinfoMod.CaptionState.CAPTION_OFF with String = js.native
  
  @js.native
  sealed trait CAPTION_ON extends CaptionState
  /* "CAPTION_ON" */ val CAPTION_ON: typings.tizenCommonWeb.tvinfoMod.CaptionState.CAPTION_ON with String = js.native
}
