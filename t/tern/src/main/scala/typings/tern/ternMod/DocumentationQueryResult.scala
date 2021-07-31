package typings.tern.ternMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentationQueryResult extends StObject {
  
  /** The documentation string of the definition or value, if any. */
  var doc: js.UndefOr[String] = js.undefined
  
  /** The origin of the definition or value, if any. */
  var origin: js.UndefOr[String] = js.undefined
  
  /** The url of the definition or value, if any. */
  var url: js.UndefOr[String] = js.undefined
}
object DocumentationQueryResult {
  
  @scala.inline
  def apply(): DocumentationQueryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentationQueryResult]
  }
  
  @scala.inline
  implicit class DocumentationQueryResultMutableBuilder[Self <: DocumentationQueryResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDoc(value: String): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocUndefined: Self = StObject.set(x, "doc", js.undefined)
    
    @scala.inline
    def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
