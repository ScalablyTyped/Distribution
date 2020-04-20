package typings.titanium.Titanium

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppEventMap extends ProxyEventMap {
  var accessibilitychanged: AppAccessibilitychangedEvent
  var close: AppCloseEvent
  var keyboardframechanged: AppKeyboardframechangedEvent
  var memorywarning: AppMemorywarningEvent
  var pause: AppPauseEvent
  var paused: AppPausedEvent
  var proximity: AppProximityEvent
  var resume: AppResumeEvent
  var resumed: AppResumedEvent
  var shortcutitemclick: AppShortcutitemclickEvent
  var significanttimechange: AppSignificanttimechangeEvent
  var started: AppStartedEvent
  var uncaughtException: AppUncaughtExceptionEvent
  var userinteraction: AppUserinteractionEvent
}

object AppEventMap {
  @scala.inline
  def apply(
    accessibilitychanged: AppAccessibilitychangedEvent,
    close: AppCloseEvent,
    keyboardframechanged: AppKeyboardframechangedEvent,
    memorywarning: AppMemorywarningEvent,
    pause: AppPauseEvent,
    paused: AppPausedEvent,
    proximity: AppProximityEvent,
    resume: AppResumeEvent,
    resumed: AppResumedEvent,
    shortcutitemclick: AppShortcutitemclickEvent,
    significanttimechange: AppSignificanttimechangeEvent,
    started: AppStartedEvent,
    uncaughtException: AppUncaughtExceptionEvent,
    userinteraction: AppUserinteractionEvent
  ): AppEventMap = {
    val __obj = js.Dynamic.literal(accessibilitychanged = accessibilitychanged.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], keyboardframechanged = keyboardframechanged.asInstanceOf[js.Any], memorywarning = memorywarning.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], proximity = proximity.asInstanceOf[js.Any], resume = resume.asInstanceOf[js.Any], resumed = resumed.asInstanceOf[js.Any], shortcutitemclick = shortcutitemclick.asInstanceOf[js.Any], significanttimechange = significanttimechange.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any], uncaughtException = uncaughtException.asInstanceOf[js.Any], userinteraction = userinteraction.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppEventMap]
  }
}

