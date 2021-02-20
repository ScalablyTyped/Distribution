package typings.winrtUwp.Windows.Media.Devices

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality for controlling the exposure settings on a capture device. */
@js.native
trait ExposureControl extends StObject {
  
  /** Gets a value that indicates if auto exposure is enabled. */
  var auto: Boolean = js.native
  
  /** Gets the maximum exposure time. */
  var max: Double = js.native
  
  /** Gets the minimum exposure time. */
  var min: Double = js.native
  
  /**
    * Asynchronously enables or disable auto exposure.
    * @param value Specifies whether or not to enable or disable auto exposure.
    * @return The object that is used to control the asynchronous operation.
    */
  def setAutoAsync(value: Boolean): IPromiseWithIAsyncAction = js.native
  
  /**
    * Asynchronously sets the exposure time.
    * @param shutterDuration The exposure time to set the Value property to. The minimum and maximum values are specified by Min and Max .
    * @return The object that is used to control the asynchronous operation.
    */
  def setValueAsync(shutterDuration: Double): IPromiseWithIAsyncAction = js.native
  
  /** Gets the smallest exposure time increment supported by the capture device. */
  var step: Double = js.native
  
  /** Gets a value that specifies if the capture device supports the exposure control. */
  var supported: Boolean = js.native
  
  /** Gets the exposure time. */
  var value: Double = js.native
}
object ExposureControl {
  
  @scala.inline
  def apply(
    auto: Boolean,
    max: Double,
    min: Double,
    setAutoAsync: Boolean => IPromiseWithIAsyncAction,
    setValueAsync: Double => IPromiseWithIAsyncAction,
    step: Double,
    supported: Boolean,
    value: Double
  ): ExposureControl = {
    val __obj = js.Dynamic.literal(auto = auto.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], setAutoAsync = js.Any.fromFunction1(setAutoAsync), setValueAsync = js.Any.fromFunction1(setValueAsync), step = step.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExposureControl]
  }
  
  @scala.inline
  implicit class ExposureControlMutableBuilder[Self <: ExposureControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuto(value: Boolean): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetAutoAsync(value: Boolean => IPromiseWithIAsyncAction): Self = StObject.set(x, "setAutoAsync", js.Any.fromFunction1(value))
    
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
