package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Object describing the current status of the wordlist. */
trait TokenDictStatusResponse extends StObject {
  
  /** Current wordlist status for the specified collection. */
  var status: js.UndefOr[String] = js.undefined
  
  /** The type for this wordlist. Can be `tokenization_dictionary` or `stopwords`. */
  var `type`: js.UndefOr[String] = js.undefined
}
object TokenDictStatusResponse {
  
  inline def apply(): TokenDictStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenDictStatusResponse]
  }
  
  extension [Self <: TokenDictStatusResponse](x: Self) {
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
