package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaseSensitive extends StObject {
  
  @JSName("$caseSensitive")
  var $caseSensitive: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$diacraticSensitive")
  var $diacraticSensitive: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$language")
  var $language: js.UndefOr[String] = js.undefined
  
  @JSName("$search")
  var $search: String
}
object CaseSensitive {
  
  inline def apply($search: String): CaseSensitive = {
    val __obj = js.Dynamic.literal($search = $search.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaseSensitive]
  }
  
  extension [Self <: CaseSensitive](x: Self) {
    
    inline def set$caseSensitive(value: Boolean): Self = StObject.set(x, "$caseSensitive", value.asInstanceOf[js.Any])
    
    inline def set$caseSensitiveUndefined: Self = StObject.set(x, "$caseSensitive", js.undefined)
    
    inline def set$diacraticSensitive(value: Boolean): Self = StObject.set(x, "$diacraticSensitive", value.asInstanceOf[js.Any])
    
    inline def set$diacraticSensitiveUndefined: Self = StObject.set(x, "$diacraticSensitive", js.undefined)
    
    inline def set$language(value: String): Self = StObject.set(x, "$language", value.asInstanceOf[js.Any])
    
    inline def set$languageUndefined: Self = StObject.set(x, "$language", js.undefined)
    
    inline def set$search(value: String): Self = StObject.set(x, "$search", value.asInstanceOf[js.Any])
  }
}
