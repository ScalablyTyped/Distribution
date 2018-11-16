package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Monitors and controls physical display information. The class provides events to allow clients to monitor for changes in the display. */
@JSGlobal("Windows.Graphics.Display.DisplayInformation")
@js.native
abstract class DisplayInformation () extends js.Object {
  /** Gets the current orientation of a rectangular monitor. */
  var currentOrientation: DisplayOrientations = js.native
  /** Diagonal size of the display in inches. */
  var diagonalSizeInInches: scala.Double = js.native
  /** Gets the pixels per logical inch of the current environment. */
  var logicalDpi: scala.Double = js.native
  /** Gets the native orientation of the display monitor, which is typically the orientation where the buttons on the device match the orientation of the monitor. */
  var nativeOrientation: DisplayOrientations = js.native
  /** Occurs when the physical display's color profile changes. */
  @JSName("oncolorprofilechanged")
  var oncolorprofilechanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DisplayInformation, _] = js.native
  /** Occurs when the LogicalDpi property changes because the pixels per inch (PPI) of the display changes. */
  @JSName("ondpichanged")
  var ondpichanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DisplayInformation, _] = js.native
  /** Occurs when either the CurrentOrientation or NativeOrientation property changes because of a mode change or a monitor change. */
  @JSName("onorientationchanged")
  var onorientationchanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DisplayInformation, _] = js.native
  /** Occurs when the StereoEnabled property changes because support for stereoscopic 3D changes. */
  @JSName("onstereoenabledchanged")
  var onstereoenabledchanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DisplayInformation, _] = js.native
  /** Gets the raw dots per inch (DPI) along the x axis of the display monitor. */
  var rawDpiX: scala.Double = js.native
  /** Gets the raw dots per inch (DPI) along the y axis of the display monitor. */
  var rawDpiY: scala.Double = js.native
  /** Gets a value representing the number of raw (physical) pixels for each view (layout) pixel. */
  var rawPixelsPerViewPixel: scala.Double = js.native
  /** Gets the scale factor of the immersive environment. */
  var resolutionScale: ResolutionScale = js.native
  /** Gets a value that indicates whether the device supports stereoscopic 3D. */
  var stereoEnabled: scala.Boolean = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_colorprofilechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.colorprofilechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DisplayInformation, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dpichanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.dpichanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DisplayInformation, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_orientationchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.orientationchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DisplayInformation, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stereoenabledchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.stereoenabledchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DisplayInformation, _]
  ): scala.Unit = js.native
  /**
                   * Asynchronously gets the default International Color Consortium (ICC) color profile that is associated with the physical display.
                   * @return Object that manages the asynchronous retrieval of the color profile.
                   */
  def getColorProfileAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream] = js.native
  /** Occurs when the physical display's color profile changes. */
  def oncolorprofilechanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[DisplayInformation]): scala.Unit = js.native
  /** Occurs when the LogicalDpi property changes because the pixels per inch (PPI) of the display changes. */
  def ondpichanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[DisplayInformation]): scala.Unit = js.native
  /** Occurs when either the CurrentOrientation or NativeOrientation property changes because of a mode change or a monitor change. */
  def onorientationchanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[DisplayInformation]): scala.Unit = js.native
  /** Occurs when the StereoEnabled property changes because support for stereoscopic 3D changes. */
  def onstereoenabledchanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[DisplayInformation]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_colorprofilechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.colorprofilechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DisplayInformation, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dpichanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.dpichanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DisplayInformation, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_orientationchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.orientationchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DisplayInformation, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stereoenabledchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.stereoenabledchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DisplayInformation, _]
  ): scala.Unit = js.native
}

/** Monitors and controls physical display information. The class provides events to allow clients to monitor for changes in the display. */
@JSGlobal("Windows.Graphics.Display.DisplayInformation")
@js.native
object DisplayInformation extends js.Object {
  /** Gets and sets the preferred orientation of the app. */
  var autoRotationPreferences: winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.DisplayOrientations = js.native
  /** Occurs when the display requires redrawing. */
  @JSName("ondisplaycontentsinvalidated")
  var ondisplaycontentsinvalidated_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.DisplayInformation, _] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_displaycontentsinvalidated(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.displaycontentsinvalidated,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.DisplayInformation, _]
  ): scala.Unit = js.native
  /**
                   * Gets the current physical display information.
                   * @return A DisplayInformation object that contains the current physical display information.
                   */
  def getForCurrentView(): winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.DisplayInformation = js.native
  /** Occurs when the display requires redrawing. */
  def ondisplaycontentsinvalidated(
    ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.DisplayInformation]
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_displaycontentsinvalidated(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.displaycontentsinvalidated,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.DisplayInformation, _]
  ): scala.Unit = js.native
}

