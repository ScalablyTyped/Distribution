package typings.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskAgentPoolMaintenanceDefinition extends js.Object {
  
  /**
    * Enable maintenance
    */
  var enabled: Boolean = js.native
  
  /**
    * Id
    */
  var id: Double = js.native
  
  /**
    * Maintenance job timeout per agent
    */
  var jobTimeoutInMinutes: Double = js.native
  
  /**
    * Max percentage of agents within a pool running maintenance job at given time
    */
  var maxConcurrentAgentsPercentage: Double = js.native
  
  var options: TaskAgentPoolMaintenanceOptions = js.native
  
  /**
    * Pool reference for the maintenance definition
    */
  var pool: TaskAgentPoolReference = js.native
  
  var retentionPolicy: TaskAgentPoolMaintenanceRetentionPolicy = js.native
  
  var scheduleSetting: TaskAgentPoolMaintenanceSchedule = js.native
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
  
  @scala.inline
  implicit class TaskAgentPoolMaintenanceDefinitionOps[Self <: TaskAgentPoolMaintenanceDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobTimeoutInMinutes(value: Double): Self = this.set("jobTimeoutInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxConcurrentAgentsPercentage(value: Double): Self = this.set("maxConcurrentAgentsPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: TaskAgentPoolMaintenanceOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPool(value: TaskAgentPoolReference): Self = this.set("pool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetentionPolicy(value: TaskAgentPoolMaintenanceRetentionPolicy): Self = this.set("retentionPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleSetting(value: TaskAgentPoolMaintenanceSchedule): Self = this.set("scheduleSetting", value.asInstanceOf[js.Any])
  }
}
