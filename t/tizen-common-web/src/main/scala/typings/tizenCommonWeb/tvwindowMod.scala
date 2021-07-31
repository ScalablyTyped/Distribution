package typings.tizenCommonWeb

import typings.tizenCommonWeb.systeminfoMod.SystemInfoVideoSourceInfo
import typings.tizenCommonWeb.tizenCommonWebStrings.ASPECT_RATIO_16x9
import typings.tizenCommonWeb.tizenCommonWebStrings.ASPECT_RATIO_1x1
import typings.tizenCommonWeb.tizenCommonWebStrings.ASPECT_RATIO_221x100
import typings.tizenCommonWeb.tizenCommonWebStrings.ASPECT_RATIO_4x3
import typings.tizenCommonWeb.tizenCommonWebStrings.ASPECT_RATIO_UNKNOWN
import typings.tizenCommonWeb.tizenCommonWebStrings.BEHIND
import typings.tizenCommonWeb.tizenCommonWebStrings.FRONT
import typings.tizenCommonWeb.tizenCommonWebStrings.MAIN
import typings.tizenCommonWeb.tizenCommonWebStrings.Percentsign
import typings.tizenCommonWeb.tizenCommonWebStrings.px
import typings.tizenCommonWeb.tizenMod.ErrorCallback
import typings.tizenCommonWeb.tizenMod.SuccessCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tvwindowMod {
  
  @js.native
  sealed trait AspectRatio extends StObject
  @JSImport("tizen-common-web/tvwindow", "AspectRatio")
  @js.native
  object AspectRatio extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[AspectRatio & String] = js.native
    
    @js.native
    sealed trait ASPECT_RATIO_16x9
      extends StObject
         with AspectRatio
    /* "ASPECT_RATIO_16x9" */ val ASPECT_RATIO_16x9: typings.tizenCommonWeb.tvwindowMod.AspectRatio.ASPECT_RATIO_16x9 & String = js.native
    
    @js.native
    sealed trait ASPECT_RATIO_1x1
      extends StObject
         with AspectRatio
    /* "ASPECT_RATIO_1x1" */ val ASPECT_RATIO_1x1: typings.tizenCommonWeb.tvwindowMod.AspectRatio.ASPECT_RATIO_1x1 & String = js.native
    
    @js.native
    sealed trait ASPECT_RATIO_221x100
      extends StObject
         with AspectRatio
    /* "ASPECT_RATIO_221x100" */ val ASPECT_RATIO_221x100: typings.tizenCommonWeb.tvwindowMod.AspectRatio.ASPECT_RATIO_221x100 & String = js.native
    
    @js.native
    sealed trait ASPECT_RATIO_4x3
      extends StObject
         with AspectRatio
    /* "ASPECT_RATIO_4x3" */ val ASPECT_RATIO_4x3: typings.tizenCommonWeb.tvwindowMod.AspectRatio.ASPECT_RATIO_4x3 & String = js.native
    
    @js.native
    sealed trait ASPECT_RATIO_UNKNOWN
      extends StObject
         with AspectRatio
    /* "ASPECT_RATIO_UNKNOWN" */ val ASPECT_RATIO_UNKNOWN: typings.tizenCommonWeb.tvwindowMod.AspectRatio.ASPECT_RATIO_UNKNOWN & String = js.native
  }
  
  @js.native
  sealed trait MeasurementUnit extends StObject
  @JSImport("tizen-common-web/tvwindow", "MeasurementUnit")
  @js.native
  object MeasurementUnit extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MeasurementUnit & String] = js.native
    
    @js.native
    sealed trait Percentsign
      extends StObject
         with MeasurementUnit
    /* "%" */ val Percentsign: typings.tizenCommonWeb.tvwindowMod.MeasurementUnit.Percentsign & String = js.native
    
    @js.native
    sealed trait px
      extends StObject
         with MeasurementUnit
    /* "px" */ val px: typings.tizenCommonWeb.tvwindowMod.MeasurementUnit.px & String = js.native
  }
  
  @js.native
  sealed trait WindowType extends StObject
  @JSImport("tizen-common-web/tvwindow", "WindowType")
  @js.native
  object WindowType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[WindowType & String] = js.native
    
    @js.native
    sealed trait MAIN
      extends StObject
         with WindowType
    /* "MAIN" */ val MAIN: typings.tizenCommonWeb.tvwindowMod.WindowType.MAIN & String = js.native
  }
  
  @js.native
  sealed trait ZPosition extends StObject
  @JSImport("tizen-common-web/tvwindow", "ZPosition")
  @js.native
  object ZPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ZPosition & String] = js.native
    
    @js.native
    sealed trait BEHIND
      extends StObject
         with ZPosition
    /* "BEHIND" */ val BEHIND: typings.tizenCommonWeb.tvwindowMod.ZPosition.BEHIND & String = js.native
    
    @js.native
    sealed trait FRONT
      extends StObject
         with ZPosition
    /* "FRONT" */ val FRONT: typings.tizenCommonWeb.tvwindowMod.ZPosition.FRONT & String = js.native
  }
  
  type AvailableWindowListCallback = js.Function1[/* type */ js.Array[WindowType], Unit]
  
  type SourceChangedSuccessCallback = js.Function2[/* source */ SystemInfoVideoSourceInfo, /* type */ WindowType, Unit]
  
  @js.native
  trait TVWindowManager extends StObject {
    
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
      errorCallback: Unit,
      unit: Unit,
      `type`: WindowType
    ): Unit = js.native
    def getRect(successCallback: WindowRectangleSuccessCallback, errorCallback: Unit, unit: Percentsign): Unit = js.native
    def getRect(
      successCallback: WindowRectangleSuccessCallback,
      errorCallback: Unit,
      unit: Percentsign,
      `type`: WindowType
    ): Unit = js.native
    def getRect(successCallback: WindowRectangleSuccessCallback, errorCallback: Unit, unit: px, `type`: MAIN): Unit = js.native
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
      unit: Unit,
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
    def getRect_MAIN(successCallback: WindowRectangleSuccessCallback, errorCallback: Unit, unit: Unit, `type`: MAIN): Unit = js.native
    @JSName("getRect")
    def getRect_MAIN(
      successCallback: WindowRectangleSuccessCallback,
      errorCallback: Unit,
      unit: Percentsign,
      `type`: MAIN
    ): Unit = js.native
    @JSName("getRect")
    def getRect_MAIN(
      successCallback: WindowRectangleSuccessCallback,
      errorCallback: Unit,
      unit: MeasurementUnit,
      `type`: MAIN
    ): Unit = js.native
    @JSName("getRect")
    def getRect_MAIN(
      successCallback: WindowRectangleSuccessCallback,
      errorCallback: ErrorCallback,
      unit: Unit,
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
    def getRect_px(successCallback: WindowRectangleSuccessCallback, errorCallback: Unit, unit: px): Unit = js.native
    @JSName("getRect")
    def getRect_px(successCallback: WindowRectangleSuccessCallback, errorCallback: Unit, unit: px, `type`: WindowType): Unit = js.native
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
    def hide(successCallback: SuccessCallback, errorCallback: Unit, `type`: WindowType): Unit = js.native
    def hide(successCallback: SuccessCallback, errorCallback: ErrorCallback): Unit = js.native
    def hide(successCallback: SuccessCallback, errorCallback: ErrorCallback, `type`: WindowType): Unit = js.native
    @JSName("hide")
    def hide_MAIN(successCallback: SuccessCallback, errorCallback: Unit, `type`: MAIN): Unit = js.native
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
    @JSName("setSource")
    def setSource_MAIN(
      videoSource: SystemInfoVideoSourceInfo,
      successCallback: SourceChangedSuccessCallback,
      errorCallback: Unit,
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
    def show(successCallback: WindowRectangleSuccessCallback, errorCallback: Unit, rectangle: js.Array[String]): Unit = js.native
    def show(
      successCallback: WindowRectangleSuccessCallback,
      errorCallback: Unit,
      rectangle: js.Array[String],
      `type`: Unit,
      zPosition: ZPosition
    ): Unit = js.native
    def show(
      successCallback: WindowRectangleSuccessCallback,
      errorCallback: Unit,
      rectangle: js.Array[String],
      `type`: MAIN,
      zPosition: BEHIND
    ): Unit = js.native
    def show(
      successCallback: WindowRectangleSuccessCallback,
      errorCallback: Unit,
      rectangle: js.Array[String],
      `type`: MAIN,
      zPosition: FRONT
    ): Unit = js.native
    def show(
      successCallback: WindowRectangleSuccessCallback,
      errorCallback: Unit,
      rectangle: js.Array[String],
      `type`: WindowType
    ): Unit = js.native
    def show(
      successCallback: WindowRectangleSuccessCallback,
      errorCallback: Unit,
      rectangle: js.Array[String],
      `type`: WindowType,
      zPosition: ZPosition
    ): Unit = js.native
    def show(
      successCallback: WindowRectangleSuccessCallback,
      errorCallback: Unit,
      rectangle: Unit,
      `type`: Unit,
      zPosition: ZPosition
    ): Unit = js.native
    def show(
      successCallback: WindowRectangleSuccessCallback,
      errorCallback: Unit,
      rectangle: Unit,
      `type`: MAIN,
      zPosition: BEHIND
    ): Unit = js.native
    def show(
      successCallback: WindowRectangleSuccessCallback,
      errorCallback: Unit,
      rectangle: Unit,
      `type`: MAIN,
      zPosition: FRONT
    ): Unit = js.native
    def show(
      successCallback: WindowRectangleSuccessCallback,
      errorCallback: Unit,
      rectangle: Unit,
      `type`: WindowType
    ): Unit = js.native
    def show(
      successCallback: WindowRectangleSuccessCallback,
      errorCallback: Unit,
      rectangle: Unit,
      `type`: WindowType,
      zPosition: ZPosition
    ): Unit = js.native
    def show(successCallback: WindowRectangleSuccessCallback, errorCallback: ErrorCallback): Unit = js.native
    def show(
      successCallback: WindowRectangleSuccessCallback,
      errorCallback: ErrorCallback,
      rectangle: js.Array[String]
    ): Unit = js.native
    def show(
      successCallback: WindowRectangleSuccessCallback,
      errorCallback: ErrorCallback,
      rectangle: js.Array[String],
      `type`: Unit,
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
    def show(
      successCallback: WindowRectangleSuccessCallback,
      errorCallback: ErrorCallback,
      rectangle: Unit,
      `type`: Unit,
      zPosition: ZPosition
    ): Unit = js.native
    def show(
      successCallback: WindowRectangleSuccessCallback,
      errorCallback: ErrorCallback,
      rectangle: Unit,
      `type`: MAIN,
      zPosition: BEHIND
    ): Unit = js.native
    def show(
      successCallback: WindowRectangleSuccessCallback,
      errorCallback: ErrorCallback,
      rectangle: Unit,
      `type`: MAIN,
      zPosition: FRONT
    ): Unit = js.native
    def show(
      successCallback: WindowRectangleSuccessCallback,
      errorCallback: ErrorCallback,
      rectangle: Unit,
      `type`: WindowType
    ): Unit = js.native
    def show(
      successCallback: WindowRectangleSuccessCallback,
      errorCallback: ErrorCallback,
      rectangle: Unit,
      `type`: WindowType,
      zPosition: ZPosition
    ): Unit = js.native
    @JSName("show")
    def show_BEHIND(
      successCallback: WindowRectangleSuccessCallback,
      errorCallback: Unit,
      rectangle: js.Array[String],
      `type`: Unit,
      zPosition: BEHIND
    ): Unit = js.native
    @JSName("show")
    def show_BEHIND(
      successCallback: WindowRectangleSuccessCallback,
      errorCallback: Unit,
      rectangle: js.Array[String],
      `type`: WindowType,
      zPosition: BEHIND
    ): Unit = js.native
    @JSName("show")
    def show_BEHIND(
      successCallback: WindowRectangleSuccessCallback,
      errorCallback: Unit,
      rectangle: Unit,
      `type`: Unit,
      zPosition: BEHIND
    ): Unit = js.native
    @JSName("show")
    def show_BEHIND(
      successCallback: WindowRectangleSuccessCallback,
      errorCallback: Unit,
      rectangle: Unit,
      `type`: WindowType,
      zPosition: BEHIND
    ): Unit = js.native
    @JSName("show")
    def show_BEHIND(
      successCallback: WindowRectangleSuccessCallback,
      errorCallback: ErrorCallback,
      rectangle: js.Array[String],
      `type`: Unit,
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
    def show_BEHIND(
      successCallback: WindowRectangleSuccessCallback,
      errorCallback: ErrorCallback,
      rectangle: Unit,
      `type`: Unit,
      zPosition: BEHIND
    ): Unit = js.native
    @JSName("show")
    def show_BEHIND(
      successCallback: WindowRectangleSuccessCallback,
      errorCallback: ErrorCallback,
      rectangle: Unit,
      `type`: WindowType,
      zPosition: BEHIND
    ): Unit = js.native
    @JSName("show")
    def show_FRONT(
      successCallback: WindowRectangleSuccessCallback,
      errorCallback: Unit,
      rectangle: js.Array[String],
      `type`: Unit,
      zPosition: FRONT
    ): Unit = js.native
    @JSName("show")
    def show_FRONT(
      successCallback: WindowRectangleSuccessCallback,
      errorCallback: Unit,
      rectangle: js.Array[String],
      `type`: WindowType,
      zPosition: FRONT
    ): Unit = js.native
    @JSName("show")
    def show_FRONT(
      successCallback: WindowRectangleSuccessCallback,
      errorCallback: Unit,
      rectangle: Unit,
      `type`: Unit,
      zPosition: FRONT
    ): Unit = js.native
    @JSName("show")
    def show_FRONT(
      successCallback: WindowRectangleSuccessCallback,
      errorCallback: Unit,
      rectangle: Unit,
      `type`: WindowType,
      zPosition: FRONT
    ): Unit = js.native
    @JSName("show")
    def show_FRONT(
      successCallback: WindowRectangleSuccessCallback,
      errorCallback: ErrorCallback,
      rectangle: js.Array[String],
      `type`: Unit,
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
    def show_FRONT(
      successCallback: WindowRectangleSuccessCallback,
      errorCallback: ErrorCallback,
      rectangle: Unit,
      `type`: Unit,
      zPosition: FRONT
    ): Unit = js.native
    @JSName("show")
    def show_FRONT(
      successCallback: WindowRectangleSuccessCallback,
      errorCallback: ErrorCallback,
      rectangle: Unit,
      `type`: WindowType,
      zPosition: FRONT
    ): Unit = js.native
    @JSName("show")
    def show_MAIN(
      successCallback: WindowRectangleSuccessCallback,
      errorCallback: Unit,
      rectangle: js.Array[String],
      `type`: MAIN
    ): Unit = js.native
    @JSName("show")
    def show_MAIN(
      successCallback: WindowRectangleSuccessCallback,
      errorCallback: Unit,
      rectangle: js.Array[String],
      `type`: MAIN,
      zPosition: ZPosition
    ): Unit = js.native
    @JSName("show")
    def show_MAIN(
      successCallback: WindowRectangleSuccessCallback,
      errorCallback: Unit,
      rectangle: Unit,
      `type`: MAIN
    ): Unit = js.native
    @JSName("show")
    def show_MAIN(
      successCallback: WindowRectangleSuccessCallback,
      errorCallback: Unit,
      rectangle: Unit,
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
    @JSName("show")
    def show_MAIN(
      successCallback: WindowRectangleSuccessCallback,
      errorCallback: ErrorCallback,
      rectangle: Unit,
      `type`: MAIN
    ): Unit = js.native
    @JSName("show")
    def show_MAIN(
      successCallback: WindowRectangleSuccessCallback,
      errorCallback: ErrorCallback,
      rectangle: Unit,
      `type`: MAIN,
      zPosition: ZPosition
    ): Unit = js.native
  }
  
  trait VideoResolution extends StObject {
    
    /**
      * Video aspect ratio.
      *
      */
    val aspectRatio: AspectRatio | ASPECT_RATIO_1x1 | ASPECT_RATIO_4x3 | ASPECT_RATIO_16x9 | ASPECT_RATIO_221x100 | ASPECT_RATIO_UNKNOWN
    
    /**
      * Vertical frequency rate in Hz.
      */
    val frequency: Double
    
    /**
      * Video height in pixels.
      */
    val height: Double
    
    /**
      * Video width in pixels.
      */
    val width: Double
  }
  object VideoResolution {
    
    @scala.inline
    def apply(
      aspectRatio: AspectRatio | ASPECT_RATIO_1x1 | ASPECT_RATIO_4x3 | ASPECT_RATIO_16x9 | ASPECT_RATIO_221x100 | ASPECT_RATIO_UNKNOWN,
      frequency: Double,
      height: Double,
      width: Double
    ): VideoResolution = {
      val __obj = js.Dynamic.literal(aspectRatio = aspectRatio.asInstanceOf[js.Any], frequency = frequency.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[VideoResolution]
    }
    
    @scala.inline
    implicit class VideoResolutionMutableBuilder[Self <: VideoResolution] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAspectRatio(
        value: AspectRatio | ASPECT_RATIO_1x1 | ASPECT_RATIO_4x3 | ASPECT_RATIO_16x9 | ASPECT_RATIO_221x100 | ASPECT_RATIO_UNKNOWN
      ): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type VideoResolutionChangeCallback = js.Function2[/* resolution */ VideoResolution, /* type */ WindowType, Unit]
  
  type WindowRectangleSuccessCallback = js.Function2[/* windowRect */ js.Array[String], /* type */ WindowType, Unit]
}
