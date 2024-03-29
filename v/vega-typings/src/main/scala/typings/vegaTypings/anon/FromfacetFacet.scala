package typings.vegaTypings.anon

import typings.vegaTypings.typesSpecMarkMod.Facet
import typings.vegaTypings.typesSpecMarkMod.FromFacet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined vega-typings.vega-typings/types/spec/mark.From & {  facet :vega-typings.vega-typings/types/spec/mark.Facet} */
trait FromfacetFacet
  extends StObject
     with FromFacet {
  
  var data: js.UndefOr[String] = js.undefined
  
  var facet: Facet
}
object FromfacetFacet {
  
  inline def apply(facet: Facet): FromfacetFacet = {
    val __obj = js.Dynamic.literal(facet = facet.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromfacetFacet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FromfacetFacet] (val x: Self) extends AnyVal {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setFacet(value: Facet): Self = StObject.set(x, "facet", value.asInstanceOf[js.Any])
  }
}
