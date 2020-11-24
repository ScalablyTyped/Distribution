package typings.umbraco.umbraco.services

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait INavigationService extends js.Object {
  
  /**
    Internal method that should ONLY be used by the legacy API wrapper, the legacy API used to
    have to set an active tree and then sync, the new API does this in one method by using syncTreePath
    */
  def _setActiveTreeType(treeAlias: String, loadChildren: Boolean): Unit = js.native
  
  /**
    Internal method that should ONLY be used by the legacy API wrapper, the legacy API used to
    have to set an active tree and then sync, the new API does this in one method by using syncTree
    */
  def _syncPath(path: js.Array[String], forceReload: Boolean): Unit = js.native
  
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
  def changeSection(sectionAlias: String, force: Boolean): Unit = js.native
  
  /** Executes a given menu action */
  def executeMenuAction(action: js.Any, node: js.Any, section: js.Any): Unit = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.services.navigationService#hideDialog
    * @methodOf umbraco.services.navigationService
    *
    * @description
    * hides the currently open dialog
    */
  def hideDialog(showMenu: Boolean): Unit = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.services.navigationService#hideMenu
    * @methodOf umbraco.services.navigationService
    *
    * @description
    * Hides the menu by hiding the containing dom element
    */
  def hideMenu(): Unit = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.services.navigationService#hideNavigation
    * @methodOf umbraco.services.navigationService
    *
    * @description
    * hides any open navigation panes and resets the tree, actions and the currently selected node
    */
  def hideNavigation(): Unit = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.services.navigationService#hideSearch
    * @methodOf umbraco.services.navigationService
    *
    * @description
    * hides the search pane
    */
  def hideSearch(): Unit = js.native
  
  def hideTray(): Unit = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.services.navigationService#hideTree
    * @methodOf umbraco.services.navigationService
    *
    * @description
    * Hides the tree by hiding the containing dom element
    */
  def hideTree(): Unit = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.services.navigationService#load
    * @methodOf umbraco.services.navigationService
    *
    * @description
    * Shows the legacy iframe and loads in the content based on the source url
    * @param {String} source The URL to load into the iframe
    */
  def loadLegacyIFrame(source: String): Unit = js.native
  
  //TODO: This should return a promise
  def reloadNode(node: js.Any): Unit = js.native
  
  //TODO: This should return a promise
  def reloadSection(sectionAlias: String): Unit = js.native
  
  /**
    Called to assign the main tree event handler - this is called by the navigation controller.
    TODO: Potentially another dev could call this which would kind of mung the whole app so potentially there's a better way.
    */
  def setupTreeEvents(treeEventHandler: js.Any): Unit = js.native
  
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
  def showDialog(args: IShowDialogArgs): Unit = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.services.navigationService#showUserDialog
    * @methodOf umbraco.services.navigationService
    *
    * @description
    * Opens the user dialog, next to the sections navigation
    * template is located in views/common/dialogs/user.html
    */
  def showHelpDialog(): Unit = js.native
  
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
  def showMenu(event: Event, args: js.Any*): Unit = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.services.navigationService#showSearch
    * @methodOf umbraco.services.navigationService
    *
    * @description
    * shows the search pane
    */
  def showSearch(): Unit = js.native
  
  def showTray(): Unit = js.native
  
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
  def showTree(sectionAlias: String, syncArgs: ISyncTreeArgs): Unit = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.services.navigationService#showUserDialog
    * @methodOf umbraco.services.navigationService
    *
    * @description
    * Opens the user dialog, next to the sections navigation
    * template is located in views/common/dialogs/user.html
    */
  def showUserDialog(): Unit = js.native
  
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
  def syncTree(args: ISyncTreeArgs): js.Any = js.native
}
object INavigationService {
  
