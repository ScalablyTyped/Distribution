package typings.winrtUwp.Windows.Media.Capture

import typings.winrtUwp.Windows.System.VirtualKey
import typings.winrtUwp.Windows.System.VirtualKeyModifiers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines alternate shortcut keys for app capture. */
trait AppCaptureAlternateShortcutKeys extends js.Object {
  /** Gets or sets the save historical video shortcut key. */
  var saveHistoricalVideoKey: VirtualKey
  /** Gets or sets the save historical video shortcut key modifiers. */
  var saveHistoricalVideoKeyModifiers: VirtualKeyModifiers
  /** Gets or sets the take screenshot shortcut key. */
  var takeScreenshotKey: VirtualKey
  /** Gets or sets the take screenshot shortcut key modifiers. */
  var takeScreenshotKeyModifiers: VirtualKeyModifiers
  /** Gets or sets the toggle game bar shortcut key. */
  var toggleGameBarKey: VirtualKey
  /** Gets or sets the toggle game bar shortcut key modifiers. */
  var toggleGameBarKeyModifiers: VirtualKeyModifiers
  var toggleMicrophoneCaptureKey: js.Any
   /* unmapped type */ var toggleMicrophoneCaptureKeyModifiers: js.Any
   /* unmapped type */ /** Gets or sets the toggle recording indicator shortcut key. */
  var toggleRecordingIndicatorKey: VirtualKey
  /** Gets or sets the toggle recording indicator shortcut key modifiers. */
  var toggleRecordingIndicatorKeyModifiers: VirtualKeyModifiers
  /** Gets or sets the toggle recording shortcut key. */
  var toggleRecordingKey: VirtualKey
  /** Gets or sets the toggle recording shortcut key modifiers. */
  var toggleRecordingKeyModifiers: VirtualKeyModifiers
}

object AppCaptureAlternateShortcutKeys {
  @scala.inline
  def apply(
    saveHistoricalVideoKey: VirtualKey,
    saveHistoricalVideoKeyModifiers: VirtualKeyModifiers,
    takeScreenshotKey: VirtualKey,
    takeScreenshotKeyModifiers: VirtualKeyModifiers,
    toggleGameBarKey: VirtualKey,
    toggleGameBarKeyModifiers: VirtualKeyModifiers,
    toggleMicrophoneCaptureKey: js.Any,
    toggleMicrophoneCaptureKeyModifiers: js.Any,
    toggleRecordingIndicatorKey: VirtualKey,
    toggleRecordingIndicatorKeyModifiers: VirtualKeyModifiers,
    toggleRecordingKey: VirtualKey,
    toggleRecordingKeyModifiers: VirtualKeyModifiers
  ): AppCaptureAlternateShortcutKeys = {
    val __obj = js.Dynamic.literal(saveHistoricalVideoKey = saveHistoricalVideoKey.asInstanceOf[js.Any], saveHistoricalVideoKeyModifiers = saveHistoricalVideoKeyModifiers.asInstanceOf[js.Any], takeScreenshotKey = takeScreenshotKey.asInstanceOf[js.Any], takeScreenshotKeyModifiers = takeScreenshotKeyModifiers.asInstanceOf[js.Any], toggleGameBarKey = toggleGameBarKey.asInstanceOf[js.Any], toggleGameBarKeyModifiers = toggleGameBarKeyModifiers.asInstanceOf[js.Any], toggleMicrophoneCaptureKey = toggleMicrophoneCaptureKey.asInstanceOf[js.Any], toggleMicrophoneCaptureKeyModifiers = toggleMicrophoneCaptureKeyModifiers.asInstanceOf[js.Any], toggleRecordingIndicatorKey = toggleRecordingIndicatorKey.asInstanceOf[js.Any], toggleRecordingIndicatorKeyModifiers = toggleRecordingIndicatorKeyModifiers.asInstanceOf[js.Any], toggleRecordingKey = toggleRecordingKey.asInstanceOf[js.Any], toggleRecordingKeyModifiers = toggleRecordingKeyModifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppCaptureAlternateShortcutKeys]
  }
}

