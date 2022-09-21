package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPropertyDecoratorOptions[T] extends StObject {
  
  var defaultSource: js.UndefOr[String] = js.undefined
  
  var defaultValue: js.UndefOr[T] = js.undefined
  
  var getDefaultValue: js.UndefOr[js.Function1[/* objectInstance */ js.UndefOr[Any], T]] = js.undefined
  
  var localizable: js.UndefOr[Any] = js.undefined
  
  var onSet: js.UndefOr[js.Function2[/* val */ T, /* objectInstance */ Any, Unit]] = js.undefined
}
object IPropertyDecoratorOptions {
  
  inline def apply[T](): IPropertyDecoratorOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPropertyDecoratorOptions[T]]
  }
  
  extension [Self <: IPropertyDecoratorOptions[?], T](x: Self & IPropertyDecoratorOptions[T]) {
    
    inline def setDefaultSource(value: String): Self = StObject.set(x, "defaultSource", value.asInstanceOf[js.Any])
    
    inline def setDefaultSourceUndefined: Self = StObject.set(x, "defaultSource", js.undefined)
    
    inline def setDefaultValue(value: T): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setGetDefaultValue(value: /* objectInstance */ js.UndefOr[Any] => T): Self = StObject.set(x, "getDefaultValue", js.Any.fromFunction1(value))
    
    inline def setGetDefaultValueUndefined: Self = StObject.set(x, "getDefaultValue", js.undefined)
    
    inline def setLocalizable(value: Any): Self = StObject.set(x, "localizable", value.asInstanceOf[js.Any])
    
    inline def setLocalizableUndefined: Self = StObject.set(x, "localizable", js.undefined)
    
    inline def setOnSet(value: (/* val */ T, /* objectInstance */ Any) => Unit): Self = StObject.set(x, "onSet", js.Any.fromFunction2(value))
    
    inline def setOnSetUndefined: Self = StObject.set(x, "onSet", js.undefined)
  }
}
