package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataDriver extends StObject {
  
  var csv: obj
  
  var excel: String
  
  var html: obj
  
  var htmltable: obj
  
  var jsarray: obj
  
  var json: obj
  
  var xml: obj
}
object DataDriver {
  
  inline def apply(csv: obj, excel: String, html: obj, htmltable: obj, jsarray: obj, json: obj, xml: obj): DataDriver = {
    val __obj = js.Dynamic.literal(csv = csv.asInstanceOf[js.Any], excel = excel.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], htmltable = htmltable.asInstanceOf[js.Any], jsarray = jsarray.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], xml = xml.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataDriver]
  }
  
  extension [Self <: DataDriver](x: Self) {
    
    inline def setCsv(value: obj): Self = StObject.set(x, "csv", value.asInstanceOf[js.Any])
    
    inline def setExcel(value: String): Self = StObject.set(x, "excel", value.asInstanceOf[js.Any])
    
    inline def setHtml(value: obj): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setHtmltable(value: obj): Self = StObject.set(x, "htmltable", value.asInstanceOf[js.Any])
    
    inline def setJsarray(value: obj): Self = StObject.set(x, "jsarray", value.asInstanceOf[js.Any])
    
    inline def setJson(value: obj): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    inline def setXml(value: obj): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
  }
}
