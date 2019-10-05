package typings.titanium.Titanium.App.iOS

import typings.titanium.Titanium.Proxy
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * The UserActivity module is used to enable device Handoff and to create User Activities.
			 */
trait UserActivity extends Proxy {
  /**
  				 * Name of the activity type.
  				 */
  var activityType: String
  /**
  				 * Set to true if this user activity should be eligible to be handed off to another device
  				 */
  var eligibleForHandoff: Boolean
  /**
  				 * A Boolean value that determines whether Siri can suggest the user activity as a shortcut to the user.
  				 */
  var eligibleForPrediction: Boolean
  /**
  				 * Set to `true` if the user activity can be publicly accessed by all iOS users.
  				 */
  var eligibleForPublicIndexing: Boolean
  /**
  				 * Set to true if the user activity should be added to the on-device index.
  				 */
  var eligibleForSearch: Boolean
  /**
  				 * Absolute date after which the activity is no longer eligible to be indexed or handed off.
  				 */
  var expirationDate: String
  /**
  				 * An array of string keywords representing words or phrases that might help the user to find the activity in the application history.
  				 */
  var keywords: js.Array[String]
  /**
  				 * Set to true everytime you have updated the user activity and need the changes to be saved before handing it off to another device.
  				 */
  var needsSave: Boolean
  /**
  				 * A value used to identify the user activity.
  				 */
  var persistentIdentifier: String
  /**
  				 * An array of String keys from the userInfo property which represent the minimal information about the user activity that should be stored for later restoration.
  				 */
  var requiredUserInfoKeys: js.Array[String]
  /**
  				 * Determines if user activities are supported (`true`) or not (`false`) by the device.
  				 */
  var supported: Boolean
  /**
  				 * An optional, user-visible title for this activity such as a document name or web page title.
  				 */
  var title: String
  /**
  				 * The userInfo dictionary contains application-specific state needed to continue an activity on another device.
  				 */
  var userInfo: js.Any
  /**
  				 * When no suitable application is installed on a resuming device and the `webpageURL` property is set,
  				 * the user activity will instead be continued in a web browser by loading the specified URL.
  				 */
  var webpageURL: String
  /**
  				 * Adds a Titanium.App.iOS.SearchableItemAttributeSet to the user activity.
  				 */
  def addContentAttributeSet(contentAttributeSet: SearchableItemAttributeSet): Unit
  /**
  				 * Marks the activity as currently in use by the user.
  				 */
  def becomeCurrent(): Unit
  /**
  				 * Deletes all user activities created by your app.
  				 */
  def deleteAllSavedUserActivities(): Unit
  /**
  				 * Deletes user activities created by your app that have the specified persistent identifiers.
  				 */
  def deleteSavedUserActivitiesForPersistentIdentifiers(persistentIdentifiers: js.Array[String]): Unit
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.activityType> property.
  				 */
  def getActivityType(): String
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.eligibleForHandoff> property.
  				 */
  def getEligibleForHandoff(): Boolean
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.eligibleForPrediction> property.
  				 */
  def getEligibleForPrediction(): Boolean
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.eligibleForPublicIndexing> property.
  				 */
  def getEligibleForPublicIndexing(): Boolean
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.eligibleForSearch> property.
  				 */
  def getEligibleForSearch(): Boolean
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.expirationDate> property.
  				 */
  def getExpirationDate(): String
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.keywords> property.
  				 */
  def getKeywords(): js.Array[String]
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.needsSave> property.
  				 */
  def getNeedsSave(): Boolean
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.persistentIdentifier> property.
  				 */
  def getPersistentIdentifier(): String
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.requiredUserInfoKeys> property.
  				 */
  def getRequiredUserInfoKeys(): js.Array[String]
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.supported> property.
  				 */
  def getSupported(): Boolean
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.title> property.
  				 */
  def getTitle(): String
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.userInfo> property.
  				 */
  def getUserInfo(): js.Any
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.webpageURL> property.
  				 */
  def getWebpageURL(): String
  /**
  				 * Invalidates an activity when it is no longer eligible for continuation.
  				 */
  def invalidate(): Unit
  /**
  				 * Determines if user activities are supported (`true`) or not (`false`) by the device.
  				 */
  def isSupported(): Boolean
  /**
  				 * Marks the activity as currently **not** in use and ineligible to be continued.
  				 */
  def resignCurrent(): Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.activityType> property.
  				 */
  def setActivityType(activityType: String): Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.eligibleForHandoff> property.
  				 */
  def setEligibleForHandoff(eligibleForHandoff: Boolean): Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.eligibleForPrediction> property.
  				 */
  def setEligibleForPrediction(eligibleForPrediction: Boolean): Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.eligibleForPublicIndexing> property.
  				 */
  def setEligibleForPublicIndexing(eligibleForPublicIndexing: Boolean): Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.eligibleForSearch> property.
  				 */
  def setEligibleForSearch(eligibleForSearch: Boolean): Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.expirationDate> property.
  				 */
  def setExpirationDate(expirationDate: String): Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.keywords> property.
  				 */
  def setKeywords(keywords: js.Array[String]): Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.needsSave> property.
  				 */
  def setNeedsSave(needsSave: Boolean): Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.persistentIdentifier> property.
  				 */
  def setPersistentIdentifier(persistentIdentifier: String): Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.requiredUserInfoKeys> property.
  				 */
  def setRequiredUserInfoKeys(requiredUserInfoKeys: js.Array[String]): Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.supported> property.
  				 */
  def setSupported(supported: Boolean): Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.title> property.
  				 */
  def setTitle(title: String): Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.userInfo> property.
  				 */
  def setUserInfo(userInfo: js.Any): Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.webpageURL> property.
  				 */
  def setWebpageURL(webpageURL: String): Unit
}

