package typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod

import typings.ibmCloudSdkCore.helperMod.FileObject
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.ClassifyConstants.AcceptLanguage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*************************
  * request interfaces
  ************************/
/** Parameters for the `classify` operation. */
trait ClassifyParams extends js.Object {
  /** The desired language of parts of the response. See the response for details. */
  var accept_language: js.UndefOr[AcceptLanguage | String] = js.undefined
  /** Which classifiers to apply. Overrides the **owners** parameter. You can specify both custom and built-in classifier IDs. The built-in `default` classifier is used if both **classifier_ids** and **owners** parameters are empty. The following built-in classifier IDs require no training: - `default`: Returns classes from thousands of general tags. - `food`: Enhances specificity and accuracy for images of food items. - `explicit`: Evaluates whether the image might be pornographic. */
  var classifier_ids: js.UndefOr[js.Array[String]] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  /** An image file (.gif, .jpg, .png, .tif) or .zip file with images. Maximum image size is 10 MB. Include no more than 20 images and limit the .zip file to 100 MB. Encode the image and .zip file names in UTF-8 if they contain non-ASCII characters. The service assumes UTF-8 encoding if it encounters non-ASCII characters. You can also include an image with the **url** parameter. */
  var images_file: js.UndefOr[ReadableStream | FileObject | Buffer] = js.undefined
  /** The content type of images_file. */
  var images_file_content_type: js.UndefOr[String] = js.undefined
  /** The filename for images_file. */
  var images_filename: js.UndefOr[String] = js.undefined
  /** The categories of classifiers to apply. The **classifier_ids** parameter overrides **owners**, so make sure that **classifier_ids** is empty. - Use `IBM` to classify against the `default` general classifier. You get the same result if both **classifier_ids** and **owners** parameters are empty. - Use `me` to classify against all your custom classifiers. However, for better performance use **classifier_ids** to specify the specific custom classifiers to apply. - Use both `IBM` and `me` to analyze the image against both classifier categories. */
  var owners: js.UndefOr[js.Array[String]] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** The minimum score a class must have to be displayed in the response. Set the threshold to `0.0` to return all identified classes. */
  var threshold: js.UndefOr[Double] = js.undefined
  /** The URL of an image (.gif, .jpg, .png, .tif) to analyze. The minimum recommended pixel density is 32X32 pixels, but the service tends to perform better with images that are at least 224 x 224 pixels. The maximum image size is 10 MB. You can also include images with the **images_file** parameter. */
  var url: js.UndefOr[String] = js.undefined
}

object ClassifyParams {
  @scala.inline
  def apply(
    accept_language: AcceptLanguage | String = null,
    classifier_ids: js.Array[String] = null,
    headers: js.Object = null,
    images_file: ReadableStream | FileObject | Buffer = null,
    images_file_content_type: String = null,
    images_filename: String = null,
    owners: js.Array[String] = null,
    return_response: js.UndefOr[Boolean] = js.undefined,
    threshold: js.UndefOr[Double] = js.undefined,
    url: String = null
  ): ClassifyParams = {
    val __obj = js.Dynamic.literal()
    if (accept_language != null) __obj.updateDynamic("accept_language")(accept_language.asInstanceOf[js.Any])
    if (classifier_ids != null) __obj.updateDynamic("classifier_ids")(classifier_ids.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (images_file != null) __obj.updateDynamic("images_file")(images_file.asInstanceOf[js.Any])
    if (images_file_content_type != null) __obj.updateDynamic("images_file_content_type")(images_file_content_type.asInstanceOf[js.Any])
    if (images_filename != null) __obj.updateDynamic("images_filename")(images_filename.asInstanceOf[js.Any])
    if (owners != null) __obj.updateDynamic("owners")(owners.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.get.asInstanceOf[js.Any])
    if (!js.isUndefined(threshold)) __obj.updateDynamic("threshold")(threshold.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifyParams]
  }
}

