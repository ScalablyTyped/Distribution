package typings.tabulatorTables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadHTML extends StObject {
  
  /** By default the HTML output is a simple un-styled table. if you would like to match the current table styling you can set the style property to true. */
  var style: js.UndefOr[Boolean] = js.undefined
}
object DownloadHTML {
  
  inline def apply(): DownloadHTML = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownloadHTML]
  }
  
  extension [Self <: DownloadHTML](x: Self) {
    
    inline def setStyle(value: Boolean): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
