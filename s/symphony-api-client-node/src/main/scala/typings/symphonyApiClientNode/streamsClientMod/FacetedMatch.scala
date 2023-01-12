package typings.symphonyApiClientNode.streamsClientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FacetedMatch extends StObject {
  
  var count: Double
  
  var facet: String
}
object FacetedMatch {
  
  inline def apply(count: Double, facet: String): FacetedMatch = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], facet = facet.asInstanceOf[js.Any])
    __obj.asInstanceOf[FacetedMatch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FacetedMatch] (val x: Self) extends AnyVal {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setFacet(value: String): Self = StObject.set(x, "facet", value.asInstanceOf[js.Any])
  }
}
