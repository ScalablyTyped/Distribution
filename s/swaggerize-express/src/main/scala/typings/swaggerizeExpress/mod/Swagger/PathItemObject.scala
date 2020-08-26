package typings.swaggerizeExpress.mod.Swagger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathItemObject extends js.Object {
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.native
  var delete: js.UndefOr[OperationObject] = js.native
  var get: js.UndefOr[OperationObject] = js.native
  var head: js.UndefOr[OperationObject] = js.native
  var options: js.UndefOr[OperationObject] = js.native
  var parameters: js.UndefOr[Parameters] = js.native
  var patch: js.UndefOr[OperationObject] = js.native
  var post: js.UndefOr[OperationObject] = js.native
  var put: js.UndefOr[OperationObject] = js.native
}

object PathItemObject {
  @scala.inline
  def apply(): PathItemObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathItemObject]
  }
  @scala.inline
  implicit class PathItemObjectOps[Self <: PathItemObject] (val x: Self) extends AnyVal {
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
    def set$ref(value: String): Self = this.set("$ref", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$ref: Self = this.set("$ref", js.undefined)
    @scala.inline
    def setDelete(value: OperationObject): Self = this.set("delete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelete: Self = this.set("delete", js.undefined)
    @scala.inline
    def setGet(value: OperationObject): Self = this.set("get", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGet: Self = this.set("get", js.undefined)
    @scala.inline
    def setHead(value: OperationObject): Self = this.set("head", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHead: Self = this.set("head", js.undefined)
    @scala.inline
    def setOptions(value: OperationObject): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setParametersVarargs(value: (ParameterObject | ReferenceObject)*): Self = this.set("parameters", js.Array(value :_*))
    @scala.inline
    def setParameters(value: Parameters): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    @scala.inline
    def setPatch(value: OperationObject): Self = this.set("patch", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePatch: Self = this.set("patch", js.undefined)
    @scala.inline
    def setPost(value: OperationObject): Self = this.set("post", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePost: Self = this.set("post", js.undefined)
    @scala.inline
    def setPut(value: OperationObject): Self = this.set("put", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePut: Self = this.set("put", js.undefined)
  }
  
}

