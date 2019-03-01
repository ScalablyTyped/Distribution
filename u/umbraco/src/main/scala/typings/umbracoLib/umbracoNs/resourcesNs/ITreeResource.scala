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
    loadApplication: js.Function1[js.Any, scala.Unit],
    loadMenu: js.Function1[js.Any, scala.Unit],
    loadNodes: js.Function1[js.Any, scala.Unit]
  ): ITreeResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("loadApplication")(loadApplication)
    __obj.updateDynamic("loadMenu")(loadMenu)
    __obj.updateDynamic("loadNodes")(loadNodes)
    __obj.asInstanceOf[ITreeResource]
  }
}

