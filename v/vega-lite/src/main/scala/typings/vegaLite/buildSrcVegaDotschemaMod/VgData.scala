package typings.vegaLite.buildSrcVegaDotschemaMod

import typings.vegaLite.anon.Feature
import typings.vegaTypings.typesSpecTransformMod.Transforms
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VgData extends StObject {
  
  var format: js.UndefOr[Feature] = js.undefined
  
  var name: String
  
  var source: js.UndefOr[String] = js.undefined
  
  var transform: js.UndefOr[js.Array[Transforms]] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
  
  var values: js.UndefOr[Any] = js.undefined
}
object VgData {
  
  inline def apply(name: String): VgData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[VgData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VgData] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: Feature): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTransform(value: js.Array[Transforms]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setTransformVarargs(value: Transforms*): Self = StObject.set(x, "transform", js.Array(value*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
