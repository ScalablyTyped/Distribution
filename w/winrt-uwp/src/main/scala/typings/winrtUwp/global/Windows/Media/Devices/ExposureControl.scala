package typings.winrtUwp.global.Windows.Media.Devices

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for controlling the exposure settings on a capture device. */
@JSGlobal("Windows.Media.Devices.ExposureControl")
@js.native
abstract class ExposureControl ()
  extends typings.winrtUwp.Windows.Media.Devices.ExposureControl {
  /** Gets a value that indicates if auto exposure is enabled. */
  /* CompleteClass */
  override var auto: Boolean = js.native
  /** Gets the maximum exposure time. */
  /* CompleteClass */
  override var max: Double = js.native
  /** Gets the minimum exposure time. */
  /* CompleteClass */
  override var min: Double = js.native
  /** Gets the smallest exposure time increment supported by the capture device. */
  /* CompleteClass */
  override var step: Double = js.native
  /** Gets a value that specifies if the capture device supports the exposure control. */
  /* CompleteClass */
  override var supported: Boolean = js.native
  /** Gets the exposure time. */
  /* CompleteClass */
  override var value: Double = js.native
  /**
    * Asynchronously enables or disable auto exposure.
    * @param value Specifies whether or not to enable or disable auto exposure.
    * @return The object that is used to control the asynchronous operation.
    */
  /* CompleteClass */
  override def setAutoAsync(value: Boolean): IPromiseWithIAsyncAction = js.native
  /**
    * Asynchronously sets the exposure time.
    * @param shutterDuration The exposure time to set the Value property to. The minimum and maximum values are specified by Min and Max .
    * @return The object that is used to control the asynchronous operation.
    */
  /* CompleteClass */
  override def setValueAsync(shutterDuration: Double): IPromiseWithIAsyncAction = js.native
}

