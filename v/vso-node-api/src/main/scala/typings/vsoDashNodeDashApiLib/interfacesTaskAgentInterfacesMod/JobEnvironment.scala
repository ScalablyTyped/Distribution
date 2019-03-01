package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobEnvironment extends js.Object {
  var endpoints: js.Array[ServiceEndpoint]
  var mask: js.Array[MaskHint]
  var options: org.scalablytyped.runtime.StringDictionary[JobOption]
  var secureFiles: js.Array[SecureFile]
  /**
    * Gets or sets the endpoint used for communicating back to the calling service.
    */
  var systemConnection: ServiceEndpoint
  var variables: org.scalablytyped.runtime.StringDictionary[java.lang.String]
}

object JobEnvironment {
  @scala.inline
  def apply(
    endpoints: js.Array[ServiceEndpoint],
    mask: js.Array[MaskHint],
    options: org.scalablytyped.runtime.StringDictionary[JobOption],
    secureFiles: js.Array[SecureFile],
    systemConnection: ServiceEndpoint,
    variables: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): JobEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("endpoints")(endpoints)
    __obj.updateDynamic("mask")(mask)
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("secureFiles")(secureFiles)
    __obj.updateDynamic("systemConnection")(systemConnection)
    __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[JobEnvironment]
  }
}

