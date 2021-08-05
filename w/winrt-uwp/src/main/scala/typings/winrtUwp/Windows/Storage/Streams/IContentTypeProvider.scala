package typings.winrtUwp.Windows.Storage.Streams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Characterizes the format of the data. */
trait IContentTypeProvider extends StObject {
  
  /** Gets the format of the data. */
  var contentType: String
}
object IContentTypeProvider {
  
  inline def apply(contentType: String): IContentTypeProvider = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContentTypeProvider]
  }
  
  extension [Self <: IContentTypeProvider](x: Self) {
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
  }
}
