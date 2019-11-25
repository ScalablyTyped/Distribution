package typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod

import typings.ibmDashCloudDashSdkDashCore.libHelperMod.FileObject
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.AddAudioConstants.ContainedContentType
import typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.AddAudioConstants.ContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `addAudio` operation. */
trait AddAudioParams extends js.Object {
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
  def apply(
    audio_name: String,
    audio_resource: ReadableStream | FileObject | Buffer,
    customization_id: String,
    allow_overwrite: js.UndefOr[Boolean] = js.undefined,
    contained_content_type: ContainedContentType | String = null,
    content_type: ContentType | String = null,
    headers: js.Object = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): AddAudioParams = {
    val __obj = js.Dynamic.literal(audio_name = audio_name.asInstanceOf[js.Any], audio_resource = audio_resource.asInstanceOf[js.Any], customization_id = customization_id.asInstanceOf[js.Any])
    if (!js.isUndefined(allow_overwrite)) __obj.updateDynamic("allow_overwrite")(allow_overwrite.asInstanceOf[js.Any])
    if (contained_content_type != null) __obj.updateDynamic("contained_content_type")(contained_content_type.asInstanceOf[js.Any])
    if (content_type != null) __obj.updateDynamic("content_type")(content_type.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddAudioParams]
  }
}

