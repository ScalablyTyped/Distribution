package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ProcessProperties extends js.Object {
  /**
       * Class of the process
       */
  var `class`: ProcessClass
  /**
       * Is the process default process
       */
  var isDefault: scala.Boolean
  /**
       * Is the process enabled
       */
  var isEnabled: scala.Boolean
  /**
       * ID of the parent process
       */
  var parentProcessTypeId: java.lang.String
  /**
       * Version of the process
       */
  var version: java.lang.String
}

