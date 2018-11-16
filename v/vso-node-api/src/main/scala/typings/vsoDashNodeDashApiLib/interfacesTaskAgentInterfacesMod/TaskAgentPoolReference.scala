package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TaskAgentPoolReference extends js.Object {
  var id: scala.Double
  /**
       * Gets or sets a value indicating whether or not this pool is managed by the service.
       */
  var isHosted: scala.Boolean
  var name: java.lang.String
  /**
       * Gets or sets the type of the pool
       */
  var poolType: TaskAgentPoolType
  var scope: java.lang.String
}

