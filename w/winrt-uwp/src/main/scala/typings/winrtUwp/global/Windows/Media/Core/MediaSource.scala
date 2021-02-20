package typings.winrtUwp.global.Windows.Media.Core

import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Media.Core.IMediaSource
import typings.winrtUwp.Windows.Media.Core.MseStreamSource
import typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSource
import typings.winrtUwp.Windows.Storage.IStorageFile
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a media source. Provides a common way to reference media from different sources and exposes a common model for accessing media data regardless of the underlying media format. */
@JSGlobal("Windows.Media.Core.MediaSource")
@js.native
abstract class MediaSource ()
  extends typings.winrtUwp.Windows.Media.Core.MediaSource
object MediaSource {
  
  /**
    * Creates an instance of MediaSource from the provided AdaptiveMediaSource .
    * @param mediaSource The AdaptiveMediaSource from which the MediaSource is created.
    * @return The new media source.
    */
  /* static member */
  @JSGlobal("Windows.Media.Core.MediaSource.createFromAdaptiveMediaSource")
  @js.native
  def createFromAdaptiveMediaSource(mediaSource: AdaptiveMediaSource): typings.winrtUwp.Windows.Media.Core.MediaSource = js.native
  
  /**
    * Creates an instance of MediaSource from the provided IMediaSource .
    * @param mediaSource The IMediaSource from which the MediaSource is created.
    * @return The new media source.
    */
  /* static member */
  @JSGlobal("Windows.Media.Core.MediaSource.createFromIMediaSource")
  @js.native
  def createFromIMediaSource(mediaSource: IMediaSource): typings.winrtUwp.Windows.Media.Core.MediaSource = js.native
  
  /**
    * Creates an instance of MediaSource from the provided MediaBinder .
    * @param binder The MediaBinder with which the MediaSource is associated.
    * @return The new media source.
    */
  /* static member */
  @JSGlobal("Windows.Media.Core.MediaSource.createFromMediaBinder")
  @js.native
  def createFromMediaBinder(binder: typings.winrtUwp.Windows.Media.Core.MediaBinder): typings.winrtUwp.Windows.Media.Core.MediaSource = js.native
  
  /**
    * Creates an instance of MediaSource from the provided MediaStreamSource .
    * @param mediaSource The MediaStreamSource from which the MediaSource is created.
    * @return The new media source.
    */
  /* static member */
  @JSGlobal("Windows.Media.Core.MediaSource.createFromMediaStreamSource")
  @js.native
  def createFromMediaStreamSource(mediaSource: typings.winrtUwp.Windows.Media.Core.MediaStreamSource): typings.winrtUwp.Windows.Media.Core.MediaSource = js.native
  
  /**
    * Creates an instance of MediaSource from the provided MseStreamSource .
    * @param mediaSource The MediaStreamSource from which the MediaSource is created.
    * @return The new media source.
    */
  /* static member */
  @JSGlobal("Windows.Media.Core.MediaSource.createFromMseStreamSource")
  @js.native
  def createFromMseStreamSource(mediaSource: MseStreamSource): typings.winrtUwp.Windows.Media.Core.MediaSource = js.native
  
  /**
    * Creates an instance of MediaSource from the provided IStorageFile .
    * @param file The IStorageFile from which the MediaSource is created.
    * @return The new media source.
    */
  /* static member */
  @JSGlobal("Windows.Media.Core.MediaSource.createFromStorageFile")
  @js.native
  def createFromStorageFile(file: IStorageFile): typings.winrtUwp.Windows.Media.Core.MediaSource = js.native
  
  /**
    * Creates an instance of MediaSource from the provided IRandomAccessStream .
    * @param stream The stream from which the MediaSource is created.
    * @param contentType The MIME type of the contents of the stream.
    * @return The new media source.
    */
  /* static member */
  @JSGlobal("Windows.Media.Core.MediaSource.createFromStream")
  @js.native
  def createFromStream(stream: IRandomAccessStream, contentType: String): typings.winrtUwp.Windows.Media.Core.MediaSource = js.native
  
  /**
    * Creates an instance of MediaSource from the provided IRandomAccessStreamReference .
    * @param stream The stream reference from which the MediaSource is created.
    * @param contentType The MIME type of the contents of the stream.
    * @return The new media source.
    */
  /* static member */
  @JSGlobal("Windows.Media.Core.MediaSource.createFromStreamReference")
  @js.native
  def createFromStreamReference(stream: IRandomAccessStreamReference, contentType: String): typings.winrtUwp.Windows.Media.Core.MediaSource = js.native
  
  /**
    * Creates an instance of MediaSource from the provided Uri .
    * @param uri The URI from which the MediaSource is created.
    * @return The new media source.
    */
  /* static member */
  @JSGlobal("Windows.Media.Core.MediaSource.createFromUri")
  @js.native
  def createFromUri(uri: Uri): typings.winrtUwp.Windows.Media.Core.MediaSource = js.native
}
