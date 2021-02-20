package typings.wordpressBlockEditor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AjaxUrl extends StObject {
  
  var ajaxUrl: String = js.native
  
  var nonce: String = js.native
  
  var unlockNonce: String = js.native
}
object AjaxUrl {
  
  @scala.inline
  def apply(ajaxUrl: String, nonce: String, unlockNonce: String): AjaxUrl = {
    val __obj = js.Dynamic.literal(ajaxUrl = ajaxUrl.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], unlockNonce = unlockNonce.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxUrl]
  }
  
  @scala.inline
  implicit class AjaxUrlMutableBuilder[Self <: AjaxUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAjaxUrl(value: String): Self = StObject.set(x, "ajaxUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnlockNonce(value: String): Self = StObject.set(x, "unlockNonce", value.asInstanceOf[js.Any])
  }
}
