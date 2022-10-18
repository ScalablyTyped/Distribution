package typings.twilioVideo

import typings.twilioVideo.tsdefLoglevelMod.Log.LogLevelDesc
import typings.twilioVideo.tsdefTrackMod.Track.Kind
import typings.twilioVideo.tsdefTrackMod.Track.Priority
import typings.twilioVideo.tsdefTypesMod.AudioCodec
import typings.twilioVideo.tsdefTypesMod.BandwidthProfileMode
import typings.twilioVideo.tsdefTypesMod.ClientTrackSwitchOffControl
import typings.twilioVideo.tsdefTypesMod.LogLevel
import typings.twilioVideo.tsdefTypesMod.NoiseCancellationVendor
import typings.twilioVideo.tsdefTypesMod.TrackSwitchOffMode
import typings.twilioVideo.tsdefTypesMod.VideoCodec
import typings.twilioVideo.tsdefTypesMod.VideoContentPreferencesMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object twilioVideoStrings {
  
  @js.native
  sealed trait DEBUG
    extends StObject
       with LogLevelDesc
  inline def DEBUG: DEBUG = "DEBUG".asInstanceOf[DEBUG]
  
  @js.native
  sealed trait ERROR
    extends StObject
       with LogLevelDesc
  inline def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  
  @js.native
  sealed trait H264
    extends StObject
       with VideoCodec
  inline def H264: H264 = "H264".asInstanceOf[H264]
  
  @js.native
  sealed trait INFO
    extends StObject
       with LogLevelDesc
  inline def INFO: INFO = "INFO".asInstanceOf[INFO]
  
  @js.native
  sealed trait PCMA
    extends StObject
       with AudioCodec
  inline def PCMA: PCMA = "PCMA".asInstanceOf[PCMA]
  
  @js.native
  sealed trait PCMU
    extends StObject
       with AudioCodec
  inline def PCMU: PCMU = "PCMU".asInstanceOf[PCMU]
  
  @js.native
  sealed trait SILENT
    extends StObject
       with LogLevelDesc
  inline def SILENT: SILENT = "SILENT".asInstanceOf[SILENT]
  
  @js.native
  sealed trait TRACE
    extends StObject
       with LogLevelDesc
  inline def TRACE: TRACE = "TRACE".asInstanceOf[TRACE]
  
  @js.native
  sealed trait VP8
    extends StObject
       with VideoCodec
  inline def VP8: VP8 = "VP8".asInstanceOf[VP8]
  
  @js.native
  sealed trait VP9
    extends StObject
       with VideoCodec
  inline def VP9: VP9 = "VP9".asInstanceOf[VP9]
  
  @js.native
  sealed trait WARN
    extends StObject
       with LogLevelDesc
  inline def WARN: WARN = "WARN".asInstanceOf[WARN]
  
  @js.native
  sealed trait audio
    extends StObject
       with Kind
  inline def audio: audio = "audio".asInstanceOf[audio]
  
  @js.native
  sealed trait auto
    extends StObject
       with ClientTrackSwitchOffControl
       with VideoContentPreferencesMode
  inline def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait collaboration
    extends StObject
       with BandwidthProfileMode
  inline def collaboration: collaboration = "collaboration".asInstanceOf[collaboration]
  
  @js.native
  sealed trait completed extends StObject
  inline def completed: completed = "completed".asInstanceOf[completed]
  
  @js.native
  sealed trait data
    extends StObject
       with Kind
  inline def data: data = "data".asInstanceOf[data]
  
  @js.native
  sealed trait debug_
    extends StObject
       with LogLevel
       with LogLevelDesc
  inline def debug_ : debug_ = "debug".asInstanceOf[debug_]
  
  @js.native
  sealed trait detected
    extends StObject
       with TrackSwitchOffMode
  inline def detected: detected = "detected".asInstanceOf[detected]
  
  @js.native
  sealed trait dimensionsChanged extends StObject
  inline def dimensionsChanged: dimensionsChanged = "dimensionsChanged".asInstanceOf[dimensionsChanged]
  
  @js.native
  sealed trait disabled
    extends StObject
       with TrackSwitchOffMode
  inline def disabled: disabled = "disabled".asInstanceOf[disabled]
  
  @js.native
  sealed trait disconnected extends StObject
  inline def disconnected: disconnected = "disconnected".asInstanceOf[disconnected]
  
  @js.native
  sealed trait dominantSpeakerChanged extends StObject
  inline def dominantSpeakerChanged: dominantSpeakerChanged = "dominantSpeakerChanged".asInstanceOf[dominantSpeakerChanged]
  
  @js.native
  sealed trait enabled extends StObject
  inline def enabled: enabled = "enabled".asInstanceOf[enabled]
  
  @js.native
  sealed trait error_
    extends StObject
       with LogLevel
       with LogLevelDesc
  inline def error_ : error_ = "error".asInstanceOf[error_]
  
  @js.native
  sealed trait failed extends StObject
  inline def failed: failed = "failed".asInstanceOf[failed]
  
  @js.native
  sealed trait grid
    extends StObject
       with BandwidthProfileMode
  inline def grid: grid = "grid".asInstanceOf[grid]
  
  @js.native
  sealed trait high
    extends StObject
       with Priority
  inline def high: high = "high".asInstanceOf[high]
  
  @js.native
  sealed trait info_
    extends StObject
       with LogLevel
       with LogLevelDesc
  inline def info_ : info_ = "info".asInstanceOf[info_]
  
  @js.native
  sealed trait isac
    extends StObject
       with AudioCodec
  inline def isac: isac = "isac".asInstanceOf[isac]
  
  @js.native
  sealed trait krisp
    extends StObject
       with NoiseCancellationVendor
  inline def krisp: krisp = "krisp".asInstanceOf[krisp]
  
  @js.native
  sealed trait low
    extends StObject
       with Priority
  inline def low: low = "low".asInstanceOf[low]
  
  @js.native
  sealed trait manual
    extends StObject
       with ClientTrackSwitchOffControl
       with VideoContentPreferencesMode
  inline def manual: manual = "manual".asInstanceOf[manual]
  
  @js.native
  sealed trait message extends StObject
  inline def message: message = "message".asInstanceOf[message]
  
  @js.native
  sealed trait networkQualityLevelChanged extends StObject
  inline def networkQualityLevelChanged: networkQualityLevelChanged = "networkQualityLevelChanged".asInstanceOf[networkQualityLevelChanged]
  
  @js.native
  sealed trait off
    extends StObject
       with LogLevel
  inline def off: off = "off".asInstanceOf[off]
  
  @js.native
  sealed trait opus
    extends StObject
       with AudioCodec
  inline def opus: opus = "opus".asInstanceOf[opus]
  
  @js.native
  sealed trait participantConnected extends StObject
  inline def participantConnected: participantConnected = "participantConnected".asInstanceOf[participantConnected]
  
  @js.native
  sealed trait participantDisconnected extends StObject
  inline def participantDisconnected: participantDisconnected = "participantDisconnected".asInstanceOf[participantDisconnected]
  
  @js.native
  sealed trait participantReconnected extends StObject
  inline def participantReconnected: participantReconnected = "participantReconnected".asInstanceOf[participantReconnected]
  
  @js.native
  sealed trait participantReconnecting extends StObject
  inline def participantReconnecting: participantReconnecting = "participantReconnecting".asInstanceOf[participantReconnecting]
  
  @js.native
  sealed trait predicted
    extends StObject
       with TrackSwitchOffMode
  inline def predicted: predicted = "predicted".asInstanceOf[predicted]
  
  @js.native
  sealed trait presentation
    extends StObject
       with BandwidthProfileMode
  inline def presentation: presentation = "presentation".asInstanceOf[presentation]
  
  @js.native
  sealed trait progress extends StObject
  inline def progress: progress = "progress".asInstanceOf[progress]
  
  @js.native
  sealed trait publishPriorityChanged extends StObject
  inline def publishPriorityChanged: publishPriorityChanged = "publishPriorityChanged".asInstanceOf[publishPriorityChanged]
  
  @js.native
  sealed trait reconnected extends StObject
  inline def reconnected: reconnected = "reconnected".asInstanceOf[reconnected]
  
  @js.native
  sealed trait reconnecting extends StObject
  inline def reconnecting: reconnecting = "reconnecting".asInstanceOf[reconnecting]
  
  @js.native
  sealed trait `recording-media-lost` extends StObject
  inline def `recording-media-lost`: `recording-media-lost` = "recording-media-lost".asInstanceOf[`recording-media-lost`]
  
  @js.native
  sealed trait recordingStarted extends StObject
  inline def recordingStarted: recordingStarted = "recordingStarted".asInstanceOf[recordingStarted]
  
  @js.native
  sealed trait recordingStopped extends StObject
  inline def recordingStopped: recordingStopped = "recordingStopped".asInstanceOf[recordingStopped]
  
  @js.native
  sealed trait rnnoise
    extends StObject
       with NoiseCancellationVendor
  inline def rnnoise: rnnoise = "rnnoise".asInstanceOf[rnnoise]
  
  @js.native
  sealed trait silent_
    extends StObject
       with LogLevelDesc
  inline def silent_ : silent_ = "silent".asInstanceOf[silent_]
  
  @js.native
  sealed trait standard
    extends StObject
       with Priority
  inline def standard: standard = "standard".asInstanceOf[standard]
  
  @js.native
  sealed trait started extends StObject
  inline def started: started = "started".asInstanceOf[started]
  
  @js.native
  sealed trait stopped extends StObject
  inline def stopped: stopped = "stopped".asInstanceOf[stopped]
  
  @js.native
  sealed trait subscribed extends StObject
  inline def subscribed: subscribed = "subscribed".asInstanceOf[subscribed]
  
  @js.native
  sealed trait subscriptionFailed extends StObject
  inline def subscriptionFailed: subscriptionFailed = "subscriptionFailed".asInstanceOf[subscriptionFailed]
  
  @js.native
  sealed trait switchedOff extends StObject
  inline def switchedOff: switchedOff = "switchedOff".asInstanceOf[switchedOff]
  
  @js.native
  sealed trait switchedOn extends StObject
  inline def switchedOn: switchedOn = "switchedOn".asInstanceOf[switchedOn]
  
  @js.native
  sealed trait trace_
    extends StObject
       with LogLevelDesc
  inline def trace_ : trace_ = "trace".asInstanceOf[trace_]
  
  @js.native
  sealed trait trackDimensionsChanged extends StObject
  inline def trackDimensionsChanged: trackDimensionsChanged = "trackDimensionsChanged".asInstanceOf[trackDimensionsChanged]
  
  @js.native
  sealed trait trackDisabled extends StObject
  inline def trackDisabled: trackDisabled = "trackDisabled".asInstanceOf[trackDisabled]
  
  @js.native
  sealed trait trackEnabled extends StObject
  inline def trackEnabled: trackEnabled = "trackEnabled".asInstanceOf[trackEnabled]
  
  @js.native
  sealed trait trackMessage extends StObject
  inline def trackMessage: trackMessage = "trackMessage".asInstanceOf[trackMessage]
  
  @js.native
  sealed trait trackPublicationFailed extends StObject
  inline def trackPublicationFailed: trackPublicationFailed = "trackPublicationFailed".asInstanceOf[trackPublicationFailed]
  
  @js.native
  sealed trait trackPublishPriorityChanged extends StObject
  inline def trackPublishPriorityChanged: trackPublishPriorityChanged = "trackPublishPriorityChanged".asInstanceOf[trackPublishPriorityChanged]
  
  @js.native
  sealed trait trackPublished extends StObject
  inline def trackPublished: trackPublished = "trackPublished".asInstanceOf[trackPublished]
  
  @js.native
  sealed trait trackStarted extends StObject
  inline def trackStarted: trackStarted = "trackStarted".asInstanceOf[trackStarted]
  
  @js.native
  sealed trait trackStopped extends StObject
  inline def trackStopped: trackStopped = "trackStopped".asInstanceOf[trackStopped]
  
  @js.native
  sealed trait trackSubscribed extends StObject
  inline def trackSubscribed: trackSubscribed = "trackSubscribed".asInstanceOf[trackSubscribed]
  
  @js.native
  sealed trait trackSubscriptionFailed extends StObject
  inline def trackSubscriptionFailed: trackSubscriptionFailed = "trackSubscriptionFailed".asInstanceOf[trackSubscriptionFailed]
  
  @js.native
  sealed trait trackSwitchedOff extends StObject
  inline def trackSwitchedOff: trackSwitchedOff = "trackSwitchedOff".asInstanceOf[trackSwitchedOff]
  
  @js.native
  sealed trait trackSwitchedOn extends StObject
  inline def trackSwitchedOn: trackSwitchedOn = "trackSwitchedOn".asInstanceOf[trackSwitchedOn]
  
  @js.native
  sealed trait trackUnpublished extends StObject
  inline def trackUnpublished: trackUnpublished = "trackUnpublished".asInstanceOf[trackUnpublished]
  
  @js.native
  sealed trait trackUnsubscribed extends StObject
  inline def trackUnsubscribed: trackUnsubscribed = "trackUnsubscribed".asInstanceOf[trackUnsubscribed]
  
  @js.native
  sealed trait trackWarning extends StObject
  inline def trackWarning: trackWarning = "trackWarning".asInstanceOf[trackWarning]
  
  @js.native
  sealed trait trackWarningsCleared extends StObject
  inline def trackWarningsCleared: trackWarningsCleared = "trackWarningsCleared".asInstanceOf[trackWarningsCleared]
  
  @js.native
  sealed trait unsubscribed extends StObject
  inline def unsubscribed: unsubscribed = "unsubscribed".asInstanceOf[unsubscribed]
  
  @js.native
  sealed trait video
    extends StObject
       with Kind
  inline def video: video = "video".asInstanceOf[video]
  
  @js.native
  sealed trait warn_
    extends StObject
       with LogLevel
       with LogLevelDesc
  inline def warn_ : warn_ = "warn".asInstanceOf[warn_]
  
  @js.native
  sealed trait warning extends StObject
  inline def warning: warning = "warning".asInstanceOf[warning]
  
  @js.native
  sealed trait warningsCleared extends StObject
  inline def warningsCleared: warningsCleared = "warningsCleared".asInstanceOf[warningsCleared]
}
