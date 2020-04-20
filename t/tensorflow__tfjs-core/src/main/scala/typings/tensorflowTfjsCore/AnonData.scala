package typings.tensorflowTfjsCore

import typings.std.ArrayBuffer
import typings.tensorflowTfjsCore.typesMod.WeightsManifestEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var data: ArrayBuffer
  var specs: js.Array[WeightsManifestEntry]
}

object AnonData {
  @scala.inline
  def apply(data: ArrayBuffer, specs: js.Array[WeightsManifestEntry]): AnonData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], specs = specs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonData]
  }
}

