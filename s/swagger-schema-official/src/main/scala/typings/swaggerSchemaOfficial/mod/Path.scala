package typings.swaggerSchemaOfficial.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Path extends js.Object {
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.undefined
  var delete: js.UndefOr[Operation] = js.undefined
  var get: js.UndefOr[Operation] = js.undefined
  var head: js.UndefOr[Operation] = js.undefined
  var options: js.UndefOr[Operation] = js.undefined
  var parameters: js.UndefOr[js.Array[Parameter | Reference]] = js.undefined
  var patch: js.UndefOr[Operation] = js.undefined
  var post: js.UndefOr[Operation] = js.undefined
  var put: js.UndefOr[Operation] = js.undefined
}

object Path {
  @scala.inline
  def apply(
    $ref: String = null,
    delete: Operation = null,
    get: Operation = null,
    head: Operation = null,
    options: Operation = null,
    parameters: js.Array[Parameter | Reference] = null,
    patch: Operation = null,
    post: Operation = null,
    put: Operation = null
  ): Path = {
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
    __obj.asInstanceOf[Path]
  }
}

