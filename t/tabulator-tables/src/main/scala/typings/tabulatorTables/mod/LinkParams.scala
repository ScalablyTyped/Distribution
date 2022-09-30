package typings.tabulatorTables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkParams
  extends StObject
     with _FormatterParams {
  
  var download: js.UndefOr[Boolean] = js.undefined
  
  var label: js.UndefOr[String | (js.Function1[/* cell */ CellComponent, String])] = js.undefined
  
  // Link
  var labelField: js.UndefOr[String] = js.undefined
  
  var target: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String | (js.Function1[/* cell */ CellComponent, String])] = js.undefined
  
  var urlField: js.UndefOr[String] = js.undefined
  
  var urlPrefix: js.UndefOr[String] = js.undefined
}
object LinkParams {
  
  inline def apply(): LinkParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkParams]
  }
  
  extension [Self <: LinkParams](x: Self) {
    
    inline def setDownload(value: Boolean): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    inline def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
    
    inline def setLabel(value: String | (js.Function1[/* cell */ CellComponent, String])): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelField(value: String): Self = StObject.set(x, "labelField", value.asInstanceOf[js.Any])
    
    inline def setLabelFieldUndefined: Self = StObject.set(x, "labelField", js.undefined)
    
    inline def setLabelFunction1(value: /* cell */ CellComponent => String): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setUrl(value: String | (js.Function1[/* cell */ CellComponent, String])): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlField(value: String): Self = StObject.set(x, "urlField", value.asInstanceOf[js.Any])
    
    inline def setUrlFieldUndefined: Self = StObject.set(x, "urlField", js.undefined)
    
    inline def setUrlFunction1(value: /* cell */ CellComponent => String): Self = StObject.set(x, "url", js.Any.fromFunction1(value))
    
    inline def setUrlPrefix(value: String): Self = StObject.set(x, "urlPrefix", value.asInstanceOf[js.Any])
    
    inline def setUrlPrefixUndefined: Self = StObject.set(x, "urlPrefix", js.undefined)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
