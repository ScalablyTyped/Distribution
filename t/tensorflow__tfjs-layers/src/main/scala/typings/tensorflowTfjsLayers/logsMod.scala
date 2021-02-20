package typings.tensorflowTfjsLayers

import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowTfjsCore.distTensorMod.Scalar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logsMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/logs", "disposeTensorsInLogs")
  @js.native
  def disposeTensorsInLogs(logs: UnresolvedLogs): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/logs", "resolveScalarsInLogs")
  @js.native
  def resolveScalarsInLogs(logs: UnresolvedLogs): js.Promise[Unit] = js.native
  
  type Logs = StringDictionary[Double]
  
  type UnresolvedLogs = StringDictionary[Double | Scalar]
}
