package typings.tizenTvWebapis.tvinfoMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TvInfoKey extends js.Object
@JSImport("tizen-tv-webapis/tvinfo", "TvInfoKey")
@js.native
object TvInfoKey extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TvInfoKey with Double] = js.native
  
  /**
    * Whether the application can be executed in the background
    */
  @js.native
  sealed trait TV_VIEWER_BG_EXECUTABLE extends TvInfoKey
  /* 0 */ @js.native
  object TV_VIEWER_BG_EXECUTABLE extends TopLevel[TV_VIEWER_BG_EXECUTABLE with Double]
}
