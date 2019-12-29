package typings.atTensorflowTfjsDashLayers

import org.scalablytyped.runtime.StringDictionary
import typings.atTensorflowTfjsDashCore.distTensorMod.Scalar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/logs", JSImport.Namespace)
@js.native
object distLogsMod extends js.Object {
  def disposeTensorsInLogs(logs: UnresolvedLogs): Unit = js.native
  def resolveScalarsInLogs(logs: UnresolvedLogs): js.Promise[Unit] = js.native
  type Logs = StringDictionary[Double]
  type UnresolvedLogs = StringDictionary[Double | Scalar]
}

