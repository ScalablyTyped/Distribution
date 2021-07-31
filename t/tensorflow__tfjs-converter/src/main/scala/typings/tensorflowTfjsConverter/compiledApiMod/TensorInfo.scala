package typings.tensorflowTfjsConverter.compiledApiMod

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
    
    @scala.inline
    def apply(): ICooSparse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICooSparse]
    }
    
    @scala.inline
    implicit class ICooSparseMutableBuilder[Self <: ICooSparse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDenseShapeTensorName(value: String): Self = StObject.set(x, "denseShapeTensorName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDenseShapeTensorNameNull: Self = StObject.set(x, "denseShapeTensorName", null)
      
      @scala.inline
      def setDenseShapeTensorNameUndefined: Self = StObject.set(x, "denseShapeTensorName", js.undefined)
      
      @scala.inline
      def setIndicesTensorName(value: String): Self = StObject.set(x, "indicesTensorName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicesTensorNameNull: Self = StObject.set(x, "indicesTensorName", null)
      
      @scala.inline
      def setIndicesTensorNameUndefined: Self = StObject.set(x, "indicesTensorName", js.undefined)
      
      @scala.inline
      def setValuesTensorName(value: String): Self = StObject.set(x, "valuesTensorName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesTensorNameNull: Self = StObject.set(x, "valuesTensorName", null)
      
      @scala.inline
      def setValuesTensorNameUndefined: Self = StObject.set(x, "valuesTensorName", js.undefined)
    }
  }
}
