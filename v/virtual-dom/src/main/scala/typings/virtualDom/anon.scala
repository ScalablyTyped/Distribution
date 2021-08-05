package typings.virtualDom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Document extends StObject {
    
    var document: js.UndefOr[typings.std.Document] = js.undefined
    
    var warn: js.UndefOr[Boolean] = js.undefined
  }
  object Document {
    
    inline def apply(): Document = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Document]
    }
    
    extension [Self <: Document](x: Self) {
      
      inline def setDocument(value: typings.std.Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
      
      inline def setWarn(value: Boolean): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
      
      inline def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
    }
  }
}
