package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataDriver extends StObject {
  
  var csv: js.Any = js.native
  
  var excel: String = js.native
  
  var html: js.Any = js.native
  
  var htmltable: js.Any = js.native
  
  var jsarray: js.Any = js.native
  
  var json: js.Any = js.native
  
  var xml: js.Any = js.native
}
object DataDriver {
  
  @scala.inline
  def apply(
    csv: js.Any,
    excel: String,
    html: js.Any,
    htmltable: js.Any,
    jsarray: js.Any,
    json: js.Any,
    xml: js.Any
  ): DataDriver = {
    val __obj = js.Dynamic.literal(csv = csv.asInstanceOf[js.Any], excel = excel.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], htmltable = htmltable.asInstanceOf[js.Any], jsarray = jsarray.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], xml = xml.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataDriver]
  }
  
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
