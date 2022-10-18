package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsLayers.distKerasFormatTypesMod.PyJsonDict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKerasFormatNodeConfigMod {
  
  type LayerName = String
  
  type NodeArgs = PyJsonDict
  
  type NodeConfig = js.Array[TensorKeyWithArgsArray]
  
  type NodeIndex = Double
  
  type TensorIndex = Double
  
  type TensorKeyArray = js.Tuple3[LayerName, NodeIndex, TensorIndex]
  
  type TensorKeyWithArgsArray = js.Tuple4[LayerName, NodeIndex, TensorIndex, NodeArgs]
}
