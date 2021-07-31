package typings.stripe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDataOptions extends StObject {
  
  var expand: js.UndefOr[js.Array[String]] = js.undefined
  
  var include: js.UndefOr[js.Array[String]] = js.undefined
}
object IDataOptions {
  
  @scala.inline
  def apply(): IDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDataOptions]
  }
  
  @scala.inline
  implicit class IDataOptionsMutableBuilder[Self <: IDataOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpand(value: js.Array[String]): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    @scala.inline
    def setExpandVarargs(value: String*): Self = StObject.set(x, "expand", js.Array(value :_*))
    
    @scala.inline
    def setInclude(value: js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value :_*))
  }
}
