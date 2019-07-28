package typings.winrtDashUwp.WindowsNs.MediaNs.CaptureNs

import typings.winrtDashUwp.WindowsNs.SystemNs.VirtualKey
import typings.winrtDashUwp.WindowsNs.SystemNs.VirtualKeyModifiers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines alternate shortcut keys for app capture. */
@JSGlobal("Windows.Media.Capture.AppCaptureAlternateShortcutKeys")
@js.native
abstract class AppCaptureAlternateShortcutKeys () extends js.Object {
  /** Gets or sets the save historical video shortcut key. */
  var saveHistoricalVideoKey: VirtualKey = js.native
  /** Gets or sets the save historical video shortcut key modifiers. */
  var saveHistoricalVideoKeyModifiers: VirtualKeyModifiers = js.native
  /** Gets or sets the take screenshot shortcut key. */
  var takeScreenshotKey: VirtualKey = js.native
  /** Gets or sets the take screenshot shortcut key modifiers. */
  var takeScreenshotKeyModifiers: VirtualKeyModifiers = js.native
  /** Gets or sets the toggle game bar shortcut key. */
  var toggleGameBarKey: VirtualKey = js.native
  /** Gets or sets the toggle game bar shortcut key modifiers. */
  var toggleGameBarKeyModifiers: VirtualKeyModifiers = js.native
  var toggleMicrophoneCaptureKey: js.Any = js.native
   /* unmapped type */ var toggleMicrophoneCaptureKeyModifiers: js.Any = js.native
   /* unmapped type */ /** Gets or sets the toggle recording indicator shortcut key. */
  var toggleRecordingIndicatorKey: VirtualKey = js.native
  /** Gets or sets the toggle recording indicator shortcut key modifiers. */
  var toggleRecordingIndicatorKeyModifiers: VirtualKeyModifiers = js.native
  /** Gets or sets the toggle recording shortcut key. */
  var toggleRecordingKey: VirtualKey = js.native
  /** Gets or sets the toggle recording shortcut key modifiers. */
  var toggleRecordingKeyModifiers: VirtualKeyModifiers = js.native
}

