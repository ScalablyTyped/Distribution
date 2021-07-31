package typings.tizenTvWebapis.tvinfoMod

import typings.tizenTvWebapis.anon.ACCESSIBILITYFOCUSZOOM
import typings.tizenTvWebapis.anon.AUDIOLANGUAGECODEAFR
import typings.tizenTvWebapis.anon.TVVIEWERBGEXECUTABLE
import typings.tizenTvWebapis.anon.TVVIEWERBGNOTEXECUTABLE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TvInfoManager extends StObject {
  
  /**
    * Defines constants for TV information keys.
    */
  var TvInfoKey: TVVIEWERBGEXECUTABLE
  
  /**
    * Caption settings key
    */
  var TvInfoMenuKey: ACCESSIBILITYFOCUSZOOM
  
  /**
    * Defines constants for TV menu settings values.
    */
  var TvInfoMenuValue: AUDIOLANGUAGECODEAFR
  
  /**
    * Defines constants for TV information values.
    */
  var TvInfoValue: TVVIEWERBGNOTEXECUTABLE
  
  /**
    * Registers a caption menu change listener callback.
    * @param listener TvInfoCaptionChangeCallback listener
    * @param key Caption menu key
    * @returns Listener ID
    * @throw WebAPIException TypeMismatchError, InvalidValuesError
    * @since 2.3
    * @note Since plugin version 3.0, if a parameter value is out of range, InvalidValuesError is thrown instead of TypeMismatchError.
    */
  def addCaptionChangeListener(key: TvInfoMenuKey, listener: TvInfoCaptionChangeCallback): Double
  
  /**
    * Retrieves the specified caption or subtitle menu key value.
    * @param key Caption or subtitle menu key
    * @returns Key value
    * @throw WebAPIException TypeMismatchError, InvalidValuesError
    * @since 2.3
    * @note Since plugin version 3.0, if a parameter value is out of range, InvalidValuesError is thrown instead of TypeMismatchError.
    */
  def getMenuValue(key: TvInfoMenuKey): TvInfoMenuValue
  
  /**
    * Retrieves the specified TV information key value.
    * @param key TV information key
    * @returns Key value
    * @throw WebAPIException TypeMismatchError, InvalidValuesError
    * @since 2.3
    * @note Since plugin version 3.0, if a parameter value is out of range, InvalidValuesError is thrown instead of TypeMismatchError.
    */
  def getTvInfoValue(key: TvInfoKey): TvInfoValue
  
  /**
    * Retrieves the plugin version number.
    * @returns Plugin version
    * @since 2.3
    */
  def getVersion(): String
  
  /**
    * Checks whether the picture size has been resized.
    * @param listenerId TvInfoCaptionChangeCallback ID
    * @returns Boolean value:
    *         true: Yes
    *         false: No
    * @throw WebAPIException NotSupportedError
    * @since 2.3
    * @note Since plugin version 3.0, if a parameter value is out of range, InvalidValuesError is thrown instead of TypeMismatchError.
    */
  def isTvsPicSizeResized(): Boolean
  
  /**
    * Enables controlling caption display dynamically from within the application.
    * The application gains full permission to show and hide the captions.
    * When the application launches or resumes, call registerInAppCaptionControl(true).
    * When the application is sent to the background or deactivated states, you must call registerInAppCaptionControl(false).
    * @param status Enable or disable dynamic caption display control.
    * @throw WebAPIException TypeMismatchError
    * @since 2.3
    */
  def registerInAppCaptionControl(status: Boolean): Unit
  
  /**
    * Unregisters a caption menu change listener callback.
    * @param listenerId TvInfoCaptionChangeCallback ID
    * @throw WebAPIException TypeMismatchError, InvalidValuesError
    * @since 2.3
    * @note Since plugin version 3.0, if a parameter value is out of range, InvalidValuesError is thrown instead of TypeMismatchError.
    */
  def removeCaptionChangeListener(listenerId: Double): Unit
  
  /**
    * If captions are switched on in the TV menu, controls the caption visibility state.
    * If captions are switched off in the TV menu, captions are not shown even if the application calls showCaption(true).
    * @param show Boolean value
    * @throw WebAPIException TypeMismatchError
    * @since 2.3
    */
  def showCaption(show: Boolean): Unit
}
object TvInfoManager {
  
