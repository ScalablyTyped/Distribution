package typings
package umbracoLib.umbracoNs.resourcesNs

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
  def loadApplication(options: js.Any): scala.Unit
  /** Loads in the data to display the nodes menu */
  def loadMenu(node: js.Any): scala.Unit
  /** Loads in the data to display the child nodes for a given node */
  def loadNodes(options: js.Any): scala.Unit
}

object ITreeResource {
  @scala.inline
  def apply(
    loadApplication: js.Any => scala.Unit,
    loadMenu: js.Any => scala.Unit,
    loadNodes: js.Any => scala.Unit
  ): ITreeResource = {
    val __obj = js.Dynamic.literal(loadApplication = js.Any.fromFunction1(loadApplication), loadMenu = js.Any.fromFunction1(loadMenu), loadNodes = js.Any.fromFunction1(loadNodes))
  
    __obj.asInstanceOf[ITreeResource]
  }
}