object UserActivity {
  @scala.inline
  def apply(
    activityType: String,
    addContentAttributeSet: SearchableItemAttributeSet => Unit,
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    apiName: String,
    applyProperties: js.Any => Unit,
    becomeCurrent: () => Unit,
    bubbleParent: Boolean,
    deleteAllSavedUserActivities: () => Unit,
    deleteSavedUserActivitiesForPersistentIdentifiers: js.Array[String] => Unit,
    eligibleForHandoff: Boolean,
    eligibleForPrediction: Boolean,
    eligibleForPublicIndexing: Boolean,
    eligibleForSearch: Boolean,
    expirationDate: String,
    fireEvent: (String, js.Any) => Unit,
    getActivityType: () => String,
    getApiName: () => String,
    getBubbleParent: () => Boolean,
    getEligibleForHandoff: () => Boolean,
    getEligibleForPrediction: () => Boolean,
    getEligibleForPublicIndexing: () => Boolean,
    getEligibleForSearch: () => Boolean,
    getExpirationDate: () => String,
    getKeywords: () => js.Array[String],
    getNeedsSave: () => Boolean,
    getPersistentIdentifier: () => String,
    getRequiredUserInfoKeys: () => js.Array[String],
    getSupported: () => Boolean,
    getTitle: () => String,
    getUserInfo: () => js.Any,
    getWebpageURL: () => String,
    invalidate: () => Unit,
    isSupported: () => Boolean,
    keywords: js.Array[String],
    needsSave: Boolean,
    persistentIdentifier: String,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    requiredUserInfoKeys: js.Array[String],
    resignCurrent: () => Unit,
    setActivityType: String => Unit,
    setBubbleParent: Boolean => Unit,
    setEligibleForHandoff: Boolean => Unit,
    setEligibleForPrediction: Boolean => Unit,
    setEligibleForPublicIndexing: Boolean => Unit,
    setEligibleForSearch: Boolean => Unit,
    setExpirationDate: String => Unit,
    setKeywords: js.Array[String] => Unit,
    setNeedsSave: Boolean => Unit,
    setPersistentIdentifier: String => Unit,
    setRequiredUserInfoKeys: js.Array[String] => Unit,
    setSupported: Boolean => Unit,
    setTitle: String => Unit,
    setUserInfo: js.Any => Unit,
    setWebpageURL: String => Unit,
    supported: Boolean,
    title: String,
    userInfo: js.Any,
    webpageURL: String,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): UserActivity = {
    val __obj = js.Dynamic.literal(activityType = activityType, addContentAttributeSet = js.Any.fromFunction1(addContentAttributeSet), addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), becomeCurrent = js.Any.fromFunction0(becomeCurrent), bubbleParent = bubbleParent, deleteAllSavedUserActivities = js.Any.fromFunction0(deleteAllSavedUserActivities), deleteSavedUserActivitiesForPersistentIdentifiers = js.Any.fromFunction1(deleteSavedUserActivitiesForPersistentIdentifiers), eligibleForHandoff = eligibleForHandoff, eligibleForPrediction = eligibleForPrediction, eligibleForPublicIndexing = eligibleForPublicIndexing, eligibleForSearch = eligibleForSearch, expirationDate = expirationDate, fireEvent = js.Any.fromFunction2(fireEvent), getActivityType = js.Any.fromFunction0(getActivityType), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getEligibleForHandoff = js.Any.fromFunction0(getEligibleForHandoff), getEligibleForPrediction = js.Any.fromFunction0(getEligibleForPrediction), getEligibleForPublicIndexing = js.Any.fromFunction0(getEligibleForPublicIndexing), getEligibleForSearch = js.Any.fromFunction0(getEligibleForSearch), getExpirationDate = js.Any.fromFunction0(getExpirationDate), getKeywords = js.Any.fromFunction0(getKeywords), getNeedsSave = js.Any.fromFunction0(getNeedsSave), getPersistentIdentifier = js.Any.fromFunction0(getPersistentIdentifier), getRequiredUserInfoKeys = js.Any.fromFunction0(getRequiredUserInfoKeys), getSupported = js.Any.fromFunction0(getSupported), getTitle = js.Any.fromFunction0(getTitle), getUserInfo = js.Any.fromFunction0(getUserInfo), getWebpageURL = js.Any.fromFunction0(getWebpageURL), invalidate = js.Any.fromFunction0(invalidate), isSupported = js.Any.fromFunction0(isSupported), keywords = keywords, needsSave = needsSave, persistentIdentifier = persistentIdentifier, removeEventListener = js.Any.fromFunction2(removeEventListener), requiredUserInfoKeys = requiredUserInfoKeys, resignCurrent = js.Any.fromFunction0(resignCurrent), setActivityType = js.Any.fromFunction1(setActivityType), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setEligibleForHandoff = js.Any.fromFunction1(setEligibleForHandoff), setEligibleForPrediction = js.Any.fromFunction1(setEligibleForPrediction), setEligibleForPublicIndexing = js.Any.fromFunction1(setEligibleForPublicIndexing), setEligibleForSearch = js.Any.fromFunction1(setEligibleForSearch), setExpirationDate = js.Any.fromFunction1(setExpirationDate), setKeywords = js.Any.fromFunction1(setKeywords), setNeedsSave = js.Any.fromFunction1(setNeedsSave), setPersistentIdentifier = js.Any.fromFunction1(setPersistentIdentifier), setRequiredUserInfoKeys = js.Any.fromFunction1(setRequiredUserInfoKeys), setSupported = js.Any.fromFunction1(setSupported), setTitle = js.Any.fromFunction1(setTitle), setUserInfo = js.Any.fromFunction1(setUserInfo), setWebpageURL = js.Any.fromFunction1(setWebpageURL), supported = supported, title = title, userInfo = userInfo, webpageURL = webpageURL)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[UserActivity]
  }
}

