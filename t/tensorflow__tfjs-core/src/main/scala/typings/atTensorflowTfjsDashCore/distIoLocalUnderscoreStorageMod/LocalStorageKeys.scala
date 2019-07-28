package typings.atTensorflowTfjsDashCore.distIoLocalUnderscoreStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalStorageKeys extends js.Object {
  var info: String
  var modelMetadata: String
  var topology: String
  var weightData: String
  var weightSpecs: String
}

object LocalStorageKeys {
  @scala.inline
  def apply(info: String, modelMetadata: String, topology: String, weightData: String, weightSpecs: String): LocalStorageKeys = {
    val __obj = js.Dynamic.literal(info = info, modelMetadata = modelMetadata, topology = topology, weightData = weightData, weightSpecs = weightSpecs)
  
    __obj.asInstanceOf[LocalStorageKeys]
  }
}

