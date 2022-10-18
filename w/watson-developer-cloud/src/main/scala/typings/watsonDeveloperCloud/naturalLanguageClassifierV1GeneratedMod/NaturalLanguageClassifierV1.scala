package typings.watsonDeveloperCloud.naturalLanguageClassifierV1GeneratedMod

import typings.ibmCloudSdkCore.mod.BaseService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IBM Watson&trade; Natural Language Classifier uses machine learning algorithms to return the top matching predefined classes for short text input. You create and train a classifier to connect predefined classes to example texts so that the service can apply those classes to new inputs.
  */
@js.native
trait NaturalLanguageClassifierV1 extends BaseService {
  
  /*************************
    * classifyText
    ************************/
  /**
    * Classify a phrase.
    *
    * Returns label information for the input. The status must be `Available` before you can use the classifier to
    * classify text.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.classifier_id - Classifier ID to use.
    * @param {string} params.text - The submitted phrase. The maximum length is 2048 characters.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def classify(params: ClassifyParams): js.Promise[Any] | Unit = js.native
  def classify(params: ClassifyParams, callback: Callback[Classification]): js.Promise[Any] | Unit = js.native
  
  /**
    * Classify multiple phrases.
    *
    * Returns label information for multiple phrases. The status must be `Available` before you can use the classifier to
    * classify text.
    *
    * Note that classifying Japanese texts is a beta feature.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.classifier_id - Classifier ID to use.
    * @param {ClassifyInput[]} params.collection - The submitted phrases.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def classifyCollection(params: ClassifyCollectionParams): js.Promise[Any] | Unit = js.native
  def classifyCollection(params: ClassifyCollectionParams, callback: Callback[ClassificationCollection]): js.Promise[Any] | Unit = js.native
  
  /*************************
    * manageClassifiers
    ************************/
  /**
    * Create classifier.
    *
    * Sends data to create and train a classifier and returns information about the new classifier.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {NodeJS.ReadableStream|FileObject|Buffer} params.metadata - Metadata in JSON format. The metadata identifies
    * the language of the data, and an optional name to identify the classifier. Specify the language with the 2-letter
    * primary language code as assigned in ISO standard 639.
    *
    * Supported languages are English (`en`), Arabic (`ar`), French (`fr`), German, (`de`), Italian (`it`), Japanese
    * (`ja`), Korean (`ko`), Brazilian Portuguese (`pt`), and Spanish (`es`).
    * @param {NodeJS.ReadableStream|FileObject|Buffer} params.training_data - Training data in CSV format. Each text
    * value must have at least one class. The data can include up to 3,000 classes and 20,000 records. For details, see
    * [Data preparation](https://cloud.ibm.com/docs/services/natural-language-classifier/using-your-data.html).
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def createClassifier(params: CreateClassifierParams): js.Promise[Any] | Unit = js.native
  def createClassifier(params: CreateClassifierParams, callback: Callback[Classifier]): js.Promise[Any] | Unit = js.native
  
  /**
    * Delete classifier.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.classifier_id - Classifier ID to delete.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def deleteClassifier(params: DeleteClassifierParams): js.Promise[Any] | Unit = js.native
  def deleteClassifier(params: DeleteClassifierParams, callback: Callback[Empty]): js.Promise[Any] | Unit = js.native
  
  /**
    * Get information about a classifier.
    *
    * Returns status and other information about a classifier.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.classifier_id - Classifier ID to query.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def getClassifier(params: GetClassifierParams): js.Promise[Any] | Unit = js.native
  def getClassifier(params: GetClassifierParams, callback: Callback[Classifier]): js.Promise[Any] | Unit = js.native
  
  /**
    * List classifiers.
    *
    * Returns an empty array if no classifiers are available.
    *
    * @param {Object} [params] - The parameters to send to the service.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def listClassifiers(): js.Promise[Any] | Unit = js.native
  def listClassifiers(params: Unit, callback: Callback[ClassifierList]): js.Promise[Any] | Unit = js.native
  def listClassifiers(params: ListClassifiersParams): js.Promise[Any] | Unit = js.native
  def listClassifiers(params: ListClassifiersParams, callback: Callback[ClassifierList]): js.Promise[Any] | Unit = js.native
  
  var name: String = js.native
  
  var serviceVersion: String = js.native
}
