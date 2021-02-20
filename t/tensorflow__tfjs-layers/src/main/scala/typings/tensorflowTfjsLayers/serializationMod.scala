package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.mod.serialization.Serializable
import typings.tensorflowTfjsCore.serializationMod.ConfigDict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializationMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/serialization", "deserialize")
  @js.native
  def deserialize(config: ConfigDict): Serializable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/serialization", "deserialize")
  @js.native
  def deserialize(config: ConfigDict, customObjects: js.UndefOr[scala.Nothing], fastWeightInit: Boolean): Serializable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/serialization", "deserialize")
  @js.native
  def deserialize(config: ConfigDict, customObjects: ConfigDict): Serializable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/serialization", "deserialize")
  @js.native
  def deserialize(config: ConfigDict, customObjects: ConfigDict, fastWeightInit: Boolean): Serializable = js.native
}
