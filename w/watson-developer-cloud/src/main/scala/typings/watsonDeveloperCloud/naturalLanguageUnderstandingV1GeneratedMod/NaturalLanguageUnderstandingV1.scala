package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import typings.ibmCloudSdkCore.mod.BaseService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Analyze various features of text content at scale. Provide text, raw HTML, or a public URL and IBM Watson Natural Language Understanding will give you results for the features you request. The service cleans HTML content before analysis by default, so the results can ignore most advertisements and other unwanted content.  You can create [custom models](https://cloud.ibm.com/docs/services/natural-language-understanding/customizing.html) with Watson Knowledge Studio to detect custom entities, relations, and categories in Natural Language Understanding.
  */
@js.native
trait NaturalLanguageUnderstandingV1 extends BaseService {
  
  /*************************
    * analyze
    ************************/
  /**
    * Analyze text.
    *
    * Analyzes text, HTML, or a public webpage for the following features:
    * - Categories
    * - Concepts
    * - Emotion
    * - Entities
    * - Keywords
    * - Metadata
    * - Relations
    * - Semantic roles
    * - Sentiment
    * - Syntax (Experimental).
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {Features} params.features - Specific features to analyze the document for.
    * @param {string} [params.text] - The plain text to analyze. One of the `text`, `html`, or `url` parameters is
    * required.
    * @param {string} [params.html] - The HTML file to analyze. One of the `text`, `html`, or `url` parameters is
    * required.
    * @param {string} [params.url] - The webpage to analyze. One of the `text`, `html`, or `url` parameters is required.
    * @param {boolean} [params.clean] - Set this to `false` to disable webpage cleaning. To learn more about webpage
    * cleaning, see the [Analyzing
    * webpages](https://cloud.ibm.com/docs/services/natural-language-understanding/analyzing-webpages.html)
    * documentation.
    * @param {string} [params.xpath] - An [XPath
    * query](https://cloud.ibm.com/docs/services/natural-language-understanding/analyzing-webpages.html#xpath) to perform
    * on `html` or `url` input. Results of the query will be appended to the cleaned webpage text before it is analyzed.
    * To analyze only the results of the XPath query, set the `clean` parameter to `false`.
    * @param {boolean} [params.fallback_to_raw] - Whether to use raw HTML content if text cleaning fails.
    * @param {boolean} [params.return_analyzed_text] - Whether or not to return the analyzed text.
    * @param {string} [params.language] - ISO 639-1 code that specifies the language of your text. This overrides
    * automatic language detection. Language support differs depending on the features you include in your analysis. See
    * [Language support](https://www.bluemix.net/docs/services/natural-language-understanding/language-support.html) for
    * more information.
    * @param {number} [params.limit_text_characters] - Sets the maximum number of characters that are processed by the
    * service.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def analyze(params: AnalyzeParams): js.Promise[Any] | Unit = js.native
  def analyze(params: AnalyzeParams, callback: Callback[AnalysisResults]): js.Promise[Any] | Unit = js.native
  
  /*************************
    * manageModels
    ************************/
  /**
    * Delete model.
    *
    * Deletes a custom model.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.model_id - Model ID of the model to delete.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def deleteModel(params: DeleteModelParams): js.Promise[Any] | Unit = js.native
  def deleteModel(params: DeleteModelParams, callback: Callback[DeleteModelResults]): js.Promise[Any] | Unit = js.native
  
  /**
    * List models.
    *
    * Lists Watson Knowledge Studio [custom
    * models](https://cloud.ibm.com/docs/services/natural-language-understanding/customizing.html) that are deployed to
    * your Natural Language Understanding service.
    *
    * @param {Object} [params] - The parameters to send to the service.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def listModels(): js.Promise[Any] | Unit = js.native
  def listModels(params: Unit, callback: Callback[ListModelsResults]): js.Promise[Any] | Unit = js.native
  def listModels(params: ListModelsParams): js.Promise[Any] | Unit = js.native
  def listModels(params: ListModelsParams, callback: Callback[ListModelsResults]): js.Promise[Any] | Unit = js.native
  
  var name: String = js.native
  
  var serviceVersion: String = js.native
}
