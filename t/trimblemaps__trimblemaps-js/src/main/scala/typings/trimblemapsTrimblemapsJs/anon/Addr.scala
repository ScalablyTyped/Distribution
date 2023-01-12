package typings.trimblemapsTrimblemapsJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Addr extends StObject {
  
  var addr: js.UndefOr[String] = js.undefined
  
  var city: js.UndefOr[String] = js.undefined
  
  var country: js.UndefOr[String] = js.undefined
  
  var dataset: js.UndefOr[String] = js.undefined
  
  var postcodeFilter: js.UndefOr[String] = js.undefined
  
  var region: js.UndefOr[String] = js.undefined
  
  var searchString: js.UndefOr[String] = js.undefined
  
  var splc: js.UndefOr[String] = js.undefined
  
  var state: js.UndefOr[String] = js.undefined
  
  var zip: js.UndefOr[String] = js.undefined
}
object Addr {
  
  inline def apply(): Addr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Addr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Addr] (val x: Self) extends AnyVal {
    
    inline def setAddr(value: String): Self = StObject.set(x, "addr", value.asInstanceOf[js.Any])
    
    inline def setAddrUndefined: Self = StObject.set(x, "addr", js.undefined)
    
    inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setDataset(value: String): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    inline def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
    
    inline def setPostcodeFilter(value: String): Self = StObject.set(x, "postcodeFilter", value.asInstanceOf[js.Any])
    
    inline def setPostcodeFilterUndefined: Self = StObject.set(x, "postcodeFilter", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setSearchString(value: String): Self = StObject.set(x, "searchString", value.asInstanceOf[js.Any])
    
    inline def setSearchStringUndefined: Self = StObject.set(x, "searchString", js.undefined)
    
    inline def setSplc(value: String): Self = StObject.set(x, "splc", value.asInstanceOf[js.Any])
    
    inline def setSplcUndefined: Self = StObject.set(x, "splc", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setZip(value: String): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
    
    inline def setZipUndefined: Self = StObject.set(x, "zip", js.undefined)
  }
}
