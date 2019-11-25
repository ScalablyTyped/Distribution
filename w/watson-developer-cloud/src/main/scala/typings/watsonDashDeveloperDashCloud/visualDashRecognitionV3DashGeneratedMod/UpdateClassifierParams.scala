package typings.watsonDashDeveloperDashCloud.visualDashRecognitionV3DashGeneratedMod

import typings.ibmDashCloudDashSdkDashCore.libHelperMod.FileObject
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `updateClassifier` operation. */
trait UpdateClassifierParams extends js.Object {
  /** The ID of the classifier. */
  var classifier_id: String
  var headers: js.UndefOr[js.Object] = js.undefined
  /** A .zip file of images that do not depict the visual subject of any of the classes of the new classifier. Must contain a minimum of 10 images. Encode special characters in the file name in UTF-8. */
  var negative_examples: js.UndefOr[ReadableStream | FileObject | Buffer] = js.undefined
  /** The filename for negative_examples. */
  var negative_examples_filename: js.UndefOr[String] = js.undefined
  /** A dictionary that contains the value for each classname. The value is a .zip file of images that depict the visual subject of a class in the classifier. The positive examples create or update classes in the classifier. You can include more than one positive example file in a call. Specify the parameter name by appending `_positive_examples` to the class name. For example, `goldenretriever_positive_examples` creates the class `goldenretriever`. Include at least 10 images in .jpg or .png format. The minimum recommended image resolution is 32X32 pixels. The maximum number of images is 10,000 images or 100 MB per .zip file. Encode special characters in the file name in UTF-8. */
  var positive_examples: js.UndefOr[Map[String, ReadableStream | FileObject | Buffer]] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
}

object UpdateClassifierParams {
  @scala.inline
  def apply(
    classifier_id: String,
    headers: js.Object = null,
    negative_examples: ReadableStream | FileObject | Buffer = null,
    negative_examples_filename: String = null,
    positive_examples: Map[String, ReadableStream | FileObject | Buffer] = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): UpdateClassifierParams = {
    val __obj = js.Dynamic.literal(classifier_id = classifier_id.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (negative_examples != null) __obj.updateDynamic("negative_examples")(negative_examples.asInstanceOf[js.Any])
    if (negative_examples_filename != null) __obj.updateDynamic("negative_examples_filename")(negative_examples_filename.asInstanceOf[js.Any])
    if (positive_examples != null) __obj.updateDynamic("positive_examples")(positive_examples.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateClassifierParams]
  }
}

