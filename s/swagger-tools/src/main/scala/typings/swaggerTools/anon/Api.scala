package typings.swaggerTools.anon

import typings.swaggerTools.mod.SwaggerRequestParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Api extends js.Object {
  var api: js.Any = js.native
  var apiDeclaration: js.Any = js.native
  var apiIndex: Double = js.native
  var authorizations: js.UndefOr[js.Any] = js.native
  var operation: js.UndefOr[js.Any] = js.native
  var operationPath: js.UndefOr[js.Array[String]] = js.native
  var params: SwaggerRequestParameters = js.native
  var resourceIndex: Double = js.native
  var resourceListing: js.Any = js.native
  var swaggerVersion: String = js.native
  var useStubs: js.UndefOr[Boolean] = js.native
}

object Api {
  @scala.inline
  def apply(
    api: js.Any,
    apiDeclaration: js.Any,
    apiIndex: Double,
    params: SwaggerRequestParameters,
    resourceIndex: Double,
    resourceListing: js.Any,
    swaggerVersion: String
  ): Api = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], apiDeclaration = apiDeclaration.asInstanceOf[js.Any], apiIndex = apiIndex.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], resourceIndex = resourceIndex.asInstanceOf[js.Any], resourceListing = resourceListing.asInstanceOf[js.Any], swaggerVersion = swaggerVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Api]
  }
  @scala.inline
  implicit class ApiOps[Self <: Api] (val x: Self) extends AnyVal {
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
    def setApi(value: js.Any): Self = this.set("api", value.asInstanceOf[js.Any])
    @scala.inline
    def setApiDeclaration(value: js.Any): Self = this.set("apiDeclaration", value.asInstanceOf[js.Any])
    @scala.inline
    def setApiIndex(value: Double): Self = this.set("apiIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setParams(value: SwaggerRequestParameters): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceIndex(value: Double): Self = this.set("resourceIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceListing(value: js.Any): Self = this.set("resourceListing", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwaggerVersion(value: String): Self = this.set("swaggerVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthorizations(value: js.Any): Self = this.set("authorizations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorizations: Self = this.set("authorizations", js.undefined)
    @scala.inline
    def setOperation(value: js.Any): Self = this.set("operation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperation: Self = this.set("operation", js.undefined)
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

