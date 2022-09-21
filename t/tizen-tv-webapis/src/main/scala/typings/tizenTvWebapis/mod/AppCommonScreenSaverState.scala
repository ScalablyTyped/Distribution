package typings.tizenTvWebapis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AppCommonScreenSaverState extends StObject
@JSImport("tizen-tv-webapis", "AppCommonScreenSaverState")
@js.native
object AppCommonScreenSaverState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppCommonScreenSaverState & Double] = js.native
  
  /**
    * Screensaver off
    *
    * @since 2.3
    */
  @js.native
  sealed trait SCREEN_SAVER_OFF
    extends StObject
       with AppCommonScreenSaverState
  /* 0 */ val SCREEN_SAVER_OFF: typings.tizenTvWebapis.mod.AppCommonScreenSaverState.SCREEN_SAVER_OFF & Double = js.native
  
  /**
    * Screensaver on
    *
    * @since 2.3
    */
  @js.native
  sealed trait SCREEN_SAVER_ON
    extends StObject
       with AppCommonScreenSaverState
  /* 1 */ val SCREEN_SAVER_ON: typings.tizenTvWebapis.mod.AppCommonScreenSaverState.SCREEN_SAVER_ON & Double = js.native
}
