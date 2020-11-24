package typings.unsplashJs.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessKey extends js.Object {
  
  var accessKey: String = js.native
  
  var apiUrl: js.UndefOr[String] = js.native
  
  var apiVersion: js.UndefOr[String] = js.native
  
  var bearerToken: js.UndefOr[String] = js.native
  
  var callbackUrl: js.UndefOr[String] = js.native
  
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  
  var secret: js.UndefOr[String] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
object AccessKey {
  
  @scala.inline
  def apply(accessKey: String): AccessKey = {
    val __obj = js.Dynamic.literal(accessKey = accessKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessKey]
  }
  
  @scala.inline
  implicit class AccessKeyOps[Self <: AccessKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccessKey(value: String): Self = this.set("accessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiUrl(value: String): Self = this.set("apiUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiUrl: Self = this.set("apiUrl", js.undefined)
    
    @scala.inline
    def setApiVersion(value: String): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
    
    @scala.inline
    def setBearerToken(value: String): Self = this.set("bearerToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBearerToken: Self = this.set("bearerToken", js.undefined)
    
    @scala.inline
    def setCallbackUrl(value: String): Self = this.set("callbackUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallbackUrl: Self = this.set("callbackUrl", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setSecret(value: String): Self = this.set("secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecret: Self = this.set("secret", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
