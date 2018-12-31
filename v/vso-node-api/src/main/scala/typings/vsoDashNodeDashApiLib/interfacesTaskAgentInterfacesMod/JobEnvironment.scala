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

