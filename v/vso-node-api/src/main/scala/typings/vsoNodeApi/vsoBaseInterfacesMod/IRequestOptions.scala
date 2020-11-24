package typings.vsoNodeApi.vsoBaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRequestOptions extends js.Object {
  
  var cert: js.UndefOr[ICertConfiguration] = js.native
  
  var ignoreSslError: js.UndefOr[Boolean] = js.native
  
  var proxy: js.UndefOr[IProxyConfiguration] = js.native
  
  var socketTimeout: js.UndefOr[Double] = js.native
}
object IRequestOptions {
  
  @scala.inline
  def apply(): IRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRequestOptions]
  }
  
  @scala.inline
  implicit class IRequestOptionsOps[Self <: IRequestOptions] (val x: Self) extends AnyVal {
    
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
    def setCert(value: ICertConfiguration): Self = this.set("cert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCert: Self = this.set("cert", js.undefined)
    
    @scala.inline
    def setIgnoreSslError(value: Boolean): Self = this.set("ignoreSslError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreSslError: Self = this.set("ignoreSslError", js.undefined)
    
    @scala.inline
    def setProxy(value: IProxyConfiguration): Self = this.set("proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    
    @scala.inline
    def setSocketTimeout(value: Double): Self = this.set("socketTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocketTimeout: Self = this.set("socketTimeout", js.undefined)
  }
}
