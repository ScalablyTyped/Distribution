package typings.titanium.Titanium.App

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait iOSEventMap extends ProxyEventMap {
  
  var backgroundfetch: iOSBackgroundfetchEvent = js.native
  
  var backgroundtransfer: iOSBackgroundtransferEvent = js.native
  
  var continueactivity: iOSContinueactivityEvent = js.native
  
  var downloadcompleted: iOSDownloadcompletedEvent = js.native
  
  var downloadprogress: iOSDownloadprogressEvent = js.native
  
  var handleurl: iOSHandleurlEvent = js.native
  
  var localnotificationaction: iOSLocalnotificationactionEvent = js.native
  
  var notification: iOSNotificationEvent = js.native
  
  var remotenotificationaction: iOSRemotenotificationactionEvent = js.native
  
  var screenshotcaptured: iOSScreenshotcapturedEvent = js.native
  
  var sessioncompleted: iOSSessioncompletedEvent = js.native
  
  var sessioneventscompleted: iOSSessioneventscompletedEvent = js.native
  
  var shortcutitemclick: iOSShortcutitemclickEvent = js.native
  
  var silentpush: iOSSilentpushEvent = js.native
  
  var traitcollectionchange: iOSTraitcollectionchangeEvent = js.native
  
  var uploadprogress: iOSUploadprogressEvent = js.native
  
  var usernotificationsettings: iOSUsernotificationsettingsEvent = js.native
  
  var watchkitextensionrequest: iOSWatchkitextensionrequestEvent = js.native
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
    screenshotcaptured: iOSScreenshotcapturedEvent,
    sessioncompleted: iOSSessioncompletedEvent,
    sessioneventscompleted: iOSSessioneventscompletedEvent,
    shortcutitemclick: iOSShortcutitemclickEvent,
    silentpush: iOSSilentpushEvent,
    traitcollectionchange: iOSTraitcollectionchangeEvent,
    uploadprogress: iOSUploadprogressEvent,
    usernotificationsettings: iOSUsernotificationsettingsEvent,
    watchkitextensionrequest: iOSWatchkitextensionrequestEvent
  ): iOSEventMap = {
    val __obj = js.Dynamic.literal(backgroundfetch = backgroundfetch.asInstanceOf[js.Any], backgroundtransfer = backgroundtransfer.asInstanceOf[js.Any], continueactivity = continueactivity.asInstanceOf[js.Any], downloadcompleted = downloadcompleted.asInstanceOf[js.Any], downloadprogress = downloadprogress.asInstanceOf[js.Any], handleurl = handleurl.asInstanceOf[js.Any], localnotificationaction = localnotificationaction.asInstanceOf[js.Any], notification = notification.asInstanceOf[js.Any], remotenotificationaction = remotenotificationaction.asInstanceOf[js.Any], screenshotcaptured = screenshotcaptured.asInstanceOf[js.Any], sessioncompleted = sessioncompleted.asInstanceOf[js.Any], sessioneventscompleted = sessioneventscompleted.asInstanceOf[js.Any], shortcutitemclick = shortcutitemclick.asInstanceOf[js.Any], silentpush = silentpush.asInstanceOf[js.Any], traitcollectionchange = traitcollectionchange.asInstanceOf[js.Any], uploadprogress = uploadprogress.asInstanceOf[js.Any], usernotificationsettings = usernotificationsettings.asInstanceOf[js.Any], watchkitextensionrequest = watchkitextensionrequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[iOSEventMap]
  }
  
  @scala.inline
  implicit class iOSEventMapOps[Self <: iOSEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBackgroundfetch(value: iOSBackgroundfetchEvent): Self = this.set("backgroundfetch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundtransfer(value: iOSBackgroundtransferEvent): Self = this.set("backgroundtransfer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinueactivity(value: iOSContinueactivityEvent): Self = this.set("continueactivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadcompleted(value: iOSDownloadcompletedEvent): Self = this.set("downloadcompleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadprogress(value: iOSDownloadprogressEvent): Self = this.set("downloadprogress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandleurl(value: iOSHandleurlEvent): Self = this.set("handleurl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalnotificationaction(value: iOSLocalnotificationactionEvent): Self = this.set("localnotificationaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotification(value: iOSNotificationEvent): Self = this.set("notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemotenotificationaction(value: iOSRemotenotificationactionEvent): Self = this.set("remotenotificationaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenshotcaptured(value: iOSScreenshotcapturedEvent): Self = this.set("screenshotcaptured", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessioncompleted(value: iOSSessioncompletedEvent): Self = this.set("sessioncompleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessioneventscompleted(value: iOSSessioneventscompletedEvent): Self = this.set("sessioneventscompleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortcutitemclick(value: iOSShortcutitemclickEvent): Self = this.set("shortcutitemclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilentpush(value: iOSSilentpushEvent): Self = this.set("silentpush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraitcollectionchange(value: iOSTraitcollectionchangeEvent): Self = this.set("traitcollectionchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadprogress(value: iOSUploadprogressEvent): Self = this.set("uploadprogress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernotificationsettings(value: iOSUsernotificationsettingsEvent): Self = this.set("usernotificationsettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWatchkitextensionrequest(value: iOSWatchkitextensionrequestEvent): Self = this.set("watchkitextensionrequest", value.asInstanceOf[js.Any])
  }
}
