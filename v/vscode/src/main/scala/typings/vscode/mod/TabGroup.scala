package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabGroup extends StObject {
  
  /**
    * The active {@link Tab tab} in the group. This is the tab whose contents are currently
    * being rendered.
    *
    * *Note* that there can be one active tab per group but there can only be one {@link TabGroups.activeTabGroup active group}.
    */
  val activeTab: js.UndefOr[Tab] = js.undefined
  
  /**
    * Whether or not the group is currently active.
    *
    * *Note* that only one tab group is active at a time, but that multiple tab
    * groups can have an {@link TabGroup.aciveTab active tab}.
    *
    * @see {@link Tab.isActive}
    */
  val isActive: Boolean
  
  /**
    * The list of tabs contained within the group.
    * This can be empty if the group has no tabs open.
    */
  val tabs: js.Array[Tab]
  
  /**
    * The view column of the group.
    */
  val viewColumn: ViewColumn
}
object TabGroup {
  
  inline def apply(isActive: Boolean, tabs: js.Array[Tab], viewColumn: ViewColumn): TabGroup = {
    val __obj = js.Dynamic.literal(isActive = isActive.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any], viewColumn = viewColumn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TabGroup] (val x: Self) extends AnyVal {
    
    inline def setActiveTab(value: Tab): Self = StObject.set(x, "activeTab", value.asInstanceOf[js.Any])
    
    inline def setActiveTabUndefined: Self = StObject.set(x, "activeTab", js.undefined)
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setTabs(value: js.Array[Tab]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
    
    inline def setTabsVarargs(value: Tab*): Self = StObject.set(x, "tabs", js.Array(value*))
    
    inline def setViewColumn(value: ViewColumn): Self = StObject.set(x, "viewColumn", value.asInstanceOf[js.Any])
  }
}
