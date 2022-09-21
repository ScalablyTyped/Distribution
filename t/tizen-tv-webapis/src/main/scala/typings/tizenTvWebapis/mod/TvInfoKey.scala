package typings.tizenTvWebapis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TvInfoKey extends StObject
@JSImport("tizen-tv-webapis", "TvInfoKey")
@js.native
object TvInfoKey extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TvInfoKey & Double] = js.native
  
  /**
    * Whether the application can be executed in the background
    *
    * @since 2.3
    */
  @js.native
  sealed trait TV_VIEWER_BG_EXECUTABLE
    extends StObject
       with TvInfoKey
  /* 0 */ val TV_VIEWER_BG_EXECUTABLE: typings.tizenTvWebapis.mod.TvInfoKey.TV_VIEWER_BG_EXECUTABLE & Double = js.native
}
