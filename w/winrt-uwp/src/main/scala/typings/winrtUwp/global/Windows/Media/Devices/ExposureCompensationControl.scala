package typings.winrtUwp.global.Windows.Media.Devices

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for modifying exposure levels of captured photos. */
@JSGlobal("Windows.Media.Devices.ExposureCompensationControl")
@js.native
abstract class ExposureCompensationControl ()
  extends typings.winrtUwp.Windows.Media.Devices.ExposureCompensationControl {
  /** Gets the maximum exposure time. */
  /* CompleteClass */
  override var max: Double = js.native
  /** Gets the minimum exposure time. */
  /* CompleteClass */
  override var min: Double = js.native
  /** Gets the smallest exposure compensation increment supported by the capture device. */
  /* CompleteClass */
  override var step: Double = js.native
  /** Gets a value that specifies if the capture device supports the exposure compensation control. */
  /* CompleteClass */
  override var supported: Boolean = js.native
  /** Gets the exposure compensation level. */
  /* CompleteClass */
  override var value: Double = js.native
  /**
    * Asynchronously sets the exposure compensation.
    * @param value The exposure compensation level to set the Value property to. The minimum and maximum values are specified by Min and Max .
    * @return The object that is used to control the asynchronous operation.
    */
  /* CompleteClass */
  override def setValueAsync(value: Double): IPromiseWithIAsyncAction = js.native
}

