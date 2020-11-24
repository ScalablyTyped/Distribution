package typings.swaggerUiExpress.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwaggerUiOptions extends js.Object {
  
  var customCss: js.UndefOr[String] = js.native
  
  var customCssUrl: js.UndefOr[String] = js.native
  
  var customJs: js.UndefOr[String] = js.native
  
  var customSiteTitle: js.UndefOr[String] = js.native
  
  var customfavIcon: js.UndefOr[String] = js.native
  
  var explorer: js.UndefOr[Boolean] = js.native
  
  var isExplorer: js.UndefOr[Boolean] = js.native
  
  var swaggerOptions: js.UndefOr[SwaggerOptions] = js.native
  
  var swaggerUrl: js.UndefOr[String] = js.native
  
  var swaggerUrls: js.UndefOr[js.Array[String]] = js.native
}
object SwaggerUiOptions {
  
  @scala.inline
  def apply(): SwaggerUiOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwaggerUiOptions]
  }
  
  @scala.inline
  implicit class SwaggerUiOptionsOps[Self <: SwaggerUiOptions] (val x: Self) extends AnyVal {
    
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
    def setCustomCss(value: String): Self = this.set("customCss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomCss: Self = this.set("customCss", js.undefined)
    
    @scala.inline
    def setCustomCssUrl(value: String): Self = this.set("customCssUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomCssUrl: Self = this.set("customCssUrl", js.undefined)
    
    @scala.inline
    def setCustomJs(value: String): Self = this.set("customJs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomJs: Self = this.set("customJs", js.undefined)
    
    @scala.inline
    def setCustomSiteTitle(value: String): Self = this.set("customSiteTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomSiteTitle: Self = this.set("customSiteTitle", js.undefined)
    
    @scala.inline
    def setCustomfavIcon(value: String): Self = this.set("customfavIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomfavIcon: Self = this.set("customfavIcon", js.undefined)
    
    @scala.inline
    def setExplorer(value: Boolean): Self = this.set("explorer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplorer: Self = this.set("explorer", js.undefined)
    
    @scala.inline
    def setIsExplorer(value: Boolean): Self = this.set("isExplorer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsExplorer: Self = this.set("isExplorer", js.undefined)
    
    @scala.inline
    def setSwaggerOptions(value: SwaggerOptions): Self = this.set("swaggerOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwaggerOptions: Self = this.set("swaggerOptions", js.undefined)
    
    @scala.inline
    def setSwaggerUrl(value: String): Self = this.set("swaggerUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwaggerUrl: Self = this.set("swaggerUrl", js.undefined)
    
    @scala.inline
    def setSwaggerUrlsVarargs(value: String*): Self = this.set("swaggerUrls", js.Array(value :_*))
    
    @scala.inline
    def setSwaggerUrls(value: js.Array[String]): Self = this.set("swaggerUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwaggerUrls: Self = this.set("swaggerUrls", js.undefined)
  }
}
