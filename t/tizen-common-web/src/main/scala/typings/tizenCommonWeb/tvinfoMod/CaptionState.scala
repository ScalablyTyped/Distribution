package typings.tizenCommonWeb.tvinfoMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CaptionState extends js.Object

@JSImport("tizen-common-web/tvinfo", "CaptionState")
@js.native
object CaptionState extends js.Object {
  @js.native
  sealed trait CAPTION_OFF extends CaptionState
  
  @js.native
  sealed trait CAPTION_ON extends CaptionState
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CaptionState with String] = js.native
  /* "CAPTION_OFF" */ @js.native
  object CAPTION_OFF extends TopLevel[CAPTION_OFF with String]
  
  /* "CAPTION_ON" */ @js.native
  object CAPTION_ON extends TopLevel[CAPTION_ON with String]
  
}

