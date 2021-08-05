package typings.weixinApp.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  var value: StringDictionary[String | Boolean | Double]
}
object Value {
  
  inline def apply(value: StringDictionary[String | Boolean | Double]): Value = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  extension [Self <: Value](x: Self) {
    
    inline def setValue(value: StringDictionary[String | Boolean | Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
