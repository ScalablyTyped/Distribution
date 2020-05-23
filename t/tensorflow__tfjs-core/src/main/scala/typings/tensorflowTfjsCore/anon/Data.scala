package typings.tensorflowTfjsCore.anon

import typings.std.ArrayBuffer
import typings.tensorflowTfjsCore.typesMod.WeightsManifestEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: ArrayBuffer
  var specs: js.Array[WeightsManifestEntry]
}

object Data {
  @scala.inline
  def apply(data: ArrayBuffer, specs: js.Array[WeightsManifestEntry]): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], specs = specs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

