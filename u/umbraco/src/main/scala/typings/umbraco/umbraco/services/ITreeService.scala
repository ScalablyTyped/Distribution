package typings.umbraco.umbraco.services

import typings.angular.angularMod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.services.treeService
  * @function
  *
  * @description
  * The tree service factory, used internally by the umbTree and umbTreeItem directives
  */
@js.native
trait ITreeService extends js.Object {
  /**
    * @ngdoc method
    * @name umbraco.services.treeService#clearCache
    * @methodOf umbraco.services.treeService
    * @function
    *
    * @description
    * Clears the tree cache - with optional cacheKey, optional section or optional filter.
    *
    * @param {Object} args arguments
    * @param {String} args.cacheKey optional cachekey - this is used to clear specific trees in dialogs
    * @param {String} args.section optional section alias - clear tree for a given section
    * @param {String} args.childrenOf optional parent ID - only clear the cache below a specific node
    */
  def clearCache(): Unit = js.native
  def clearCache(args: ICacheArgs): Unit = js.native
  /**
    * @ngdoc method
    * @name umbraco.services.treeService#getChildNode
    * @methodOf umbraco.services.treeService
    * @function
    *
    * @description
    * Gets a child node with a given ID, from a specific treeNode
    * @param {object} treeNode to retrive child node from
    * @param {int} id id of child node
    */
  def getChildNode(treeNode: js.Object, id: Double): js.Any = js.native
  /**
    * @ngdoc method
    * @name umbraco.services.treeService#getChildren
    * @methodOf umbraco.services.treeService
    * @function
    *
    * @description
    * Gets the children from the server for a given node
    * @param {object} args Arguments
    * @param {object} args.node tree node object to retrieve the children for
    * @param {string} args.section current section alias
    */
  def getChildren(args: js.Any*): js.Any = js.native
  /**
    * @ngdoc method
    * @name umbraco.services.treeService#getDescendantNode
    * @methodOf umbraco.services.treeService
    * @function
    *
    * @description
    * Gets a descendant node by id
    * @param {object} treeNode to retrive descendant node from
    * @param {int} id id of descendant node
    * @param {string} treeAlias - optional tree alias, if fetching descendant node from a child of a listview document
    */
  def getDescendantNode(treeNode: js.Object, id: Double, treeAlias: String): js.Any = js.native
  /**
    * @ngdoc method
    * @name umbraco.services.treeService#getMenu
    * @methodOf umbraco.services.treeService
    * @function
    *
    * @description
    * Returns available menu actions for a given tree node
    * @param {object} args Arguments
    * @param {string} args.treeNode tree node object to retrieve the menu for
    */
  def getMenu(args: js.Any*): js.Any = js.native
  /**
    * @ngdoc method
    * @name umbraco.services.treeService#getPath
    * @methodOf umbraco.services.treeService
    * @function
    *
    * @description
    * This will return the current node's path by walking up the tree
    * @param {object} node Tree node to retrieve path for
    */
  def getPath(node: js.Object): String = js.native
  /**
    * @ngdoc method
    * @name umbraco.services.treeService#getTree
    * @methodOf umbraco.services.treeService
    * @function
    *
    * @description
    * gets the tree, returns a promise
    * @param {object} args Arguments
    * @param {string} args.section Section alias
    * @param {string} args.cacheKey Optional cachekey
    */
  def getTree(args: ITreeArgs): IPromise[_] = js.native
  /**
    * @ngdoc method
    * @name umbraco.services.treeService#getTreeAlias
    * @methodOf umbraco.services.treeService
    * @function
    *
    * @description
    * Gets the node's tree alias, this is done by looking up the meta-data of the current node's root node
    * @param {object} treeNode to retrive tree alias from
    */
  def getTreeAlias(treeNode: js.Object): String = js.native
  /**
    * @ngdoc method
    * @name umbraco.services.treeService#getTreePackageFolder
    * @methodOf umbraco.services.treeService
    * @function
    *
    * @description
    * Determines if the current tree is a plugin tree and if so returns the package folder it has declared
    * so we know where to find it's views, otherwise it will just return undefined.
    *
    * @param {String} treeAlias The tree alias to check
    */
  def getTreePackageFolder(treeAlias: String): IPackageFolder = js.native
  /**
    * @ngdoc method
    * @name umbraco.services.treeService#getTreeRoot
    * @methodOf umbraco.services.treeService
    * @function
    *
    * @description
    * Gets the root node of the current tree type for a given tree node
    * @param {object} treeNode to retrive tree root node from
    */
  def getTreeRoot(treeNode: js.Object): js.Any = js.native
  /**
    * @ngdoc method
    * @name umbraco.services.treeService#loadNodeChildren
    * @methodOf umbraco.services.treeService
    * @function
    *
    * @description
    * Clears all node children, gets it's up-to-date children from the server and re-assigns them and then
    * returns them in a promise.
    * @param {object} args An arguments object
    * @param {object} args.node The tree node
    * @param {object} args.section The current section
    */
  def loadNodeChildren(args: INodeArgs): IPromise[_] = js.native
  /**
    * @ngdoc method
    * @name umbraco.services.treeService#reloadNode
    * @methodOf umbraco.services.treeService
    * @function
    *
    * @description
    * Re-loads the single node from the server
    * @param {object} node Tree node to reload
    */
  def reloadNode(node: js.Object): Unit = js.native
  /**
    * @ngdoc method
    * @name umbraco.services.treeService#removeChildNodes
    * @methodOf umbraco.services.treeService
    * @function
    *
    * @description
    * Removes all child nodes from a given tree node
    * @param {object} treeNode the node to remove children from
    */
  def removeChildNodes(treeNode: js.Object): Unit = js.native
  /**
    * @ngdoc method
    * @name umbraco.services.treeService#removeNode
    * @methodOf umbraco.services.treeService
    * @function
    *
    * @description
    * Removes a given node from the tree
    * @param {object} treeNode the node to remove
    */
  def removeNode(treeNode: js.Object): Unit = js.native
}

