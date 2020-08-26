package typings.vis.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  def releaseFunction(clusterPosition: Position, containedNodesPositions: StringDictionary[Position]): StringDictionary[Position] = js.native
}

object OpenClusterOptions {
  @scala.inline
  def apply(releaseFunction: (Position, StringDictionary[Position]) => StringDictionary[Position]): OpenClusterOptions = {
    val __obj = js.Dynamic.literal(releaseFunction = js.Any.fromFunction2(releaseFunction))
    __obj.asInstanceOf[OpenClusterOptions]
  }
  @scala.inline
  implicit class OpenClusterOptionsOps[Self <: OpenClusterOptions] (val x: Self) extends AnyVal {
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
    def setReleaseFunction(value: (Position, StringDictionary[Position]) => StringDictionary[Position]): Self = this.set("releaseFunction", js.Any.fromFunction2(value))
  }
  
}

