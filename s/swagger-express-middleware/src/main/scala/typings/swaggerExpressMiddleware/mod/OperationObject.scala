package typings.swaggerExpressMiddleware.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationObject extends js.Object {
  var consumes: js.UndefOr[MimeTypes] = js.native
  var deprecated: js.UndefOr[Boolean] = js.native
  var description: js.UndefOr[String] = js.native
  var externalDocs: js.UndefOr[ExternalDocumentationObject] = js.native
  var operationId: js.UndefOr[String] = js.native
  var parameters: js.UndefOr[Parameters] = js.native
  var produces: js.UndefOr[MimeTypes] = js.native
  var responses: ResponsesObject = js.native
  var schemes: js.UndefOr[js.Array[String]] = js.native
  var security: js.UndefOr[js.Array[SecurityRequirementObject]] = js.native
  var summary: js.UndefOr[String] = js.native
  var tags: js.UndefOr[js.Array[String]] = js.native
}

object OperationObject {
  @scala.inline
  def apply(responses: ResponsesObject): OperationObject = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationObject]
  }
  @scala.inline
  implicit class OperationObjectOps[Self <: OperationObject] (val x: Self) extends AnyVal {
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
    def setResponses(value: ResponsesObject): Self = this.set("responses", value.asInstanceOf[js.Any])
    @scala.inline
    def setConsumesVarargs(value: String*): Self = this.set("consumes", js.Array(value :_*))
    @scala.inline
    def setConsumes(value: MimeTypes): Self = this.set("consumes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsumes: Self = this.set("consumes", js.undefined)
    @scala.inline
    def setDeprecated(value: Boolean): Self = this.set("deprecated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeprecated: Self = this.set("deprecated", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setExternalDocs(value: ExternalDocumentationObject): Self = this.set("externalDocs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalDocs: Self = this.set("externalDocs", js.undefined)
    @scala.inline
    def setOperationId(value: String): Self = this.set("operationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationId: Self = this.set("operationId", js.undefined)
    @scala.inline
    def setParametersVarargs(value: (ParameterObject | ReferenceObject)*): Self = this.set("parameters", js.Array(value :_*))
    @scala.inline
    def setParameters(value: Parameters): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    @scala.inline
    def setProducesVarargs(value: String*): Self = this.set("produces", js.Array(value :_*))
    @scala.inline
    def setProduces(value: MimeTypes): Self = this.set("produces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProduces: Self = this.set("produces", js.undefined)
    @scala.inline
    def setSchemesVarargs(value: String*): Self = this.set("schemes", js.Array(value :_*))
    @scala.inline
    def setSchemes(value: js.Array[String]): Self = this.set("schemes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemes: Self = this.set("schemes", js.undefined)
    @scala.inline
    def setSecurityVarargs(value: SecurityRequirementObject*): Self = this.set("security", js.Array(value :_*))
    @scala.inline
    def setSecurity(value: js.Array[SecurityRequirementObject]): Self = this.set("security", value.asInstanceOf[js.Any])
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

