package typings.styledComponents.nativeDistDistTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInlineStyle[Props] extends StObject {
  
  def generateStyleObject(executionContext: js.Object): js.Object
  
  var rules: RuleSet[Props]
}
object IInlineStyle {
  
  inline def apply[Props](generateStyleObject: js.Object => js.Object, rules: RuleSet[Props]): IInlineStyle[Props] = {
    val __obj = js.Dynamic.literal(generateStyleObject = js.Any.fromFunction1(generateStyleObject), rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInlineStyle[Props]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IInlineStyle[?], Props] (val x: Self & IInlineStyle[Props]) extends AnyVal {
    
    inline def setGenerateStyleObject(value: js.Object => js.Object): Self = StObject.set(x, "generateStyleObject", js.Any.fromFunction1(value))
    
    inline def setRules(value: RuleSet[Props]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
  }
}
