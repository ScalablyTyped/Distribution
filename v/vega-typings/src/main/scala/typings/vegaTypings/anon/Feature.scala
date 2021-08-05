package typings.vegaTypings.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Feature extends StObject {
  
  var feature: String
}
object Feature {
  
  inline def apply(feature: String): Feature = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any])
    __obj.asInstanceOf[Feature]
  }
  
  extension [Self <: Feature](x: Self) {
    
    inline def setFeature(value: String): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
  }
}
