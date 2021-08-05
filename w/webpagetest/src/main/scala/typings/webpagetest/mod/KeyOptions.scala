package typings.webpagetest.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyOptions extends StObject {
  
  /** API key (if assigned). Contact the WebPageTest server administrator for a key if required */
  var key: js.UndefOr[String] = js.undefined
}
object KeyOptions {
  
  inline def apply(): KeyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyOptions]
  }
  
  extension [Self <: KeyOptions](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
