package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionAdminSettings extends StObject {
  
  /**
    * If true, members of the group subscribed to the associated subscription cannot opt (choose not to get notified)
    */
  var blockUserOptOut: Boolean
}
object SubscriptionAdminSettings {
  
  @scala.inline
  def apply(blockUserOptOut: Boolean): SubscriptionAdminSettings = {
    val __obj = js.Dynamic.literal(blockUserOptOut = blockUserOptOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionAdminSettings]
  }
  
  @scala.inline
  implicit class SubscriptionAdminSettingsMutableBuilder[Self <: SubscriptionAdminSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockUserOptOut(value: Boolean): Self = StObject.set(x, "blockUserOptOut", value.asInstanceOf[js.Any])
  }
}
