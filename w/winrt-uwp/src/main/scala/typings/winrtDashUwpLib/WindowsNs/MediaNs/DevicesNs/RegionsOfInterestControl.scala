package typings
package winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality to mange the regions of interest on a device. */
@JSGlobal("Windows.Media.Devices.RegionsOfInterestControl")
@js.native
abstract class RegionsOfInterestControl () extends js.Object {
  /** Gets a value that specifies if auto exposure is supported on the capture device. */
  var autoExposureSupported: scala.Boolean = js.native
  /** Gets a value that specifies if auto focus is supported on the capture device. */
  var autoFocusSupported: scala.Boolean = js.native
  /** Gets a value that specifies if auto white balance is supported on the capture device. */
  var autoWhiteBalanceSupported: scala.Boolean = js.native
  /** Gets the maximum number of regions of interest that can be specified. */
  var maxRegions: scala.Double = js.native
  /**
                   * Asynchronously clears the regions of interests.
                   * @return The object that is used to control the asynchronous operation.
                   */
  def clearRegionsAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Asynchronously sets the regions of interest.
                   * @param regions The regions of interest.
                   * @return The object that is used to control the asynchronous operation.
                   */
  def setRegionsAsync(regions: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[RegionOfInterest]): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Asynchronously sets the regions of interest and specifies if the values should be locked.
                   * @param regions The regions of interests.
                   * @param lockValues Specifies if the values should be locked.
                   * @return The object that is used to control the asynchronous operation.
                   */
  def setRegionsAsync(
    regions: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[RegionOfInterest],
    lockValues: scala.Boolean
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
}

