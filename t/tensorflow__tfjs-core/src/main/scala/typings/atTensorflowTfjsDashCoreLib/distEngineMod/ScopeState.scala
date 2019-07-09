package typings
package atTensorflowTfjsDashCoreLib.distEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScopeState extends js.Object {
  var id: scala.Double
  var name: java.lang.String
  var track: js.Array[
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ]
}

object ScopeState {
  @scala.inline
  def apply(
    id: scala.Double,
    name: java.lang.String,
    track: js.Array[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ): ScopeState = {
    val __obj = js.Dynamic.literal(id = id, name = name, track = track)
  
    __obj.asInstanceOf[ScopeState]
  }
}

