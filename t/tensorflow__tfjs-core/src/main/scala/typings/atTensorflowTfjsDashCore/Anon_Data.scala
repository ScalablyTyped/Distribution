package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.distIoTypesMod.WeightsManifestEntry
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: ArrayBuffer
  var specs: js.Array[WeightsManifestEntry]
}

object Anon_Data {
  @scala.inline
  def apply(data: ArrayBuffer, specs: js.Array[WeightsManifestEntry]): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], specs = specs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Data]
  }
}

