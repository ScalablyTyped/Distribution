package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TVInfoManager extends StObject {
  
  /**
    * Adds a listener to be called when given caption menu key value changes.
    *
    * @param key Caption menu key which changes will be observed by this listener
    * @param callback Callback method to be invoked when the value changes
    *
    * @returns long Subscription identifier
    *
    * @throw WebAPIException with error type TypeMismatchError, if the input parameter is not compatible with the expected type.
    * @throw WebAPIException with error type InvalidValuesError, if any of the input parameters contain an invalid value.
    * @throw WebAPIException with error type UnknownError in any other error case.
    */
  def addCaptionValueChangeListener(key: CaptionInfoKey, callback: CaptionValueChangeCallback): Double
  
  /**
    * Method returns the value for corresponding caption menu key.
    *
    * @returns CaptionValue value for given caption menu key
    *
    * @throw WebAPIException with error type TypeMismatchError, if the input parameter is not compatible with the expected type.
    * @throw WebAPIException with error type UnknownError in any other error case.
    */
  def getCaptionValue(key: CaptionInfoKey): CaptionValue
  
  /**
    * Removes a listener.
    *
    * Calling this function has no effect if there is no listener with given id.
    *
    * @param watchId Identifier of the subscription returned by addCaptionValueChangeListener()
    *
    * @throw WebAPIException with error type UnknownError, in any other error case.
    */
  def removeCaptionValueChangeListener(watchId: Double): Unit
}
object TVInfoManager {
  
  inline def apply(
    addCaptionValueChangeListener: (CaptionInfoKey, CaptionValueChangeCallback) => Double,
    getCaptionValue: CaptionInfoKey => CaptionValue,
    removeCaptionValueChangeListener: Double => Unit
  ): TVInfoManager = {
    val __obj = js.Dynamic.literal(addCaptionValueChangeListener = js.Any.fromFunction2(addCaptionValueChangeListener), getCaptionValue = js.Any.fromFunction1(getCaptionValue), removeCaptionValueChangeListener = js.Any.fromFunction1(removeCaptionValueChangeListener))
    __obj.asInstanceOf[TVInfoManager]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TVInfoManager] (val x: Self) extends AnyVal {
    
    inline def setAddCaptionValueChangeListener(value: (CaptionInfoKey, CaptionValueChangeCallback) => Double): Self = StObject.set(x, "addCaptionValueChangeListener", js.Any.fromFunction2(value))
    
    inline def setGetCaptionValue(value: CaptionInfoKey => CaptionValue): Self = StObject.set(x, "getCaptionValue", js.Any.fromFunction1(value))
    
    inline def setRemoveCaptionValueChangeListener(value: Double => Unit): Self = StObject.set(x, "removeCaptionValueChangeListener", js.Any.fromFunction1(value))
  }
}
