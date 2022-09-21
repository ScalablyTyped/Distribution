package typings.typeormAuroraDataApiDriver

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Parameters extends StObject {
    
    var parameters: js.UndefOr[js.Array[Any]] = js.undefined
    
    var queryString: String
  }
  object Parameters {
    
    inline def apply(queryString: String): Parameters = {
      val __obj = js.Dynamic.literal(queryString = queryString.asInstanceOf[js.Any])
      __obj.asInstanceOf[Parameters]
    }
    
    extension [Self <: Parameters](x: Self) {
      
      inline def setParameters(value: js.Array[Any]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setParametersVarargs(value: Any*): Self = StObject.set(x, "parameters", js.Array(value*))
      
      inline def setQueryString(value: String): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColumnMetadata * / any, 'scale' | 'precision'> */
  trait Pickanyscaleprecision extends StObject {
    
    var precision: js.UndefOr[Any] = js.undefined
    
    var scale: js.UndefOr[Any] = js.undefined
  }
  object Pickanyscaleprecision {
    
    inline def apply(): Pickanyscaleprecision = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Pickanyscaleprecision]
    }
    
    extension [Self <: Pickanyscaleprecision](x: Self) {
      
      inline def setPrecision(value: Any): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setScale(value: Any): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    }
  }
}
