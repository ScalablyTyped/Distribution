package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataDriver extends StObject {
  
  var csv: js.Any
  
  var excel: String
  
  var html: js.Any
  
  var htmltable: js.Any
  
  var jsarray: js.Any
  
  var json: js.Any
  
  var xml: js.Any
}
object DataDriver {
  
  @JSImport("webix", "DataDriver")
  @js.native
  val ^ : DataDriver = js.native
  
  @scala.inline
  implicit class DataDriverMutableBuilder[Self <: DataDriver] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCsv(value: js.Any): Self = StObject.set(x, "csv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcel(value: String): Self = StObject.set(x, "excel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml(value: js.Any): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmltable(value: js.Any): Self = StObject.set(x, "htmltable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsarray(value: js.Any): Self = StObject.set(x, "jsarray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJson(value: js.Any): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXml(value: js.Any): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
  }
}
