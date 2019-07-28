package typings.winrtDashUwp.WindowsNs.GraphicsNs.DisplayNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.EventHandler
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream
import typings.winrtDashUwp.WindowsNs.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.colorprofilechanged
import typings.winrtDashUwp.winrtDashUwpStrings.displaycontentsinvalidated
import typings.winrtDashUwp.winrtDashUwpStrings.logicaldpichanged
import typings.winrtDashUwp.winrtDashUwpStrings.orientationchanged
import typings.winrtDashUwp.winrtDashUwpStrings.stereoenabledchanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides various properties that are related to the physical display. */
@JSGlobal("Windows.Graphics.Display.DisplayProperties")
@js.native
abstract class DisplayProperties () extends js.Object

/* static members */
@JSGlobal("Windows.Graphics.Display.DisplayProperties")
@js.native
object DisplayProperties extends js.Object {
  /** Gets and sets the preferred orientation of the app. */
  var autoRotationPreferences: DisplayOrientations = js.native
  /** Gets the current orientation of a rectangular monitor. */
  var currentOrientation: DisplayOrientations = js.native
  /** Gets the pixels per logical inch of the current environment. */
  var logicalDpi: Double = js.native
  /** Gets the native orientation of the display monitor, which is typically the orientation where the buttons on the device match the orientation of the monitor. */
  var nativeOrientation: DisplayOrientations = js.native
  /** Occurs when the physical display's color profile changes. */
  @JSName("oncolorprofilechanged")
  var oncolorprofilechanged_Original: DisplayPropertiesEventHandler = js.native
  /** Occurs when the display requires redrawing. */
  @JSName("ondisplaycontentsinvalidated")
  var ondisplaycontentsinvalidated_Original: DisplayPropertiesEventHandler = js.native
  /** Occurs when the LogicalDpi property changes because the pixels per inch (PPI) of the display changes. */
  @JSName("onlogicaldpichanged")
  var onlogicaldpichanged_Original: DisplayPropertiesEventHandler = js.native
  /** Occurs when either the CurrentOrientation or NativeOrientation property changes because of a mode change or a monitor change. */
  @JSName("onorientationchanged")
  var onorientationchanged_Original: DisplayPropertiesEventHandler = js.native
  /** Occurs when the StereoEnabled property changes because support for stereoscopic 3D changes. */
  @JSName("onstereoenabledchanged")
  var onstereoenabledchanged_Original: DisplayPropertiesEventHandler = js.native
  /** Gets the scale factor of the immersive environment. */
  var resolutionScale: ResolutionScale = js.native
  /** Gets a value that indicates whether the device supports stereoscopic 3D. */
  var stereoEnabled: Boolean = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_colorprofilechanged(`type`: colorprofilechanged, listener: DisplayPropertiesEventHandler): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_displaycontentsinvalidated(`type`: displaycontentsinvalidated, listener: DisplayPropertiesEventHandler): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_logicaldpichanged(`type`: logicaldpichanged, listener: DisplayPropertiesEventHandler): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_orientationchanged(`type`: orientationchanged, listener: DisplayPropertiesEventHandler): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stereoenabledchanged(`type`: stereoenabledchanged, listener: DisplayPropertiesEventHandler): Unit = js.native
  /**
    * Asynchronously gets the default International Color Consortium (ICC) color profile that is associated with the physical display.
    * @return Object that manages the asynchronous retrieval of the color profile.
    */
  def getColorProfileAsync(): IPromiseWithIAsyncOperation[IRandomAccessStream] = js.native
  /** Occurs when the physical display's color profile changes. */
  def oncolorprofilechanged(ev: WinRTEvent[_]): Unit = js.native
  /** Occurs when the display requires redrawing. */
  def ondisplaycontentsinvalidated(ev: WinRTEvent[_]): Unit = js.native
  /** Occurs when the LogicalDpi property changes because the pixels per inch (PPI) of the display changes. */
  def onlogicaldpichanged(ev: WinRTEvent[_]): Unit = js.native
  /** Occurs when either the CurrentOrientation or NativeOrientation property changes because of a mode change or a monitor change. */
  def onorientationchanged(ev: WinRTEvent[_]): Unit = js.native
  /** Occurs when the StereoEnabled property changes because support for stereoscopic 3D changes. */
  def onstereoenabledchanged(ev: WinRTEvent[_]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_colorprofilechanged(`type`: colorprofilechanged, listener: DisplayPropertiesEventHandler): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_displaycontentsinvalidated(`type`: displaycontentsinvalidated, listener: DisplayPropertiesEventHandler): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_logicaldpichanged(`type`: logicaldpichanged, listener: DisplayPropertiesEventHandler): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_orientationchanged(`type`: orientationchanged, listener: DisplayPropertiesEventHandler): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stereoenabledchanged(`type`: stereoenabledchanged, listener: DisplayPropertiesEventHandler): Unit = js.native
}

