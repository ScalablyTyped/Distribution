package typings.tensorflowTfjsLayers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userDefinedMetadataMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/user_defined_metadata", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/user_defined_metadata", "MAX_USER_DEFINED_METADATA_SERIALIZED_LENGTH")
  @js.native
  val MAX_USER_DEFINED_METADATA_SERIALIZED_LENGTH: Double = js.native
  
  inline def checkUserDefinedMetadata(userDefinedMetadata: js.Object, modelName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkUserDefinedMetadata")(userDefinedMetadata.asInstanceOf[js.Any], modelName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkUserDefinedMetadata(userDefinedMetadata: js.Object, modelName: String, checkSize: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkUserDefinedMetadata")(userDefinedMetadata.asInstanceOf[js.Any], modelName.asInstanceOf[js.Any], checkSize.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def plainObjectCheck(x: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("plainObjectCheck")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
