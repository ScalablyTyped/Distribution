package typings.atTensorflowTfjsDashCore.distEngineMod

import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScopeState extends js.Object {
  var id: Double
  var name: String
  var track: js.Array[Tensor[Rank]]
}

object ScopeState {
  @scala.inline
  def apply(id: Double, name: String, track: js.Array[Tensor[Rank]]): ScopeState = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ScopeState]
  }
}

