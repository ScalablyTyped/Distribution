package typings.uirouterCore.transitionInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import typings.uirouterCore.pathNodeMod.PathNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMatchingNodes
  extends /* key */ StringDictionary[js.Array[PathNode]] {
  var entering: js.Array[PathNode] = js.native
  var exiting: js.Array[PathNode] = js.native
  var from: js.Array[PathNode] = js.native
  var retained: js.Array[PathNode] = js.native
  var to: js.Array[PathNode] = js.native
}

object IMatchingNodes {
  @scala.inline
  def apply(
    entering: js.Array[PathNode],
    exiting: js.Array[PathNode],
    from: js.Array[PathNode],
    retained: js.Array[PathNode],
    to: js.Array[PathNode]
  ): IMatchingNodes = {
    val __obj = js.Dynamic.literal(entering = entering.asInstanceOf[js.Any], exiting = exiting.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], retained = retained.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMatchingNodes]
  }
  @scala.inline
  implicit class IMatchingNodesOps[Self <: IMatchingNodes] (val x: Self) extends AnyVal {
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
    def setEnteringVarargs(value: PathNode*): Self = this.set("entering", js.Array(value :_*))
    @scala.inline
    def setEntering(value: js.Array[PathNode]): Self = this.set("entering", value.asInstanceOf[js.Any])
    @scala.inline
    def setExitingVarargs(value: PathNode*): Self = this.set("exiting", js.Array(value :_*))
    @scala.inline
    def setExiting(value: js.Array[PathNode]): Self = this.set("exiting", value.asInstanceOf[js.Any])
    @scala.inline
    def setFromVarargs(value: PathNode*): Self = this.set("from", js.Array(value :_*))
    @scala.inline
    def setFrom(value: js.Array[PathNode]): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def setRetainedVarargs(value: PathNode*): Self = this.set("retained", js.Array(value :_*))
    @scala.inline
    def setRetained(value: js.Array[PathNode]): Self = this.set("retained", value.asInstanceOf[js.Any])
    @scala.inline
    def setToVarargs(value: PathNode*): Self = this.set("to", js.Array(value :_*))
    @scala.inline
    def setTo(value: js.Array[PathNode]): Self = this.set("to", value.asInstanceOf[js.Any])
  }
  
}

