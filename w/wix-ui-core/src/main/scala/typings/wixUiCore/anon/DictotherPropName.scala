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
  
  @scala.inline
  def apply(): DictotherPropName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DictotherPropName]
  }
  
  @scala.inline
  implicit class DictotherPropNameMutableBuilder[Self <: DictotherPropName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
