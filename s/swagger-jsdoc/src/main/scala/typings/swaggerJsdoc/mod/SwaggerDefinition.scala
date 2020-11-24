package typings.swaggerJsdoc.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwaggerDefinition
  extends /* key */ StringDictionary[js.Any] {
  
  var basePath: js.UndefOr[String] = js.native
  
  var host: js.UndefOr[String] = js.native
  
  var info: ApiInformation = js.native
  
  var openapi: js.UndefOr[String] = js.native
  
  var servers: js.UndefOr[js.Array[ServerInformation]] = js.native
}
object SwaggerDefinition {
  
  @scala.inline
  def apply(info: ApiInformation): SwaggerDefinition = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwaggerDefinition]
  }
  
  @scala.inline
  implicit class SwaggerDefinitionOps[Self <: SwaggerDefinition] (val x: Self) extends AnyVal {
    
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
    def setInfo(value: ApiInformation): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasePath(value: String): Self = this.set("basePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasePath: Self = this.set("basePath", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setOpenapi(value: String): Self = this.set("openapi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenapi: Self = this.set("openapi", js.undefined)
    
    @scala.inline
    def setServersVarargs(value: ServerInformation*): Self = this.set("servers", js.Array(value :_*))
    
    @scala.inline
    def setServers(value: js.Array[ServerInformation]): Self = this.set("servers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServers: Self = this.set("servers", js.undefined)
  }
}
