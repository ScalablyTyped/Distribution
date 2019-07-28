package typings.umbraco.umbracoNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.resources.treeResource
  * @description Loads in data for trees
  **/
trait ITreeResource extends js.Object {
  /** Loads in the data to display the nodes for an application */
  def loadApplication(options: js.Any): Unit
  /** Loads in the data to display the nodes menu */
  def loadMenu(node: js.Any): Unit
  /** Loads in the data to display the child nodes for a given node */
  def loadNodes(options: js.Any): Unit
}

object ITreeResource {
  @scala.inline
  def apply(loadApplication: js.Any => Unit, loadMenu: js.Any => Unit, loadNodes: js.Any => Unit): ITreeResource = {
    val __obj = js.Dynamic.literal(loadApplication = js.Any.fromFunction1(loadApplication), loadMenu = js.Any.fromFunction1(loadMenu), loadNodes = js.Any.fromFunction1(loadNodes))
  
    __obj.asInstanceOf[ITreeResource]
  }
}

