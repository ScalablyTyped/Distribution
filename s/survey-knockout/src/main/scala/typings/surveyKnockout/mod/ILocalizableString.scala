package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILocalizableString extends StObject {
  
  def getIsMultiple(): Boolean
  
  def getJson(): Any
  
  def getLocaleText(loc: String): String
  
  def getLocales(): js.Array[Any]
  
  def setLocaleText(loc: String, newValue: String): Any
}
object ILocalizableString {
  
  inline def apply(
    getIsMultiple: () => Boolean,
    getJson: () => Any,
    getLocaleText: String => String,
    getLocales: () => js.Array[Any],
    setLocaleText: (String, String) => Any
  ): ILocalizableString = {
    val __obj = js.Dynamic.literal(getIsMultiple = js.Any.fromFunction0(getIsMultiple), getJson = js.Any.fromFunction0(getJson), getLocaleText = js.Any.fromFunction1(getLocaleText), getLocales = js.Any.fromFunction0(getLocales), setLocaleText = js.Any.fromFunction2(setLocaleText))
    __obj.asInstanceOf[ILocalizableString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ILocalizableString] (val x: Self) extends AnyVal {
    
    inline def setGetIsMultiple(value: () => Boolean): Self = StObject.set(x, "getIsMultiple", js.Any.fromFunction0(value))
    
    inline def setGetJson(value: () => Any): Self = StObject.set(x, "getJson", js.Any.fromFunction0(value))
    
    inline def setGetLocaleText(value: String => String): Self = StObject.set(x, "getLocaleText", js.Any.fromFunction1(value))
    
    inline def setGetLocales(value: () => js.Array[Any]): Self = StObject.set(x, "getLocales", js.Any.fromFunction0(value))
    
    inline def setSetLocaleText(value: (String, String) => Any): Self = StObject.set(x, "setLocaleText", js.Any.fromFunction2(value))
  }
}
