package typings.urlparser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Params extends js.Object {
  var params: js.Object = js.native
  var parts: js.Array[String] = js.native
}

object Params {
  @scala.inline
  def apply(params: js.Object, parts: js.Array[String]): Params = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params]
  }
  @scala.inline
  implicit class ParamsOps[Self <: Params] (val x: Self) extends AnyVal {
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
    def setParams(value: js.Object): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def setPartsVarargs(value: String*): Self = this.set("parts", js.Array(value :_*))
    @scala.inline
    def setParts(value: js.Array[String]): Self = this.set("parts", value.asInstanceOf[js.Any])
  }
  
}

