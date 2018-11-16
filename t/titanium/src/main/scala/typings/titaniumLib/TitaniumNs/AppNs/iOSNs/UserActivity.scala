package typings
package titaniumLib.TitaniumNs.AppNs.iOSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * The UserActivity module is used to enable device Handoff and to create User Activities.
			 */

trait UserActivity
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * Name of the activity type.
  				 */
  var activityType: java.lang.String
  /**
  				 * Set to true if this user activity should be eligible to be handed off to another device
  				 */
  var eligibleForHandoff: scala.Boolean
  /**
  				 * Set to `true` if the user activity can be publicly accessed by all iOS users.
  				 */
  var eligibleForPublicIndexing: scala.Boolean
  /**
  				 * Set to true if the user activity should be added to the on-device index.
  				 */
  var eligibleForSearch: scala.Boolean
  /**
  				 * Absolute date after which the activity is no longer eligible to be indexed or handed off.
  				 */
  var expirationDate: java.lang.String
  /**
  				 * An array of string keywords representing words or phrases that might help the user to find the activity in the application history.
  				 */
  var keywords: js.Array[java.lang.String]
  /**
  				 * Set to true everytime you have updated the user activity and need the changes to be saved before handing it off to another device.
  				 */
  var needsSave: scala.Boolean
  /**
  				 * An array of String keys from the userInfo property which represent the minimal information about the user activity that should be stored for later restoration.
  				 */
  var requiredUserInfoKeys: js.Array[java.lang.String]
  /**
  				 * Determines if user activities are supported (`true`) or not (`false`) by the device.
  				 */
  var supported: scala.Boolean
  /**
  				 * An optional, user-visible title for this activity such as a document name or web page title.
  				 */
  var title: java.lang.String
  /**
  				 * The userInfo dictionary contains application-specific state needed to continue an activity on another device.
  				 */
  var userInfo: js.Any
  /**
  				 * When no suitable application is installed on a resuming device and the `webpageURL` property is set,
  				 * the user activity will instead be continued in a web browser by loading the specified URL.
  				 */
  var webpageURL: java.lang.String
  /**
  				 * Adds a Titanium.App.iOS.SearchableItemAttributeSet to the user activity.
  				 */
  def addContentAttributeSet(contentAttributeSet: SearchableItemAttributeSet): scala.Unit
  /**
  				 * Marks the activity as currently in use by the user.
  				 */
  def becomeCurrent(): scala.Unit
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.activityType> property.
  				 */
  def getActivityType(): java.lang.String
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.eligibleForHandoff> property.
  				 */
  def getEligibleForHandoff(): scala.Boolean
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.eligibleForPublicIndexing> property.
  				 */
  def getEligibleForPublicIndexing(): scala.Boolean
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.eligibleForSearch> property.
  				 */
  def getEligibleForSearch(): scala.Boolean
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.expirationDate> property.
  				 */
  def getExpirationDate(): java.lang.String
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.keywords> property.
  				 */
  def getKeywords(): js.Array[java.lang.String]
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.needsSave> property.
  				 */
  def getNeedsSave(): scala.Boolean
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.requiredUserInfoKeys> property.
  				 */
  def getRequiredUserInfoKeys(): js.Array[java.lang.String]
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.supported> property.
  				 */
  def getSupported(): scala.Boolean
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.title> property.
  				 */
  def getTitle(): java.lang.String
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.userInfo> property.
  				 */
  def getUserInfo(): js.Any
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.webpageURL> property.
  				 */
  def getWebpageURL(): java.lang.String
  /**
  				 * Invalidates an activity when it is no longer eligible for continuation.
  				 */
  def invalidate(): scala.Unit
  /**
  				 * Determines if user activities are supported (`true`) or not (`false`) by the device.
  				 */
  def isSupported(): scala.Boolean
  /**
  				 * Marks the activity as currently **not** in use and ineligible to be continued.
  				 */
  def resignCurrent(): scala.Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.activityType> property.
  				 */
  def setActivityType(activityType: java.lang.String): scala.Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.eligibleForHandoff> property.
  				 */
  def setEligibleForHandoff(eligibleForHandoff: scala.Boolean): scala.Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.eligibleForPublicIndexing> property.
  				 */
  def setEligibleForPublicIndexing(eligibleForPublicIndexing: scala.Boolean): scala.Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.eligibleForSearch> property.
  				 */
  def setEligibleForSearch(eligibleForSearch: scala.Boolean): scala.Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.expirationDate> property.
  				 */
  def setExpirationDate(expirationDate: java.lang.String): scala.Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.keywords> property.
  				 */
  def setKeywords(keywords: js.Array[java.lang.String]): scala.Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.needsSave> property.
  				 */
  def setNeedsSave(needsSave: scala.Boolean): scala.Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.requiredUserInfoKeys> property.
  				 */
  def setRequiredUserInfoKeys(requiredUserInfoKeys: js.Array[java.lang.String]): scala.Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.supported> property.
  				 */
  def setSupported(supported: scala.Boolean): scala.Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.title> property.
  				 */
  def setTitle(title: java.lang.String): scala.Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.userInfo> property.
  				 */
  def setUserInfo(userInfo: js.Any): scala.Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.webpageURL> property.
  				 */
  def setWebpageURL(webpageURL: java.lang.String): scala.Unit
}

