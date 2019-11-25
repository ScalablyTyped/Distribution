package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.distTensorMod.DataId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FlatOffset extends js.Object {
  var flatOffset: Double
  var origDataId: DataId
}

object Anon_FlatOffset {
  @scala.inline
  def apply(flatOffset: Double, origDataId: DataId): Anon_FlatOffset = {
    val __obj = js.Dynamic.literal(flatOffset = flatOffset.asInstanceOf[js.Any], origDataId = origDataId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_FlatOffset]
  }
}

