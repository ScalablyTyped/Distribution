package typings.titanium.Titanium.App

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait iOSEventMap extends ProxyEventMap {
  var backgroundfetch: iOSBackgroundfetchEvent
  var backgroundtransfer: iOSBackgroundtransferEvent
  var continueactivity: iOSContinueactivityEvent
  var downloadcompleted: iOSDownloadcompletedEvent
  var downloadprogress: iOSDownloadprogressEvent
  var handleurl: iOSHandleurlEvent
  var localnotificationaction: iOSLocalnotificationactionEvent
  var notification: iOSNotificationEvent
  var remotenotificationaction: iOSRemotenotificationactionEvent
  var sessioncompleted: iOSSessioncompletedEvent
  var sessioneventscompleted: iOSSessioneventscompletedEvent
  var shortcutitemclick: iOSShortcutitemclickEvent
  var silentpush: iOSSilentpushEvent
  var traitcollectionchange: iOSTraitcollectionchangeEvent
  var uploadprogress: iOSUploadprogressEvent
  var usernotificationsettings: iOSUsernotificationsettingsEvent
  var watchkitextensionrequest: iOSWatchkitextensionrequestEvent
}

object iOSEventMap {
  @scala.inline
  def apply(
    backgroundfetch: iOSBackgroundfetchEvent,
    backgroundtransfer: iOSBackgroundtransferEvent,
    continueactivity: iOSContinueactivityEvent,
    downloadcompleted: iOSDownloadcompletedEvent,
    downloadprogress: iOSDownloadprogressEvent,
    handleurl: iOSHandleurlEvent,
    localnotificationaction: iOSLocalnotificationactionEvent,
    notification: iOSNotificationEvent,
    remotenotificationaction: iOSRemotenotificationactionEvent,
    sessioncompleted: iOSSessioncompletedEvent,
    sessioneventscompleted: iOSSessioneventscompletedEvent,
    shortcutitemclick: iOSShortcutitemclickEvent,
    silentpush: iOSSilentpushEvent,
    traitcollectionchange: iOSTraitcollectionchangeEvent,
    uploadprogress: iOSUploadprogressEvent,
    usernotificationsettings: iOSUsernotificationsettingsEvent,
    watchkitextensionrequest: iOSWatchkitextensionrequestEvent
  ): iOSEventMap = {
    val __obj = js.Dynamic.literal(backgroundfetch = backgroundfetch.asInstanceOf[js.Any], backgroundtransfer = backgroundtransfer.asInstanceOf[js.Any], continueactivity = continueactivity.asInstanceOf[js.Any], downloadcompleted = downloadcompleted.asInstanceOf[js.Any], downloadprogress = downloadprogress.asInstanceOf[js.Any], handleurl = handleurl.asInstanceOf[js.Any], localnotificationaction = localnotificationaction.asInstanceOf[js.Any], notification = notification.asInstanceOf[js.Any], remotenotificationaction = remotenotificationaction.asInstanceOf[js.Any], sessioncompleted = sessioncompleted.asInstanceOf[js.Any], sessioneventscompleted = sessioneventscompleted.asInstanceOf[js.Any], shortcutitemclick = shortcutitemclick.asInstanceOf[js.Any], silentpush = silentpush.asInstanceOf[js.Any], traitcollectionchange = traitcollectionchange.asInstanceOf[js.Any], uploadprogress = uploadprogress.asInstanceOf[js.Any], usernotificationsettings = usernotificationsettings.asInstanceOf[js.Any], watchkitextensionrequest = watchkitextensionrequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[iOSEventMap]
  }
}

