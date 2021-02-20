package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildSettings extends StObject {
  
  /**
    * The number of days to keep records of deleted builds.
    */
  var daysToKeepDeletedBuildsBeforeDestroy: Double = js.native
  
  /**
    * The default retention policy.
    */
  var defaultRetentionPolicy: RetentionPolicy = js.native
  
  /**
    * The maximum retention policy.
    */
  var maximumRetentionPolicy: RetentionPolicy = js.native
}
object BuildSettings {
  
  @scala.inline
  def apply(
    daysToKeepDeletedBuildsBeforeDestroy: Double,
    defaultRetentionPolicy: RetentionPolicy,
    maximumRetentionPolicy: RetentionPolicy
  ): BuildSettings = {
    val __obj = js.Dynamic.literal(daysToKeepDeletedBuildsBeforeDestroy = daysToKeepDeletedBuildsBeforeDestroy.asInstanceOf[js.Any], defaultRetentionPolicy = defaultRetentionPolicy.asInstanceOf[js.Any], maximumRetentionPolicy = maximumRetentionPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildSettings]
  }
  
  @scala.inline
  implicit class BuildSettingsMutableBuilder[Self <: BuildSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDaysToKeepDeletedBuildsBeforeDestroy(value: Double): Self = StObject.set(x, "daysToKeepDeletedBuildsBeforeDestroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRetentionPolicy(value: RetentionPolicy): Self = StObject.set(x, "defaultRetentionPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumRetentionPolicy(value: RetentionPolicy): Self = StObject.set(x, "maximumRetentionPolicy", value.asInstanceOf[js.Any])
  }
}
