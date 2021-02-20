package typings.tensorflowTfjsLayers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userDefinedMetadataMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/user_defined_metadata", "MAX_USER_DEFINED_METADATA_SERIALIZED_LENGTH")
  @js.native
  val MAX_USER_DEFINED_METADATA_SERIALIZED_LENGTH: Double = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/user_defined_metadata", "checkUserDefinedMetadata")
  @js.native
  def checkUserDefinedMetadata(userDefinedMetadata: js.Object, modelName: String): Unit = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/user_defined_metadata", "checkUserDefinedMetadata")
  @js.native
  def checkUserDefinedMetadata(userDefinedMetadata: js.Object, modelName: String, checkSize: Boolean): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/user_defined_metadata", "plainObjectCheck")
  @js.native
  def plainObjectCheck(x: js.Any): Boolean = js.native
}
