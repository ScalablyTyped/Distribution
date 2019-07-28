package typings.titanium.TitaniumNs.AndroidNs

import typings.std.Date
import typings.titanium.TitaniumNs.Proxy
import typings.titanium.wakeLockOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * UI notifications that can be sent while the application is in the background.
		 */
@js.native
trait Notification extends Proxy {
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
  			 * <ti:app>
  			 *     <android>
  			 *         <manifest>
  			 *             <uses-permission android:name="android.permission.WAKE_LOCK" />
  			 *         </manifest>
  			 *     </android>
  			 * </ti:app>
  			 */
  var wakeLock: wakeLockOptions = js.native
  /**
  			 * The timestamp for the notification (defaults to the current time).
  			 */
  var when: Date | Double = js.native
  /**
  			 * Add an action button to the notification
  			 */
  def addAction(icon: String, title: String, intent: PendingIntent): Unit = js.native
  /**
  			 * Add an action button to the notification
  			 */
  def addAction(icon: Double, title: String, intent: PendingIntent): Unit = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.audioStreamType> property.
  			 */
  def getAudioStreamType(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.category> property.
  			 */
  def getCategory(): String = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.color> property.
  			 */
  def getColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.contentIntent> property.
  			 */
  def getContentIntent(): PendingIntent = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.contentText> property.
  			 */
  def getContentText(): String = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.contentTitle> property.
  			 */
  def getContentTitle(): String = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.defaults> property.
  			 */
  def getDefaults(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.deleteIntent> property.
  			 */
  def getDeleteIntent(): PendingIntent = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.flags> property.
  			 */
  def getFlags(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.groupKey> property.
  			 */
  def getGroupKey(): String = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.groupSummary> property.
  			 */
  def getGroupSummary(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.icon> property.
  			 */
  def getIcon(): Double | String = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.largeIcon> property.
  			 */
  def getLargeIcon(): Double | String = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.ledARGB> property.
  			 */
  def getLedARGB(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.ledOffMS> property.
  			 */
  def getLedOffMS(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.ledOnMS> property.
  			 */
  def getLedOnMS(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.number> property.
  			 */
  def getNumber(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.priority> property.
  			 */
  def getPriority(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.sound> property.
  			 */
  def getSound(): String = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.style> property.
  			 */
  def getStyle(): BigTextStyle | BigPictureStyle = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.tickerText> property.
  			 */
  def getTickerText(): String = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.visibility> property.
  			 */
  def getVisibility(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.wakeLock> property.
  			 */
  def getWakeLock(): wakeLockOptions = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.when> property.
  			 */
  def getWhen(): Date | Double = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.audioStreamType> property.
  			 */
  def setAudioStreamType(audioStreamType: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.category> property.
  			 */
  def setCategory(category: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.color> property.
  			 */
  def setColor(color: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.contentIntent> property.
  			 */
  def setContentIntent(contentIntent: PendingIntent): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.contentText> property.
  			 */
  def setContentText(contentText: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.contentTitle> property.
  			 */
  def setContentTitle(contentTitle: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.contentView> property.
  			 */
  def setContentView(contentView: RemoteViews): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.defaults> property.
  			 */
  def setDefaults(defaults: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.deleteIntent> property.
  			 */
  def setDeleteIntent(deleteIntent: PendingIntent): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.flags> property.
  			 */
  def setFlags(flags: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.groupKey> property.
  			 */
  def setGroupKey(groupKey: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.groupSummary> property.
  			 */
  def setGroupSummary(groupSummary: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.icon> property.
  			 */
  def setIcon(icon: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.icon> property.
  			 */
  def setIcon(icon: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.largeIcon> property.
  			 */
  def setLargeIcon(largeIcon: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.largeIcon> property.
  			 */
  def setLargeIcon(largeIcon: Double): Unit = js.native
  /**
  			 * Sets the latest event info using the built-in notification view for this notification.
  			 */
  def setLatestEventInfo(contentTitle: String, contentText: String, contentIntent: PendingIntent): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.ledARGB> property.
  			 */
  def setLedARGB(ledARGB: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.ledOffMS> property.
  			 */
  def setLedOffMS(ledOffMS: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.ledOnMS> property.
  			 */
  def setLedOnMS(ledOnMS: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.number> property.
  			 */
  def setNumber(number: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.priority> property.
  			 */
  def setPriority(priority: Double): Unit = js.native
  /**
  			 * Set the progress this notification represents.
  			 */
  def setProgress(max: Double, progress: Double, indeterminate: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.sound> property.
  			 */
  def setSound(sound: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.style> property.
  			 */
  def setStyle(style: BigPictureStyle): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.style> property.
  			 */
  def setStyle(style: BigTextStyle): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.tickerText> property.
  			 */
  def setTickerText(tickerText: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.visibility> property.
  			 */
  def setVisibility(visibility: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.wakeLock> property.
  			 */
  def setWakeLock(wakeLock: wakeLockOptions): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.when> property.
  			 */
  def setWhen(when: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.when> property.
  			 */
  def setWhen(when: Date): Unit = js.native
}

