package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFindElement extends StObject {
  
  var element: Base
  
  var str: LocalizableString
}
object IFindElement {
  
  inline def apply(element: Base, str: LocalizableString): IFindElement = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], str = str.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFindElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IFindElement] (val x: Self) extends AnyVal {
    
    inline def setElement(value: Base): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setStr(value: LocalizableString): Self = StObject.set(x, "str", value.asInstanceOf[js.Any])
  }
}
