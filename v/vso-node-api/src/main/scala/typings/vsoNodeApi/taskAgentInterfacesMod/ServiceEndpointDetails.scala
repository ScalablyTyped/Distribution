package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceEndpointDetails extends js.Object {
  var authorization: EndpointAuthorization = js.native
  var data: StringDictionary[String] = js.native
  var `type`: String = js.native
  var url: String = js.native
}

object ServiceEndpointDetails {
  @scala.inline
  def apply(authorization: EndpointAuthorization, data: StringDictionary[String], `type`: String, url: String): ServiceEndpointDetails = {
    val __obj = js.Dynamic.literal(authorization = authorization.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceEndpointDetails]
  }
  @scala.inline
  implicit class ServiceEndpointDetailsOps[Self <: ServiceEndpointDetails] (val x: Self) extends AnyVal {
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
    def setAuthorization(value: EndpointAuthorization): Self = this.set("authorization", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: StringDictionary[String]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

