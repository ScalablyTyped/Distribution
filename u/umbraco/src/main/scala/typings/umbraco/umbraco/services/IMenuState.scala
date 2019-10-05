package typings.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Menu State
  */
trait IMenuState extends js.Object {
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
  @scala.inline
  def apply(
    currentNode: js.Any,
    dialogTitle: String,
    menuActions: js.Any,
    showMenu: Boolean,
    showMenuDialog: Boolean
  ): IMenuState = {
    val __obj = js.Dynamic.literal(currentNode = currentNode, dialogTitle = dialogTitle, menuActions = menuActions, showMenu = showMenu, showMenuDialog = showMenuDialog)
  
    __obj.asInstanceOf[IMenuState]
  }
}

