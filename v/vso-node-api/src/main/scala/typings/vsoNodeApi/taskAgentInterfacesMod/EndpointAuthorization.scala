package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointAuthorization extends js.Object {
  var parameters: StringDictionary[String] = js.native
  var scheme: String = js.native
}

object EndpointAuthorization {
  @scala.inline
  def apply(parameters: StringDictionary[String], scheme: String): EndpointAuthorization = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointAuthorization]
  }
  @scala.inline
  implicit class EndpointAuthorizationOps[Self <: EndpointAuthorization] (val x: Self) extends AnyVal {
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
    def setParameters(value: StringDictionary[String]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setScheme(value: String): Self = this.set("scheme", value.asInstanceOf[js.Any])
  }
  
}

