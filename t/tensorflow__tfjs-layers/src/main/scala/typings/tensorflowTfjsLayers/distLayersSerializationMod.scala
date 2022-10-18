package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.distSerializationMod.ConfigDict
import typings.tensorflowTfjsCore.mod.serialization.Serializable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLayersSerializationMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/serialization", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deserialize(config: ConfigDict): Serializable = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(config.asInstanceOf[js.Any]).asInstanceOf[Serializable]
  inline def deserialize(config: ConfigDict, customObjects: Unit, fastWeightInit: Boolean): Serializable = (^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(config.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any], fastWeightInit.asInstanceOf[js.Any])).asInstanceOf[Serializable]
  inline def deserialize(config: ConfigDict, customObjects: ConfigDict): Serializable = (^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(config.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any])).asInstanceOf[Serializable]
  inline def deserialize(config: ConfigDict, customObjects: ConfigDict, fastWeightInit: Boolean): Serializable = (^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(config.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any], fastWeightInit.asInstanceOf[js.Any])).asInstanceOf[Serializable]
}