  @scala.inline
  def apply(
    TvInfoKey: TVVIEWERBGEXECUTABLE,
    TvInfoMenuKey: ACCESSIBILITYFOCUSZOOM,
    TvInfoMenuValue: AUDIOLANGUAGECODEAFR,
    TvInfoValue: TVVIEWERBGNOTEXECUTABLE,
    addCaptionChangeListener: (TvInfoMenuKey, TvInfoCaptionChangeCallback) => Double,
    getMenuValue: TvInfoMenuKey => TvInfoMenuValue,
    getTvInfoValue: TvInfoKey => TvInfoValue,
    getVersion: () => String,
    isTvsPicSizeResized: () => Boolean,
    registerInAppCaptionControl: Boolean => Unit,
    removeCaptionChangeListener: Double => Unit,
    showCaption: Boolean => Unit
  ): TvInfoManager = {
    val __obj = js.Dynamic.literal(TvInfoKey = TvInfoKey.asInstanceOf[js.Any], TvInfoMenuKey = TvInfoMenuKey.asInstanceOf[js.Any], TvInfoMenuValue = TvInfoMenuValue.asInstanceOf[js.Any], TvInfoValue = TvInfoValue.asInstanceOf[js.Any], addCaptionChangeListener = js.Any.fromFunction2(addCaptionChangeListener), getMenuValue = js.Any.fromFunction1(getMenuValue), getTvInfoValue = js.Any.fromFunction1(getTvInfoValue), getVersion = js.Any.fromFunction0(getVersion), isTvsPicSizeResized = js.Any.fromFunction0(isTvsPicSizeResized), registerInAppCaptionControl = js.Any.fromFunction1(registerInAppCaptionControl), removeCaptionChangeListener = js.Any.fromFunction1(removeCaptionChangeListener), showCaption = js.Any.fromFunction1(showCaption))
    __obj.asInstanceOf[TvInfoManager]
  }
  
  @scala.inline
  implicit class TvInfoManagerMutableBuilder[Self <: TvInfoManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddCaptionChangeListener(value: (TvInfoMenuKey, TvInfoCaptionChangeCallback) => Double): Self = StObject.set(x, "addCaptionChangeListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetMenuValue(value: TvInfoMenuKey => TvInfoMenuValue): Self = StObject.set(x, "getMenuValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTvInfoValue(value: TvInfoKey => TvInfoValue): Self = StObject.set(x, "getTvInfoValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetVersion(value: () => String): Self = StObject.set(x, "getVersion", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsTvsPicSizeResized(value: () => Boolean): Self = StObject.set(x, "isTvsPicSizeResized", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRegisterInAppCaptionControl(value: Boolean => Unit): Self = StObject.set(x, "registerInAppCaptionControl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveCaptionChangeListener(value: Double => Unit): Self = StObject.set(x, "removeCaptionChangeListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowCaption(value: Boolean => Unit): Self = StObject.set(x, "showCaption", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTvInfoKey(value: TVVIEWERBGEXECUTABLE): Self = StObject.set(x, "TvInfoKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTvInfoMenuKey(value: ACCESSIBILITYFOCUSZOOM): Self = StObject.set(x, "TvInfoMenuKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTvInfoMenuValue(value: AUDIOLANGUAGECODEAFR): Self = StObject.set(x, "TvInfoMenuValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTvInfoValue(value: TVVIEWERBGNOTEXECUTABLE): Self = StObject.set(x, "TvInfoValue", value.asInstanceOf[js.Any])
  }
}
