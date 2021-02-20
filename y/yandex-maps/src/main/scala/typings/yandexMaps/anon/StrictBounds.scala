package typings.yandexMaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrictBounds extends StObject {
  
  var boundedBy: js.UndefOr[js.Array[js.Array[Double]]] = js.native
  
  var results: js.UndefOr[Double] = js.native
  
  var strictBounds: js.UndefOr[Boolean] = js.native
}
object StrictBounds {
  
  @scala.inline
  def apply(): StrictBounds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictBounds]
  }
  
  @scala.inline
  implicit class StrictBoundsMutableBuilder[Self <: StrictBounds] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundedBy(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "boundedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundedByUndefined: Self = StObject.set(x, "boundedBy", js.undefined)
    
    @scala.inline
    def setBoundedByVarargs(value: js.Array[Double]*): Self = StObject.set(x, "boundedBy", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    @scala.inline
    def setStrictBounds(value: Boolean): Self = StObject.set(x, "strictBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictBoundsUndefined: Self = StObject.set(x, "strictBounds", js.undefined)
  }
}
