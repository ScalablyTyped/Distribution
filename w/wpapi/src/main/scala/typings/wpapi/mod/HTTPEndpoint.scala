package typings.wpapi.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTTPEndpoint extends js.Object {
  var args: StringDictionary[HTTPArgument] = js.native
  var methods: js.Array[HTTPMethod] = js.native
}

object HTTPEndpoint {
  @scala.inline
  def apply(args: StringDictionary[HTTPArgument], methods: js.Array[HTTPMethod]): HTTPEndpoint = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], methods = methods.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTTPEndpoint]
  }
  @scala.inline
  implicit class HTTPEndpointOps[Self <: HTTPEndpoint] (val x: Self) extends AnyVal {
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
    def setArgs(value: StringDictionary[HTTPArgument]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethodsVarargs(value: HTTPMethod*): Self = this.set("methods", js.Array(value :_*))
    @scala.inline
    def setMethods(value: js.Array[HTTPMethod]): Self = this.set("methods", value.asInstanceOf[js.Any])
  }
  
}

