package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisabledAsDuplicateOfDefault extends js.Object {
  
  var disabled: scala.Double = js.native
  
  var disabledAsDuplicateOfDefault: scala.Double = js.native
  
  var disabledByAdmin: scala.Double = js.native
  
  var disabledBySystem: scala.Double = js.native
  
  var disabledInactiveIdentity: scala.Double = js.native
  
  var disabledInvalidPathClause: scala.Double = js.native
  
  var disabledInvalidRoleExpression: scala.Double = js.native
  
  var disabledMessageQueueNotSupported: scala.Double = js.native
  
  var disabledMissingIdentity: scala.Double = js.native
  
  var enabled: scala.Double = js.native
  
  var enabledOnProbation: scala.Double = js.native
  
  var jailedByNotificationsVolume: scala.Double = js.native
  
  var pendingDeletion: scala.Double = js.native
}
object DisabledAsDuplicateOfDefault {
  
  @scala.inline
  def apply(
    disabled: scala.Double,
    disabledAsDuplicateOfDefault: scala.Double,
    disabledByAdmin: scala.Double,
    disabledBySystem: scala.Double,
    disabledInactiveIdentity: scala.Double,
    disabledInvalidPathClause: scala.Double,
    disabledInvalidRoleExpression: scala.Double,
    disabledMessageQueueNotSupported: scala.Double,
    disabledMissingIdentity: scala.Double,
    enabled: scala.Double,
    enabledOnProbation: scala.Double,
    jailedByNotificationsVolume: scala.Double,
    pendingDeletion: scala.Double
  ): DisabledAsDuplicateOfDefault = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], disabledAsDuplicateOfDefault = disabledAsDuplicateOfDefault.asInstanceOf[js.Any], disabledByAdmin = disabledByAdmin.asInstanceOf[js.Any], disabledBySystem = disabledBySystem.asInstanceOf[js.Any], disabledInactiveIdentity = disabledInactiveIdentity.asInstanceOf[js.Any], disabledInvalidPathClause = disabledInvalidPathClause.asInstanceOf[js.Any], disabledInvalidRoleExpression = disabledInvalidRoleExpression.asInstanceOf[js.Any], disabledMessageQueueNotSupported = disabledMessageQueueNotSupported.asInstanceOf[js.Any], disabledMissingIdentity = disabledMissingIdentity.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], enabledOnProbation = enabledOnProbation.asInstanceOf[js.Any], jailedByNotificationsVolume = jailedByNotificationsVolume.asInstanceOf[js.Any], pendingDeletion = pendingDeletion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisabledAsDuplicateOfDefault]
  }
  
  @scala.inline
  implicit class DisabledAsDuplicateOfDefaultOps[Self <: DisabledAsDuplicateOfDefault] (val x: Self) extends AnyVal {
    
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
    def setDisabled(value: scala.Double): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledAsDuplicateOfDefault(value: scala.Double): Self = this.set("disabledAsDuplicateOfDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledByAdmin(value: scala.Double): Self = this.set("disabledByAdmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledBySystem(value: scala.Double): Self = this.set("disabledBySystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledInactiveIdentity(value: scala.Double): Self = this.set("disabledInactiveIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledInvalidPathClause(value: scala.Double): Self = this.set("disabledInvalidPathClause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledInvalidRoleExpression(value: scala.Double): Self = this.set("disabledInvalidRoleExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledMessageQueueNotSupported(value: scala.Double): Self = this.set("disabledMessageQueueNotSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledMissingIdentity(value: scala.Double): Self = this.set("disabledMissingIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: scala.Double): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledOnProbation(value: scala.Double): Self = this.set("enabledOnProbation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJailedByNotificationsVolume(value: scala.Double): Self = this.set("jailedByNotificationsVolume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingDeletion(value: scala.Double): Self = this.set("pendingDeletion", value.asInstanceOf[js.Any])
  }
}
