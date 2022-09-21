package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataDriver extends StObject {
  
  var csv: Any
  
  var excel: String
  
  var html: Any
  
  var htmltable: Any
  
  var jsarray: Any
  
  var json: Any
  
  var xml: Any
}
object DataDriver {
  
  inline def apply(csv: Any, excel: String, html: Any, htmltable: Any, jsarray: Any, json: Any, xml: Any): DataDriver = {
    val __obj = js.Dynamic.literal(csv = csv.asInstanceOf[js.Any], excel = excel.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], htmltable = htmltable.asInstanceOf[js.Any], jsarray = jsarray.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], xml = xml.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataDriver]
  }
  
  extension [Self <: DataDriver](x: Self) {
    
    inline def setCsv(value: Any): Self = StObject.set(x, "csv", value.asInstanceOf[js.Any])
    
    inline def setExcel(value: String): Self = StObject.set(x, "excel", value.asInstanceOf[js.Any])
    
    inline def setHtml(value: Any): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setHtmltable(value: Any): Self = StObject.set(x, "htmltable", value.asInstanceOf[js.Any])
    
    inline def setJsarray(value: Any): Self = StObject.set(x, "jsarray", value.asInstanceOf[js.Any])
    
    inline def setJson(value: Any): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    inline def setXml(value: Any): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
  }
}
