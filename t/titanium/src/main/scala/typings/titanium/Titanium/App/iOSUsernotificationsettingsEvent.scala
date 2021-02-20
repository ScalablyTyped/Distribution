package typings.titanium.Titanium.App

import typings.titanium.Titanium.App.iOS.UserNotificationCategory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the user notification settings are registered.
  */
@js.native
trait iOSUsernotificationsettingsEvent extends iOSBaseEvent {
  
  /**
    * Set of categories of user notification actions the application is registered to use.
    */
  var categories: js.Array[UserNotificationCategory] = js.native
  
  /**
    * Notification types the application is registered to use.
    */
  var types: js.Array[Double] = js.native
}
object iOSUsernotificationsettingsEvent {
  
  @scala.inline
  def apply(categories: js.Array[UserNotificationCategory], source: iOS, types: js.Array[Double]): iOSUsernotificationsettingsEvent = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[iOSUsernotificationsettingsEvent]
  }
  
  @scala.inline
  implicit class iOSUsernotificationsettingsEventMutableBuilder[Self <: iOSUsernotificationsettingsEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategories(value: js.Array[UserNotificationCategory]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesVarargs(value: UserNotificationCategory*): Self = StObject.set(x, "categories", js.Array(value :_*))
    
    @scala.inline
    def setTypes(value: js.Array[Double]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesVarargs(value: Double*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
