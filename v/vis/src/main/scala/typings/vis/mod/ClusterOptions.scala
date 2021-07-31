package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterOptions extends StObject {
  
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
      /* childNodesOptions */ js.Array[js.Any], 
      /* childEdgesOptions */ js.Array[js.Any], 
      js.Any
    ]
  ] = js.undefined
}
object ClusterOptions {
  
  @scala.inline
  def apply(): ClusterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterOptions]
  }
  
  @scala.inline
  implicit class ClusterOptionsMutableBuilder[Self <: ClusterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterEdgeProperties(value: EdgeOptions): Self = StObject.set(x, "clusterEdgeProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterEdgePropertiesUndefined: Self = StObject.set(x, "clusterEdgeProperties", js.undefined)
    
    @scala.inline
    def setClusterNodeProperties(value: NodeOptions): Self = StObject.set(x, "clusterNodeProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterNodePropertiesUndefined: Self = StObject.set(x, "clusterNodeProperties", js.undefined)
    
    @scala.inline
    def setJoinCondition(value: /* nodeOptions */ js.Any => Boolean): Self = StObject.set(x, "joinCondition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setJoinConditionUndefined: Self = StObject.set(x, "joinCondition", js.undefined)
    
    @scala.inline
    def setProcessProperties(
      value: (/* clusterOptions */ js.Any, /* childNodesOptions */ js.Array[js.Any], /* childEdgesOptions */ js.Array[js.Any]) => js.Any
    ): Self = StObject.set(x, "processProperties", js.Any.fromFunction3(value))
    
    @scala.inline
    def setProcessPropertiesUndefined: Self = StObject.set(x, "processProperties", js.undefined)
  }
}
