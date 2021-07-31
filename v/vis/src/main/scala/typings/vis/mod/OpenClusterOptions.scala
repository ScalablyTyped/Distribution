package typings.vis.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenClusterOptions extends StObject {
  
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
  def releaseFunction(clusterPosition: Position, containedNodesPositions: StringDictionary[Position]): StringDictionary[Position]
}
object OpenClusterOptions {
  
  @scala.inline
  def apply(releaseFunction: (Position, StringDictionary[Position]) => StringDictionary[Position]): OpenClusterOptions = {
    val __obj = js.Dynamic.literal(releaseFunction = js.Any.fromFunction2(releaseFunction))
    __obj.asInstanceOf[OpenClusterOptions]
  }
  
  @scala.inline
  implicit class OpenClusterOptionsMutableBuilder[Self <: OpenClusterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReleaseFunction(value: (Position, StringDictionary[Position]) => StringDictionary[Position]): Self = StObject.set(x, "releaseFunction", js.Any.fromFunction2(value))
  }
}
