package typings.twilio.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Key extends StObject {
  
  var key: js.UndefOr[String] = js.undefined
  
  var next_page_url: js.UndefOr[String] = js.undefined
  
  var previous_page_url: js.UndefOr[String] = js.undefined
}
object Key {
  
  inline def apply(): Key = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Key]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setNext_page_url(value: String): Self = StObject.set(x, "next_page_url", value.asInstanceOf[js.Any])
    
    inline def setNext_page_urlUndefined: Self = StObject.set(x, "next_page_url", js.undefined)
    
    inline def setPrevious_page_url(value: String): Self = StObject.set(x, "previous_page_url", value.asInstanceOf[js.Any])
    
    inline def setPrevious_page_urlUndefined: Self = StObject.set(x, "previous_page_url", js.undefined)
  }
}
