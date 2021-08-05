package typings.umbraco.umbraco.services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Menu State
  */
trait IMenuState extends StObject {
  
  //The tree node that the ctx menu is launched for
  var currentNode: js.Any
  
  //the title to display in the context menu dialog
  var dialogTitle: String
  
  //this list of menu items to display
  var menuActions: js.Any
  
  //Whether the context menu is being shown or not
  var showMenu: Boolean
  
  //Whether the menu's dialog is being shown or not
  var showMenuDialog: Boolean
}
object IMenuState {
  
  inline def apply(
    currentNode: js.Any,
    dialogTitle: String,
    menuActions: js.Any,
    showMenu: Boolean,
    showMenuDialog: Boolean
  ): IMenuState = {
    val __obj = js.Dynamic.literal(currentNode = currentNode.asInstanceOf[js.Any], dialogTitle = dialogTitle.asInstanceOf[js.Any], menuActions = menuActions.asInstanceOf[js.Any], showMenu = showMenu.asInstanceOf[js.Any], showMenuDialog = showMenuDialog.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMenuState]
  }
  
  extension [Self <: IMenuState](x: Self) {
    
    inline def setCurrentNode(value: js.Any): Self = StObject.set(x, "currentNode", value.asInstanceOf[js.Any])
    
    inline def setDialogTitle(value: String): Self = StObject.set(x, "dialogTitle", value.asInstanceOf[js.Any])
    
    inline def setMenuActions(value: js.Any): Self = StObject.set(x, "menuActions", value.asInstanceOf[js.Any])
    
    inline def setShowMenu(value: Boolean): Self = StObject.set(x, "showMenu", value.asInstanceOf[js.Any])
    
    inline def setShowMenuDialog(value: Boolean): Self = StObject.set(x, "showMenuDialog", value.asInstanceOf[js.Any])
  }
}
