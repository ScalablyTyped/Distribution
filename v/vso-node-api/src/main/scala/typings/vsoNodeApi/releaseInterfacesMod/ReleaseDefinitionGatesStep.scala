package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseDefinitionGatesStep extends js.Object {
  var gates: js.Array[ReleaseDefinitionGate]
  var gatesOptions: ReleaseDefinitionGatesOptions
  var id: Double
}

object ReleaseDefinitionGatesStep {
  @scala.inline
  def apply(gates: js.Array[ReleaseDefinitionGate], gatesOptions: ReleaseDefinitionGatesOptions, id: Double): ReleaseDefinitionGatesStep = {
    val __obj = js.Dynamic.literal(gates = gates.asInstanceOf[js.Any], gatesOptions = gatesOptions.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReleaseDefinitionGatesStep]
  }
}

