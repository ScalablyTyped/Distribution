package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.mod.serialization.Serializable
import typings.tensorflowTfjsCore.serializationMod.ConfigDict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializationMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/serialization", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def deserialize(config: ConfigDict): Serializable = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(config.asInstanceOf[js.Any]).asInstanceOf[Serializable]
  @scala.inline
  def deserialize(config: ConfigDict, customObjects: Unit, fastWeightInit: Boolean): Serializable = (^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(config.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any], fastWeightInit.asInstanceOf[js.Any])).asInstanceOf[Serializable]
  @scala.inline
  def deserialize(config: ConfigDict, customObjects: ConfigDict): Serializable = (^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(config.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any])).asInstanceOf[Serializable]
  @scala.inline
  def deserialize(config: ConfigDict, customObjects: ConfigDict, fastWeightInit: Boolean): Serializable = (^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(config.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any], fastWeightInit.asInstanceOf[js.Any])).asInstanceOf[Serializable]
}
