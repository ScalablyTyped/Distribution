package typings.stripe.mod.accounts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPersonDocumentCreateUpdateOptions extends StObject {
  
  /**
    * The back of an ID returned by a file upload with a purpose value of identity_document.
    * The uploaded file needs to be a color image (smaller than 8,000px by 8,000px),
    * in JPG or PNG format, and less than 10 MB in size.
    */
  var back: js.UndefOr[String] = js.undefined
  
  /**
    * The front of an ID returned by a file upload with a purpose value of identity_document.
    * The uploaded file needs to be a color image (smaller than 8,000px by 8,000px),
    * in JPG or PNG format, and less than 10 MB in size.
    */
  var front: js.UndefOr[String] = js.undefined
}
object IPersonDocumentCreateUpdateOptions {
  
  inline def apply(): IPersonDocumentCreateUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPersonDocumentCreateUpdateOptions]
  }
  
  extension [Self <: IPersonDocumentCreateUpdateOptions](x: Self) {
    
    inline def setBack(value: String): Self = StObject.set(x, "back", value.asInstanceOf[js.Any])
    
    inline def setBackUndefined: Self = StObject.set(x, "back", js.undefined)
    
    inline def setFront(value: String): Self = StObject.set(x, "front", value.asInstanceOf[js.Any])
    
    inline def setFrontUndefined: Self = StObject.set(x, "front", js.undefined)
  }
}
