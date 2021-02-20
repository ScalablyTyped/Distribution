package typings.webpagetest.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyOptions extends StObject {
  
  /** API key (if assigned). Contact the WebPageTest server administrator for a key if required */
  var key: js.UndefOr[String] = js.native
}
object KeyOptions {
  
  @scala.inline
  def apply(): KeyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyOptions]
  }
  
  @scala.inline
  implicit class KeyOptionsMutableBuilder[Self <: KeyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
