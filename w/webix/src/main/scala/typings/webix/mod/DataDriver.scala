package typings.webix.mod

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
  
  @JSImport("webix", "DataDriver")
  @js.native
  val ^ : DataDriver = js.native
  
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
