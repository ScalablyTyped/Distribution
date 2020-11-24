package typings.winrtUwp.Windows.Media.Devices

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality for controlling the focus settings on a capture device. */
@js.native
trait FocusControl extends js.Object {
  
  /**
    * Configures the FocusControl object with values specified in the provided FocusSettings object.
    * @param settings The focus settings to use to configure the FocusControl object.
    */
  def configure(settings: FocusSettings): Unit = js.native
  
  /**
    * Asynchronously focuses the device.
    * @return The object that is used to control the asynchronous operation.
    */
  def focusAsync(): IPromiseWithIAsyncAction = js.native
  
  /** Gets a value that specifics if the capture device supports the FocusChanged event. */
  var focusChangedSupported: Boolean = js.native
  
  /** Gets a MediaCaptureFocusState value indicating the current focus state of the capture device. */
  var focusState: MediaCaptureFocusState = js.native
  
  /**
    * Locks the capture device's focus.
    * @return An asynchronous action.
    */
  def lockAsync(): IPromiseWithIAsyncAction = js.native
  
  /** Gets the maximum focus length. */
  var max: Double = js.native
  
  /** Gets the minimum focus length. */
  var min: Double = js.native
  
  /** Gets the capture device's current focus mode. */
  var mode: FocusMode = js.native
  
  /** Gets the focus preset. */
  var preset: FocusPreset = js.native
  
  /**
    * Asynchronously sets the focus Preset .
    * @param preset The focus preset to set the Preset property to.
    * @return The object that is used to control the asynchronous operation.
    */
  def setPresetAsync(preset: FocusPreset): IPromiseWithIAsyncAction = js.native
  /**
    * Asynchronously sets the focus Preset , specifying if the operation must complete before the device is focused.
    * @param preset The focus preset to set the Preset property to.
    * @param completeBeforeFocus Specifies if the asynchronous operation must complete before the device is focused.
    * @return The object that is used to control the asynchronous operation.
    */
  def setPresetAsync(preset: FocusPreset, completeBeforeFocus: Boolean): IPromiseWithIAsyncAction = js.native
  
  /**
    * Asynchronously sets the focus Value .
    * @param focus The value to set the focus to. The minimum and maximum values are specified by Min and Max .
    * @return The object that is used to control the asynchronous operation.
    */
  def setValueAsync(focus: Double): IPromiseWithIAsyncAction = js.native
  
  /** Gets the smallest focus increment supported by the capture device. */
  var step: Double = js.native
  
  /** Gets a value that specifies if the capture device supports the focus control. */
  var supported: Boolean = js.native
  
  /** Gets a list of values indicating the manual focus distances that are supported by the capture device. */
  var supportedFocusDistances: IVectorView[ManualFocusDistance] = js.native
  
  /** Gets a list of values indicating the focus modes that are supported by the capture device. */
  var supportedFocusModes: IVectorView[FocusMode] = js.native
  
  /** Gets a list of values indicating the auto focus ranges that are supported by the capture device. */
  var supportedFocusRanges: IVectorView[AutoFocusRange] = js.native
  
  /** Gets the focus presets that the capture device supports. */
  var supportedPresets: IVectorView[FocusPreset] = js.native
  
  /**
    * Unlocks the capture device's focus if it has previously been locked with a call to LockAsync .
    * @return An asynchronous action.
    */
  def unlockAsync(): IPromiseWithIAsyncAction = js.native
  
  /** Gets the current value that the focus is set to. */
  var value: Double = js.native
  
  /** Gets a value that indicates whether WaitForFocus is supported by the capture device. */
  var waitForFocusSupported: Boolean = js.native
}
