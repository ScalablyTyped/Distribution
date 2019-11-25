package typings.swaggerDashExpressDashMiddleware.swaggerDashExpressDashMiddlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathItemObject extends js.Object {
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.undefined
  var delete: js.UndefOr[OperationObject] = js.undefined
  var get: js.UndefOr[OperationObject] = js.undefined
  var head: js.UndefOr[OperationObject] = js.undefined
  var options: js.UndefOr[OperationObject] = js.undefined
  var parameters: js.UndefOr[Parameters] = js.undefined
  var patch: js.UndefOr[OperationObject] = js.undefined
  var post: js.UndefOr[OperationObject] = js.undefined
  var put: js.UndefOr[OperationObject] = js.undefined
}

object PathItemObject {
  @scala.inline
  def apply(
    $ref: String = null,
    delete: OperationObject = null,
    get: OperationObject = null,
    head: OperationObject = null,
    options: OperationObject = null,
    parameters: Parameters = null,
    patch: OperationObject = null,
    post: OperationObject = null,
    put: OperationObject = null
  ): PathItemObject = {
    val __obj = js.Dynamic.literal()
    if ($ref != null) __obj.updateDynamic("$ref")($ref.asInstanceOf[js.Any])
    if (delete != null) __obj.updateDynamic("delete")(delete.asInstanceOf[js.Any])
    if (get != null) __obj.updateDynamic("get")(get.asInstanceOf[js.Any])
    if (head != null) __obj.updateDynamic("head")(head.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (patch != null) __obj.updateDynamic("patch")(patch.asInstanceOf[js.Any])
    if (post != null) __obj.updateDynamic("post")(post.asInstanceOf[js.Any])
    if (put != null) __obj.updateDynamic("put")(put.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathItemObject]
  }
}

