package typings.tabulatorTables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadCSV extends StObject {
  
  /** If you need the output CSV to include a byte order mark (BOM) to ensure that output with UTF-8 characters can be correctly interpreted across different applications, you should set the bom option to true. */
  var bom: js.UndefOr[Boolean] = js.undefined
  
  /** By default CSV files are created using a comma (,) delimiter. If you need to change this for any reason the you can pass the options object with a delimiter property to the download function which will then use this delimiter instead of the comma. */
  var delimiter: js.UndefOr[String] = js.undefined
}
object DownloadCSV {
  
  inline def apply(): DownloadCSV = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownloadCSV]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DownloadCSV] (val x: Self) extends AnyVal {
    
    inline def setBom(value: Boolean): Self = StObject.set(x, "bom", value.asInstanceOf[js.Any])
    
    inline def setBomUndefined: Self = StObject.set(x, "bom", js.undefined)
    
    inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
  }
}
