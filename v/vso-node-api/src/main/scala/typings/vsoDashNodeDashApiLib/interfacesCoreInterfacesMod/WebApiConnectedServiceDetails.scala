package typings
package vsoDashNodeDashApiLib.interfacesCoreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait WebApiConnectedServiceDetails extends WebApiConnectedServiceRef {
  /**
       * Meta data for service connection
       */
  var connectedServiceMetaData: WebApiConnectedService
  /**
       * Credential info
       */
  var credentialsXml: java.lang.String
  /**
       * Optional uri to connect directly to the service such as https://windows.azure.com
       */
  var endPoint: java.lang.String
}

