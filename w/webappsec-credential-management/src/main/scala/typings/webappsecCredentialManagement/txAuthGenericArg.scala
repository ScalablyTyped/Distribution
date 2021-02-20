package typings.webappsecCredentialManagement

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Type definitions for webauthn
// Spec: https://w3c.github.io/webauthn/
@js.native
trait txAuthGenericArg extends StObject {
  
  var content: ArrayBuffer = js.native
  
  var contentType: String = js.native
}
object txAuthGenericArg {
  
  @scala.inline
  def apply(content: ArrayBuffer, contentType: String): txAuthGenericArg = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[txAuthGenericArg]
  }
  
  @scala.inline
  implicit class txAuthGenericArgMutableBuilder[Self <: txAuthGenericArg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: ArrayBuffer): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
  }
}
