package typings
package umbracoLib.umbracoNs.servicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.services.navigationService
  *
  * @requires $rootScope
  * @requires $routeParams
  * @requires $log
  * @requires $location
  * @requires dialogService
  * @requires treeService
  * @requires sectionResource
  *
  * @description
  * Service to handle the main application navigation. Responsible for invoking the tree
  * Section navigation and search, and maintain their state for the entire application lifetime
  *
  */
trait INavigationService extends js.Object {
  /**
    Internal method that should ONLY be used by the legacy API wrapper, the legacy API used to
    have to set an active tree and then sync, the new API does this in one method by using syncTreePath
    */
  def _setActiveTreeType(treeAlias: java.lang.String, loadChildren: scala.Boolean): scala.Unit
  /**
    Internal method that should ONLY be used by the legacy API wrapper, the legacy API used to
    have to set an active tree and then sync, the new API does this in one method by using syncTree
    */
  def _syncPath(path: js.Array[java.lang.String], forceReload: scala.Boolean): scala.Unit
  /**
    * @ngdoc method
    * @name umbraco.services.navigationService#changeSection
    * @methodOf umbraco.services.navigationService
    *
    * @description
    * Changes the active section to a given section alias
    * If the navigation is 'sticky' this will load the associated tree
    * and load the dashboard related to the section
    * @param {string} sectionAlias The alias of the section
    */
  def changeSection(sectionAlias: java.lang.String, force: scala.Boolean): scala.Unit
  /** Executes a given menu action */
  def executeMenuAction(action: js.Any, node: js.Any, section: js.Any): scala.Unit
  /**
    * @ngdoc method
    * @name umbraco.services.navigationService#hideDialog
    * @methodOf umbraco.services.navigationService
    *
    * @description
    * hides the currently open dialog
    */
  def hideDialog(showMenu: scala.Boolean): scala.Unit
  /**
    * @ngdoc method
    * @name umbraco.services.navigationService#hideMenu
    * @methodOf umbraco.services.navigationService
    *
    * @description
    * Hides the menu by hiding the containing dom element
    */
  def hideMenu(): scala.Unit
  /**
    * @ngdoc method
    * @name umbraco.services.navigationService#hideNavigation
    * @methodOf umbraco.services.navigationService
    *
    * @description
    * hides any open navigation panes and resets the tree, actions and the currently selected node
    */
  def hideNavigation(): scala.Unit
  /**
    * @ngdoc method
    * @name umbraco.services.navigationService#hideSearch
    * @methodOf umbraco.services.navigationService
    *
    * @description
    * hides the search pane
    */
  def hideSearch(): scala.Unit
  def hideTray(): scala.Unit
  /**
    * @ngdoc method
    * @name umbraco.services.navigationService#hideTree
    * @methodOf umbraco.services.navigationService
    *
    * @description
    * Hides the tree by hiding the containing dom element
    */
  def hideTree(): scala.Unit
  /**
    * @ngdoc method
    * @name umbraco.services.navigationService#load
    * @methodOf umbraco.services.navigationService
    *
    * @description
    * Shows the legacy iframe and loads in the content based on the source url
    * @param {String} source The URL to load into the iframe
    */
  def loadLegacyIFrame(source: java.lang.String): scala.Unit
  //TODO: This should return a promise
  def reloadNode(node: js.Any): scala.Unit
  //TODO: This should return a promise
  def reloadSection(sectionAlias: java.lang.String): scala.Unit
  /**
    Called to assign the main tree event handler - this is called by the navigation controller.
    TODO: Potentially another dev could call this which would kind of mung the whole app so potentially there's a better way.
    */
  def setupTreeEvents(treeEventHandler: js.Any): scala.Unit
  /**
    * @ngdoc method
    * @name umbraco.services.navigationService#showDialog
    * @methodOf umbraco.services.navigationService
    *
    * @description
    * Opens a dialog, for a given action on a given tree node
    * uses the dialogService to inject the selected action dialog
    * into #dialog div.umb-panel-body
    * the path to the dialog view is determined by:
    * "views/" + current tree + "/" + action alias + ".html"
    * The dialog controller will get passed a scope object that is created here with the properties:
    *  scope.currentNode = the selected tree node
    *  scope.currentAction = the selected menu item
    *  so that the dialog controllers can use these properties
    *
    * @param {Object} args arguments passed to the function
    * @param {Scope} args.scope current scope passed to the dialog
    * @param {Object} args.action the clicked action containing `name` and `alias`
    */
  def showDialog(args: IShowDialogArgs): scala.Unit
  /**
    * @ngdoc method
    * @name umbraco.services.navigationService#showUserDialog
    * @methodOf umbraco.services.navigationService
    *
    * @description
    * Opens the user dialog, next to the sections navigation
    * template is located in views/common/dialogs/user.html
    */
  def showHelpDialog(): scala.Unit
  /**
    * @ngdoc method
    * @name umbraco.services.navigationService#showMenu
    * @methodOf umbraco.services.navigationService
    *
    * @description
    * Hides the tree by hiding the containing dom element.
    * This always returns a promise!
    *
    * @param {Event} event the click event triggering the method, passed from the DOM element
    */
  def showMenu(event: stdLib.Event, args: js.Any*): scala.Unit
  /**
    * @ngdoc method
    * @name umbraco.services.navigationService#showSearch
    * @methodOf umbraco.services.navigationService
    *
    * @description
    * shows the search pane
    */
  def showSearch(): scala.Unit
  def showTray(): scala.Unit
  /**
    * @ngdoc method
    * @name umbraco.services.navigationService#showTree
    * @methodOf umbraco.services.navigationService
    *
    * @description
    * Displays the tree for a given section alias but turning on the containing dom element
    * only changes if the section is different from the current one
    * @param {string} sectionAlias The alias of the section to load
    * @param {Object} syncArgs Optional object of arguments for syncing the tree for the section being shown
    */
  def showTree(sectionAlias: java.lang.String, syncArgs: ISyncTreeArgs): scala.Unit
  /**
    * @ngdoc method
    * @name umbraco.services.navigationService#showUserDialog
    * @methodOf umbraco.services.navigationService
    *
    * @description
    * Opens the user dialog, next to the sections navigation
    * template is located in views/common/dialogs/user.html
    */
  def showUserDialog(): scala.Unit
  /**
    * @ngdoc method
    * @name umbraco.services.navigationService#syncTree
    * @methodOf umbraco.services.navigationService
    *
    * @description
    * Syncs a tree with a given path, returns a promise
    * The path format is: ["itemId","itemId"], and so on
    * so to sync to a specific document type node do:
    * <pre>
    * navigationService.syncTree({tree: 'content', path: ["-1","123d"], forceReload: true});
    * </pre>
    * @param {Object} args arguments passed to the function
    * @param {String} args.tree the tree alias to sync to
    * @param {Array} args.path the path to sync the tree to
    * @param {Boolean} args.forceReload optional, specifies whether to force reload the node data from the server even if it already exists in the tree currently
    * @param {Boolean} args.activate optional, specifies whether to set the synced node to be the active node, this will default to true if not specified
    */
  def syncTree(args: ISyncTreeArgs): js.Any
}

