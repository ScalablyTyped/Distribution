package typings.winrtUwp.Windows.Media.Capture

import typings.winrtUwp.Windows.System.VirtualKey
import typings.winrtUwp.Windows.System.VirtualKeyModifiers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines alternate shortcut keys for app capture. */
@js.native
trait AppCaptureAlternateShortcutKeys extends js.Object {
  
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
  
  @scala.inline
  implicit class AppCaptureAlternateShortcutKeysOps[Self <: AppCaptureAlternateShortcutKeys] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSaveHistoricalVideoKey(value: VirtualKey): Self = this.set("saveHistoricalVideoKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveHistoricalVideoKeyModifiers(value: VirtualKeyModifiers): Self = this.set("saveHistoricalVideoKeyModifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTakeScreenshotKey(value: VirtualKey): Self = this.set("takeScreenshotKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTakeScreenshotKeyModifiers(value: VirtualKeyModifiers): Self = this.set("takeScreenshotKeyModifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleGameBarKey(value: VirtualKey): Self = this.set("toggleGameBarKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleGameBarKeyModifiers(value: VirtualKeyModifiers): Self = this.set("toggleGameBarKeyModifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleMicrophoneCaptureKey(value: js.Any): Self = this.set("toggleMicrophoneCaptureKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleMicrophoneCaptureKeyModifiers(value: js.Any): Self = this.set("toggleMicrophoneCaptureKeyModifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleRecordingIndicatorKey(value: VirtualKey): Self = this.set("toggleRecordingIndicatorKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleRecordingIndicatorKeyModifiers(value: VirtualKeyModifiers): Self = this.set("toggleRecordingIndicatorKeyModifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleRecordingKey(value: VirtualKey): Self = this.set("toggleRecordingKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleRecordingKeyModifiers(value: VirtualKeyModifiers): Self = this.set("toggleRecordingKeyModifiers", value.asInstanceOf[js.Any])
  }
}
