package typings.vueI18n.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormattableProps[Value, Format]
  extends StObject
     with BaseFormatProps {
  
  /**
    * @remarks
    * The format to use in the target component.
    *
    * Specify the format key string or the format as defined by the Intl API in ECMA 402.
    */
  var format: js.UndefOr[String | Format] = js.undefined
  
  /**
    * @remarks
    * The value specified for the target component
    */
  var value: Value
}
object FormattableProps {
  
  inline def apply[Value, Format](value: Value): FormattableProps[Value, Format] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormattableProps[Value, Format]]
  }
  
  extension [Self <: FormattableProps[?, ?], Value, Format](x: Self & (FormattableProps[Value, Format])) {
    
    inline def setFormat(value: String | Format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
