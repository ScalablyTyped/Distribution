package typings.three

import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcThreeMod.Mesh
import typings.three.srcThreeMod.Points
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmExportersDracoexporterMod {
  
  @JSImport("three/examples/jsm/exporters/DRACOExporter", "DRACOExporter")
  @js.native
  open class DRACOExporter () extends StObject {
    
    def parse(
      `object`: Mesh[BufferGeometry[NormalBufferAttributes], Material | js.Array[Material]],
      options: DRACOExporterOptions
    ): js.typedarray.Int8Array = js.native
    def parse(
      `object`: Points[BufferGeometry[NormalBufferAttributes], Material | js.Array[Material]],
      options: DRACOExporterOptions
    ): js.typedarray.Int8Array = js.native
  }
  
  trait DRACOExporterOptions extends StObject {
    
    var decodeSpeed: js.UndefOr[Double] = js.undefined
    
    var encodeSpeed: js.UndefOr[Double] = js.undefined
    
    var encoderMethod: js.UndefOr[Double] = js.undefined
    
    var exportColor: js.UndefOr[Boolean] = js.undefined
    
    var exportNormals: js.UndefOr[Boolean] = js.undefined
    
    var exportUvs: js.UndefOr[Boolean] = js.undefined
    
    var quantization: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object DRACOExporterOptions {
    
    inline def apply(): DRACOExporterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DRACOExporterOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DRACOExporterOptions] (val x: Self) extends AnyVal {
      
      inline def setDecodeSpeed(value: Double): Self = StObject.set(x, "decodeSpeed", value.asInstanceOf[js.Any])
      
      inline def setDecodeSpeedUndefined: Self = StObject.set(x, "decodeSpeed", js.undefined)
      
      inline def setEncodeSpeed(value: Double): Self = StObject.set(x, "encodeSpeed", value.asInstanceOf[js.Any])
      
      inline def setEncodeSpeedUndefined: Self = StObject.set(x, "encodeSpeed", js.undefined)
      
      inline def setEncoderMethod(value: Double): Self = StObject.set(x, "encoderMethod", value.asInstanceOf[js.Any])
      
      inline def setEncoderMethodUndefined: Self = StObject.set(x, "encoderMethod", js.undefined)
      
      inline def setExportColor(value: Boolean): Self = StObject.set(x, "exportColor", value.asInstanceOf[js.Any])
      
      inline def setExportColorUndefined: Self = StObject.set(x, "exportColor", js.undefined)
      
      inline def setExportNormals(value: Boolean): Self = StObject.set(x, "exportNormals", value.asInstanceOf[js.Any])
      
      inline def setExportNormalsUndefined: Self = StObject.set(x, "exportNormals", js.undefined)
      
      inline def setExportUvs(value: Boolean): Self = StObject.set(x, "exportUvs", value.asInstanceOf[js.Any])
      
      inline def setExportUvsUndefined: Self = StObject.set(x, "exportUvs", js.undefined)
      
      inline def setQuantization(value: js.Array[Double]): Self = StObject.set(x, "quantization", value.asInstanceOf[js.Any])
      
      inline def setQuantizationUndefined: Self = StObject.set(x, "quantization", js.undefined)
      
      inline def setQuantizationVarargs(value: Double*): Self = StObject.set(x, "quantization", js.Array(value*))
    }
  }
}
