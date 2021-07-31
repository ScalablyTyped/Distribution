package typings.watsonDeveloperCloud.v3Mod

import typings.ibmCloudSdkCore.mod.BaseService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IBM Watson&trade; Language Translator translates text from one language to another. The service offers multiple IBM provided translation models that you can customize based on your unique terminology and language. Use Language Translator to take news from across the globe and present it in your language, communicate with your customers in their own language, and more.
  */
@js.native
trait LanguageTranslatorV3 extends BaseService {
  
  /*************************
    * models
    ************************/
  /**
    * Create model.
    *
    * Uploads Translation Memory eXchange (TMX) files to customize a translation model.
    *
    * You can either customize a model with a forced glossary or with a corpus that contains parallel sentences. To
    * create a model that is customized with a parallel corpus <b>and</b> a forced glossary, proceed in two steps:
    * customize with a parallel corpus first and then customize the resulting model with a glossary. Depending on the
    * type of customization and the size of the uploaded corpora, training can range from minutes for a glossary to
    * several hours for a large parallel corpus. You can upload a single forced glossary file and this file must be less
    * than <b>10 MB</b>. You can upload multiple parallel corpora tmx files. The cumulative file size of all uploaded
    * files is limited to <b>250 MB</b>. To successfully train with a parallel corpus you must have at least <b>5,000
    * parallel sentences</b> in your corpus.
    *
    * You can have a <b>maxium of 10 custom models per language pair</b>.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.base_model_id - The model ID of the model to use as the base for customization. To see
    * available models, use the `List models` method. Usually all IBM provided models are customizable. In addition, all
    * your models that have been created via parallel corpus customization, can be further customized with a forced
    * glossary.
    * @param {NodeJS.ReadableStream|FileObject|Buffer} [params.forced_glossary] - A TMX file with your customizations.
    * The customizations in the file completely overwrite the domain translaton data, including high frequency or high
    * confidence phrase translations. You can upload only one glossary with a file size less than 10 MB per call. A
    * forced glossary should contain single words or short phrases.
    * @param {NodeJS.ReadableStream|FileObject|Buffer} [params.parallel_corpus] - A TMX file with parallel sentences for
    * source and target language. You can upload multiple parallel_corpus files in one request. All uploaded
    * parallel_corpus files combined, your parallel corpus must contain at least 5,000 parallel sentences to train
    * successfully.
    * @param {string} [params.name] - An optional model name that you can use to identify the model. Valid characters are
    * letters, numbers, dashes, underscores, spaces and apostrophes. The maximum length is 32 characters.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def createModel(params: CreateModelParams): js.Promise[js.Any] | Unit = js.native
  def createModel(params: CreateModelParams, callback: Callback[TranslationModel]): js.Promise[js.Any] | Unit = js.native
  
  /**
    * Delete model.
    *
    * Deletes a custom translation model.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.model_id - Model ID of the model to delete.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def deleteModel(params: DeleteModelParams): js.Promise[js.Any] | Unit = js.native
  def deleteModel(params: DeleteModelParams, callback: Callback[DeleteModelResult]): js.Promise[js.Any] | Unit = js.native
  
  /**
    * Get model details.
    *
    * Gets information about a translation model, including training status for custom models. Use this API call to poll
    * the status of your customization request. A successfully completed training will have a status of `available`.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.model_id - Model ID of the model to get.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def getModel(params: GetModelParams): js.Promise[js.Any] | Unit = js.native
  def getModel(params: GetModelParams, callback: Callback[TranslationModel]): js.Promise[js.Any] | Unit = js.native
  
  /*************************
    * identification
    ************************/
  /**
    * Identify language.
    *
    * Identifies the language of the input text.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.text - Input text in UTF-8 format.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def identify(params: IdentifyParams): js.Promise[js.Any] | Unit = js.native
  def identify(params: IdentifyParams, callback: Callback[IdentifiedLanguages]): js.Promise[js.Any] | Unit = js.native
  
  /**
    * List identifiable languages.
    *
    * Lists the languages that the service can identify. Returns the language code (for example, `en` for English or `es`
    * for Spanish) and name of each language.
    *
    * @param {Object} [params] - The parameters to send to the service.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def listIdentifiableLanguages(): js.Promise[js.Any] | Unit = js.native
  def listIdentifiableLanguages(params: Unit, callback: Callback[IdentifiableLanguages]): js.Promise[js.Any] | Unit = js.native
  def listIdentifiableLanguages(params: ListIdentifiableLanguagesParams): js.Promise[js.Any] | Unit = js.native
  def listIdentifiableLanguages(params: ListIdentifiableLanguagesParams, callback: Callback[IdentifiableLanguages]): js.Promise[js.Any] | Unit = js.native
  
  /**
    * List models.
    *
    * Lists available translation models.
    *
    * @param {Object} [params] - The parameters to send to the service.
    * @param {string} [params.source] - Specify a language code to filter results by source language.
    * @param {string} [params.target] - Specify a language code to filter results by target language.
    * @param {boolean} [params.default_models] - If the default parameter isn't specified, the service will return all
    * models (default and non-default) for each language pair. To return only default models, set this to `true`. To
    * return only non-default models, set this to `false`. There is exactly one default model per language pair, the IBM
    * provided base model.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def listModels(): js.Promise[js.Any] | Unit = js.native
  def listModels(params: Unit, callback: Callback[TranslationModels]): js.Promise[js.Any] | Unit = js.native
  def listModels(params: ListModelsParams): js.Promise[js.Any] | Unit = js.native
  def listModels(params: ListModelsParams, callback: Callback[TranslationModels]): js.Promise[js.Any] | Unit = js.native
  
  /*************************
    * translation
    ************************/
  /**
    * Translate.
    *
    * Translates the input text from the source language to the target language.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string[]} params.text - Input text in UTF-8 encoding. Multiple entries will result in multiple translations
    * in the response.
    * @param {string} [params.model_id] - A globally unique string that identifies the underlying model that is used for
    * translation.
    * @param {string} [params.source] - Translation source language code.
    * @param {string} [params.target] - Translation target language code.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def translate(params: TranslateParams): js.Promise[js.Any] | Unit = js.native
  def translate(params: TranslateParams, callback: Callback[TranslationResult]): js.Promise[js.Any] | Unit = js.native
}
