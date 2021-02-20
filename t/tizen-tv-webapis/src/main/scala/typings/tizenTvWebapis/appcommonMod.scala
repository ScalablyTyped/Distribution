package typings.tizenTvWebapis

import typings.tizenTvWebapis.anon.SCREENSAVEROFF
import typings.tizenTvWebapis.webapisMod.ErrorCallback
import typings.tizenTvWebapis.webapisMod.SuccessCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appcommonMod {
  
  @js.native
  sealed trait AppCommonScreenSaverState extends StObject
  @JSImport("tizen-tv-webapis/appcommon", "AppCommonScreenSaverState")
  @js.native
  object AppCommonScreenSaverState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[AppCommonScreenSaverState with Double] = js.native
    
    /**
      * Screensaver off
      * @since 2.3
      */
    @js.native
    sealed trait SCREEN_SAVER_OFF extends AppCommonScreenSaverState
    /* 0 */ val SCREEN_SAVER_OFF: typings.tizenTvWebapis.appcommonMod.AppCommonScreenSaverState.SCREEN_SAVER_OFF with Double = js.native
    
    /**
      * Screensaver on
      * @since 2.3
      */
    @js.native
    sealed trait SCREEN_SAVER_ON extends AppCommonScreenSaverState
    /* 1 */ val SCREEN_SAVER_ON: typings.tizenTvWebapis.appcommonMod.AppCommonScreenSaverState.SCREEN_SAVER_ON with Double = js.native
  }
  
  @js.native
  trait AppCommonManager extends StObject {
    
    var AppCommonScreenSaverState: SCREENSAVEROFF = js.native
    
    /**
      * Retrieves the plugin version number.
      * @returns string Plugin version
      * @since 2.3
      */
    def getVersion(): String = js.native
    
    /**
      * Sets the screensaver.
      * @param state Screensaver state
      * @param onsuccess Callback method to invoke when the screensaver is set successfully
      * @param onerror Callback method to invoke if an error occurs
      * @throw WebAPIException `TypeMismatchError`, `InvalidValuesError`
      * @since 2.3
      * @note Since plugin version 3.0, if a parameter value is out of range, InvalidValuesError is thrown instead of TypeMismatchError.
      */
    def setScreenSaver(state: AppCommonScreenSaverState): Unit = js.native
    def setScreenSaver(state: AppCommonScreenSaverState, onsuccess: js.UndefOr[scala.Nothing], onerror: ErrorCallback): Unit = js.native
    def setScreenSaver(state: AppCommonScreenSaverState, onsuccess: SuccessCallback): Unit = js.native
    def setScreenSaver(state: AppCommonScreenSaverState, onsuccess: SuccessCallback, onerror: ErrorCallback): Unit = js.native
  }
}
