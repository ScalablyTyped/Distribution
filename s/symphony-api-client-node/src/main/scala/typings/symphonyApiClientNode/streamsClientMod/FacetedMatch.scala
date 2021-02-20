package typings.symphonyApiClientNode.streamsClientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FacetedMatch extends StObject {
  
  var count: Double = js.native
  
  var facet: String = js.native
}
object FacetedMatch {
  
  @scala.inline
  def apply(count: Double, facet: String): FacetedMatch = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], facet = facet.asInstanceOf[js.Any])
    __obj.asInstanceOf[FacetedMatch]
  }
  
  @scala.inline
  implicit class FacetedMatchMutableBuilder[Self <: FacetedMatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacet(value: String): Self = StObject.set(x, "facet", value.asInstanceOf[js.Any])
  }
}
