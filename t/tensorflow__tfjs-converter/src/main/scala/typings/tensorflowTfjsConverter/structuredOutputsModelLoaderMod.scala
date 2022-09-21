package typings.tensorflowTfjsConverter

import typings.std.SharedArrayBuffer
import typings.tensorflowTfjsConverter.anon.DtypeName
import typings.tensorflowTfjsConverter.anon.Inputs
import typings.tensorflowTfjsConverter.anon.Library
import typings.tensorflowTfjsConverter.anon.StructuredOutputKeys
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object structuredOutputsModelLoaderMod {
  
  object STRUCTURED_OUTPUTS_MODEL {
    
    @JSImport("@tensorflow/tfjs-converter/dist/executor/test_data/structured_outputs_model_loader", "STRUCTURED_OUTPUTS_MODEL")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@tensorflow/tfjs-converter/dist/executor/test_data/structured_outputs_model_loader", "STRUCTURED_OUTPUTS_MODEL.convertedBy")
    @js.native
    def convertedBy: String = js.native
    inline def convertedBy_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("convertedBy")(x.asInstanceOf[js.Any])
    
    @JSImport("@tensorflow/tfjs-converter/dist/executor/test_data/structured_outputs_model_loader", "STRUCTURED_OUTPUTS_MODEL.format")
    @js.native
    def format: String = js.native
    inline def format_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("format")(x.asInstanceOf[js.Any])
    
    @JSImport("@tensorflow/tfjs-converter/dist/executor/test_data/structured_outputs_model_loader", "STRUCTURED_OUTPUTS_MODEL.generatedBy")
    @js.native
    def generatedBy: String = js.native
    inline def generatedBy_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("generatedBy")(x.asInstanceOf[js.Any])
    
    @JSImport("@tensorflow/tfjs-converter/dist/executor/test_data/structured_outputs_model_loader", "STRUCTURED_OUTPUTS_MODEL.modelTopology")
    @js.native
    def modelTopology: Library = js.native
    inline def modelTopology_=(x: Library): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modelTopology")(x.asInstanceOf[js.Any])
    
    @JSImport("@tensorflow/tfjs-converter/dist/executor/test_data/structured_outputs_model_loader", "STRUCTURED_OUTPUTS_MODEL.signature")
    @js.native
    def signature: Inputs = js.native
    inline def signature_=(x: Inputs): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("signature")(x.asInstanceOf[js.Any])
    
    @JSImport("@tensorflow/tfjs-converter/dist/executor/test_data/structured_outputs_model_loader", "STRUCTURED_OUTPUTS_MODEL.userDefinedMetadata")
    @js.native
    def userDefinedMetadata: StructuredOutputKeys = js.native
    inline def userDefinedMetadata_=(x: StructuredOutputKeys): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("userDefinedMetadata")(x.asInstanceOf[js.Any])
    
    @JSImport("@tensorflow/tfjs-converter/dist/executor/test_data/structured_outputs_model_loader", "STRUCTURED_OUTPUTS_MODEL.weightData")
    @js.native
    def weightData: js.typedarray.ArrayBuffer | SharedArrayBuffer = js.native
    inline def weightData_=(x: js.typedarray.ArrayBuffer | SharedArrayBuffer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("weightData")(x.asInstanceOf[js.Any])
    
    @JSImport("@tensorflow/tfjs-converter/dist/executor/test_data/structured_outputs_model_loader", "STRUCTURED_OUTPUTS_MODEL.weightSpecs")
    @js.native
    def weightSpecs: js.Array[DtypeName] = js.native
    inline def weightSpecs_=(x: js.Array[DtypeName]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("weightSpecs")(x.asInstanceOf[js.Any])
  }
}
