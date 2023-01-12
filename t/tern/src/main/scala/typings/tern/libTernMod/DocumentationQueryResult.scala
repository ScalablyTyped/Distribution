package typings.tern.libTernMod

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
  
  inline def apply(): DocumentationQueryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentationQueryResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentationQueryResult] (val x: Self) extends AnyVal {
    
    inline def setDoc(value: String): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
    
    inline def setDocUndefined: Self = StObject.set(x, "doc", js.undefined)
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
