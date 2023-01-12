package typings.vegaLite.buildSrcDataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UrlData
  extends StObject
     with DataBase
     with DataSource {
  
  /**
    * An URL from which to load the data set. Use the `format.type` property
    * to ensure the loaded data is correctly parsed.
    */
  var url: String
}
object UrlData {
  
  inline def apply(url: String): UrlData = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UrlData] (val x: Self) extends AnyVal {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
