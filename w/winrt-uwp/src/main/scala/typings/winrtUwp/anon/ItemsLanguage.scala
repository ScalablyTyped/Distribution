package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Globalization.Language
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemsLanguage extends StObject {
  
  /** An array of Language items that start at startIndex in the HttpLanguageHeaderValueCollection . */ var items: Language
  
  /** The number of items retrieved. */ var returnValue: Double
}
object ItemsLanguage {
  
  inline def apply(items: Language, returnValue: Double): ItemsLanguage = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsLanguage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemsLanguage] (val x: Self) extends AnyVal {
    
    inline def setItems(value: Language): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
