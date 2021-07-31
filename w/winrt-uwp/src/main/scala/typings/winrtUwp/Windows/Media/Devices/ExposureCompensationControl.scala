package typings.winrtUwp.Windows.Media.Devices

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality for modifying exposure levels of captured photos. */
trait ExposureCompensationControl extends StObject {
  
  /** Gets the maximum exposure time. */
  var max: Double
  
  /** Gets the minimum exposure time. */
  var min: Double
  
  /**
    * Asynchronously sets the exposure compensation.
    * @param value The exposure compensation level to set the Value property to. The minimum and maximum values are specified by Min and Max .
    * @return The object that is used to control the asynchronous operation.
    */
  def setValueAsync(value: Double): IPromiseWithIAsyncAction
  
  /** Gets the smallest exposure compensation increment supported by the capture device. */
  var step: Double
  
  /** Gets a value that specifies if the capture device supports the exposure compensation control. */
  var supported: Boolean
  
  /** Gets the exposure compensation level. */
  var value: Double
}
object ExposureCompensationControl {
  
  @scala.inline
  def apply(
    max: Double,
    min: Double,
    setValueAsync: Double => IPromiseWithIAsyncAction,
    step: Double,
    supported: Boolean,
    value: Double
  ): ExposureCompensationControl = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], setValueAsync = js.Any.fromFunction1(setValueAsync), step = step.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExposureCompensationControl]
  }
  
  @scala.inline
  implicit class ExposureCompensationControlMutableBuilder[Self <: ExposureCompensationControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetValueAsync(value: Double => IPromiseWithIAsyncAction): Self = StObject.set(x, "setValueAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupported(value: Boolean): Self = StObject.set(x, "supported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
