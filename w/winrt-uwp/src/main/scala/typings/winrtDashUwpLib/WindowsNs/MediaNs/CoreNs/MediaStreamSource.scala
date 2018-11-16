package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a media source that delivers media samples directly to the media pipeline. */
@JSGlobal("Windows.Media.Core.MediaStreamSource")
@js.native
class MediaStreamSource protected () extends js.Object {
  /**
                   * Creates an instance of MediaStreamSource from the specified IMediaStreamDescriptor .
                   * @param descriptor The AudioStreamDescriptor or VideoStreamDescriptor to create the MediaStreamSource from.
                   */
  def this(descriptor: IMediaStreamDescriptor) = this()
  /**
                   * Creates an instance of MediaStreamSource from two IMediaStreamDescriptor objects.
                   * @param descriptor The first AudioStreamDescriptor or VideoStreamDescriptor to create the MediaStreamSource from.
                   * @param descriptor2 The second AudioStreamDescriptor or VideoStreamDescriptor to create the MediaStreamSource from.
                   */
  def this(descriptor: IMediaStreamDescriptor, descriptor2: IMediaStreamDescriptor) = this()
  /** Gets or sets the amount of data that is buffered by the MediaStreamSource . */
  var bufferTime: scala.Double = js.native
  /** Gets or sets whether or not the application supports changing its position in the media time-line. */
  var canSeek: scala.Boolean = js.native
  /** Gets or sets the duration of the media time-line. */
  var duration: scala.Double = js.native
  /** Gets or sets the Digital Rights Management (DRM) MediaProtectionManager used to protect the media. */
  var mediaProtectionManager: winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.MediaProtectionManager = js.native
  /** Gets the music properties which are used for musicrelated metadata. */
  var musicProperties: winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.MusicProperties = js.native
  /** Occurs when the MediaStreamSource is shutting down. */
  @JSName("onclosed")
  var onclosed_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaStreamSource, MediaStreamSourceClosedEventArgs] = js.native
  /** Occurs when the MediaStreamSource is paused and stops requesting MediaStreamSample objects for an unspecified period of time, but is expected to resume requesting MediaStreamSample objects from the current position. */
  @JSName("onpaused")
  var onpaused_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaStreamSource, _] = js.native
  /** Occurs when the MediaStreamSource request a MediaStreamSample for a specified stream. */
  @JSName("onsamplerequested")
  var onsamplerequested_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaStreamSource, MediaStreamSourceSampleRequestedEventArgs] = js.native
  /** Occurs when the MediaStreamSource is ready to start requesting MediaStreamSample objects. The event can specify a position in the media time-line from which the first MediaStreamSample should be delivered. */
  @JSName("onstarting")
  var onstarting_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaStreamSource, MediaStreamSourceStartingEventArgs] = js.native
  /** Occurs when the MediaStreamSource will stop requesting MediaStreamSample objects for a certain stream and will start requesting MediaStreamSample objects from a different stream instead. */
  @JSName("onswitchstreamsrequested")
  var onswitchstreamsrequested_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaStreamSource, MediaStreamSourceSwitchStreamsRequestedEventArgs] = js.native
  /** Gets or sets the thumbnail which is a reference to a stream for a video thumbnail image or music album art. */
  var thumbnail: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference = js.native
  /** Gets the video properties which are used for video related metadata. */
  var videoProperties: winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.VideoProperties = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_closed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.closed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaStreamSource, MediaStreamSourceClosedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paused(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.paused,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaStreamSource, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_samplerequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.samplerequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaStreamSource, MediaStreamSourceSampleRequestedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_starting(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.starting,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaStreamSource, MediaStreamSourceStartingEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_switchstreamsrequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.switchstreamsrequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaStreamSource, MediaStreamSourceSwitchStreamsRequestedEventArgs]
  ): scala.Unit = js.native
  /**
                   * Adds a Digital Rights Management (DRM) protection key which is used by the MediaProtectionManager to encrypt and decrypt the specified stream.
                   * @param streamDescriptor The stream the key is used to encrypt and decrypt.
                   * @param keyIdentifier The key used to encrypt and decrypt the stream.
                   * @param licenseData The DRM licence for the media.
                   */
  def addProtectionKey(
    streamDescriptor: IMediaStreamDescriptor,
    keyIdentifier: js.Array[scala.Double],
    licenseData: js.Array[scala.Double]
  ): scala.Unit = js.native
  /**
                   * Adds a new stream descriptor to the MediaStreamSource .
                   * @param descriptor The descriptor to add.
                   */
  def addStreamDescriptor(descriptor: IMediaStreamDescriptor): scala.Unit = js.native
  /**
                   * Notifies the MediaStreamSource that an error has occurred which is preventing the application from continuing to deliver data to the MediaStreamSource.
                   * @param errorStatus The cause of the error.
                   */
  def notifyError(errorStatus: MediaStreamSourceErrorStatus): scala.Unit = js.native
  /** Occurs when the MediaStreamSource is shutting down. */
  def onclosed(ev: MediaStreamSourceClosedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[MediaStreamSource]): scala.Unit = js.native
  /** Occurs when the MediaStreamSource is paused and stops requesting MediaStreamSample objects for an unspecified period of time, but is expected to resume requesting MediaStreamSample objects from the current position. */
  def onpaused(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[MediaStreamSource]): scala.Unit = js.native
  /** Occurs when the MediaStreamSource request a MediaStreamSample for a specified stream. */
  def onsamplerequested(
    ev: MediaStreamSourceSampleRequestedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[MediaStreamSource]
  ): scala.Unit = js.native
  /** Occurs when the MediaStreamSource is ready to start requesting MediaStreamSample objects. The event can specify a position in the media time-line from which the first MediaStreamSample should be delivered. */
  def onstarting(
    ev: MediaStreamSourceStartingEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[MediaStreamSource]
  ): scala.Unit = js.native
  /** Occurs when the MediaStreamSource will stop requesting MediaStreamSample objects for a certain stream and will start requesting MediaStreamSample objects from a different stream instead. */
  def onswitchstreamsrequested(
    ev: MediaStreamSourceSwitchStreamsRequestedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[MediaStreamSource]
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_closed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.closed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaStreamSource, MediaStreamSourceClosedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_paused(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.paused,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaStreamSource, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_samplerequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.samplerequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaStreamSource, MediaStreamSourceSampleRequestedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_starting(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.starting,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaStreamSource, MediaStreamSourceStartingEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_switchstreamsrequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.switchstreamsrequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaStreamSource, MediaStreamSourceSwitchStreamsRequestedEventArgs]
  ): scala.Unit = js.native
  /**
                   * Sets the range of data that the application is currently buffering.
                   * @param startOffset The smallest time stamp of a MediaStreamSample buffered by the application.
                   * @param endOffset The largest time stamp of a MediaStreamSample buffered by the application.
                   */
  def setBufferedRange(startOffset: scala.Double, endOffset: scala.Double): scala.Unit = js.native
}

