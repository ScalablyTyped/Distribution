package typings.tensorflowTfjsConverter.distDataCompiledApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TensorInfo {
  
  /** Properties of a CooSparse. */
  trait ICooSparse extends StObject {
    
    /** CooSparse denseShapeTensorName */
    var denseShapeTensorName: js.UndefOr[String | Null] = js.undefined
    
    /** CooSparse indicesTensorName */
    var indicesTensorName: js.UndefOr[String | Null] = js.undefined
    
    /** CooSparse valuesTensorName */
    var valuesTensorName: js.UndefOr[String | Null] = js.undefined
  }
  object ICooSparse {
    
    inline def apply(): ICooSparse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICooSparse]
    }
    
    extension [Self <: ICooSparse](x: Self) {
      
      inline def setDenseShapeTensorName(value: String): Self = StObject.set(x, "denseShapeTensorName", value.asInstanceOf[js.Any])
      
      inline def setDenseShapeTensorNameNull: Self = StObject.set(x, "denseShapeTensorName", null)
      
      inline def setDenseShapeTensorNameUndefined: Self = StObject.set(x, "denseShapeTensorName", js.undefined)
      
      inline def setIndicesTensorName(value: String): Self = StObject.set(x, "indicesTensorName", value.asInstanceOf[js.Any])
      
      inline def setIndicesTensorNameNull: Self = StObject.set(x, "indicesTensorName", null)
      
      inline def setIndicesTensorNameUndefined: Self = StObject.set(x, "indicesTensorName", js.undefined)
      
      inline def setValuesTensorName(value: String): Self = StObject.set(x, "valuesTensorName", value.asInstanceOf[js.Any])
      
      inline def setValuesTensorNameNull: Self = StObject.set(x, "valuesTensorName", null)
      
      inline def setValuesTensorNameUndefined: Self = StObject.set(x, "valuesTensorName", js.undefined)
    }
  }
}
