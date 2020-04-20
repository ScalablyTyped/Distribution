package typings.titanium.Titanium.Android

import typings.std.Date
import typings.titanium.Titanium.Proxy
import typings.titanium.wakeLockOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * UI notifications that can be sent while the application is in the background.
		 */
@JSGlobal("Titanium.Android.Notification")
@js.native
class Notification () extends Proxy {
  /**
  			 * The audio stream type to use when playing the sound.
  			 */
  var audioStreamType: Double = js.native
  /**
  			 * Sets the notification's category.
  			 */
  var category: String = js.native
  /**
  			 * Accent color used behind icon.
  			 */
  var color: String = js.native
  /**
  			 * The `PendingIntent` to execute when the expanded status entry is clicked.
  			 */
  var contentIntent: PendingIntent = js.native
  /**
  			 * Description text of the notification.
  			 */
  var contentText: String = js.native
  /**
  			 * Title of the notification.
  			 */
  var contentTitle: String = js.native
  /**
  			 * Custom layout to display in the notification.
  			 */
  var contentView: RemoteViews = js.native
  /**
  			 * Specifies which values should be taken from the defaults.
  			 */
  var defaults: Double = js.native
  /**
  			 * The `PendingIntent` to execute when the status entry is deleted by the user with the "Clear All Notifications" button.
  			 */
  var deleteIntent: PendingIntent = js.native
  /**
  			 * Set of flags for the notification.
  			 */
  var flags: Double = js.native
  /**
  			 * The group key that the notification will belong to.
  			 */
  var groupKey: String = js.native
  /**
  			 * Specifies if this is a group summary notification.
  			 */
  var groupSummary: Boolean = js.native
  /**
  			 * Notification icon, specified as an Android resource ID, or a local URL to a density-specific image.
  			 */
  var icon: Double | String = js.native
  /**
  			 * Add a large icon to the notification (and the ticker on some devices) specified as an Android resource ID, or a local URL to a density-specific image.
  			 */
  var largeIcon: Double | String = js.native
  /**
  			 * The color for the LED to blink.
  			 */
  var ledARGB: Double = js.native
  /**
  			 * The number of milliseconds for the LED to be off while it's flashing.
  			 */
  var ledOffMS: Double = js.native
  /**
  			 * The number of milliseconds for the LED to be on while it's flashing.
  			 */
  var ledOnMS: Double = js.native
  /**
  			 * The number of events that this notification represents.
  			 */
  var number: Double = js.native
  /**
  			 * Sets the priority of the notification.
  			 */
  var priority: Double = js.native
  /**
  			 * A URL to the sound to play.
  			 */
  var sound: String = js.native
  /**
  			 * Style object that can apply a rich notification style.
  			 */
  var style: BigTextStyle | BigPictureStyle = js.native
  /**
  			 * Text to scroll across the screen when this item is added to the status bar.
  			 */
  var tickerText: String = js.native
  /**
  			 * Allows user to conceal private information of the notification on the lockscreen.
  			 */
  var visibility: Double = js.native
  /**
  			 * Will wake up the device for the given time (in milliseconds) when the notification is shown.
  			 * The application needs to also set the `android.permission.WAKE_LOCK` permission
  			 * in the Android manifest section of the `tiapp.xml` file.
  			 *     <ti:app>
  			 *         <android>
  			 *             <manifest>
  			 *                 <uses-permission android:name="android.permission.WAKE_LOCK" />
  			 *             </manifest>
  			 *         </android>
  			 *     </ti:app>
  			 */
  var wakeLock: wakeLockOptions = js.native
  /**
  			 * The timestamp for the notification (defaults to the current time).
  			 */
  var when: Date | Double = js.native
  def addAction(icon: String, title: String, intent: PendingIntent): Unit = js.native
  /**
  			 * Add an action button to the notification
  			 */
  def addAction(icon: Double, title: String, intent: PendingIntent): Unit = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.audioStreamType> property.
  			 * @deprecated Access <Titanium.Android.Notification.audioStreamType> instead.
  			 */
  def getAudioStreamType(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.category> property.
  			 * @deprecated Access <Titanium.Android.Notification.category> instead.
  			 */
  def getCategory(): String = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.color> property.
  			 * @deprecated Access <Titanium.Android.Notification.color> instead.
  			 */
  def getColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.contentIntent> property.
  			 * @deprecated Access <Titanium.Android.Notification.contentIntent> instead.
  			 */
  def getContentIntent(): PendingIntent = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.contentText> property.
  			 * @deprecated Access <Titanium.Android.Notification.contentText> instead.
  			 */
  def getContentText(): String = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.contentTitle> property.
  			 * @deprecated Access <Titanium.Android.Notification.contentTitle> instead.
  			 */
  def getContentTitle(): String = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.defaults> property.
  			 * @deprecated Access <Titanium.Android.Notification.defaults> instead.
  			 */
  def getDefaults(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.deleteIntent> property.
  			 * @deprecated Access <Titanium.Android.Notification.deleteIntent> instead.
  			 */
  def getDeleteIntent(): PendingIntent = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.flags> property.
  			 * @deprecated Access <Titanium.Android.Notification.flags> instead.
  			 */
  def getFlags(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.groupKey> property.
  			 * @deprecated Access <Titanium.Android.Notification.groupKey> instead.
  			 */
  def getGroupKey(): String = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.groupSummary> property.
  			 * @deprecated Access <Titanium.Android.Notification.groupSummary> instead.
  			 */
  def getGroupSummary(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.icon> property.
  			 * @deprecated Access <Titanium.Android.Notification.icon> instead.
  			 */
  def getIcon(): Double | String = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.largeIcon> property.
  			 * @deprecated Access <Titanium.Android.Notification.largeIcon> instead.
  			 */
  def getLargeIcon(): Double | String = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.ledARGB> property.
  			 * @deprecated Access <Titanium.Android.Notification.ledARGB> instead.
  			 */
  def getLedARGB(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.ledOffMS> property.
  			 * @deprecated Access <Titanium.Android.Notification.ledOffMS> instead.
  			 */
  def getLedOffMS(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.ledOnMS> property.
  			 * @deprecated Access <Titanium.Android.Notification.ledOnMS> instead.
  			 */
  def getLedOnMS(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.number> property.
  			 * @deprecated Access <Titanium.Android.Notification.number> instead.
  			 */
  def getNumber(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.priority> property.
  			 * @deprecated Access <Titanium.Android.Notification.priority> instead.
  			 */
  def getPriority(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.sound> property.
  			 * @deprecated Access <Titanium.Android.Notification.sound> instead.
  			 */
  def getSound(): String = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.style> property.
  			 * @deprecated Access <Titanium.Android.Notification.style> instead.
  			 */
  def getStyle(): BigTextStyle | BigPictureStyle = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.tickerText> property.
  			 * @deprecated Access <Titanium.Android.Notification.tickerText> instead.
  			 */
  def getTickerText(): String = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.visibility> property.
  			 * @deprecated Access <Titanium.Android.Notification.visibility> instead.
  			 */
  def getVisibility(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.wakeLock> property.
  			 * @deprecated Access <Titanium.Android.Notification.wakeLock> instead.
  			 */
  def getWakeLock(): wakeLockOptions = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.when> property.
  			 * @deprecated Access <Titanium.Android.Notification.when> instead.
  			 */
  def getWhen(): Date | Double = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.audioStreamType> property.
  			 * @deprecated Set the value using <Titanium.Android.Notification.audioStreamType> instead.
  			 */
  def setAudioStreamType(audioStreamType: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.category> property.
  			 * @deprecated Set the value using <Titanium.Android.Notification.category> instead.
  			 */
  def setCategory(category: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.color> property.
  			 * @deprecated Set the value using <Titanium.Android.Notification.color> instead.
  			 */
  def setColor(color: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.contentIntent> property.
  			 * @deprecated Set the value using <Titanium.Android.Notification.contentIntent> instead.
  			 */
  def setContentIntent(contentIntent: PendingIntent): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.contentText> property.
  			 * @deprecated Set the value using <Titanium.Android.Notification.contentText> instead.
  			 */
  def setContentText(contentText: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.contentTitle> property.
  			 * @deprecated Set the value using <Titanium.Android.Notification.contentTitle> instead.
  			 */
  def setContentTitle(contentTitle: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.contentView> property.
  			 * @deprecated Set the value using <Titanium.Android.Notification.contentView> instead.
  			 */
  def setContentView(contentView: RemoteViews): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.defaults> property.
  			 * @deprecated Set the value using <Titanium.Android.Notification.defaults> instead.
  			 */
  def setDefaults(defaults: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.deleteIntent> property.
  			 * @deprecated Set the value using <Titanium.Android.Notification.deleteIntent> instead.
  			 */
  def setDeleteIntent(deleteIntent: PendingIntent): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.flags> property.
  			 * @deprecated Set the value using <Titanium.Android.Notification.flags> instead.
  			 */
  def setFlags(flags: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.groupKey> property.
  			 * @deprecated Set the value using <Titanium.Android.Notification.groupKey> instead.
  			 */
  def setGroupKey(groupKey: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.groupSummary> property.
  			 * @deprecated Set the value using <Titanium.Android.Notification.groupSummary> instead.
  			 */
  def setGroupSummary(groupSummary: Boolean): Unit = js.native
  def setIcon(icon: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.icon> property.
  			 * @deprecated Set the value using <Titanium.Android.Notification.icon> instead.
  			 */
  def setIcon(icon: Double): Unit = js.native
  def setLargeIcon(largeIcon: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.largeIcon> property.
  			 * @deprecated Set the value using <Titanium.Android.Notification.largeIcon> instead.
  			 */
  def setLargeIcon(largeIcon: Double): Unit = js.native
  /**
  			 * Sets the latest event info using the built-in notification view for this notification.
  			 */
  def setLatestEventInfo(contentTitle: String, contentText: String, contentIntent: PendingIntent): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.ledARGB> property.
  			 * @deprecated Set the value using <Titanium.Android.Notification.ledARGB> instead.
  			 */
  def setLedARGB(ledARGB: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.ledOffMS> property.
  			 * @deprecated Set the value using <Titanium.Android.Notification.ledOffMS> instead.
  			 */
  def setLedOffMS(ledOffMS: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.ledOnMS> property.
  			 * @deprecated Set the value using <Titanium.Android.Notification.ledOnMS> instead.
  			 */
  def setLedOnMS(ledOnMS: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.number> property.
  			 * @deprecated Set the value using <Titanium.Android.Notification.number> instead.
  			 */
  def setNumber(number: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.priority> property.
  			 * @deprecated Set the value using <Titanium.Android.Notification.priority> instead.
  			 */
  def setPriority(priority: Double): Unit = js.native
  /**
  			 * Set the progress this notification represents.
  			 */
  def setProgress(max: Double, progress: Double, indeterminate: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.sound> property.
  			 * @deprecated Set the value using <Titanium.Android.Notification.sound> instead.
  			 */
  def setSound(sound: String): Unit = js.native
  def setStyle(style: BigPictureStyle): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.style> property.
  			 * @deprecated Set the value using <Titanium.Android.Notification.style> instead.
  			 */
  def setStyle(style: BigTextStyle): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.tickerText> property.
  			 * @deprecated Set the value using <Titanium.Android.Notification.tickerText> instead.
  			 */
  def setTickerText(tickerText: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.visibility> property.
  			 * @deprecated Set the value using <Titanium.Android.Notification.visibility> instead.
  			 */
  def setVisibility(visibility: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.wakeLock> property.
  			 * @deprecated Set the value using <Titanium.Android.Notification.wakeLock> instead.
  			 */
  def setWakeLock(wakeLock: wakeLockOptions): Unit = js.native
  def setWhen(when: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.when> property.
  			 * @deprecated Set the value using <Titanium.Android.Notification.when> instead.
  			 */
  def setWhen(when: Date): Unit = js.native
}

