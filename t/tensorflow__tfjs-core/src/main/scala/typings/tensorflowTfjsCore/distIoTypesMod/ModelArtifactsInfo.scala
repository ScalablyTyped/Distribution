package typings.tensorflowTfjsCore.distIoTypesMod

import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.GraphDef
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.JSON
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelArtifactsInfo extends StObject {
  
  /**
    * Timestamp for when the model is saved.
    */
  var dateSaved: js.Date
  
  /**
    * Size of model topology (Keras JSON or GraphDef), in bytes.
    */
  var modelTopologyBytes: js.UndefOr[Double] = js.undefined
  
  /**
    * TODO (cais,yassogba) consider removing GraphDef as GraphDefs now
    * come in a JSON format and none of our IOHandlers support a non json
    * format. We could conder replacing this with 'Binary' if we want to
    * allow future handlers to save to non json formats (though they will
    * probably want more information than 'Binary').
    * Type of the model topology
    *
    * Type of the model topology
    *
    * Possible values:
    *   - JSON: JSON config (human-readable, e.g., Keras JSON).
    *   - GraphDef: TensorFlow
    *     [GraphDef](https://www.tensorflow.org/extend/tool_developers/#graphdef)
    *     protocol buffer (binary).
    */
  var modelTopologyType: JSON | GraphDef
  
  /**
    * Size of weight value data, in bytes.
    */
  var weightDataBytes: js.UndefOr[Double] = js.undefined
  
  /**
    * Size of weight specification or manifest, in bytes.
    */
  var weightSpecsBytes: js.UndefOr[Double] = js.undefined
}
object ModelArtifactsInfo {
  
  inline def apply(dateSaved: js.Date, modelTopologyType: JSON | GraphDef): ModelArtifactsInfo = {
    val __obj = js.Dynamic.literal(dateSaved = dateSaved.asInstanceOf[js.Any], modelTopologyType = modelTopologyType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelArtifactsInfo]
  }
  
  extension [Self <: ModelArtifactsInfo](x: Self) {
    
    inline def setDateSaved(value: js.Date): Self = StObject.set(x, "dateSaved", value.asInstanceOf[js.Any])
    
    inline def setModelTopologyBytes(value: Double): Self = StObject.set(x, "modelTopologyBytes", value.asInstanceOf[js.Any])
    
    inline def setModelTopologyBytesUndefined: Self = StObject.set(x, "modelTopologyBytes", js.undefined)
    
    inline def setModelTopologyType(value: JSON | GraphDef): Self = StObject.set(x, "modelTopologyType", value.asInstanceOf[js.Any])
    
    inline def setWeightDataBytes(value: Double): Self = StObject.set(x, "weightDataBytes", value.asInstanceOf[js.Any])
    
    inline def setWeightDataBytesUndefined: Self = StObject.set(x, "weightDataBytes", js.undefined)
    
    inline def setWeightSpecsBytes(value: Double): Self = StObject.set(x, "weightSpecsBytes", value.asInstanceOf[js.Any])
    
    inline def setWeightSpecsBytesUndefined: Self = StObject.set(x, "weightSpecsBytes", js.undefined)
  }
}
