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
  
  @scala.inline
  def apply(property: String, value: js.Any): CSSProperty = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSProperty]
  }
  
  @scala.inline
  implicit class CSSPropertyMutableBuilder[Self <: CSSProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParsed(value: Alpha): Self = StObject.set(x, "parsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParsedUndefined: Self = StObject.set(x, "parsed", js.undefined)
    
    @scala.inline
    def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
