package typings.webpagetest.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListenOptions extends StObject {
  
  /** public x509 certificate file path to use for SSL */
  var cert: js.UndefOr[String] = js.undefined
  
  /** private key file path to use for SSL */
  var key: js.UndefOr[String] = js.undefined
}
object ListenOptions {
  
  @scala.inline
  def apply(): ListenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListenOptions]
  }
  
  @scala.inline
  implicit class ListenOptionsMutableBuilder[Self <: ListenOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
