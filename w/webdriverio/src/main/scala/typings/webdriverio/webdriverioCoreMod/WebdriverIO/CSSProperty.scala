package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import typings.webdriverio.anon.Alpha
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSProperty extends StObject {
  
  var parsed: js.UndefOr[Alpha] = js.undefined
  
  var property: String
  
  var value: js.Any
}
object CSSProperty {
  
  inline def apply(property: String, value: js.Any): CSSProperty = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSProperty]
  }
  
  extension [Self <: CSSProperty](x: Self) {
    
    inline def setParsed(value: Alpha): Self = StObject.set(x, "parsed", value.asInstanceOf[js.Any])
    
    inline def setParsedUndefined: Self = StObject.set(x, "parsed", js.undefined)
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
