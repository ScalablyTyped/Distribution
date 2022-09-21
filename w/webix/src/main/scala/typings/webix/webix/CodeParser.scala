package typings.webix.webix

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeParser extends StObject {
  
  def collapseNames(obj: Any): StringDictionary[Any]
  
  def expandNames(obj: StringDictionary[Any]): Any
}
object CodeParser {
  
  inline def apply(collapseNames: Any => StringDictionary[Any], expandNames: StringDictionary[Any] => Any): CodeParser = {
    val __obj = js.Dynamic.literal(collapseNames = js.Any.fromFunction1(collapseNames), expandNames = js.Any.fromFunction1(expandNames))
    __obj.asInstanceOf[CodeParser]
  }
  
  extension [Self <: CodeParser](x: Self) {
    
    inline def setCollapseNames(value: Any => StringDictionary[Any]): Self = StObject.set(x, "collapseNames", js.Any.fromFunction1(value))
    
    inline def setExpandNames(value: StringDictionary[Any] => Any): Self = StObject.set(x, "expandNames", js.Any.fromFunction1(value))
  }
}
