package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.distSerializationMod.ConfigDictValue
import typings.tensorflowTfjsLayers.distKerasFormatTypesMod.PyJsonValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsSerializationUtilsMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/utils/serialization_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertPythonicToTs(pythonicConfig: PyJsonValue): ConfigDictValue = ^.asInstanceOf[js.Dynamic].applyDynamic("convertPythonicToTs")(pythonicConfig.asInstanceOf[js.Any]).asInstanceOf[ConfigDictValue]
  inline def convertPythonicToTs(pythonicConfig: PyJsonValue, key: String): ConfigDictValue = (^.asInstanceOf[js.Dynamic].applyDynamic("convertPythonicToTs")(pythonicConfig.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[ConfigDictValue]
  
  inline def convertTsToPythonic(tsConfig: ConfigDictValue): PyJsonValue = ^.asInstanceOf[js.Dynamic].applyDynamic("convertTsToPythonic")(tsConfig.asInstanceOf[js.Any]).asInstanceOf[PyJsonValue]
  inline def convertTsToPythonic(tsConfig: ConfigDictValue, key: String): PyJsonValue = (^.asInstanceOf[js.Dynamic].applyDynamic("convertTsToPythonic")(tsConfig.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[PyJsonValue]
}
