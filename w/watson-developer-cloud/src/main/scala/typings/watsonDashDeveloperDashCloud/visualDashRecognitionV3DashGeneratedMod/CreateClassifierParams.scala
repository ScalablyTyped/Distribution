package typings.watsonDashDeveloperDashCloud.visualDashRecognitionV3DashGeneratedMod

import typings.ibmDashCloudDashSdkDashCore.libHelperMod.FileObject
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `createClassifier` operation. */
trait CreateClassifierParams extends js.Object {
  var headers: js.UndefOr[js.Object] = js.undefined
  /** The name of the new classifier. Encode special characters in UTF-8. */
  var name: String
  /** A .zip file of images that do not depict the visual subject of any of the classes of the new classifier. Must contain a minimum of 10 images. Encode special characters in the file name in UTF-8. */
  var negative_examples: js.UndefOr[ReadableStream | FileObject | Buffer] = js.undefined
  /** The filename for negative_examples. */
  var negative_examples_filename: js.UndefOr[String] = js.undefined
  /** A dictionary that contains the value for each classname. The value is a .zip file of images that depict the visual subject of a class in the new classifier. You can include more than one positive example file in a call. Specify the parameter name by appending `_positive_examples` to the class name. For example, `goldenretriever_positive_examples` creates the class **goldenretriever**. Include at least 10 images in .jpg or .png format. The minimum recommended image resolution is 32X32 pixels. The maximum number of images is 10,000 images or 100 MB per .zip file. Encode special characters in the file name in UTF-8. */
  var positive_examples: Map[String, ReadableStream | FileObject | Buffer]
  var return_response: js.UndefOr[Boolean] = js.undefined
}

object CreateClassifierParams {
  @scala.inline
  def apply(
    name: String,
    positive_examples: Map[String, ReadableStream | FileObject | Buffer],
    headers: js.Object = null,
    negative_examples: ReadableStream | FileObject | Buffer = null,
    negative_examples_filename: String = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): CreateClassifierParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], positive_examples = positive_examples.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (negative_examples != null) __obj.updateDynamic("negative_examples")(negative_examples.asInstanceOf[js.Any])
    if (negative_examples_filename != null) __obj.updateDynamic("negative_examples_filename")(negative_examples_filename.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClassifierParams]
  }
}

