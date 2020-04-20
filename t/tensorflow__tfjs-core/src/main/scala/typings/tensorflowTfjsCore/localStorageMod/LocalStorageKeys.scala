package typings.tensorflowTfjsCore.localStorageMod

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
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], modelMetadata = modelMetadata.asInstanceOf[js.Any], topology = topology.asInstanceOf[js.Any], weightData = weightData.asInstanceOf[js.Any], weightSpecs = weightSpecs.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalStorageKeys]
  }
}

