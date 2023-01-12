package typings.trimblemapsTrimblemapsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureIdentifier extends StObject {
  
  var id: js.UndefOr[String | Double] = js.undefined
  
  var source: String
  
  var sourceLayer: js.UndefOr[String] = js.undefined
}
object FeatureIdentifier {
  
  inline def apply(source: String): FeatureIdentifier = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureIdentifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeatureIdentifier] (val x: Self) extends AnyVal {
    
    inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceLayer(value: String): Self = StObject.set(x, "sourceLayer", value.asInstanceOf[js.Any])
    
    inline def setSourceLayerUndefined: Self = StObject.set(x, "sourceLayer", js.undefined)
  }
}
