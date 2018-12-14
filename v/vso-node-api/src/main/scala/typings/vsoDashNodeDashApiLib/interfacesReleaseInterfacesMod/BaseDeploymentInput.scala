package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BaseDeploymentInput extends js.Object {
  var condition: java.lang.String
  /**
       * Gets or sets the job cancel timeout in minutes for deployment which are cancelled by user for this release environment
       */
  var jobCancelTimeoutInMinutes: scala.Double
  var overrideInputs: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /**
       * Gets or sets the job execution timeout in minutes for deployment which are queued against this release environment
       */
  var timeoutInMinutes: scala.Double
}

