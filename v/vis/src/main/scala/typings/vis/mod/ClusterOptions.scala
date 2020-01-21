package typings.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterOptions extends js.Object {
  /**
    * Optional.
    * This is an object containing the options for the edges connected to the cluster.
    * All options described in the edges module are allowed.
    * Using this, you can style the edges connecting to the cluster any way you want.
    * If none are provided, the options from the edges that are replaced are used.
    * If undefined, default edge options will be used.
    */
  var clusterEdgeProperties: js.UndefOr[EdgeOptions] = js.undefined
  /**
    * Optional.
    * This is an object containing the options for the cluster node.
    * All options described in the nodes module are allowed.
    * This allows you to style your cluster node any way you want.
    * This is also the style object that is provided in the processProperties function for fine tuning.
    * If undefined, default node options will be used.
    */
  var clusterNodeProperties: js.UndefOr[NodeOptions] = js.undefined
  /**
    * Optional for all but the cluster method.
    * The cluster module loops over all nodes that are selected to be in the cluster
    * and calls this function with their data as argument. If this function returns true,
    * this node will be added to the cluster. You have access to all options (including the default)
    * as well as any custom fields you may have added to the node to determine whether or not to include it in the cluster.
    */
  var joinCondition: js.UndefOr[js.Function1[/* nodeOptions */ js.Any, Boolean]] = js.undefined
  /**
    * Optional.
    * Before creating the new cluster node, this (optional) function will be called with the properties
    * supplied by you (clusterNodeProperties), all contained nodes and all contained edges.
    * You can use this to update the properties of the cluster based on which items it contains.
    * The function should return the properties to create the cluster node.
    */
  var processProperties: js.UndefOr[
    js.Function3[
      /* clusterOptions */ js.Any, 
      /* childNodesOptions */ js.Array[_], 
      /* childEdgesOptions */ js.Array[_], 
      _
    ]
  ] = js.undefined
}

object ClusterOptions {
  @scala.inline
  def apply(
    clusterEdgeProperties: EdgeOptions = null,
    clusterNodeProperties: NodeOptions = null,
    joinCondition: /* nodeOptions */ js.Any => Boolean = null,
    processProperties: (/* clusterOptions */ js.Any, /* childNodesOptions */ js.Array[_], /* childEdgesOptions */ js.Array[_]) => _ = null
  ): ClusterOptions = {
    val __obj = js.Dynamic.literal()
    if (clusterEdgeProperties != null) __obj.updateDynamic("clusterEdgeProperties")(clusterEdgeProperties.asInstanceOf[js.Any])
    if (clusterNodeProperties != null) __obj.updateDynamic("clusterNodeProperties")(clusterNodeProperties.asInstanceOf[js.Any])
    if (joinCondition != null) __obj.updateDynamic("joinCondition")(js.Any.fromFunction1(joinCondition))
    if (processProperties != null) __obj.updateDynamic("processProperties")(js.Any.fromFunction3(processProperties))
    __obj.asInstanceOf[ClusterOptions]
  }
}

