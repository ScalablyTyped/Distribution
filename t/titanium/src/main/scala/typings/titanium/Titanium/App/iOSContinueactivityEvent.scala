package typings.titanium.Titanium.App

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when iOS continueactivity calls `continueUserActivity`.
		 */
trait iOSContinueactivityEvent extends iOSBaseEvent {
  /**
  			 * Unique string identifier for the handoff user activity. The identifier must be defined in your `tiapp.xml` file.
  			 */
  var activityType: String
  /**
  			 * With field will contain the searchable Unique Identifier if the continueactivity is fired from a Core Spotlight searh result.
  			 */
  var searchableItemActivityIdentifier: String
  /**
  			 * The optional title provided to the user activity or search item.
  			 */
  var title: String
  /**
  			 * The optional userInfo provided to the user activity. The userInfo is a custom dictionary and can contain any information needed
  			 * to create your handoff or Core Spotlight session.
  			 */
  var userInfo: js.Any
  /**
  			 * The optional webpageURL provided to the user activity.
  			 */
  var webpageURL: String
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
}

