package typings.stripe.mod.accounts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPersonDocumentCreateUpdateOptions extends StObject {
  
  /**
    * The back of an ID returned by a file upload with a purpose value of identity_document.
    * The uploaded file needs to be a color image (smaller than 8,000px by 8,000px),
    * in JPG or PNG format, and less than 10 MB in size.
    */
  var back: js.UndefOr[String] = js.native
  
  /**
    * The front of an ID returned by a file upload with a purpose value of identity_document.
    * The uploaded file needs to be a color image (smaller than 8,000px by 8,000px),
    * in JPG or PNG format, and less than 10 MB in size.
    */
  var front: js.UndefOr[String] = js.native
}
object IPersonDocumentCreateUpdateOptions {
  
  @scala.inline
  def apply(): IPersonDocumentCreateUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPersonDocumentCreateUpdateOptions]
  }
  
  @scala.inline
  implicit class IPersonDocumentCreateUpdateOptionsMutableBuilder[Self <: IPersonDocumentCreateUpdateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBack(value: String): Self = StObject.set(x, "back", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackUndefined: Self = StObject.set(x, "back", js.undefined)
    
    @scala.inline
    def setFront(value: String): Self = StObject.set(x, "front", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrontUndefined: Self = StObject.set(x, "front", js.undefined)
  }
}
