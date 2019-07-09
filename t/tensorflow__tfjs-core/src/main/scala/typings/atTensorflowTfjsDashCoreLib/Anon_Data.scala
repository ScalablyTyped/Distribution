package typings
package atTensorflowTfjsDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: stdLib.ArrayBuffer
  var specs: js.Array[atTensorflowTfjsDashCoreLib.distIoTypesMod.WeightsManifestEntry]
}

object Anon_Data {
  @scala.inline
  def apply(
    data: stdLib.ArrayBuffer,
    specs: js.Array[atTensorflowTfjsDashCoreLib.distIoTypesMod.WeightsManifestEntry]
  ): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data, specs = specs)
  
    __obj.asInstanceOf[Anon_Data]
  }
}