  @scala.inline
  def apply(
    _setActiveTreeType: (String, Boolean) => Unit,
    _syncPath: (js.Array[String], Boolean) => Unit,
    changeSection: (String, Boolean) => Unit,
    executeMenuAction: (js.Any, js.Any, js.Any) => Unit,
    hideDialog: Boolean => Unit,
    hideMenu: () => Unit,
    hideNavigation: () => Unit,
    hideSearch: () => Unit,
    hideTray: () => Unit,
    hideTree: () => Unit,
    loadLegacyIFrame: String => Unit,
    reloadNode: js.Any => Unit,
    reloadSection: String => Unit,
    setupTreeEvents: js.Any => Unit,
    showDialog: IShowDialogArgs => Unit,
    showHelpDialog: () => Unit,
    showMenu: (Event, /* repeated */ js.Any) => Unit,
    showSearch: () => Unit,
    showTray: () => Unit,
    showTree: (String, ISyncTreeArgs) => Unit,
    showUserDialog: () => Unit,
    syncTree: ISyncTreeArgs => js.Any
  ): INavigationService = {
    val __obj = js.Dynamic.literal(_setActiveTreeType = js.Any.fromFunction2(_setActiveTreeType), _syncPath = js.Any.fromFunction2(_syncPath), changeSection = js.Any.fromFunction2(changeSection), executeMenuAction = js.Any.fromFunction3(executeMenuAction), hideDialog = js.Any.fromFunction1(hideDialog), hideMenu = js.Any.fromFunction0(hideMenu), hideNavigation = js.Any.fromFunction0(hideNavigation), hideSearch = js.Any.fromFunction0(hideSearch), hideTray = js.Any.fromFunction0(hideTray), hideTree = js.Any.fromFunction0(hideTree), loadLegacyIFrame = js.Any.fromFunction1(loadLegacyIFrame), reloadNode = js.Any.fromFunction1(reloadNode), reloadSection = js.Any.fromFunction1(reloadSection), setupTreeEvents = js.Any.fromFunction1(setupTreeEvents), showDialog = js.Any.fromFunction1(showDialog), showHelpDialog = js.Any.fromFunction0(showHelpDialog), showMenu = js.Any.fromFunction2(showMenu), showSearch = js.Any.fromFunction0(showSearch), showTray = js.Any.fromFunction0(showTray), showTree = js.Any.fromFunction2(showTree), showUserDialog = js.Any.fromFunction0(showUserDialog), syncTree = js.Any.fromFunction1(syncTree))
    __obj.asInstanceOf[INavigationService]
  }
  
  @scala.inline
  implicit class INavigationServiceOps[Self <: INavigationService] (val x: Self) extends AnyVal {
    
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
    def set_setActiveTreeType(value: (String, Boolean) => Unit): Self = this.set("_setActiveTreeType", js.Any.fromFunction2(value))
    
    @scala.inline
    def set_syncPath(value: (js.Array[String], Boolean) => Unit): Self = this.set("_syncPath", js.Any.fromFunction2(value))
    
    @scala.inline
    def setChangeSection(value: (String, Boolean) => Unit): Self = this.set("changeSection", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExecuteMenuAction(value: (js.Any, js.Any, js.Any) => Unit): Self = this.set("executeMenuAction", js.Any.fromFunction3(value))
    
    @scala.inline
    def setHideDialog(value: Boolean => Unit): Self = this.set("hideDialog", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHideMenu(value: () => Unit): Self = this.set("hideMenu", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHideNavigation(value: () => Unit): Self = this.set("hideNavigation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHideSearch(value: () => Unit): Self = this.set("hideSearch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHideTray(value: () => Unit): Self = this.set("hideTray", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHideTree(value: () => Unit): Self = this.set("hideTree", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLoadLegacyIFrame(value: String => Unit): Self = this.set("loadLegacyIFrame", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReloadNode(value: js.Any => Unit): Self = this.set("reloadNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReloadSection(value: String => Unit): Self = this.set("reloadSection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetupTreeEvents(value: js.Any => Unit): Self = this.set("setupTreeEvents", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowDialog(value: IShowDialogArgs => Unit): Self = this.set("showDialog", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowHelpDialog(value: () => Unit): Self = this.set("showHelpDialog", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowMenu(value: (Event, /* repeated */ js.Any) => Unit): Self = this.set("showMenu", js.Any.fromFunction2(value))
    
    @scala.inline
    def setShowSearch(value: () => Unit): Self = this.set("showSearch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowTray(value: () => Unit): Self = this.set("showTray", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowTree(value: (String, ISyncTreeArgs) => Unit): Self = this.set("showTree", js.Any.fromFunction2(value))
    
    @scala.inline
    def setShowUserDialog(value: () => Unit): Self = this.set("showUserDialog", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSyncTree(value: ISyncTreeArgs => js.Any): Self = this.set("syncTree", js.Any.fromFunction1(value))
  }
}
