package typings.swaggerTools.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwaggerRouter12Options extends js.Object {
  
  var controllers: js.UndefOr[SwaggerRouter12OptionsControllers | String | js.Array[String]] = js.native
  
  var ignoreMissingHandlers: js.UndefOr[Boolean] = js.native
  
  var useStubs: js.UndefOr[Boolean] = js.native
}
object SwaggerRouter12Options {
  
  @scala.inline
  def apply(): SwaggerRouter12Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwaggerRouter12Options]
  }
  
  @scala.inline
  implicit class SwaggerRouter12OptionsOps[Self <: SwaggerRouter12Options] (val x: Self) extends AnyVal {
    
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
    def setControllersVarargs(value: String*): Self = this.set("controllers", js.Array(value :_*))
    
    @scala.inline
    def setControllers(value: SwaggerRouter12OptionsControllers | String | js.Array[String]): Self = this.set("controllers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControllers: Self = this.set("controllers", js.undefined)
    
    @scala.inline
    def setIgnoreMissingHandlers(value: Boolean): Self = this.set("ignoreMissingHandlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreMissingHandlers: Self = this.set("ignoreMissingHandlers", js.undefined)
    
    @scala.inline
    def setUseStubs(value: Boolean): Self = this.set("useStubs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseStubs: Self = this.set("useStubs", js.undefined)
  }
}
