package typings.titanium.Titanium.App.iOS

import typings.titanium.Titanium.Proxy
import typings.titanium.titaniumStrings.useractivitydeleted
import typings.titanium.titaniumStrings.useractivitywascontinued
import typings.titanium.titaniumStrings.useractivitywillsave
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The UserActivity module is used to enable device Handoff and to create User Activities.
  */
@js.native
trait UserActivity extends Proxy {
  
  /**
    * Name of the activity type.
    */
  var activityType: String = js.native
  
  /**
    * Adds a Titanium.App.iOS.SearchableItemAttributeSet to the user activity.
    */
  def addContentAttributeSet(contentAttributeSet: SearchableItemAttributeSet): Unit = js.native
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  @JSName("addEventListener")
  def addEventListener_useractivitydeleted(
    name: useractivitydeleted,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ UserActivityUseractivitydeletedEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_useractivitywascontinued(
    name: useractivitywascontinued,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ UserActivityUseractivitywascontinuedEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_useractivitywillsave(
    name: useractivitywillsave,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ UserActivityUseractivitywillsaveEvent, Unit]
  ): Unit = js.native
  
  /**
    * Marks the activity as currently in use by the user.
    */
  def becomeCurrent(): Unit = js.native
  
  /**
    * Deletes all user activities created by your app.
    */
  def deleteAllSavedUserActivities(): Unit = js.native
  
  /**
    * Deletes user activities created by your app that have the specified persistent identifiers.
    */
  def deleteSavedUserActivitiesForPersistentIdentifiers(persistentIdentifiers: js.Array[String]): Unit = js.native
  
  /**
    * Set to true if this user activity should be eligible to be handed off to another device
    */
  var eligibleForHandoff: Boolean = js.native
  
  /**
    * A Boolean value that determines whether Siri can suggest the user activity as a shortcut to the user.
    */
  var eligibleForPrediction: Boolean = js.native
  
  /**
    * Set to `true` if the user activity can be publicly accessed by all iOS users.
    */
  var eligibleForPublicIndexing: Boolean = js.native
  
  /**
    * Set to true if the user activity should be added to the on-device index.
    */
  var eligibleForSearch: Boolean = js.native
  
  /**
    * Absolute date after which the activity is no longer eligible to be indexed or handed off.
    */
  var expirationDate: String = js.native
  
  /**
    * Fires a synthesized event to any registered listeners.
    */
  @JSName("fireEvent")
  def fireEvent_useractivitydeleted(name: useractivitydeleted): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_useractivitydeleted(name: useractivitydeleted, event: UserActivityUseractivitydeletedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_useractivitywascontinued(name: useractivitywascontinued): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_useractivitywascontinued(name: useractivitywascontinued, event: UserActivityUseractivitywascontinuedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_useractivitywillsave(name: useractivitywillsave): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_useractivitywillsave(name: useractivitywillsave, event: UserActivityUseractivitywillsaveEvent): Unit = js.native
  
  /**
    * Gets the value of the <Titanium.App.iOS.UserActivity.activityType> property.
    * @deprecated Access <Titanium.App.iOS.UserActivity.activityType> instead.
    */
  def getActivityType(): String = js.native
  
  /**
    * Gets the value of the <Titanium.App.iOS.UserActivity.eligibleForHandoff> property.
    * @deprecated Access <Titanium.App.iOS.UserActivity.eligibleForHandoff> instead.
    */
  def getEligibleForHandoff(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.App.iOS.UserActivity.eligibleForPrediction> property.
    * @deprecated Access <Titanium.App.iOS.UserActivity.eligibleForPrediction> instead.
    */
  def getEligibleForPrediction(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.App.iOS.UserActivity.eligibleForPublicIndexing> property.
    * @deprecated Access <Titanium.App.iOS.UserActivity.eligibleForPublicIndexing> instead.
    */
  def getEligibleForPublicIndexing(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.App.iOS.UserActivity.eligibleForSearch> property.
    * @deprecated Access <Titanium.App.iOS.UserActivity.eligibleForSearch> instead.
    */
  def getEligibleForSearch(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.App.iOS.UserActivity.expirationDate> property.
    * @deprecated Access <Titanium.App.iOS.UserActivity.expirationDate> instead.
    */
  def getExpirationDate(): String = js.native
  
  /**
    * Gets the value of the <Titanium.App.iOS.UserActivity.keywords> property.
    * @deprecated Access <Titanium.App.iOS.UserActivity.keywords> instead.
    */
  def getKeywords(): js.Array[String] = js.native
  
  /**
    * Gets the value of the <Titanium.App.iOS.UserActivity.needsSave> property.
    * @deprecated Access <Titanium.App.iOS.UserActivity.needsSave> instead.
    */
  def getNeedsSave(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.App.iOS.UserActivity.persistentIdentifier> property.
    * @deprecated Access <Titanium.App.iOS.UserActivity.persistentIdentifier> instead.
    */
  def getPersistentIdentifier(): String = js.native
  
  /**
    * Gets the value of the <Titanium.App.iOS.UserActivity.requiredUserInfoKeys> property.
    * @deprecated Access <Titanium.App.iOS.UserActivity.requiredUserInfoKeys> instead.
    */
  def getRequiredUserInfoKeys(): js.Array[String] = js.native
  
  /**
    * Gets the value of the <Titanium.App.iOS.UserActivity.supported> property.
    * @deprecated Use [Titanium.App.iOS.UserActivity.isSupported](Titanium.App.iOS.UserActivity.isSupported) instead.
    */
  def getSupported(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.App.iOS.UserActivity.title> property.
    * @deprecated Access <Titanium.App.iOS.UserActivity.title> instead.
    */
  def getTitle(): String = js.native
  
  /**
    * Gets the value of the <Titanium.App.iOS.UserActivity.userInfo> property.
    * @deprecated Access <Titanium.App.iOS.UserActivity.userInfo> instead.
    */
  def getUserInfo(): js.Any = js.native
  
  /**
    * Gets the value of the <Titanium.App.iOS.UserActivity.webpageURL> property.
    * @deprecated Access <Titanium.App.iOS.UserActivity.webpageURL> instead.
    */
  def getWebpageURL(): String = js.native
  
  /**
    * Invalidates an activity when it is no longer eligible for continuation.
    */
  def invalidate(): Unit = js.native
  
  /**
    * Determines if user activities are supported (`true`) or not (`false`) by the device.
    */
  def isSupported(): Boolean = js.native
  
  /**
    * An array of string keywords representing words or phrases that might help the user to find the activity in the application history.
    */
  var keywords: js.Array[String] = js.native
  
  /**
    * Set to true everytime you have updated the user activity and need the changes to be saved before handing it off to another device.
    */
  var needsSave: Boolean = js.native
  
  /**
    * A value used to identify the user activity.
    */
  var persistentIdentifier: String = js.native
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  @JSName("removeEventListener")
  def removeEventListener_useractivitydeleted(
    name: useractivitydeleted,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ UserActivityUseractivitydeletedEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_useractivitywascontinued(
    name: useractivitywascontinued,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ UserActivityUseractivitywascontinuedEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_useractivitywillsave(
    name: useractivitywillsave,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ UserActivityUseractivitywillsaveEvent, Unit]
  ): Unit = js.native
  
  /**
    * An array of String keys from the userInfo property which represent the minimal information about the user activity that should be stored for later restoration.
    */
  var requiredUserInfoKeys: js.Array[String] = js.native
  
  /**
    * Marks the activity as currently **not** in use and ineligible to be continued.
    */
  def resignCurrent(): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.App.iOS.UserActivity.activityType> property.
    * @deprecated Set the value using <Titanium.App.iOS.UserActivity.activityType> instead.
    */
  def setActivityType(activityType: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.App.iOS.UserActivity.eligibleForHandoff> property.
    * @deprecated Set the value using <Titanium.App.iOS.UserActivity.eligibleForHandoff> instead.
    */
  def setEligibleForHandoff(eligibleForHandoff: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.App.iOS.UserActivity.eligibleForPrediction> property.
    * @deprecated Set the value using <Titanium.App.iOS.UserActivity.eligibleForPrediction> instead.
    */
  def setEligibleForPrediction(eligibleForPrediction: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.App.iOS.UserActivity.eligibleForPublicIndexing> property.
    * @deprecated Set the value using <Titanium.App.iOS.UserActivity.eligibleForPublicIndexing> instead.
    */
  def setEligibleForPublicIndexing(eligibleForPublicIndexing: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.App.iOS.UserActivity.eligibleForSearch> property.
    * @deprecated Set the value using <Titanium.App.iOS.UserActivity.eligibleForSearch> instead.
    */
  def setEligibleForSearch(eligibleForSearch: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.App.iOS.UserActivity.expirationDate> property.
    * @deprecated Set the value using <Titanium.App.iOS.UserActivity.expirationDate> instead.
    */
  def setExpirationDate(expirationDate: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.App.iOS.UserActivity.keywords> property.
    * @deprecated Set the value using <Titanium.App.iOS.UserActivity.keywords> instead.
    */
  def setKeywords(keywords: js.Array[String]): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.App.iOS.UserActivity.needsSave> property.
    * @deprecated Set the value using <Titanium.App.iOS.UserActivity.needsSave> instead.
    */
  def setNeedsSave(needsSave: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.App.iOS.UserActivity.persistentIdentifier> property.
    * @deprecated Set the value using <Titanium.App.iOS.UserActivity.persistentIdentifier> instead.
    */
  def setPersistentIdentifier(persistentIdentifier: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.App.iOS.UserActivity.requiredUserInfoKeys> property.
    * @deprecated Set the value using <Titanium.App.iOS.UserActivity.requiredUserInfoKeys> instead.
    */
  def setRequiredUserInfoKeys(requiredUserInfoKeys: js.Array[String]): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.App.iOS.UserActivity.supported> property.
    * @deprecated Use [Titanium.App.iOS.UserActivity.isSupported](Titanium.App.iOS.UserActivity.isSupported) instead.
    */
  def setSupported(supported: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.App.iOS.UserActivity.title> property.
    * @deprecated Set the value using <Titanium.App.iOS.UserActivity.title> instead.
    */
  def setTitle(title: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.App.iOS.UserActivity.userInfo> property.
    * @deprecated Set the value using <Titanium.App.iOS.UserActivity.userInfo> instead.
    */
  def setUserInfo(userInfo: js.Any): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.App.iOS.UserActivity.webpageURL> property.
    * @deprecated Set the value using <Titanium.App.iOS.UserActivity.webpageURL> instead.
    */
  def setWebpageURL(webpageURL: String): Unit = js.native
  
  /**
    * Determines if user activities are supported (`true`) or not (`false`) by the device.
    * @deprecated Use [Titanium.App.iOS.UserActivity.isSupported](Titanium.App.iOS.UserActivity.isSupported) instead.
    */
  var supported: Boolean = js.native
  
  /**
    * An optional, user-visible title for this activity such as a document name or web page title.
    */
  var title: String = js.native
  
  /**
    * The userInfo dictionary contains application-specific state needed to continue an activity on another device.
    */
  var userInfo: js.Any = js.native
  
  /**
    * When no suitable application is installed on a resuming device and the `webpageURL` property is set,
    * the user activity will instead be continued in a web browser by loading the specified URL.
    */
  var webpageURL: String = js.native
}
