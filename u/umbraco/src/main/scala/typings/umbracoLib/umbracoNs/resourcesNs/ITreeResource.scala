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

