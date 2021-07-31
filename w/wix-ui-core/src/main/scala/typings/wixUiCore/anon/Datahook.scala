package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Datahook extends StObject {
  
  var className: String
  
  var `data-hook`: String
  
  var name: String
}
object Datahook {
  
  @scala.inline
  def apply(className: String, `data-hook`: String, name: String): Datahook = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("data-hook")(`data-hook`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Datahook]
  }
  
  @scala.inline
  implicit class DatahookMutableBuilder[Self <: Datahook] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setData-hook`(value: String): Self = StObject.set(x, "data-hook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
