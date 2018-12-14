package typings
package visLib.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OpenClusterOptions extends js.Object {
  /**
     * A function that can be used to manually position the nodes after the cluster is opened.
     * The containedNodesPositions contain the positions of the nodes in the cluster at the
     * moment they were clustered. This function is expected to return the newPositions,
     * which can be the containedNodesPositions (altered) or a new object.
     * This has to be an object with keys equal to the nodeIds that exist in the
     * containedNodesPositions and an {x:x,y:y} position object.
     *
     * For all nodeIds not listed in this returned object,
     * we will position them at the location of the cluster.
     * This is also the default behaviour when no releaseFunction is defined.
     */
  def releaseFunction(
    clusterPosition: Position,
    containedNodesPositions: org.scalablytyped.runtime.StringDictionary[Position]
  ): org.scalablytyped.runtime.StringDictionary[Position]
}

