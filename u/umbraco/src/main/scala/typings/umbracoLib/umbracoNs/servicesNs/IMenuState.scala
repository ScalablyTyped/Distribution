package typings
package umbracoLib.umbracoNs.servicesNs

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
  var dialogTitle: java.lang.String
  //this list of menu items to display
  var menuActions: js.Any
  //Whether the context menu is being shown or not
  var showMenu: scala.Boolean
  //Whether the menu's dialog is being shown or not
  var showMenuDialog: scala.Boolean
}

