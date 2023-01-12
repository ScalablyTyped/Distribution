package typings.yandexMaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<yandex-maps.yandex-maps.ISuggestOptions, 'provider'> */
trait OmitISuggestOptionsprovid extends StObject {
  
  var boundedBy: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  
  var results: js.UndefOr[Double] = js.undefined
}
object OmitISuggestOptionsprovid {
  
  inline def apply(): OmitISuggestOptionsprovid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitISuggestOptionsprovid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitISuggestOptionsprovid] (val x: Self) extends AnyVal {
    
    inline def setBoundedBy(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "boundedBy", value.asInstanceOf[js.Any])
    
    inline def setBoundedByUndefined: Self = StObject.set(x, "boundedBy", js.undefined)
    
    inline def setBoundedByVarargs(value: js.Array[Double]*): Self = StObject.set(x, "boundedBy", js.Array(value*))
    
    inline def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
  }
}
