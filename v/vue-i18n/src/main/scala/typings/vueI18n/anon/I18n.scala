package typings.vueI18n.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait I18n extends StObject {
  
  var format: Type
  
  var i18n: TypeObjectConstructor
  
  var locale: TypeStringConstructor
  
  var scope: Default
  
  var tag: Type
  
  var value: RequiredType
}
object I18n {
  
  inline def apply(
    format: Type,
    i18n: TypeObjectConstructor,
    locale: TypeStringConstructor,
    scope: Default,
    tag: Type,
    value: RequiredType
  ): I18n = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], i18n = i18n.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[I18n]
  }
  
  extension [Self <: I18n](x: Self) {
    
    inline def setFormat(value: Type): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setI18n(value: TypeObjectConstructor): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: TypeStringConstructor): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setScope(value: Default): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setTag(value: Type): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setValue(value: RequiredType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
