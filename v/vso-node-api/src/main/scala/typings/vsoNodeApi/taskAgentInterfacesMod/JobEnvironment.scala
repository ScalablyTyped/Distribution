package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobEnvironment extends js.Object {
  var endpoints: js.Array[ServiceEndpoint]
  var mask: js.Array[MaskHint]
  var options: StringDictionary[JobOption]
  var secureFiles: js.Array[SecureFile]
  /**
    * Gets or sets the endpoint used for communicating back to the calling service.
    */
  var systemConnection: ServiceEndpoint
  var variables: StringDictionary[String]
}

object JobEnvironment {
  @scala.inline
  def apply(
    endpoints: js.Array[ServiceEndpoint],
    mask: js.Array[MaskHint],
    options: StringDictionary[JobOption],
    secureFiles: js.Array[SecureFile],
    systemConnection: ServiceEndpoint,
    variables: StringDictionary[String]
  ): JobEnvironment = {
    val __obj = js.Dynamic.literal(endpoints = endpoints.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], secureFiles = secureFiles.asInstanceOf[js.Any], systemConnection = systemConnection.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobEnvironment]
  }
}

