package typings.winrt.anon

import typings.winrt.Windows.ApplicationModel.Resources.Core.ResourceQualifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnValueNumber extends StObject {
  
  var items: js.Array[ResourceQualifier] = js.native
  
  var returnValue: Double = js.native
}
object ReturnValueNumber {
  
  @scala.inline
  def apply(items: js.Array[ResourceQualifier], returnValue: Double): ReturnValueNumber = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnValueNumber]
  }
  
  @scala.inline
  implicit class ReturnValueNumberMutableBuilder[Self <: ReturnValueNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[ResourceQualifier]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: ResourceQualifier*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
