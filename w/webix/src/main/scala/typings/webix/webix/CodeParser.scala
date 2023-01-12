package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeParser extends StObject {
  
  def collapseNames(obj: Any): obj
  
  def expandNames(obj: obj): obj
}
object CodeParser {
  
  inline def apply(collapseNames: Any => obj, expandNames: obj => obj): CodeParser = {
    val __obj = js.Dynamic.literal(collapseNames = js.Any.fromFunction1(collapseNames), expandNames = js.Any.fromFunction1(expandNames))
    __obj.asInstanceOf[CodeParser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodeParser] (val x: Self) extends AnyVal {
    
    inline def setCollapseNames(value: Any => obj): Self = StObject.set(x, "collapseNames", js.Any.fromFunction1(value))
    
    inline def setExpandNames(value: obj => obj): Self = StObject.set(x, "expandNames", js.Any.fromFunction1(value))
  }
}
