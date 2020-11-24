package typings.tizenTvWebapis.tvinfoMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TvInfoValue extends js.Object
@JSImport("tizen-tv-webapis/tvinfo", "TvInfoValue")
@js.native
object TvInfoValue extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TvInfoValue with Double] = js.native
  
  /**
    * Background execution is supported
    */
  @js.native
  sealed trait TV_VIEWER_BG_EXECUTABLE extends TvInfoValue
  /* 1 */ @js.native
  object TV_VIEWER_BG_EXECUTABLE extends TopLevel[TV_VIEWER_BG_EXECUTABLE with Double]
  
  /**
    * Background execution is not supported
    */
  @js.native
  sealed trait TV_VIEWER_BG_NOT_EXECUTABLE extends TvInfoValue
  /* 0 */ @js.native
  object TV_VIEWER_BG_NOT_EXECUTABLE extends TopLevel[TV_VIEWER_BG_NOT_EXECUTABLE with Double]
}
