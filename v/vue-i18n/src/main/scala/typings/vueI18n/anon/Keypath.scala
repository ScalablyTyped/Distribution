package typings.vueI18n.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Keypath extends StObject {
  
  var i18n: TypeObjectConstructor
  
  var keypath: RequiredBoolean
  
  var locale: TypeStringConstructor
  
  var plural: Validator
  
  var scope: Default
  
  var tag: Type
}
object Keypath {
  
  inline def apply(
    i18n: TypeObjectConstructor,
    keypath: RequiredBoolean,
    locale: TypeStringConstructor,
    plural: Validator,
    scope: Default,
    tag: Type
  ): Keypath = {
    val __obj = js.Dynamic.literal(i18n = i18n.asInstanceOf[js.Any], keypath = keypath.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], plural = plural.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Keypath]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Keypath] (val x: Self) extends AnyVal {
    
    inline def setI18n(value: TypeObjectConstructor): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
    
    inline def setKeypath(value: RequiredBoolean): Self = StObject.set(x, "keypath", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: TypeStringConstructor): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setPlural(value: Validator): Self = StObject.set(x, "plural", value.asInstanceOf[js.Any])
    
    inline def setScope(value: Default): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setTag(value: Type): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
