package typings.winrtUwp.Windows.Media

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Registers a media parser or codec. */
@JSGlobal("Windows.Media.MediaExtensionManager")
@js.native
/** Creates a new MediaExtensionManager object that is used to register a media parser or codec. */
class MediaExtensionManager () extends js.Object {
  /**
    * Registers an audio decoder for the specified input and output media types.
    * @param activatableClassId The class identifier of the activatable runtime class of the audio decoder. The runtime class must implement the IMediaExtension interface.
    * @param inputSubtype The guid identifier of the media type that the audio decoder accepts as input.
    * @param outputSubtype The guid identifier of the media type that is output by the audio decoder.
    */
  def registerAudioDecoder(activatableClassId: String, inputSubtype: String, outputSubtype: String): Unit = js.native
  /**
    * Registers an audio decoder for the specified input and output media types with an optional configuration parameter.
    * @param activatableClassId The class identifier of the activatable runtime class of the audio decoder. The runtime class must implement the IMediaExtension interface.
    * @param inputSubtype The guid identifier of the media type that the audio decoder accepts as input.
    * @param outputSubtype The guid identifier of the media type that is output by the audio decoder.
    * @param configuration An optional parameter that contains the configuration properties to be passed to the audio decoder.
    */
  def registerAudioDecoder(
    activatableClassId: String,
    inputSubtype: String,
    outputSubtype: String,
    configuration: IPropertySet
  ): Unit = js.native
  /**
    * Registers an audio encoder for the specified input and output media types.
    * @param activatableClassId The class identifier of the activatable runtime class of the audio encoder. The runtime class must implement the IMediaExtension interface.
    * @param inputSubtype The guid identifier of the media type that the audio encoder accepts as input.
    * @param outputSubtype The guid identifier of the media type that is output by the audio encoder.
    */
  def registerAudioEncoder(activatableClassId: String, inputSubtype: String, outputSubtype: String): Unit = js.native
  /**
    * Registers an audio encoder for the specified input and output media types with an optional configuration parameter.
    * @param activatableClassId The class identifier of the activatable runtime class of the audio encoder. The runtime class must implement the IMediaExtension interface.
    * @param inputSubtype The guid identifier of the media type that the audio encoder accepts as input.
    * @param outputSubtype The guid identifier of the media type that is output by the audio encoder.
    * @param configuration An optional parameter that contains the configuration properties to be passed to the audio encoder.
    */
  def registerAudioEncoder(
    activatableClassId: String,
    inputSubtype: String,
    outputSubtype: String,
    configuration: IPropertySet
  ): Unit = js.native
  /**
    * Registers a byte-stream handler by file name extension and MIME type.
    * @param activatableClassId The class identifier of the activatable runtime class of the byte-stream handler. The runtime class must implement the IMediaExtension interface.
    * @param fileExtension The file name extension that is registered for this byte-stream handler.
    * @param mimeType The MIME type that is registered for this byte-stream handler.
    */
  def registerByteStreamHandler(activatableClassId: String, fileExtension: String, mimeType: String): Unit = js.native
  /**
    * Registers a byte-stream handler by file name extension and MIME type, with an optional configuration parameter.
    * @param activatableClassId The class identifier of the activatable runtime class of the byte-stream handler. The runtime class must implement the IMediaExtension interface.
    * @param fileExtension The file name extension that is registered for this byte-stream handler.
    * @param mimeType The MIME type that is registered for this byte-stream handler.
    * @param configuration An optional parameter that contains configuration properties for the byte-stream handler.
    */
  def registerByteStreamHandler(activatableClassId: String, fileExtension: String, mimeType: String, configuration: IPropertySet): Unit = js.native
  /**
    * Registers a scheme handler for the specified URL scheme.
    * @param activatableClassId The class identifier of the activatable runtime class of the scheme handler. The runtime class must implement the IMediaExtension interface.
    * @param scheme The URL scheme that will be recognized to invoke the scheme handler. For example, "myscheme://".
    */
  def registerSchemeHandler(activatableClassId: String, scheme: String): Unit = js.native
  /**
    * Registers a scheme handler for the specified URL scheme with an optional configuration parameter.
    * @param activatableClassId The class identifier of the activatable runtime class of the scheme handler. The runtime class must implement the IMediaExtension interface.
    * @param scheme The URL scheme that will be recognized to invoke the scheme handler. For example, "myscheme://".
    * @param configuration An optional parameter that contains configuration properties for the scheme handler.
    */
  def registerSchemeHandler(activatableClassId: String, scheme: String, configuration: IPropertySet): Unit = js.native
  /**
    * Registers an video decoder for the specified input and output media types.
    * @param activatableClassId The class identifier of the activatable runtime class of the video decoder. The runtime class must implement the IMediaExtension interface.
    * @param inputSubtype The guid identifier of the media type that the video decoder accepts as input.
    * @param outputSubtype The guid identifier of the media type that is output by the video decoder.
    */
  def registerVideoDecoder(activatableClassId: String, inputSubtype: String, outputSubtype: String): Unit = js.native
  /**
    * Registers a video decoder for the specified input and output media types with an optional configuration parameter.
    * @param activatableClassId The class identifier of the activatable runtime class of the video decoder. The runtime class must implement the IMediaExtension interface.
    * @param inputSubtype The guid identifier of the media type that the video decoder accepts as input.
    * @param outputSubtype The guid identifier of the media type that is output by the video decoder.
    * @param configuration An optional parameter that contains the configuration properties to be passed to the video decoder.
    */
  def registerVideoDecoder(
    activatableClassId: String,
    inputSubtype: String,
    outputSubtype: String,
    configuration: IPropertySet
  ): Unit = js.native
  /**
    * Registers a video encoder for the specified input and output media types.
    * @param activatableClassId The class identifier of the activatable runtime class of the video encoder. The runtime class must implement the IMediaExtension interface.
    * @param inputSubtype The guid identifier of the media type that the video encoder accepts as input.
    * @param outputSubtype The guid identifier of the media type that is output by the video encoder.
    */
  def registerVideoEncoder(activatableClassId: String, inputSubtype: String, outputSubtype: String): Unit = js.native
  /**
    * Registers a video encoder for the specified input and output media types with an optional configuration parameter.
    * @param activatableClassId The class identifier of the activatable runtime class of the video encoder. The runtime class must implement the IMediaExtension interface.
    * @param inputSubtype The guid identifier of the media type that the video encoder accepts as input.
    * @param outputSubtype The guid identifier of the media type that is output by the video encoder.
    * @param configuration An optional parameter that contains the configuration properties to be passed to the video encoder.
    */
  def registerVideoEncoder(
    activatableClassId: String,
    inputSubtype: String,
    outputSubtype: String,
    configuration: IPropertySet
  ): Unit = js.native
}

