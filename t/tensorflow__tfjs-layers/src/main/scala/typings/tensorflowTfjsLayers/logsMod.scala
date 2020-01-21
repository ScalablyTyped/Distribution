package typings.tensorflowTfjsLayers

import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowTfjsCore.tensorMod.Scalar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/logs", JSImport.Namespace)
@js.native
object logsMod extends js.Object {
  def disposeTensorsInLogs(logs: UnresolvedLogs): Unit = js.native
  def resolveScalarsInLogs(logs: UnresolvedLogs): js.Promise[Unit] = js.native
  type Logs = StringDictionary[Double]
  type UnresolvedLogs = StringDictionary[Double | Scalar]
}

