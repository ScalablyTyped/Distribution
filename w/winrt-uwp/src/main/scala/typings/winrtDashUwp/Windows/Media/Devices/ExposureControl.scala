package typings.winrtDashUwp.Windows.Media.Devices

import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for controlling the exposure settings on a capture device. */
@JSGlobal("Windows.Media.Devices.ExposureControl")
@js.native
abstract class ExposureControl () extends js.Object {
  /** Gets a value that indicates if auto exposure is enabled. */
  var auto: Boolean = js.native
  /** Gets the maximum exposure time. */
  var max: Double = js.native
  /** Gets the minimum exposure time. */
  var min: Double = js.native
  /** Gets the smallest exposure time increment supported by the capture device. */
  var step: Double = js.native
  /** Gets a value that specifies if the capture device supports the exposure control. */
  var supported: Boolean = js.native
  /** Gets the exposure time. */
  var value: Double = js.native
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
}

