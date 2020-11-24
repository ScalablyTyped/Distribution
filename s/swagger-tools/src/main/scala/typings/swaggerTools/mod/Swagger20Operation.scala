package typings.swaggerTools.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Swagger20Operation extends js.Object {
  
  var operationId: js.UndefOr[String] = js.native
  
  var parameters: js.UndefOr[js.Array[SwaggerParameterSchema]] = js.native
  
  var responses: StringDictionary[Swagger20Response] = js.native
  
  var security: js.UndefOr[js.Array[Swagger20Security]] = js.native
  
  var summary: js.UndefOr[String] = js.native
  
  var tags: js.UndefOr[js.Array[String]] = js.native
}
object Swagger20Operation {
  
  @scala.inline
  def apply(responses: StringDictionary[Swagger20Response]): Swagger20Operation = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Swagger20Operation]
  }
  
  @scala.inline
  implicit class Swagger20OperationOps[Self <: Swagger20Operation] (val x: Self) extends AnyVal {
    
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
    def setResponses(value: StringDictionary[Swagger20Response]): Self = this.set("responses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationId(value: String): Self = this.set("operationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationId: Self = this.set("operationId", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: SwaggerParameterSchema*): Self = this.set("parameters", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: js.Array[SwaggerParameterSchema]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    
    @scala.inline
    def setSecurityVarargs(value: Swagger20Security*): Self = this.set("security", js.Array(value :_*))
    
    @scala.inline
    def setSecurity(value: js.Array[Swagger20Security]): Self = this.set("security", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurity: Self = this.set("security", js.undefined)
    
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
