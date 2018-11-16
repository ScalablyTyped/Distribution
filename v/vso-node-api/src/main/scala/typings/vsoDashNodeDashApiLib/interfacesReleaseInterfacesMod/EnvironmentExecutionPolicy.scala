package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait EnvironmentExecutionPolicy extends js.Object {
  /**
       * This policy decides, how many environments would be with Environment Runner.
       */
  var concurrencyCount: scala.Double
  /**
       * Queue depth in the EnvironmentQueue table, this table keeps the environment entries till Environment Runner is free [as per it's policy] to take another environment for running.
       */
  var queueDepthCount: scala.Double
}

