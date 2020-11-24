package typings.swaggerExpressValidator.mod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var allowNullable: js.UndefOr[Boolean] = js.native
  
  var requestValidationFn: js.UndefOr[
    js.Function3[
      /* req */ Request_[ParamsDictionary, _, _, Query], 
      /* data */ js.Any, 
      /* errors */ js.Any, 
      Unit
    ]
  ] = js.native
  
  var responseValidationFn: js.UndefOr[
    js.Function3[
      /* req */ Request_[ParamsDictionary, _, _, Query], 
      /* data */ js.Any, 
      /* errors */ js.Any, 
      Unit
    ]
  ] = js.native
  
  var schema: String = js.native
  
  var validateRequest: js.UndefOr[Boolean] = js.native
  
  var validateResponse: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(schema: String): Options = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setSchema(value: String): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowNullable(value: Boolean): Self = this.set("allowNullable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowNullable: Self = this.set("allowNullable", js.undefined)
    
    @scala.inline
    def setRequestValidationFn(
      value: (/* req */ Request_[ParamsDictionary, _, _, Query], /* data */ js.Any, /* errors */ js.Any) => Unit
    ): Self = this.set("requestValidationFn", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteRequestValidationFn: Self = this.set("requestValidationFn", js.undefined)
    
    @scala.inline
    def setResponseValidationFn(
      value: (/* req */ Request_[ParamsDictionary, _, _, Query], /* data */ js.Any, /* errors */ js.Any) => Unit
    ): Self = this.set("responseValidationFn", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteResponseValidationFn: Self = this.set("responseValidationFn", js.undefined)
    
    @scala.inline
    def setValidateRequest(value: Boolean): Self = this.set("validateRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateRequest: Self = this.set("validateRequest", js.undefined)
    
    @scala.inline
    def setValidateResponse(value: Boolean): Self = this.set("validateResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateResponse: Self = this.set("validateResponse", js.undefined)
  }
}
