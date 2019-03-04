package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointAuthorization extends js.Object {
  var parameters: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var scheme: java.lang.String
}

object EndpointAuthorization {
  @scala.inline
  def apply(parameters: org.scalablytyped.runtime.StringDictionary[java.lang.String], scheme: java.lang.String): EndpointAuthorization = {
    val __obj = js.Dynamic.literal(parameters = parameters, scheme = scheme)
  
    __obj.asInstanceOf[EndpointAuthorization]
  }
}

