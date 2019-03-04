package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseDefinitionGatesStep extends js.Object {
  var gates: js.Array[ReleaseDefinitionGate]
  var gatesOptions: ReleaseDefinitionGatesOptions
  var id: scala.Double
}

object ReleaseDefinitionGatesStep {
  @scala.inline
  def apply(
    gates: js.Array[ReleaseDefinitionGate],
    gatesOptions: ReleaseDefinitionGatesOptions,
    id: scala.Double
  ): ReleaseDefinitionGatesStep = {
    val __obj = js.Dynamic.literal(gates = gates, gatesOptions = gatesOptions, id = id)
  
    __obj.asInstanceOf[ReleaseDefinitionGatesStep]
  }
}

