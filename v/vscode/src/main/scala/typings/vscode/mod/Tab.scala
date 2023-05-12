package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tab extends StObject {
  
  /**
  		 * The group which the tab belongs to.
  		 */
  val group: TabGroup
  
  /**
  		 * Defines the structure of the tab i.e. text, notebook, custom, etc.
  		 * Resource and other useful properties are defined on the tab kind.
  		 */
  val input: TabInputText | TabInputTextDiff | TabInputCustom | TabInputWebview | TabInputNotebook | TabInputNotebookDiff | TabInputTerminal | Any
  
  /**
  		 * Whether or not the tab is currently active.
  		 * This is dictated by being the selected tab in the group.
  		 */
  val isActive: Boolean
  
  /**
  		 * Whether or not the dirty indicator is present on the tab.
  		 */
  val isDirty: Boolean
  
  /**
  		 * Whether or not the tab is pinned (pin icon is present).
  		 */
  val isPinned: Boolean
  
  /**
  		 * Whether or not the tab is in preview mode.
  		 */
  val isPreview: Boolean
  
  /**
  		 * The text displayed on the tab.
  		 */
  val label: String
}
object Tab {
  
  inline def apply(
    group: TabGroup,
    input: TabInputText | TabInputTextDiff | TabInputCustom | TabInputWebview | TabInputNotebook | TabInputNotebookDiff | TabInputTerminal | Any,
    isActive: Boolean,
    isDirty: Boolean,
    isPinned: Boolean,
    isPreview: Boolean,
    label: String
  ): Tab = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isDirty = isDirty.asInstanceOf[js.Any], isPinned = isPinned.asInstanceOf[js.Any], isPreview = isPreview.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tab]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Tab] (val x: Self) extends AnyVal {
    
    inline def setGroup(value: TabGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setInput(
      value: TabInputText | TabInputTextDiff | TabInputCustom | TabInputWebview | TabInputNotebook | TabInputNotebookDiff | TabInputTerminal | Any
    ): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setIsDirty(value: Boolean): Self = StObject.set(x, "isDirty", value.asInstanceOf[js.Any])
    
    inline def setIsPinned(value: Boolean): Self = StObject.set(x, "isPinned", value.asInstanceOf[js.Any])
    
    inline def setIsPreview(value: Boolean): Self = StObject.set(x, "isPreview", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
