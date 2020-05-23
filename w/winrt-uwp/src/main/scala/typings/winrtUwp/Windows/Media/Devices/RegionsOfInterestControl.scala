package typings.winrtUwp.Windows.Media.Devices

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality to mange the regions of interest on a device. */
@js.native
trait RegionsOfInterestControl extends js.Object {
  /** Gets a value that specifies if auto exposure is supported on the capture device. */
  var autoExposureSupported: Boolean = js.native
  /** Gets a value that specifies if auto focus is supported on the capture device. */
  var autoFocusSupported: Boolean = js.native
  /** Gets a value that specifies if auto white balance is supported on the capture device. */
  var autoWhiteBalanceSupported: Boolean = js.native
  /** Gets the maximum number of regions of interest that can be specified. */
  var maxRegions: Double = js.native
  /**
    * Asynchronously clears the regions of interests.
    * @return The object that is used to control the asynchronous operation.
    */
  def clearRegionsAsync(): IPromiseWithIAsyncAction = js.native
  /**
    * Asynchronously sets the regions of interest.
    * @param regions The regions of interest.
    * @return The object that is used to control the asynchronous operation.
    */
  def setRegionsAsync(regions: IIterable[RegionOfInterest]): IPromiseWithIAsyncAction = js.native
  /**
    * Asynchronously sets the regions of interest and specifies if the values should be locked.
    * @param regions The regions of interests.
    * @param lockValues Specifies if the values should be locked.
    * @return The object that is used to control the asynchronous operation.
    */
  def setRegionsAsync(regions: IIterable[RegionOfInterest], lockValues: Boolean): IPromiseWithIAsyncAction = js.native
}

