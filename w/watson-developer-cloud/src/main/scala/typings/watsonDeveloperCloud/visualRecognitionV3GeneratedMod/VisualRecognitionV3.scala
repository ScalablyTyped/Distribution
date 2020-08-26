package typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod

import typings.ibmCloudSdkCore.helperMod.FileObject
import typings.ibmCloudSdkCore.mod.BaseService
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The IBM Watson&trade; Visual Recognition service uses deep learning algorithms to identify scenes, objects, and faces  in images you upload to the service. You can create and train a custom classifier to identify subjects that suit your needs.
  */
@js.native
trait VisualRecognitionV3 extends BaseService {
  /*************************
    * general
    ************************/
  /**
    * Classify images.
    *
    * Classify images with built-in or custom classifiers.
    *
    * @param {Object} [params] - The parameters to send to the service.
    * @param {NodeJS.ReadableStream|FileObject|Buffer} [params.images_file] - An image file (.gif, .jpg, .png, .tif) or
    * .zip file with images. Maximum image size is 10 MB. Include no more than 20 images and limit the .zip file to 100
    * MB. Encode the image and .zip file names in UTF-8 if they contain non-ASCII characters. The service assumes UTF-8
    * encoding if it encounters non-ASCII characters.
    *
    * You can also include an image with the **url** parameter.
    * @param {string} [params.images_filename] - The filename for images_file.
    * @param {string} [params.images_file_content_type] - The content type of images_file.
    * @param {string} [params.url] - The URL of an image (.gif, .jpg, .png, .tif) to analyze. The minimum recommended
    * pixel density is 32X32 pixels, but the service tends to perform better with images that are at least 224 x 224
    * pixels. The maximum image size is 10 MB.
    *
    * You can also include images with the **images_file** parameter.
    * @param {number} [params.threshold] - The minimum score a class must have to be displayed in the response. Set the
    * threshold to `0.0` to return all identified classes.
    * @param {string[]} [params.owners] - The categories of classifiers to apply. The **classifier_ids** parameter
    * overrides **owners**, so make sure that **classifier_ids** is empty.
    * - Use `IBM` to classify against the `default` general classifier. You get the same result if both
    * **classifier_ids** and **owners** parameters are empty.
    * - Use `me` to classify against all your custom classifiers. However, for better performance use **classifier_ids**
    * to specify the specific custom classifiers to apply.
    * - Use both `IBM` and `me` to analyze the image against both classifier categories.
    * @param {string[]} [params.classifier_ids] - Which classifiers to apply. Overrides the **owners** parameter. You can
    * specify both custom and built-in classifier IDs. The built-in `default` classifier is used if both
    * **classifier_ids** and **owners** parameters are empty.
    *
    * The following built-in classifier IDs require no training:
    * - `default`: Returns classes from thousands of general tags.
    * - `food`: Enhances specificity and accuracy for images of food items.
    * - `explicit`: Evaluates whether the image might be pornographic.
    * @param {string} [params.accept_language] - The desired language of parts of the response. See the response for
    * details.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def classify(): js.Promise[_] | Unit = js.native
  def classify(params: js.UndefOr[scala.Nothing], callback: Callback[ClassifiedImages]): js.Promise[_] | Unit = js.native
  def classify(params: ClassifyParams): js.Promise[_] | Unit = js.native
  def classify(params: ClassifyParams, callback: Callback[ClassifiedImages]): js.Promise[_] | Unit = js.native
  /*************************
    * custom
    ************************/
  /**
    * Create a classifier.
    *
    * Train a new multi-faceted classifier on the uploaded image data. Create your custom classifier with positive or
    * negative examples. Include at least two sets of examples, either two positive example files or one positive and one
    * negative file. You can upload a maximum of 256 MB per call.
    *
    * Encode all names in UTF-8 if they contain non-ASCII characters (.zip and image file names, and classifier and class
    * names). The service assumes UTF-8 encoding if it encounters non-ASCII characters.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.name - The name of the new classifier. Encode special characters in UTF-8.
    * @param {Map<string, NodeJS.ReadableStream|FileObject|Buffer>} params.positive_examples - A dictionary that contains
    * the value for each classname. The value is a .zip file of images that depict the visual subject of a class in the
    * new classifier. You can include more than one positive example file in a call.
    *
    * Specify the parameter name by appending `_positive_examples` to the class name. For example,
    * `goldenretriever_positive_examples` creates the class **goldenretriever**.
    *
    * Include at least 10 images in .jpg or .png format. The minimum recommended image resolution is 32X32 pixels. The
    * maximum number of images is 10,000 images or 100 MB per .zip file.
    *
    * Encode special characters in the file name in UTF-8.
    * @param {NodeJS.ReadableStream|FileObject|Buffer} [params.negative_examples] - A .zip file of images that do not
    * depict the visual subject of any of the classes of the new classifier. Must contain a minimum of 10 images.
    *
    * Encode special characters in the file name in UTF-8.
    * @param {string} [params.negative_examples_filename] - The filename for negative_examples.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def createClassifier(params: CreateClassifierParams): js.Promise[_] | Unit = js.native
  def createClassifier(params: CreateClassifierParams, callback: Callback[Classifier]): js.Promise[_] | Unit = js.native
  /**
    * Delete a classifier.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.classifier_id - The ID of the classifier.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def deleteClassifier(params: DeleteClassifierParams): js.Promise[_] | Unit = js.native
  def deleteClassifier(params: DeleteClassifierParams, callback: Callback[Empty]): js.Promise[_] | Unit = js.native
  /*************************
    * userData
    ************************/
  /**
    * Delete labeled data.
    *
    * Deletes all data associated with a specified customer ID. The method has no effect if no data is associated with
    * the customer ID.
    *
    * You associate a customer ID with data by passing the `X-Watson-Metadata` header with a request that passes data.
    * For more information about personal data and customer IDs, see [Information
    * security](https://cloud.ibm.com/docs/services/visual-recognition/information-security.html).
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.customer_id - The customer ID for which all data is to be deleted.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def deleteUserData(params: DeleteUserDataParams): js.Promise[_] | Unit = js.native
  def deleteUserData(params: DeleteUserDataParams, callback: Callback[Empty]): js.Promise[_] | Unit = js.native
  /*************************
    * face
    ************************/
  /**
    * Detect faces in images.
    *
    * **Important:** On April 2, 2018, the identity information in the response to calls to the Face model was removed.
    * The identity information refers to the `name` of the person, `score`, and `type_hierarchy` knowledge graph. For
    * details about the enhanced Face model, see the [Release
    * notes](https://cloud.ibm.com/docs/services/visual-recognition/release-notes.html#2april2018).
    *
    * Analyze and get data about faces in images. Responses can include estimated age and gender. This feature uses a
    * built-in model, so no training is necessary. The Detect faces method does not support general biometric facial
    * recognition.
    *
    * Supported image formats include .gif, .jpg, .png, and .tif. The maximum image size is 10 MB. The minimum
    * recommended pixel density is 32X32 pixels, but the service tends to perform better with images that are at least
    * 224 x 224 pixels.
    *
    * @param {Object} [params] - The parameters to send to the service.
    * @param {NodeJS.ReadableStream|FileObject|Buffer} [params.images_file] - An image file (gif, .jpg, .png, .tif.) or
    * .zip file with images. Limit the .zip file to 100 MB. You can include a maximum of 15 images in a request.
    *
    * Encode the image and .zip file names in UTF-8 if they contain non-ASCII characters. The service assumes UTF-8
    * encoding if it encounters non-ASCII characters.
    *
    * You can also include an image with the **url** parameter.
    * @param {string} [params.images_filename] - The filename for images_file.
    * @param {string} [params.images_file_content_type] - The content type of images_file.
    * @param {string} [params.url] - The URL of an image to analyze. Must be in .gif, .jpg, .png, or .tif format. The
    * minimum recommended pixel density is 32X32 pixels, but the service tends to perform better with images that are at
    * least 224 x 224 pixels. The maximum image size is 10 MB. Redirects are followed, so you can use a shortened URL.
    *
    * You can also include images with the **images_file** parameter.
    * @param {string} [params.accept_language] - The desired language of parts of the response. See the response for
    * details.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def detectFaces(): js.Promise[_] | Unit = js.native
  def detectFaces(params: js.UndefOr[scala.Nothing], callback: Callback[DetectedFaces]): js.Promise[_] | Unit = js.native
  def detectFaces(params: DetectFacesParams): js.Promise[_] | Unit = js.native
  def detectFaces(params: DetectFacesParams, callback: Callback[DetectedFaces]): js.Promise[_] | Unit = js.native
  /**
    * Retrieve classifier details.
    *
    * Retrieve information about a custom classifier.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.classifier_id - The ID of the classifier.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def getClassifier(params: GetClassifierParams): js.Promise[_] | Unit = js.native
  def getClassifier(params: GetClassifierParams, callback: Callback[Classifier]): js.Promise[_] | Unit = js.native
  /*************************
    * coreML
    ************************/
  /**
    * Retrieve a Core ML model of a classifier.
    *
    * Download a Core ML model file (.mlmodel) of a custom classifier that returns <tt>\"core_ml_enabled\": true</tt> in
    * the classifier details.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.classifier_id - The ID of the classifier.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def getCoreMlModel(params: GetCoreMlModelParams): js.Promise[_] | Unit = js.native
  def getCoreMlModel(params: GetCoreMlModelParams, callback: Callback[ReadableStream | FileObject | Buffer]): js.Promise[_] | Unit = js.native
  /**
    * Retrieve a list of classifiers.
    *
    * @param {Object} [params] - The parameters to send to the service.
    * @param {boolean} [params.verbose] - Specify `true` to return details about the classifiers. Omit this parameter to
    * return a brief list of classifiers.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def listClassifiers(): js.Promise[_] | Unit = js.native
  def listClassifiers(params: js.UndefOr[scala.Nothing], callback: Callback[Classifiers]): js.Promise[_] | Unit = js.native
  def listClassifiers(params: ListClassifiersParams): js.Promise[_] | Unit = js.native
  def listClassifiers(params: ListClassifiersParams, callback: Callback[Classifiers]): js.Promise[_] | Unit = js.native
  /**
    * Update a classifier.
    *
    * Update a custom classifier by adding new positive or negative classes or by adding new images to existing classes.
    * You must supply at least one set of positive or negative examples. For details, see [Updating custom
    * classifiers](https://cloud.ibm.com/docs/services/visual-recognition/customizing.html#updating-custom-classifiers).
    *
    * Encode all names in UTF-8 if they contain non-ASCII characters (.zip and image file names, and classifier and class
    * names). The service assumes UTF-8 encoding if it encounters non-ASCII characters.
    *
    * **Tip:** Don't make retraining calls on a classifier until the status is ready. When you submit retraining requests
    * in parallel, the last request overwrites the previous requests. The retrained property shows the last time the
    * classifier retraining finished.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.classifier_id - The ID of the classifier.
    * @param {Map<string, NodeJS.ReadableStream|FileObject|Buffer>} [params.positive_examples] - A dictionary that
    * contains the value for each classname. The value is a .zip file of images that depict the visual subject of a class
    * in the classifier. The positive examples create or update classes in the classifier. You can include more than one
    * positive example file in a call.
    *
    * Specify the parameter name by appending `_positive_examples` to the class name. For example,
    * `goldenretriever_positive_examples` creates the class `goldenretriever`.
    *
    * Include at least 10 images in .jpg or .png format. The minimum recommended image resolution is 32X32 pixels. The
    * maximum number of images is 10,000 images or 100 MB per .zip file.
    *
    * Encode special characters in the file name in UTF-8.
    * @param {NodeJS.ReadableStream|FileObject|Buffer} [params.negative_examples] - A .zip file of images that do not
    * depict the visual subject of any of the classes of the new classifier. Must contain a minimum of 10 images.
    *
    * Encode special characters in the file name in UTF-8.
    * @param {string} [params.negative_examples_filename] - The filename for negative_examples.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def updateClassifier(params: UpdateClassifierParams): js.Promise[_] | Unit = js.native
  def updateClassifier(params: UpdateClassifierParams, callback: Callback[Classifier]): js.Promise[_] | Unit = js.native
}

