package typings.typedRestClient.restClientMod

import typings.typedRestClient.interfacesMod.IHeaders
import typings.typedRestClient.interfacesMod.IRequestQueryParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRequestOptions extends js.Object {
  
  var acceptHeader: js.UndefOr[String] = js.native
  
  var additionalHeaders: js.UndefOr[IHeaders] = js.native
  
  var deserializeDates: js.UndefOr[Boolean] = js.native
  
  var queryParameters: js.UndefOr[IRequestQueryParams] = js.native
  
  var responseProcessor: js.UndefOr[js.Function] = js.native
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
    def setAcceptHeader(value: String): Self = this.set("acceptHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceptHeader: Self = this.set("acceptHeader", js.undefined)
    
    @scala.inline
    def setAdditionalHeaders(value: IHeaders): Self = this.set("additionalHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalHeaders: Self = this.set("additionalHeaders", js.undefined)
    
    @scala.inline
    def setDeserializeDates(value: Boolean): Self = this.set("deserializeDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeserializeDates: Self = this.set("deserializeDates", js.undefined)
    
    @scala.inline
    def setQueryParameters(value: IRequestQueryParams): Self = this.set("queryParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryParameters: Self = this.set("queryParameters", js.undefined)
    
    @scala.inline
    def setResponseProcessor(value: js.Function): Self = this.set("responseProcessor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseProcessor: Self = this.set("responseProcessor", js.undefined)
  }
}
