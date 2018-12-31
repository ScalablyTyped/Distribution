package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides various properties that are related to the physical display. */
@JSGlobal("Windows.Graphics.Display.DisplayProperties")
@js.native
abstract class DisplayProperties () extends js.Object

/** Provides various properties that are related to the physical display. */
@JSGlobal("Windows.Graphics.Display.DisplayProperties")
@js.native
object DisplayProperties extends js.Object {
  /** Gets and sets the preferred orientation of the app. */
  var autoRotationPreferences: winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.DisplayOrientations = js.native
  /** Gets the current orientation of a rectangular monitor. */
  var currentOrientation: winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.DisplayOrientations = js.native
  /** Gets the pixels per logical inch of the current environment. */
  var logicalDpi: scala.Double = js.native
  /** Gets the native orientation of the display monitor, which is typically the orientation where the buttons on the device match the orientation of the monitor. */
  var nativeOrientation: winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.DisplayOrientations = js.native
  /** Occurs when the physical display's color profile changes. */
  @JSName("oncolorprofilechanged")
  var oncolorprofilechanged_Original: winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.DisplayPropertiesEventHandler = js.native
  /** Occurs when the display requires redrawing. */
  @JSName("ondisplaycontentsinvalidated")
  var ondisplaycontentsinvalidated_Original: winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.DisplayPropertiesEventHandler = js.native
  /** Occurs when the LogicalDpi property changes because the pixels per inch (PPI) of the display changes. */
  @JSName("onlogicaldpichanged")
  var onlogicaldpichanged_Original: winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.DisplayPropertiesEventHandler = js.native
  /** Occurs when either the CurrentOrientation or NativeOrientation property changes because of a mode change or a monitor change. */
  @JSName("onorientationchanged")
  var onorientationchanged_Original: winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.DisplayPropertiesEventHandler = js.native
  /** Occurs when the StereoEnabled property changes because support for stereoscopic 3D changes. */
  @JSName("onstereoenabledchanged")
  var onstereoenabledchanged_Original: winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.DisplayPropertiesEventHandler = js.native
  /** Gets the scale factor of the immersive environment. */
  var resolutionScale: winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.ResolutionScale = js.native
  /** Gets a value that indicates whether the device supports stereoscopic 3D. */
  var stereoEnabled: scala.Boolean = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_colorprofilechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.colorprofilechanged,
    listener: winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.DisplayPropertiesEventHandler
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_displaycontentsinvalidated(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.displaycontentsinvalidated,
    listener: winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.DisplayPropertiesEventHandler
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_logicaldpichanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.logicaldpichanged,
    listener: winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.DisplayPropertiesEventHandler
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_orientationchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.orientationchanged,
    listener: winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.DisplayPropertiesEventHandler
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stereoenabledchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.stereoenabledchanged,
    listener: winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.DisplayPropertiesEventHandler
  ): scala.Unit = js.native
  /**
    * Asynchronously gets the default International Color Consortium (ICC) color profile that is associated with the physical display.
    * @return Object that manages the asynchronous retrieval of the color profile.
    */
  def getColorProfileAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream] = js.native
  /** Occurs when the physical display's color profile changes. */
  def oncolorprofilechanged(ev: winrtDashUwpLib.WindowsNs.WinRTEvent[_]): scala.Unit = js.native
  /** Occurs when the display requires redrawing. */
  def ondisplaycontentsinvalidated(ev: winrtDashUwpLib.WindowsNs.WinRTEvent[_]): scala.Unit = js.native
  /** Occurs when the LogicalDpi property changes because the pixels per inch (PPI) of the display changes. */
  def onlogicaldpichanged(ev: winrtDashUwpLib.WindowsNs.WinRTEvent[_]): scala.Unit = js.native
  /** Occurs when either the CurrentOrientation or NativeOrientation property changes because of a mode change or a monitor change. */
  def onorientationchanged(ev: winrtDashUwpLib.WindowsNs.WinRTEvent[_]): scala.Unit = js.native
  /** Occurs when the StereoEnabled property changes because support for stereoscopic 3D changes. */
  def onstereoenabledchanged(ev: winrtDashUwpLib.WindowsNs.WinRTEvent[_]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_colorprofilechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.colorprofilechanged,
    listener: winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.DisplayPropertiesEventHandler
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_displaycontentsinvalidated(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.displaycontentsinvalidated,
    listener: winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.DisplayPropertiesEventHandler
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_logicaldpichanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.logicaldpichanged,
    listener: winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.DisplayPropertiesEventHandler
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_orientationchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.orientationchanged,
    listener: winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.DisplayPropertiesEventHandler
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stereoenabledchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.stereoenabledchanged,
    listener: winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.DisplayPropertiesEventHandler
  ): scala.Unit = js.native
}

