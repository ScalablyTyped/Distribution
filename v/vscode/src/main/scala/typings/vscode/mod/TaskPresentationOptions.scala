package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskPresentationOptions extends StObject {
  
  /**
    * Controls whether the terminal is cleared before executing the task.
    */
  var clear: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Controls whether the command associated with the task is echoed
    * in the user interface.
    */
  var echo: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Controls whether the panel showing the task output is taking focus.
    */
  var focus: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Controls if the task panel is used for this task only (dedicated),
    * shared between tasks (shared) or if a new panel is created on
    * every task execution (new). Defaults to `TaskInstanceKind.Shared`
    */
  var panel: js.UndefOr[TaskPanelKind] = js.undefined
  
  /**
    * Controls whether the task output is reveal in the user interface.
    * Defaults to `RevealKind.Always`.
    */
  var reveal: js.UndefOr[TaskRevealKind] = js.undefined
  
  /**
    * Controls whether to show the "Terminal will be reused by tasks, press any key to close it" message.
    */
  var showReuseMessage: js.UndefOr[Boolean] = js.undefined
}
object TaskPresentationOptions {
  
  inline def apply(): TaskPresentationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskPresentationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TaskPresentationOptions] (val x: Self) extends AnyVal {
    
    inline def setClear(value: Boolean): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
    
    inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
    
    inline def setEcho(value: Boolean): Self = StObject.set(x, "echo", value.asInstanceOf[js.Any])
    
    inline def setEchoUndefined: Self = StObject.set(x, "echo", js.undefined)
    
    inline def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    inline def setPanel(value: TaskPanelKind): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
    
    inline def setPanelUndefined: Self = StObject.set(x, "panel", js.undefined)
    
    inline def setReveal(value: TaskRevealKind): Self = StObject.set(x, "reveal", value.asInstanceOf[js.Any])
    
    inline def setRevealUndefined: Self = StObject.set(x, "reveal", js.undefined)
    
    inline def setShowReuseMessage(value: Boolean): Self = StObject.set(x, "showReuseMessage", value.asInstanceOf[js.Any])
    
    inline def setShowReuseMessageUndefined: Self = StObject.set(x, "showReuseMessage", js.undefined)
  }
}
