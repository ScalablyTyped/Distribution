package typings
package titaniumLib.TitaniumNs.AndroidNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * UI notifications that can be sent while the application is in the background.
		 */
@js.native
trait Notification
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * The audio stream type to use when playing the sound.
  			 */
  var audioStreamType: scala.Double = js.native
  /**
  			 * Sets the notification's category.
  			 */
  var category: java.lang.String = js.native
  /**
  			 * Accent color used behind icon.
  			 */
  var color: java.lang.String = js.native
  /**
  			 * The `PendingIntent` to execute when the expanded status entry is clicked.
  			 */
  var contentIntent: PendingIntent = js.native
  /**
  			 * Description text of the notification.
  			 */
  var contentText: java.lang.String = js.native
  /**
  			 * Title of the notification.
  			 */
  var contentTitle: java.lang.String = js.native
  /**
  			 * Custom layout to display in the notification.
  			 */
  var contentView: RemoteViews = js.native
  /**
  			 * Specifies which values should be taken from the defaults.
  			 */
  var defaults: scala.Double = js.native
  /**
  			 * The `PendingIntent` to execute when the status entry is deleted by the user with the "Clear All Notifications" button.
  			 */
  var deleteIntent: PendingIntent = js.native
  /**
  			 * Set of flags for the notification.
  			 */
  var flags: scala.Double = js.native
  /**
  			 * The group key that the notification will belong to.
  			 */
  var groupKey: java.lang.String = js.native
  /**
  			 * Specifies if this is a group summary notification.
  			 */
  var groupSummary: scala.Boolean = js.native
  /**
  			 * Notification icon, specified as an Android resource ID, or a local URL to a density-specific image.
  			 */
  var icon: scala.Double | java.lang.String = js.native
  /**
  			 * Add a large icon to the notification (and the ticker on some devices) specified as an Android resource ID, or a local URL to a density-specific image.
  			 */
  var largeIcon: scala.Double | java.lang.String = js.native
  /**
  			 * The color for the LED to blink.
  			 */
  var ledARGB: scala.Double = js.native
  /**
  			 * The number of milliseconds for the LED to be off while it's flashing.
  			 */
  var ledOffMS: scala.Double = js.native
  /**
  			 * The number of milliseconds for the LED to be on while it's flashing.
  			 */
  var ledOnMS: scala.Double = js.native
  /**
  			 * The number of events that this notification represents.
  			 */
  var number: scala.Double = js.native
  /**
  			 * Sets the priority of the notification.
  			 */
  var priority: scala.Double = js.native
  /**
  			 * A URL to the sound to play.
  			 */
  var sound: java.lang.String = js.native
  /**
  			 * Style object that can apply a rich notification style.
  			 */
  var style: BigTextStyle | BigPictureStyle = js.native
  /**
  			 * Text to scroll across the screen when this item is added to the status bar.
  			 */
  var tickerText: java.lang.String = js.native
  /**
  			 * Allows user to conceal private information of the notification on the lockscreen.
  			 */
  var visibility: scala.Double = js.native
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
  var wakeLock: titaniumLib.wakeLockOptions = js.native
  /**
  			 * The timestamp for the notification (defaults to the current time).
  			 */
  var when: stdLib.Date | scala.Double = js.native
  /**
  			 * Add an action button to the notification
  			 */
  def addAction(icon: java.lang.String, title: java.lang.String, intent: PendingIntent): scala.Unit = js.native
  /**
  			 * Add an action button to the notification
  			 */
  def addAction(icon: scala.Double, title: java.lang.String, intent: PendingIntent): scala.Unit = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.audioStreamType> property.
  			 */
  def getAudioStreamType(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.category> property.
  			 */
  def getCategory(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.color> property.
  			 */
  def getColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.contentIntent> property.
  			 */
  def getContentIntent(): PendingIntent = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.contentText> property.
  			 */
  def getContentText(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.contentTitle> property.
  			 */
  def getContentTitle(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.defaults> property.
  			 */
  def getDefaults(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.deleteIntent> property.
  			 */
  def getDeleteIntent(): PendingIntent = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.flags> property.
  			 */
  def getFlags(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.groupKey> property.
  			 */
  def getGroupKey(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.groupSummary> property.
  			 */
  def getGroupSummary(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.icon> property.
  			 */
  def getIcon(): scala.Double | java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.largeIcon> property.
  			 */
  def getLargeIcon(): scala.Double | java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.ledARGB> property.
  			 */
  def getLedARGB(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.ledOffMS> property.
  			 */
  def getLedOffMS(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.ledOnMS> property.
  			 */
  def getLedOnMS(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.number> property.
  			 */
  def getNumber(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.priority> property.
  			 */
  def getPriority(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.sound> property.
  			 */
  def getSound(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.style> property.
  			 */
  def getStyle(): BigTextStyle | BigPictureStyle = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.tickerText> property.
  			 */
  def getTickerText(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.visibility> property.
  			 */
  def getVisibility(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.wakeLock> property.
  			 */
  def getWakeLock(): titaniumLib.wakeLockOptions = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Notification.when> property.
  			 */
  def getWhen(): stdLib.Date | scala.Double = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.audioStreamType> property.
  			 */
  def setAudioStreamType(audioStreamType: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.category> property.
  			 */
  def setCategory(category: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.color> property.
  			 */
  def setColor(color: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.contentIntent> property.
  			 */
  def setContentIntent(contentIntent: PendingIntent): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.contentText> property.
  			 */
  def setContentText(contentText: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.contentTitle> property.
  			 */
  def setContentTitle(contentTitle: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.contentView> property.
  			 */
  def setContentView(contentView: RemoteViews): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.defaults> property.
  			 */
  def setDefaults(defaults: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.deleteIntent> property.
  			 */
  def setDeleteIntent(deleteIntent: PendingIntent): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.flags> property.
  			 */
  def setFlags(flags: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.groupKey> property.
  			 */
  def setGroupKey(groupKey: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.groupSummary> property.
  			 */
  def setGroupSummary(groupSummary: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.icon> property.
  			 */
  def setIcon(icon: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.icon> property.
  			 */
  def setIcon(icon: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.largeIcon> property.
  			 */
  def setLargeIcon(largeIcon: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.largeIcon> property.
  			 */
  def setLargeIcon(largeIcon: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the latest event info using the built-in notification view for this notification.
  			 */
  def setLatestEventInfo(contentTitle: java.lang.String, contentText: java.lang.String, contentIntent: PendingIntent): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.ledARGB> property.
  			 */
  def setLedARGB(ledARGB: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.ledOffMS> property.
  			 */
  def setLedOffMS(ledOffMS: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.ledOnMS> property.
  			 */
  def setLedOnMS(ledOnMS: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.number> property.
  			 */
  def setNumber(number: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.priority> property.
  			 */
  def setPriority(priority: scala.Double): scala.Unit = js.native
  /**
  			 * Set the progress this notification represents.
  			 */
  def setProgress(max: scala.Double, progress: scala.Double, indeterminate: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.sound> property.
  			 */
  def setSound(sound: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.style> property.
  			 */
  def setStyle(style: BigPictureStyle): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.style> property.
  			 */
  def setStyle(style: BigTextStyle): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.tickerText> property.
  			 */
  def setTickerText(tickerText: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.visibility> property.
  			 */
  def setVisibility(visibility: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.wakeLock> property.
  			 */
  def setWakeLock(wakeLock: titaniumLib.wakeLockOptions): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.when> property.
  			 */
  def setWhen(when: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Notification.when> property.
  			 */
  def setWhen(when: stdLib.Date): scala.Unit = js.native
}

