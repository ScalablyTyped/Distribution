package typings.titanium.Titanium.App

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when iOS continueactivity calls `continueUserActivity`.
  */
@js.native
trait iOSContinueactivityEvent extends iOSBaseEvent {
  
  /**
    * Unique string identifier for the handoff user activity. The identifier must be defined in your `tiapp.xml` file.
    */
  var activityType: String = js.native
  
  /**
    * With field will contain the searchable Unique Identifier if the continueactivity is fired from a Core Spotlight searh result.
    */
  var searchableItemActivityIdentifier: String = js.native
  
  /**
    * The optional title provided to the user activity or search item.
    */
  var title: String = js.native
  
  /**
    * The optional userInfo provided to the user activity. The userInfo is a custom dictionary and can contain any information needed
    * to create your handoff or Core Spotlight session.
    */
  var userInfo: js.Any = js.native
  
  /**
    * The optional webpageURL provided to the user activity.
    */
  var webpageURL: String = js.native
}
object iOSContinueactivityEvent {
  
  @scala.inline
  def apply(
    activityType: String,
    searchableItemActivityIdentifier: String,
    source: iOS,
    title: String,
    userInfo: js.Any,
    webpageURL: String
  ): iOSContinueactivityEvent = {
    val __obj = js.Dynamic.literal(activityType = activityType.asInstanceOf[js.Any], searchableItemActivityIdentifier = searchableItemActivityIdentifier.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any], webpageURL = webpageURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[iOSContinueactivityEvent]
  }
  
  @scala.inline
  implicit class iOSContinueactivityEventMutableBuilder[Self <: iOSContinueactivityEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivityType(value: String): Self = StObject.set(x, "activityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchableItemActivityIdentifier(value: String): Self = StObject.set(x, "searchableItemActivityIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserInfo(value: js.Any): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebpageURL(value: String): Self = StObject.set(x, "webpageURL", value.asInstanceOf[js.Any])
  }
}
