package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TVWindowManager extends StObject {
  
  /**
    * Adds a video resolution listener for getting notified about resolution changes.
    *
    * @param callback The method to invoke when the resolution has been changed.
    * @param type The window type. By default, this parameter is set to MAIN.
    *
    * @returns long The identifier of the resolution change listener.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input attribute is not compatible with the expected type for this attribute.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type UnknownError, if it fails to register a listener.
    *
    * @since 2.4
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/tv.window
    */
  def addVideoResolutionChangeListener(callback: VideoResolutionChangeCallback): Double = js.native
  def addVideoResolutionChangeListener(callback: VideoResolutionChangeCallback, `type`: WindowType): Double = js.native
  
  /**
    * Gets the list of available windows.
    *
    * @param successCallback The method to invoke when a list of the available windows is retrieved successfully.
    * @param errorCallback The method to invoke when an error occurs.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input attribute is not compatible with the expected type for this attribute.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/tv.window
    */
  def getAvailableWindows(successCallback: AvailableWindowListCallback): Unit = js.native
  def getAvailableWindows(successCallback: AvailableWindowListCallback, errorCallback: ErrorCallback): Unit = js.native
  
  /**
    * Gets the area information of a TV window which is shown.
    *
    * According to the specified **unit**, information about the area will be passed to an array that contains 4 strings through _WindowRectangleSuccessCallback_ as follows :
    *
    * *   If you set _"px"_ as _unit_, \["0px", "0px", "1920px", "1080px"\]
    * *   If you set _"%"_ as _unit_, \["0%", "0%", "100%", "100%"\]
    *
    * If you omit **unit**, the pixel("px") unit will be used as a default unit.
    *
    * @param successCallback The method to invoke when the position and size of the TV window has been obtained successfully.
    * @param errorCallback The method to invoke when an error occurs.
    * @param unit The measurement unit for specifying the display area - by default, this attribute is set to _"px"_.
    * @param type The window type - by default, this attribute is set to MAIN.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input attribute is not compatible with the expected type for this attribute.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type UnknownError if any other error occurs.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/tv.window
    */
  def getRect(successCallback: WindowRectangleSuccessCallback): Unit = js.native
  def getRect(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: Null,
    unit: Null,
    `type`: WindowType
  ): Unit = js.native
  def getRect(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: Null,
    unit: Unit,
    `type`: WindowType
  ): Unit = js.native
  def getRect(successCallback: WindowRectangleSuccessCallback, errorCallback: Null, unit: MeasurementUnit): Unit = js.native
  def getRect(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: Null,
    unit: MeasurementUnit,
    `type`: WindowType
  ): Unit = js.native
  def getRect(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: Unit,
    unit: Null,
    `type`: WindowType
  ): Unit = js.native
  def getRect(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: Unit,
    unit: Unit,
    `type`: WindowType
  ): Unit = js.native
  def getRect(successCallback: WindowRectangleSuccessCallback, errorCallback: Unit, unit: MeasurementUnit): Unit = js.native
  def getRect(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: Unit,
    unit: MeasurementUnit,
    `type`: WindowType
  ): Unit = js.native
  def getRect(successCallback: WindowRectangleSuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  def getRect(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: ErrorCallback,
    unit: Null,
    `type`: WindowType
  ): Unit = js.native
  def getRect(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: ErrorCallback,
    unit: Unit,
    `type`: WindowType
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
  
  /**
    * Gets information about the current source of a specified TV window.
    *
    * @param type The window type - by default, this attribute is set to MAIN.
    *
    * @returns The information about the current video source. Returned object will have the _signal_ property, stating whether there is signal provided or not on the source, this property value will be filled only when the window was shown using [show()](./tvwindow.html#TVWindowManager::show) function.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input attribute is not compatible with the expected type for this attribute.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type UnknownError if any other error occurs.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/tv.window
    */
  def getSource(): SystemInfoVideoSourceInfo = js.native
  def getSource(`type`: WindowType): SystemInfoVideoSourceInfo = js.native
  
  /**
    * Gets video resolution information.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input attribute is not compatible with the expected type for this attribute.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type UnknownError if any other error occurs.
    *
    * @param type The window type - by default, this attribute is set to MAIN.
    *
    * @returns VideoResolution current video resolution information
    *
    * @since 2.4
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/tv.window
    */
  def getVideoResolution(): VideoResolution = js.native
  def getVideoResolution(`type`: WindowType): VideoResolution = js.native
  
  /**
    * Hides a TV window which is shown.
    *
    * @param successCallback The method to invoke when the window is hidden successfully.
    * @param errorCallback The method to invoke when an error occurs.
    * @param type The window type - by default, this attribute is set to MAIN.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input attribute is not compatible with the expected type for this attribute.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type UnknownError if any other error occurs.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/tv.window
    */
  def hide(successCallback: SuccessCallback): Unit = js.native
  def hide(successCallback: SuccessCallback, errorCallback: Null, `type`: WindowType): Unit = js.native
  def hide(successCallback: SuccessCallback, errorCallback: Unit, `type`: WindowType): Unit = js.native
  def hide(successCallback: SuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  def hide(successCallback: SuccessCallback, errorCallback: ErrorCallback, `type`: WindowType): Unit = js.native
  
  /**
    * Removes the listener to stop receiving notifications for the video resolution changes.
    *
    * Calling this function has no effect if there is no listener with given id.
    *
    * @param listenerId The identifier of the listener for resolution changes.
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type UnknownError in any other error case.
    *
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
    * The result SystemInfoVideoSourceInfo object will have the _signal_ property filled only when the window was shown using [show()](./tvwindow.html#TVWindowManager::show) function.
    * @param errorCallback The method to invoke when an error occurs.
    * @param type The window type - by default, this attribute is set to MAIN.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input attribute is not compatible with the expected type for this attribute.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type UnknownError if any other error occurs.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/tv.window
    */
  def setSource(videoSource: SystemInfoVideoSourceInfo, successCallback: SourceChangedSuccessCallback): Unit = js.native
  def setSource(
    videoSource: SystemInfoVideoSourceInfo,
    successCallback: SourceChangedSuccessCallback,
    errorCallback: Null,
    `type`: WindowType
  ): Unit = js.native
  def setSource(
    videoSource: SystemInfoVideoSourceInfo,
    successCallback: SourceChangedSuccessCallback,
    errorCallback: Unit,
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
  
  /**
    * Sets the display area of a TV window and shows it on the display.
    *
    * The _rectangle_ array requires exactly four elements which are described below:
    *
    * *   The first element indicates the x coordinate of the top left corner of the TV window (distance from the left edge of the screen).
    * *   The second element indicates the y coordinate of the top left corner of the TV window (distance from the top edge of the screen).
    * *   The third element indicates the width of the TV window.
    * *   The fourth element indicates the height of the TV window.
    *
    *
    * Each element of _rectangle_ can be described in either absolute value by using pixel units "px"
    * or relative value by using percentage units "%". If you do not specify any unit after a value then it will be taken as an absolute value.
    *
    * The _errorCallback_ is invoked with these error types:
    *
    * *   _InvalidValuesError_ will be thrown if _rectangle_ has any element with invalid format (e.g. "10p") or it does not have 4 elements.
    * *   _NotSupportedError_ will be thrown if you set _rectangle_ which is not within the boundary of the display area or when the TV window is not supported in the current screen orientation.
    * *   _TypeMismatchError_ will be thrown if _rectangle_ is not an array.
    *
    *
    * @param successCallback The method which will be invoked when the position and size of the TV window has been changed successfully.
    * @param errorCallback The method which will be invoked when an error occurs.
    * @param rectangle An array that contains information about the position and size of a specified TV window as a string with units
    * .
    * Without this parameter, the TV window will have the same size and location as when this method last suceeded.
    * But, if a rectangle has never been specified, the TV window will be shown in full screen mode.
    * @param type The window type - by default, this attribute is set to MAIN.
    * @param zPosition Specifies whether the TV window should be in front of or behind the Web Application since Tizen 2.4
    * By default, this parameter is set to FRONT.
    * If this parameter is set to null or FRONT, this method behaves in the same way as it did before Tizen 2.4.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input attribute is not compatible with the expected type for this attribute.
    * @throw WebAPIException with error type InvalidValuesError, if any of the input parameters contain an invalid value.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type UnknownError if any other error occurs.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/tv.window
    */
  def show(
    successCallback: WindowRectangleSuccessCallback,
    errorCallback: js.UndefOr[ErrorCallback | Null],
    rectangle: js.UndefOr[js.Array[String] | Null],
    `type`: js.UndefOr[WindowType | Null],
    zPosition: js.UndefOr[ZPosition | Null]
  ): Unit = js.native
}
