package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskAgentPoolMaintenanceDefinition extends js.Object {
  /**
    * Enable maintenance
    */
  var enabled: Boolean
  /**
    * Id
    */
  var id: Double
  /**
    * Maintenance job timeout per agent
    */
  var jobTimeoutInMinutes: Double
  /**
    * Max percentage of agents within a pool running maintenance job at given time
    */
  var maxConcurrentAgentsPercentage: Double
  var options: TaskAgentPoolMaintenanceOptions
  /**
    * Pool reference for the maintenance definition
    */
  var pool: TaskAgentPoolReference
  var retentionPolicy: TaskAgentPoolMaintenanceRetentionPolicy
  var scheduleSetting: TaskAgentPoolMaintenanceSchedule
}

object TaskAgentPoolMaintenanceDefinition {
  @scala.inline
  def apply(
    enabled: Boolean,
    id: Double,
    jobTimeoutInMinutes: Double,
    maxConcurrentAgentsPercentage: Double,
    options: TaskAgentPoolMaintenanceOptions,
    pool: TaskAgentPoolReference,
    retentionPolicy: TaskAgentPoolMaintenanceRetentionPolicy,
    scheduleSetting: TaskAgentPoolMaintenanceSchedule
  ): TaskAgentPoolMaintenanceDefinition = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], jobTimeoutInMinutes = jobTimeoutInMinutes.asInstanceOf[js.Any], maxConcurrentAgentsPercentage = maxConcurrentAgentsPercentage.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], pool = pool.asInstanceOf[js.Any], retentionPolicy = retentionPolicy.asInstanceOf[js.Any], scheduleSetting = scheduleSetting.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TaskAgentPoolMaintenanceDefinition]
  }
}

