package typings.wixUiCore.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictotherPropName
  extends StObject
     with /* otherPropName */ StringDictionary[js.Any] {
  
  var className: js.UndefOr[String] = js.undefined
  
  var style: js.UndefOr[js.Object] = js.undefined
}
object DictotherPropName {
  
  inline def apply(): DictotherPropName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DictotherPropName]
  }
  
  extension [Self <: DictotherPropName](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
