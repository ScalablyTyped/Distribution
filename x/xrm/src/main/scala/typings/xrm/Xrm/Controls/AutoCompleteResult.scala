package typings.xrm.Xrm.Controls

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for Result value of AutoCompleteResultSet
  */
trait AutoCompleteResult extends StObject {
  
  /**
    * Display value(s) for this auto-complete option
    */
  var fields: js.Array[String]
  
  /**
    * Url of the icon to display
    */
  var icon: js.UndefOr[String] = js.undefined
  
  /**
    * The Identifier
    */
  var id: String | Double
}
object AutoCompleteResult {
  
  @scala.inline
  def apply(fields: js.Array[String], id: String | Double): AutoCompleteResult = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCompleteResult]
  }
  
  @scala.inline
  implicit class AutoCompleteResultMutableBuilder[Self <: AutoCompleteResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
