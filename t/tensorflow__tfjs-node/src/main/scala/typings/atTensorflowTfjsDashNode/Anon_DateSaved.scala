package typings.atTensorflowTfjsDashNode

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DateSaved extends js.Object {
  var dateSaved: Date
  var modelTopologyBytes: Double
  var modelTopologyType: String
  var weightDataBytes: Double
  var weightSpecsBytes: Double
}

object Anon_DateSaved {
  @scala.inline
  def apply(
    dateSaved: Date,
    modelTopologyBytes: Double,
    modelTopologyType: String,
    weightDataBytes: Double,
    weightSpecsBytes: Double
  ): Anon_DateSaved = {
    val __obj = js.Dynamic.literal(dateSaved = dateSaved.asInstanceOf[js.Any], modelTopologyBytes = modelTopologyBytes.asInstanceOf[js.Any], modelTopologyType = modelTopologyType.asInstanceOf[js.Any], weightDataBytes = weightDataBytes.asInstanceOf[js.Any], weightSpecsBytes = weightSpecsBytes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DateSaved]
  }
}

