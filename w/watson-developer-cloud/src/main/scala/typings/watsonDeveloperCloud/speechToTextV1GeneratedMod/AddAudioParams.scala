package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import typings.ibmCloudSdkCore.helperMod.FileObject
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContainedContentType
import typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `addAudio` operation. */
trait AddAudioParams extends StObject {
  
  /** If `true`, the specified audio resource overwrites an existing audio resource with the same name. If `false`, the request fails if an audio resource with the same name already exists. The parameter has no effect if an audio resource with the same name does not already exist. */
  var allow_overwrite: js.UndefOr[Boolean] = js.undefined
  
  /** The name of the new audio resource for the custom acoustic model. Use a localized name that matches the language of the custom model and reflects the contents of the resource. * Include a maximum of 128 characters in the name. * Do not include spaces, slashes, or backslashes in the name. * Do not use the name of an audio resource that has already been added to the custom model. */
  var audio_name: String
  
  /** The audio resource that is to be added to the custom acoustic model, an individual audio file or an archive file. */
  var audio_resource: ReadableStream | FileObject | Buffer
  
  /** **For an archive-type resource,** specify the format of the audio files that are contained in the archive file if they are of type `audio/alaw`, `audio/basic`, `audio/l16`, or `audio/mulaw`. Include the `rate`, `channels`, and `endianness` parameters where necessary. In this case, all audio files that are contained in the archive file must be of the indicated type. For all other audio formats, you can omit the header. In this case, the audio files can be of multiple types as long as they are not of the types listed in the previous paragraph. The parameter accepts all of the audio formats that are supported for use with speech recognition. For more information, see **Content types for audio-type resources** in the method description. **For an audio-type resource,** omit the header. */
  var contained_content_type: js.UndefOr[ContainedContentType | String] = js.undefined
  
  /** For an audio-type resource, the format (MIME type) of the audio. For more information, see **Content types for audio-type resources** in the method description. For an archive-type resource, the media type of the archive file. For more information, see **Content types for archive-type resources** in the method description. */
  var content_type: js.UndefOr[ContentType | String] = js.undefined
  
  /** The customization ID (GUID) of the custom acoustic model that is to be used for the request. You must make the request with credentials for the instance of the service that owns the custom model. */
  var customization_id: String
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
}
object AddAudioParams {
  
  @scala.inline
  def apply(audio_name: String, audio_resource: ReadableStream | FileObject | Buffer, customization_id: String): AddAudioParams = {
    val __obj = js.Dynamic.literal(audio_name = audio_name.asInstanceOf[js.Any], audio_resource = audio_resource.asInstanceOf[js.Any], customization_id = customization_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddAudioParams]
  }
  
  @scala.inline
  implicit class AddAudioParamsMutableBuilder[Self <: AddAudioParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllow_overwrite(value: Boolean): Self = StObject.set(x, "allow_overwrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_overwriteUndefined: Self = StObject.set(x, "allow_overwrite", js.undefined)
    
    @scala.inline
    def setAudio_name(value: String): Self = StObject.set(x, "audio_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudio_resource(value: ReadableStream | FileObject | Buffer): Self = StObject.set(x, "audio_resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContained_content_type(value: ContainedContentType | String): Self = StObject.set(x, "contained_content_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContained_content_typeUndefined: Self = StObject.set(x, "contained_content_type", js.undefined)
    
    @scala.inline
    def setContent_type(value: ContentType | String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent_typeUndefined: Self = StObject.set(x, "content_type", js.undefined)
    
    @scala.inline
    def setCustomization_id(value: String): Self = StObject.set(x, "customization_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
  }
}
