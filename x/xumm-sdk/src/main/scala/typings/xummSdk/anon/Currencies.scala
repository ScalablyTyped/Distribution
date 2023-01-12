package typings.xummSdk.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Currencies extends StObject {
  
  var avatar: js.UndefOr[String] = js.undefined
  
  var currencies: StringDictionary[Avatar]
  
  var domain: js.UndefOr[String] = js.undefined
  
  var id: Double
  
  var name: String
  
  var shortlist: Double
}
object Currencies {
  
  inline def apply(currencies: StringDictionary[Avatar], id: Double, name: String, shortlist: Double): Currencies = {
    val __obj = js.Dynamic.literal(currencies = currencies.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], shortlist = shortlist.asInstanceOf[js.Any])
    __obj.asInstanceOf[Currencies]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Currencies] (val x: Self) extends AnyVal {
    
    inline def setAvatar(value: String): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
    
    inline def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
    
    inline def setCurrencies(value: StringDictionary[Avatar]): Self = StObject.set(x, "currencies", value.asInstanceOf[js.Any])
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setShortlist(value: Double): Self = StObject.set(x, "shortlist", value.asInstanceOf[js.Any])
  }
}
