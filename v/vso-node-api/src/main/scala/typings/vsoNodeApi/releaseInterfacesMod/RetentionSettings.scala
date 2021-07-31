package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetentionSettings extends StObject {
  
  var daysToKeepDeletedReleases: Double
  
  var defaultEnvironmentRetentionPolicy: EnvironmentRetentionPolicy
  
  var maximumEnvironmentRetentionPolicy: EnvironmentRetentionPolicy
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
  implicit class RetentionSettingsMutableBuilder[Self <: RetentionSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDaysToKeepDeletedReleases(value: Double): Self = StObject.set(x, "daysToKeepDeletedReleases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultEnvironmentRetentionPolicy(value: EnvironmentRetentionPolicy): Self = StObject.set(x, "defaultEnvironmentRetentionPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumEnvironmentRetentionPolicy(value: EnvironmentRetentionPolicy): Self = StObject.set(x, "maximumEnvironmentRetentionPolicy", value.asInstanceOf[js.Any])
  }
}
