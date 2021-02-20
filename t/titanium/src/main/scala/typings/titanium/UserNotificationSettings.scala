package typings.titanium

import typings.titanium.Titanium.App.iOS.UserNotificationCategory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dictionary object of parameters used to register the application with local notifications using
  * the <Titanium.App.iOS.registerUserNotificationSettings> method.
  * To retrieve the current notification settings, use the
  * <Titanium.App.iOS.UserNotificationCenter.requestUserNotificationSettings> method.
  */
@js.native
trait UserNotificationSettings extends StObject {
  
  /**
    * Set of categories of user notification actions required by the applicaiton to use.
    */
  var categories: js.UndefOr[js.Array[UserNotificationCategory]] = js.native
  
  /**
    * Notification types to use.
    */
  var types: js.UndefOr[js.Array[Double]] = js.native
}
object UserNotificationSettings {
  
  @scala.inline
  def apply(): UserNotificationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserNotificationSettings]
  }
  
  @scala.inline
  implicit class UserNotificationSettingsMutableBuilder[Self <: UserNotificationSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategories(value: js.Array[UserNotificationCategory]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    @scala.inline
    def setCategoriesVarargs(value: UserNotificationCategory*): Self = StObject.set(x, "categories", js.Array(value :_*))
    
    @scala.inline
    def setTypes(value: js.Array[Double]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    @scala.inline
    def setTypesVarargs(value: Double*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
