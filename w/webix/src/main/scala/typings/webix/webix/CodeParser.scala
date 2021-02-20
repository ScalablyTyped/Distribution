package typings.webix.webix

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeParser extends StObject {
  
  def collapseNames(obj: js.Any): StringDictionary[js.Any] = js.native
  
  def expandNames(obj: StringDictionary[js.Any]): js.Any = js.native
}
object CodeParser {
  
  @scala.inline
  def apply(collapseNames: js.Any => StringDictionary[js.Any], expandNames: StringDictionary[js.Any] => js.Any): CodeParser = {
    val __obj = js.Dynamic.literal(collapseNames = js.Any.fromFunction1(collapseNames), expandNames = js.Any.fromFunction1(expandNames))
    __obj.asInstanceOf[CodeParser]
  }
  
  @scala.inline
  implicit class CodeParserMutableBuilder[Self <: CodeParser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollapseNames(value: js.Any => StringDictionary[js.Any]): Self = StObject.set(x, "collapseNames", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExpandNames(value: StringDictionary[js.Any] => js.Any): Self = StObject.set(x, "expandNames", js.Any.fromFunction1(value))
  }
}
