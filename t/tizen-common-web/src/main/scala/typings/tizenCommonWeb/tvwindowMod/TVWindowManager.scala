package typings.tizenCommonWeb.tvwindowMod

import typings.tizenCommonWeb.systeminfoMod.SystemInfoVideoSourceInfo
import typings.tizenCommonWeb.tizenCommonWebStrings.BEHIND
import typings.tizenCommonWeb.tizenCommonWebStrings.FRONT
import typings.tizenCommonWeb.tizenCommonWebStrings.MAIN
import typings.tizenCommonWeb.tizenCommonWebStrings.Percentsign
import typings.tizenCommonWeb.tizenCommonWebStrings.px
import typings.tizenCommonWeb.tizenMod.ErrorCallback
import typings.tizenCommonWeb.tizenMod.SuccessCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TVWindowManager extends js.Object {
  
  /**
    * Adds a video resolution listener for getting notified about resolution changes.
    *
    * @param callback The method to invoke when the resolution has been changed.
    * @param type The window type. By default, this parameter is set to ***MAIN***.
    *
    * @returns long The identifier of the resolution change listener.
    *
    * @throw WebAPIException `TypeMismatchError`,`SecurityError`,`UnknownError`.
    *
    * @since 2.4
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/tv.window
    */
  def addVideoResolutionChangeListener(callback: VideoResolutionChangeCallback): Double = js.native
  def addVideoResolutionChangeListener(callback: VideoResolutionChangeCallback, `type`: WindowType): Double = js.native
  @JSName("addVideoResolutionChangeListener")
  def addVideoResolutionChangeListener_MAIN(callback: VideoResolutionChangeCallback, `type`: MAIN): Double = js.native
  
  /**
    * Gets the list of available windows.
    * @param successCallback The method to invoke when a list of the available windows is retrieved successfully.
    * @param errorCallback The method to invoke when an error occurs.
    * @throw WebAPIException `TypeMismatchError`,`SecurityError`.
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/tv.window
    */
  def getAvailableWindows(successCallback: AvailableWindowListCallback): Unit = js.native
  def getAvailableWindows(successCallback: AvailableWindowListCallback, errorCallback: ErrorCallback): Unit = js.native
  
  /**
    * Gets the area information of a TV window which is shown.
    *
    * According to the specified **unit**, information about the area will be passed to an array that contains 4 strings through `WindowRectangleSuccessCallback` as follows :
    * - If you set `"px"` as `unit`, ["0px", "0px", "1920px", "1080px"]
    * - If you set `"%"` as `unit`, ["0%", "0%", "100%", "100%"]
    * If you omit **unit**, the pixel(***"px"***) unit will be used as a default unit.
    *
    * @param successCallback The method to invoke when the position and size of the TV window has been obtained successfully.
    * @param errorCallback The method to invoke when an error occurs.
    * @param unit The measurement unit for specifying the display area - by default, this attribute is set to `"px"`.
    * @param type The window type - by default, this attribute is set to ***MAIN***.
    *
    * @throw WebAPIException `TypeMismatchError`, `SecurityError`, `UnknownError`.
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/tv.window
    */
  def getRect(successCallback: WindowRectangleSuccessCallback): Unit = js.native
  def getRect(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: js.UndefOr[scala.Nothing],
    unit: js.UndefOr[scala.Nothing],
    `type`: WindowType
  ): Unit = js.native
  def getRect(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: js.UndefOr[scala.Nothing],
    unit: Percentsign
  ): Unit = js.native
  def getRect(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: js.UndefOr[scala.Nothing],
    unit: Percentsign,
    `type`: WindowType
  ): Unit = js.native
  def getRect(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: js.UndefOr[scala.Nothing],
    unit: px,
    `type`: MAIN
  ): Unit = js.native
  def getRect(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: js.UndefOr[scala.Nothing],
    unit: MeasurementUnit
  ): Unit = js.native
  def getRect(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: js.UndefOr[scala.Nothing],
    unit: MeasurementUnit,
    `type`: WindowType
  ): Unit = js.native
  def getRect(successCallback: WindowRectangleSuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  def getRect(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: ErrorCallback,
    unit: js.UndefOr[scala.Nothing],
    `type`: WindowType
  ): Unit = js.native
  def getRect(successCallback: WindowRectangleSuccessCallback, errorCallback: ErrorCallback, unit: Percentsign): Unit = js.native
  def getRect(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: ErrorCallback,
    unit: Percentsign,
    `type`: WindowType
  ): Unit = js.native
  def getRect(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: ErrorCallback,
    unit: px,
    `type`: MAIN
  ): Unit = js.native
  def getRect(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: ErrorCallback,
    unit: MeasurementUnit
  ): Unit = js.native
  def getRect(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: ErrorCallback,
    unit: MeasurementUnit,
    `type`: WindowType
  ): Unit = js.native
  @JSName("getRect")
  def getRect_MAIN(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: js.UndefOr[scala.Nothing],
    unit: js.UndefOr[scala.Nothing],
    `type`: MAIN
  ): Unit = js.native
  @JSName("getRect")
  def getRect_MAIN(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: js.UndefOr[scala.Nothing],
    unit: Percentsign,
    `type`: MAIN
  ): Unit = js.native
  @JSName("getRect")
  def getRect_MAIN(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: js.UndefOr[scala.Nothing],
    unit: MeasurementUnit,
    `type`: MAIN
  ): Unit = js.native
  @JSName("getRect")
  def getRect_MAIN(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: ErrorCallback,
    unit: js.UndefOr[scala.Nothing],
    `type`: MAIN
  ): Unit = js.native
  @JSName("getRect")
  def getRect_MAIN(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: ErrorCallback,
    unit: Percentsign,
    `type`: MAIN
  ): Unit = js.native
  @JSName("getRect")
  def getRect_MAIN(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: ErrorCallback,
    unit: MeasurementUnit,
    `type`: MAIN
  ): Unit = js.native
  @JSName("getRect")
  def getRect_px(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: js.UndefOr[scala.Nothing],
    unit: px
  ): Unit = js.native
  @JSName("getRect")
  def getRect_px(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: js.UndefOr[scala.Nothing],
    unit: px,
    `type`: WindowType
  ): Unit = js.native
  @JSName("getRect")
  def getRect_px(successCallback: WindowRectangleSuccessCallback, errorCallback: ErrorCallback, unit: px): Unit = js.native
  @JSName("getRect")
  def getRect_px(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: ErrorCallback,
    unit: px,
    `type`: WindowType
  ): Unit = js.native
  
  /**
    * Gets information about the current source of a specified TV window.
    *
    * @param type The window type - by default, this attribute is set to ***MAIN***.
    *
    * @returns The information about the current video source. Returned object will have the `signal` property, stating whether there is signal provided or not on the source, this property value will be filled only when the window was shown using `show()` function.
    *
    * @throw WebAPIException `TypeMismatchError`, `SecurityError`, `UnknownError`.
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/tv.window
    */
  def getSource(): SystemInfoVideoSourceInfo = js.native
  def getSource(`type`: WindowType): SystemInfoVideoSourceInfo = js.native
  @JSName("getSource")
  def getSource_MAIN(`type`: MAIN): SystemInfoVideoSourceInfo = js.native
  
  /**
    * Gets video resolution information.
    *
    * @param type The window type - by default, this attribute is set to ***MAIN***.
    * @returns VideoResolution current video resolution information
    * @throw WebAPIException `TypeMismatchError`, `SecurityError`, `UnknownError`.
    *
    * @since 2.4
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/tv.window
    *
    */
  def getVideoResolution(): VideoResolution = js.native
  def getVideoResolution(`type`: WindowType): VideoResolution = js.native
  @JSName("getVideoResolution")
  def getVideoResolution_MAIN(`type`: MAIN): VideoResolution = js.native
  
  /**
    * Hides a TV window which is shown.
    *
    * @param successCallback The method to invoke when the window is hidden successfully.
    * @param errorCallback The method to invoke when an error occurs.
    * @param type The window type - by default, this attribute is set to ***MAIN***.
    *
    * @throw WebAPIException `TypeMismatchError`, `SecurityError`, `UnknownError`.
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/tv.window
    */
  def hide(successCallback: SuccessCallback): Unit = js.native
  def hide(successCallback: SuccessCallback, errorCallback: js.UndefOr[scala.Nothing], `type`: WindowType): Unit = js.native
  def hide(successCallback: SuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  def hide(successCallback: SuccessCallback, errorCallback: ErrorCallback, `type`: WindowType): Unit = js.native
  @JSName("hide")
  def hide_MAIN(successCallback: SuccessCallback, errorCallback: js.UndefOr[scala.Nothing], `type`: MAIN): Unit = js.native
  @JSName("hide")
  def hide_MAIN(successCallback: SuccessCallback, errorCallback: ErrorCallback, `type`: MAIN): Unit = js.native
  
  /**
    * Removes the listener to stop receiving notifications for the video resolution changes.
    *
    * Calling this function has no effect if there is no listener with given id.
    *
    * @param listenerId The identifier of the listener for resolution changes.
    *
    * @throw WebAPIException SecurityError, UnknownError.
    * @since 2.4
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/tv.window
    */
  def removeVideoResolutionChangeListener(listenerId: Double): Unit = js.native
  
  /**
    * Changes the source of a TV window.
    *
    * @param videoSource The video source to set
    * The possible video sources can be obtained through **tizen.systeminfo.getPropertyValue("VIDEOSOURCE")**.
    * @param successCallback The method to invoke when the intput source has been changed successfully.
    * The result SystemInfoVideoSourceInfo object will have the `signal` property filled only when the window was shown using `show()` function.
    * @param errorCallback The method to invoke when an error occurs.
    * @param type The window type - by default, this attribute is set to ***MAIN***.
    * @throw WebAPIException `TypeMismatchError`, `SecurityError`, `UnknownError`.
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/tv.window
    */
  def setSource(videoSource: SystemInfoVideoSourceInfo, successCallback: SourceChangedSuccessCallback): Unit = js.native
  def setSource(
    videoSource: SystemInfoVideoSourceInfo,
    successCallback: SourceChangedSuccessCallback,
    errorCallback: js.UndefOr[scala.Nothing],
    `type`: WindowType
  ): Unit = js.native
  def setSource(
    videoSource: SystemInfoVideoSourceInfo,
    successCallback: SourceChangedSuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def setSource(
    videoSource: SystemInfoVideoSourceInfo,
    successCallback: SourceChangedSuccessCallback,
    errorCallback: ErrorCallback,
    `type`: WindowType
  ): Unit = js.native
  @JSName("setSource")
  def setSource_MAIN(
    videoSource: SystemInfoVideoSourceInfo,
    successCallback: SourceChangedSuccessCallback,
    errorCallback: js.UndefOr[scala.Nothing],
    `type`: MAIN
  ): Unit = js.native
  @JSName("setSource")
  def setSource_MAIN(
    videoSource: SystemInfoVideoSourceInfo,
    successCallback: SourceChangedSuccessCallback,
    errorCallback: ErrorCallback,
    `type`: MAIN
  ): Unit = js.native
  
  /**
    * Sets the display area of a TV window and shows it on the display.
    *
    * The `rectangle` array requires exactly four elements which are described below:
    * - The first element indicates the x coordinate of the top left corner of the TV window (distance from the left edge of the screen).
    * - The second element indicates the y coordinate of the top left corner of the TV window (distance from the top edge of the screen).
    * - The third element indicates the width of the TV window.
    * - The fourth element indicates the height of the TV window.
    *
    * Each element of `rectangle` can be described in either absolute value by using pixel units "px"
    * or relative value by using percentage units "%". If you do not specify any unit after a value then it will be taken as an absolute value.
    *
    * The `errorCallback` is invoked with these error types:
    * - `InvalidValuesError` will be thrown if `rectangle` has any element with invalid format (e.g. "10p") or it does not have 4 elements.
    * - `NotSupportedError` will be thrown if you set `rectangle` which is not within the boundary of the display area or when the TV window is not supported in the current screen orientation.
    * - `TypeMismatchError` will be thrown if `rectangle` is not an array.
    *
    * @param successCallback The method which will be invoked when the position and size of the TV window has been changed successfully.
    * @param errorCallback The method which will be invoked when an error occurs.
    * @param rectangle An array that contains information about the position and size of a specified TV window as a string with units.
    *
    *        Without this parameter, the TV window will have the same size and location as when this method last suceeded.
    *
    *        But, if a rectangle has never been specified, the TV window will be shown in full screen mode.
    * @param type The window type - by default, this attribute is set to ***MAIN***.
    * @param zPosition Specifies whether the TV window should be in front of or behind the Web Application since Tizen 2.4
    *  By default, this parameter is set to ***FRONT***.
    *
    * If this parameter is set to null or ***FRONT***, this method behaves in the same way as it did before Tizen 2.4.
    *
    * @throw WebAPIException `TypeMismatchError`, `InvalidValuesError`, `SecurityError`, `UnknownError`.
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/tv.window
    */
  def show(successCallback: WindowRectangleSuccessCallback): Unit = js.native
  def show(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: js.UndefOr[scala.Nothing],
    rectangle: js.UndefOr[scala.Nothing],
    `type`: js.UndefOr[scala.Nothing],
    zPosition: ZPosition
  ): Unit = js.native
  def show(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: js.UndefOr[scala.Nothing],
    rectangle: js.UndefOr[scala.Nothing],
    `type`: MAIN,
    zPosition: BEHIND
  ): Unit = js.native
  def show(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: js.UndefOr[scala.Nothing],
    rectangle: js.UndefOr[scala.Nothing],
    `type`: MAIN,
    zPosition: FRONT
  ): Unit = js.native
  def show(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: js.UndefOr[scala.Nothing],
    rectangle: js.UndefOr[scala.Nothing],
    `type`: WindowType
  ): Unit = js.native
  def show(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: js.UndefOr[scala.Nothing],
    rectangle: js.UndefOr[scala.Nothing],
    `type`: WindowType,
    zPosition: ZPosition
  ): Unit = js.native
  def show(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: js.UndefOr[scala.Nothing],
    rectangle: js.Array[String]
  ): Unit = js.native
  def show(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: js.UndefOr[scala.Nothing],
    rectangle: js.Array[String],
    `type`: js.UndefOr[scala.Nothing],
    zPosition: ZPosition
  ): Unit = js.native
  def show(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: js.UndefOr[scala.Nothing],
    rectangle: js.Array[String],
    `type`: MAIN,
    zPosition: BEHIND
  ): Unit = js.native
  def show(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: js.UndefOr[scala.Nothing],
    rectangle: js.Array[String],
    `type`: MAIN,
    zPosition: FRONT
  ): Unit = js.native
  def show(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: js.UndefOr[scala.Nothing],
    rectangle: js.Array[String],
    `type`: WindowType
  ): Unit = js.native
  def show(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: js.UndefOr[scala.Nothing],
    rectangle: js.Array[String],
    `type`: WindowType,
    zPosition: ZPosition
  ): Unit = js.native
  def show(successCallback: WindowRectangleSuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  def show(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: ErrorCallback,
    rectangle: js.UndefOr[scala.Nothing],
    `type`: js.UndefOr[scala.Nothing],
    zPosition: ZPosition
  ): Unit = js.native
  def show(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: ErrorCallback,
    rectangle: js.UndefOr[scala.Nothing],
    `type`: MAIN,
    zPosition: BEHIND
  ): Unit = js.native
  def show(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: ErrorCallback,
    rectangle: js.UndefOr[scala.Nothing],
    `type`: MAIN,
    zPosition: FRONT
  ): Unit = js.native
  def show(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: ErrorCallback,
    rectangle: js.UndefOr[scala.Nothing],
    `type`: WindowType
  ): Unit = js.native
  def show(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: ErrorCallback,
    rectangle: js.UndefOr[scala.Nothing],
    `type`: WindowType,
    zPosition: ZPosition
  ): Unit = js.native
  def show(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: ErrorCallback,
    rectangle: js.Array[String]
  ): Unit = js.native
  def show(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: ErrorCallback,
    rectangle: js.Array[String],
    `type`: js.UndefOr[scala.Nothing],
    zPosition: ZPosition
  ): Unit = js.native
  def show(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: ErrorCallback,
    rectangle: js.Array[String],
    `type`: MAIN,
    zPosition: BEHIND
  ): Unit = js.native
  def show(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: ErrorCallback,
    rectangle: js.Array[String],
    `type`: MAIN,
    zPosition: FRONT
  ): Unit = js.native
  def show(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: ErrorCallback,
    rectangle: js.Array[String],
    `type`: WindowType
  ): Unit = js.native
  def show(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: ErrorCallback,
    rectangle: js.Array[String],
    `type`: WindowType,
    zPosition: ZPosition
  ): Unit = js.native
  @JSName("show")
  def show_BEHIND(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: js.UndefOr[scala.Nothing],
    rectangle: js.UndefOr[scala.Nothing],
    `type`: js.UndefOr[scala.Nothing],
    zPosition: BEHIND
  ): Unit = js.native
  @JSName("show")
  def show_BEHIND(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: js.UndefOr[scala.Nothing],
    rectangle: js.UndefOr[scala.Nothing],
    `type`: WindowType,
    zPosition: BEHIND
  ): Unit = js.native
  @JSName("show")
  def show_BEHIND(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: js.UndefOr[scala.Nothing],
    rectangle: js.Array[String],
    `type`: js.UndefOr[scala.Nothing],
    zPosition: BEHIND
  ): Unit = js.native
  @JSName("show")
  def show_BEHIND(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: js.UndefOr[scala.Nothing],
    rectangle: js.Array[String],
    `type`: WindowType,
    zPosition: BEHIND
  ): Unit = js.native
  @JSName("show")
  def show_BEHIND(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: ErrorCallback,
    rectangle: js.UndefOr[scala.Nothing],
    `type`: js.UndefOr[scala.Nothing],
    zPosition: BEHIND
  ): Unit = js.native
  @JSName("show")
  def show_BEHIND(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: ErrorCallback,
    rectangle: js.UndefOr[scala.Nothing],
    `type`: WindowType,
    zPosition: BEHIND
  ): Unit = js.native
  @JSName("show")
  def show_BEHIND(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: ErrorCallback,
    rectangle: js.Array[String],
    `type`: js.UndefOr[scala.Nothing],
    zPosition: BEHIND
  ): Unit = js.native
  @JSName("show")
  def show_BEHIND(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: ErrorCallback,
    rectangle: js.Array[String],
    `type`: WindowType,
    zPosition: BEHIND
  ): Unit = js.native
  @JSName("show")
  def show_FRONT(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: js.UndefOr[scala.Nothing],
    rectangle: js.UndefOr[scala.Nothing],
    `type`: js.UndefOr[scala.Nothing],
    zPosition: FRONT
  ): Unit = js.native
  @JSName("show")
  def show_FRONT(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: js.UndefOr[scala.Nothing],
    rectangle: js.UndefOr[scala.Nothing],
    `type`: WindowType,
    zPosition: FRONT
  ): Unit = js.native
  @JSName("show")
  def show_FRONT(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: js.UndefOr[scala.Nothing],
    rectangle: js.Array[String],
    `type`: js.UndefOr[scala.Nothing],
    zPosition: FRONT
  ): Unit = js.native
  @JSName("show")
  def show_FRONT(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: js.UndefOr[scala.Nothing],
    rectangle: js.Array[String],
    `type`: WindowType,
    zPosition: FRONT
  ): Unit = js.native
  @JSName("show")
  def show_FRONT(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: ErrorCallback,
    rectangle: js.UndefOr[scala.Nothing],
    `type`: js.UndefOr[scala.Nothing],
    zPosition: FRONT
  ): Unit = js.native
  @JSName("show")
  def show_FRONT(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: ErrorCallback,
    rectangle: js.UndefOr[scala.Nothing],
    `type`: WindowType,
    zPosition: FRONT
  ): Unit = js.native
  @JSName("show")
  def show_FRONT(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: ErrorCallback,
    rectangle: js.Array[String],
    `type`: js.UndefOr[scala.Nothing],
    zPosition: FRONT
  ): Unit = js.native
  @JSName("show")
  def show_FRONT(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: ErrorCallback,
    rectangle: js.Array[String],
    `type`: WindowType,
    zPosition: FRONT
  ): Unit = js.native
  @JSName("show")
  def show_MAIN(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: js.UndefOr[scala.Nothing],
    rectangle: js.UndefOr[scala.Nothing],
    `type`: MAIN
  ): Unit = js.native
  @JSName("show")
  def show_MAIN(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: js.UndefOr[scala.Nothing],
    rectangle: js.UndefOr[scala.Nothing],
    `type`: MAIN,
    zPosition: ZPosition
  ): Unit = js.native
  @JSName("show")
  def show_MAIN(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: js.UndefOr[scala.Nothing],
    rectangle: js.Array[String],
    `type`: MAIN
  ): Unit = js.native
  @JSName("show")
  def show_MAIN(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: js.UndefOr[scala.Nothing],
    rectangle: js.Array[String],
    `type`: MAIN,
    zPosition: ZPosition
  ): Unit = js.native
  @JSName("show")
  def show_MAIN(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: ErrorCallback,
    rectangle: js.UndefOr[scala.Nothing],
    `type`: MAIN
  ): Unit = js.native
  @JSName("show")
  def show_MAIN(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: ErrorCallback,
    rectangle: js.UndefOr[scala.Nothing],
    `type`: MAIN,
    zPosition: ZPosition
  ): Unit = js.native
  @JSName("show")
  def show_MAIN(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: ErrorCallback,
    rectangle: js.Array[String],
    `type`: MAIN
  ): Unit = js.native
  @JSName("show")
  def show_MAIN(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: ErrorCallback,
    rectangle: js.Array[String],
    `type`: MAIN,
    zPosition: ZPosition
  ): Unit = js.native
}
