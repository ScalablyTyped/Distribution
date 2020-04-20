package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvironmentExecutionPolicy extends js.Object {
  /**
    * This policy decides, how many environments would be with Environment Runner.
    */
  var concurrencyCount: Double
  /**
    * Queue depth in the EnvironmentQueue table, this table keeps the environment entries till Environment Runner is free [as per it's policy] to take another environment for running.
    */
  var queueDepthCount: Double
}

object EnvironmentExecutionPolicy {
  @scala.inline
  def apply(concurrencyCount: Double, queueDepthCount: Double): EnvironmentExecutionPolicy = {
    val __obj = js.Dynamic.literal(concurrencyCount = concurrencyCount.asInstanceOf[js.Any], queueDepthCount = queueDepthCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentExecutionPolicy]
  }
}

