package typings.tensorflowTfjsCore.typesMod

import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SaveResult extends js.Object {
  
  /**
    * Error messages and related data (if any).
    */
  var errors: js.UndefOr[js.Array[js.Object | String]] = js.native
  
  /**
    * Information about the model artifacts saved.
    */
  var modelArtifactsInfo: ModelArtifactsInfo = js.native
  
  /**
    * HTTP responses from the server that handled the model-saving request (if
    * any). This is applicable only to server-based saving routes.
    */
  var responses: js.UndefOr[js.Array[Response]] = js.native
}
object SaveResult {
  
  @scala.inline
  def apply(modelArtifactsInfo: ModelArtifactsInfo): SaveResult = {
    val __obj = js.Dynamic.literal(modelArtifactsInfo = modelArtifactsInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveResult]
  }
  
  @scala.inline
  implicit class SaveResultOps[Self <: SaveResult] (val x: Self) extends AnyVal {
    
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
    def setModelArtifactsInfo(value: ModelArtifactsInfo): Self = this.set("modelArtifactsInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsVarargs(value: (js.Object | String)*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[js.Object | String]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    
    @scala.inline
    def setResponsesVarargs(value: Response*): Self = this.set("responses", js.Array(value :_*))
    
    @scala.inline
    def setResponses(value: js.Array[Response]): Self = this.set("responses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponses: Self = this.set("responses", js.undefined)
  }
}