object INavigationService {
  @scala.inline
  def apply(
    _setActiveTreeType: js.Function2[java.lang.String, scala.Boolean, scala.Unit],
    _syncPath: js.Function2[js.Array[java.lang.String], scala.Boolean, scala.Unit],
    changeSection: js.Function2[java.lang.String, scala.Boolean, scala.Unit],
    executeMenuAction: js.Function3[js.Any, js.Any, js.Any, scala.Unit],
    hideDialog: js.Function1[scala.Boolean, scala.Unit],
    hideMenu: js.Function0[scala.Unit],
    hideNavigation: js.Function0[scala.Unit],
    hideSearch: js.Function0[scala.Unit],
    hideTray: js.Function0[scala.Unit],
    hideTree: js.Function0[scala.Unit],
    loadLegacyIFrame: js.Function1[java.lang.String, scala.Unit],
    reloadNode: js.Function1[js.Any, scala.Unit],
    reloadSection: js.Function1[java.lang.String, scala.Unit],
    setupTreeEvents: js.Function1[js.Any, scala.Unit],
    showDialog: js.Function1[IShowDialogArgs, scala.Unit],
    showHelpDialog: js.Function0[scala.Unit],
    showMenu: js.Function2[stdLib.Event, /* repeated */ js.Any, scala.Unit],
    showSearch: js.Function0[scala.Unit],
    showTray: js.Function0[scala.Unit],
    showTree: js.Function2[java.lang.String, ISyncTreeArgs, scala.Unit],
    showUserDialog: js.Function0[scala.Unit],
    syncTree: js.Function1[ISyncTreeArgs, js.Any]
  ): INavigationService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_setActiveTreeType")(_setActiveTreeType)
    __obj.updateDynamic("_syncPath")(_syncPath)
    __obj.updateDynamic("changeSection")(changeSection)
    __obj.updateDynamic("executeMenuAction")(executeMenuAction)
    __obj.updateDynamic("hideDialog")(hideDialog)
    __obj.updateDynamic("hideMenu")(hideMenu)
    __obj.updateDynamic("hideNavigation")(hideNavigation)
    __obj.updateDynamic("hideSearch")(hideSearch)
    __obj.updateDynamic("hideTray")(hideTray)
    __obj.updateDynamic("hideTree")(hideTree)
    __obj.updateDynamic("loadLegacyIFrame")(loadLegacyIFrame)
    __obj.updateDynamic("reloadNode")(reloadNode)
    __obj.updateDynamic("reloadSection")(reloadSection)
    __obj.updateDynamic("setupTreeEvents")(setupTreeEvents)
    __obj.updateDynamic("showDialog")(showDialog)
    __obj.updateDynamic("showHelpDialog")(showHelpDialog)
    __obj.updateDynamic("showMenu")(showMenu)
    __obj.updateDynamic("showSearch")(showSearch)
    __obj.updateDynamic("showTray")(showTray)
    __obj.updateDynamic("showTree")(showTree)
    __obj.updateDynamic("showUserDialog")(showUserDialog)
    __obj.updateDynamic("syncTree")(syncTree)
    __obj.asInstanceOf[INavigationService]
  }
}

