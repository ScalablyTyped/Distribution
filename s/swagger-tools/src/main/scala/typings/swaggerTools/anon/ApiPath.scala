package typings.swaggerTools.anon

import typings.swaggerTools.mod.OperationParameter
import typings.swaggerTools.mod.Swagger20Operation
import typings.swaggerTools.mod.SwaggerRequestParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiPath[P /* <: SwaggerRequestParameters */] extends js.Object {
  var apiPath: String = js.native
  var operation: js.UndefOr[Swagger20Operation] = js.native
  var operationParameters: js.UndefOr[js.Array[OperationParameter]] = js.native
  var operationPath: js.UndefOr[js.Array[String]] = js.native
  var params: P = js.native
  var path: js.Any = js.native
  var security: js.Array[_] = js.native
  var swaggerObject: js.Any = js.native
  var swaggerVersion: String = js.native
  var useStubs: js.UndefOr[Boolean] = js.native
}

object ApiPath {
  @scala.inline
  def apply[/* <: typings.swaggerTools.mod.SwaggerRequestParameters */ P](
    apiPath: String,
    params: P,
    path: js.Any,
    security: js.Array[_],
    swaggerObject: js.Any,
    swaggerVersion: String
  ): ApiPath[P] = {
    val __obj = js.Dynamic.literal(apiPath = apiPath.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], security = security.asInstanceOf[js.Any], swaggerObject = swaggerObject.asInstanceOf[js.Any], swaggerVersion = swaggerVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiPath[P]]
  }
  @scala.inline
  implicit class ApiPathOps[Self <: ApiPath[_], /* <: typings.swaggerTools.mod.SwaggerRequestParameters */ P] (val x: Self with ApiPath[P]) extends AnyVal {
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
    def setApiPath(value: String): Self = this.set("apiPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setParams(value: P): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: js.Any): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecurityVarargs(value: js.Any*): Self = this.set("security", js.Array(value :_*))
    @scala.inline
    def setSecurity(value: js.Array[_]): Self = this.set("security", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwaggerObject(value: js.Any): Self = this.set("swaggerObject", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwaggerVersion(value: String): Self = this.set("swaggerVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperation(value: Swagger20Operation): Self = this.set("operation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperation: Self = this.set("operation", js.undefined)
    @scala.inline
    def setOperationParametersVarargs(value: OperationParameter*): Self = this.set("operationParameters", js.Array(value :_*))
    @scala.inline
    def setOperationParameters(value: js.Array[OperationParameter]): Self = this.set("operationParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationParameters: Self = this.set("operationParameters", js.undefined)
    @scala.inline
    def setOperationPathVarargs(value: String*): Self = this.set("operationPath", js.Array(value :_*))
    @scala.inline
    def setOperationPath(value: js.Array[String]): Self = this.set("operationPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationPath: Self = this.set("operationPath", js.undefined)
    @scala.inline
    def setUseStubs(value: Boolean): Self = this.set("useStubs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseStubs: Self = this.set("useStubs", js.undefined)
  }
  
}

