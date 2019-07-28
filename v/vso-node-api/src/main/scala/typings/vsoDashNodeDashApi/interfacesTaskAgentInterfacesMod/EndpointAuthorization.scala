package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointAuthorization extends js.Object {
  var parameters: StringDictionary[String]
  var scheme: String
}

object EndpointAuthorization {
  @scala.inline
  def apply(parameters: StringDictionary[String], scheme: String): EndpointAuthorization = {
    val __obj = js.Dynamic.literal(parameters = parameters, scheme = scheme)
  
    __obj.asInstanceOf[EndpointAuthorization]
  }
}

