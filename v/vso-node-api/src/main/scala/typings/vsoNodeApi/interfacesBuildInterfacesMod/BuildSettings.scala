package typings.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildSettings extends StObject {
  
  /**
    * The number of days to keep records of deleted builds.
    */
  var daysToKeepDeletedBuildsBeforeDestroy: Double
  
  /**
    * The default retention policy.
    */
  var defaultRetentionPolicy: RetentionPolicy
  
  /**
    * The maximum retention policy.
    */
  var maximumRetentionPolicy: RetentionPolicy
}
object BuildSettings {
  
  inline def apply(
    daysToKeepDeletedBuildsBeforeDestroy: Double,
    defaultRetentionPolicy: RetentionPolicy,
    maximumRetentionPolicy: RetentionPolicy
  ): BuildSettings = {
    val __obj = js.Dynamic.literal(daysToKeepDeletedBuildsBeforeDestroy = daysToKeepDeletedBuildsBeforeDestroy.asInstanceOf[js.Any], defaultRetentionPolicy = defaultRetentionPolicy.asInstanceOf[js.Any], maximumRetentionPolicy = maximumRetentionPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuildSettings] (val x: Self) extends AnyVal {
    
    inline def setDaysToKeepDeletedBuildsBeforeDestroy(value: Double): Self = StObject.set(x, "daysToKeepDeletedBuildsBeforeDestroy", value.asInstanceOf[js.Any])
    
    inline def setDefaultRetentionPolicy(value: RetentionPolicy): Self = StObject.set(x, "defaultRetentionPolicy", value.asInstanceOf[js.Any])
    
    inline def setMaximumRetentionPolicy(value: RetentionPolicy): Self = StObject.set(x, "maximumRetentionPolicy", value.asInstanceOf[js.Any])
  }
}
