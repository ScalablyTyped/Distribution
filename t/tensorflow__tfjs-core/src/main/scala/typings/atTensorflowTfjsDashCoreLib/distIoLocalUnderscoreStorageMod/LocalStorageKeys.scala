package typings
package atTensorflowTfjsDashCoreLib.distIoLocalUnderscoreStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalStorageKeys extends js.Object {
  var info: java.lang.String
  var modelMetadata: java.lang.String
  var topology: java.lang.String
  var weightData: java.lang.String
  var weightSpecs: java.lang.String
}

object LocalStorageKeys {
  @scala.inline
  def apply(
    info: java.lang.String,
    modelMetadata: java.lang.String,
    topology: java.lang.String,
    weightData: java.lang.String,
    weightSpecs: java.lang.String
  ): LocalStorageKeys = {
    val __obj = js.Dynamic.literal(info = info, modelMetadata = modelMetadata, topology = topology, weightData = weightData, weightSpecs = weightSpecs)
  
    __obj.asInstanceOf[LocalStorageKeys]
  }
}

