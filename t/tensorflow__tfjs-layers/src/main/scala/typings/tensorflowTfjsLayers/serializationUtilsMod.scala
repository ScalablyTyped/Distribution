package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.serializationMod.ConfigDictValue
import typings.tensorflowTfjsLayers.typesMod.PyJsonValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializationUtilsMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/utils/serialization_utils", "convertPythonicToTs")
  @js.native
  def convertPythonicToTs(pythonicConfig: PyJsonValue): ConfigDictValue = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/utils/serialization_utils", "convertPythonicToTs")
  @js.native
  def convertPythonicToTs(pythonicConfig: PyJsonValue, key: String): ConfigDictValue = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/utils/serialization_utils", "convertTsToPythonic")
  @js.native
  def convertTsToPythonic(tsConfig: ConfigDictValue): PyJsonValue = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/utils/serialization_utils", "convertTsToPythonic")
  @js.native
  def convertTsToPythonic(tsConfig: ConfigDictValue, key: String): PyJsonValue = js.native
}
