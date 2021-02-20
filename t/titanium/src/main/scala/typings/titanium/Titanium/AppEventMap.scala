package typings.titanium.Titanium

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppEventMap extends ProxyEventMap {
  
  var accessibilitychanged: AppAccessibilitychangedEvent = js.native
  
  var close: AppCloseEvent = js.native
  
  var keyboardframechanged: AppKeyboardframechangedEvent = js.native
  
  var memorywarning: AppMemorywarningEvent = js.native
  
  var pause: AppPauseEvent = js.native
  
  var paused: AppPausedEvent = js.native
  
  var proximity: AppProximityEvent = js.native
  
  var resume: AppResumeEvent = js.native
  
  var resumed: AppResumedEvent = js.native
  
  var shortcutitemclick: AppShortcutitemclickEvent = js.native
  
  var significanttimechange: AppSignificanttimechangeEvent = js.native
  
  var started: AppStartedEvent = js.native
  
  var uncaughtException: AppUncaughtExceptionEvent = js.native
  
  var userinteraction: AppUserinteractionEvent = js.native
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
  
  @scala.inline
  implicit class AppEventMapMutableBuilder[Self <: AppEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibilitychanged(value: AppAccessibilitychangedEvent): Self = StObject.set(x, "accessibilitychanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClose(value: AppCloseEvent): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardframechanged(value: AppKeyboardframechangedEvent): Self = StObject.set(x, "keyboardframechanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemorywarning(value: AppMemorywarningEvent): Self = StObject.set(x, "memorywarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPause(value: AppPauseEvent): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaused(value: AppPausedEvent): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProximity(value: AppProximityEvent): Self = StObject.set(x, "proximity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResume(value: AppResumeEvent): Self = StObject.set(x, "resume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResumed(value: AppResumedEvent): Self = StObject.set(x, "resumed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortcutitemclick(value: AppShortcutitemclickEvent): Self = StObject.set(x, "shortcutitemclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignificanttimechange(value: AppSignificanttimechangeEvent): Self = StObject.set(x, "significanttimechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStarted(value: AppStartedEvent): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUncaughtException(value: AppUncaughtExceptionEvent): Self = StObject.set(x, "uncaughtException", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserinteraction(value: AppUserinteractionEvent): Self = StObject.set(x, "userinteraction", value.asInstanceOf[js.Any])
  }
}
