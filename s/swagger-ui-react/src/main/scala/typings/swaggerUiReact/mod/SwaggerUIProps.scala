package typings.swaggerUiReact.mod

import typings.swaggerUiReact.swaggerUiReactStrings.full
import typings.swaggerUiReact.swaggerUiReactStrings.list
import typings.swaggerUiReact.swaggerUiReactStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwaggerUIProps extends js.Object {
  
  var deepLinking: js.UndefOr[Boolean] = js.native
  
  var defaultModelExpandDepth: js.UndefOr[Double] = js.native
  
  var docExpansion: js.UndefOr[list | full | none] = js.native
  
  var onComplete: js.UndefOr[js.Function1[/* system */ System, Unit]] = js.native
  
  var plugins: js.UndefOr[js.Array[Plugin]] = js.native
  
  var requestInterceptor: js.UndefOr[js.Function1[/* req */ Request, Request | js.Promise[Request]]] = js.native
  
  var responseInterceptor: js.UndefOr[js.Function1[/* res */ Response, Response | js.Promise[Response]]] = js.native
  
  var spec: js.UndefOr[js.Object | String] = js.native
  
  var supportedSubmitMethods: js.UndefOr[js.Array[String]] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object SwaggerUIProps {
  
  @scala.inline
  def apply(): SwaggerUIProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwaggerUIProps]
  }
  
  @scala.inline
  implicit class SwaggerUIPropsOps[Self <: SwaggerUIProps] (val x: Self) extends AnyVal {
    
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
    def setDeepLinking(value: Boolean): Self = this.set("deepLinking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeepLinking: Self = this.set("deepLinking", js.undefined)
    
    @scala.inline
    def setDefaultModelExpandDepth(value: Double): Self = this.set("defaultModelExpandDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultModelExpandDepth: Self = this.set("defaultModelExpandDepth", js.undefined)
    
    @scala.inline
    def setDocExpansion(value: list | full | none): Self = this.set("docExpansion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocExpansion: Self = this.set("docExpansion", js.undefined)
    
    @scala.inline
    def setOnComplete(value: /* system */ System => Unit): Self = this.set("onComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnComplete: Self = this.set("onComplete", js.undefined)
    
    @scala.inline
    def setPluginsVarargs(value: Plugin*): Self = this.set("plugins", js.Array(value :_*))
    
    @scala.inline
    def setPlugins(value: js.Array[Plugin]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    
    @scala.inline
    def setRequestInterceptor(value: /* req */ Request => Request | js.Promise[Request]): Self = this.set("requestInterceptor", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRequestInterceptor: Self = this.set("requestInterceptor", js.undefined)
    
    @scala.inline
    def setResponseInterceptor(value: /* res */ Response => Response | js.Promise[Response]): Self = this.set("responseInterceptor", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteResponseInterceptor: Self = this.set("responseInterceptor", js.undefined)
    
    @scala.inline
    def setSpec(value: js.Object | String): Self = this.set("spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpec: Self = this.set("spec", js.undefined)
    
    @scala.inline
    def setSupportedSubmitMethodsVarargs(value: String*): Self = this.set("supportedSubmitMethods", js.Array(value :_*))
    
    @scala.inline
    def setSupportedSubmitMethods(value: js.Array[String]): Self = this.set("supportedSubmitMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedSubmitMethods: Self = this.set("supportedSubmitMethods", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
