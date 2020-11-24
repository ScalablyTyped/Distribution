package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RetentionSettings extends js.Object {
  
  var daysToKeepDeletedReleases: Double = js.native
  
  var defaultEnvironmentRetentionPolicy: EnvironmentRetentionPolicy = js.native
  
  var maximumEnvironmentRetentionPolicy: EnvironmentRetentionPolicy = js.native
}
object RetentionSettings {
  
  @scala.inline
  def apply(
    daysToKeepDeletedReleases: Double,
    defaultEnvironmentRetentionPolicy: EnvironmentRetentionPolicy,
    maximumEnvironmentRetentionPolicy: EnvironmentRetentionPolicy
  ): RetentionSettings = {
    val __obj = js.Dynamic.literal(daysToKeepDeletedReleases = daysToKeepDeletedReleases.asInstanceOf[js.Any], defaultEnvironmentRetentionPolicy = defaultEnvironmentRetentionPolicy.asInstanceOf[js.Any], maximumEnvironmentRetentionPolicy = maximumEnvironmentRetentionPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetentionSettings]
  }
  
  @scala.inline
  implicit class RetentionSettingsOps[Self <: RetentionSettings] (val x: Self) extends AnyVal {
    
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
    def setDaysToKeepDeletedReleases(value: Double): Self = this.set("daysToKeepDeletedReleases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultEnvironmentRetentionPolicy(value: EnvironmentRetentionPolicy): Self = this.set("defaultEnvironmentRetentionPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumEnvironmentRetentionPolicy(value: EnvironmentRetentionPolicy): Self = this.set("maximumEnvironmentRetentionPolicy", value.asInstanceOf[js.Any])
  }
}
