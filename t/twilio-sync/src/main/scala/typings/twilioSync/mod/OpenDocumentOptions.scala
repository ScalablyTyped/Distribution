package typings.twilioSync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for opening a document.
  */
trait OpenDocumentOptions
  extends StObject
     with OpenOptions {
  
  /**
    * The initial data of the Sync document.
    */
  var data: js.UndefOr[json] = js.undefined
}
object OpenDocumentOptions {
  
  inline def apply(): OpenDocumentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenDocumentOptions]
  }
  
  extension [Self <: OpenDocumentOptions](x: Self) {
    
    inline def setData(value: json): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
