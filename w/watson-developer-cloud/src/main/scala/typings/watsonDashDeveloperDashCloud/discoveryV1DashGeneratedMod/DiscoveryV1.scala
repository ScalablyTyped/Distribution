package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import typings.ibmDashCloudDashSdkDashCore.ibmDashCloudDashSdkDashCoreMod.BaseService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The IBM Watson&trade; Discovery Service is a cognitive search and content analytics engine that you can add to applications to identify patterns, trends and actionable insights to drive better decision-making. Securely unify structured and unstructured data with pre-enriched content, and use a simplified query language to eliminate the need for manual filtering of results.
  */
@js.native
trait DiscoveryV1 extends BaseService {
  /*************************
    * documents
    ************************/
  /**
    * Add a document.
    *
    * Add a document to a collection with optional metadata.
    *
    *   * The **version** query parameter is still required.
    *
    *   * Returns immediately after the system has accepted the document for processing.
    *
    *   * The user must provide document content, metadata, or both. If the request is missing both document content and
    * metadata, it is rejected.
    *
    *   * The user can set the **Content-Type** parameter on the **file** part to indicate the media type of the
    * document. If the **Content-Type** parameter is missing or is one of the generic media types (for example,
    * `application/octet-stream`), then the service attempts to automatically detect the document's media type.
    *
    *   * The following field names are reserved and will be filtered out if present after normalization: `id`, `score`,
    * `highlight`, and any field with the prefix of: `_`, `+`, or `-`
    *
    *   * Fields with empty name values after normalization are filtered out before indexing.
    *
    *   * Fields containing the following characters after normalization are filtered out before indexing: `#` and `,`
    *
    *  **Note:** Documents can be added with a specific **document_id** by using the
    * **_/v1/environments/{environment_id}/collections/{collection_id}/documents** method.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {string} params.collection_id - The ID of the collection.
    * @param {NodeJS.ReadableStream|FileObject|Buffer} [params.file] - The content of the document to ingest. The maximum
    * supported file size when adding a file to a collection is 50 megabytes, the maximum supported file size when
    * testing a confiruration is 1 megabyte. Files larger than the supported size are rejected.
    * @param {string} [params.filename] - The filename for file.
    * @param {string} [params.file_content_type] - The content type of file.
    * @param {string} [params.metadata] - If you're using the Data Crawler to upload your documents, you can test a
    * document against the type of metadata that the Data Crawler might send. The maximum supported metadata file size is
    * 1 MB. Metadata parts larger than 1 MB are rejected.
    * Example:  ``` {
    *   "Creator": "Johnny Appleseed",
    *   "Subject": "Apples"
    * } ```.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def addDocument(params: AddDocumentParams): js.Promise[_] | Unit = js.native
  def addDocument(params: AddDocumentParams, callback: Callback[DocumentAccepted]): js.Promise[_] | Unit = js.native
  /*************************
    * trainingData
    ************************/
  /**
    * Add query to training data.
    *
    * Adds a query to the training data for this collection. The query can contain a filter and natural language query.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {string} params.collection_id - The ID of the collection.
    * @param {string} [params.natural_language_query] - The natural text query for the new training query.
    * @param {string} [params.filter] - The filter used on the collection before the **natural_language_query** is
    * applied.
    * @param {TrainingExample[]} [params.examples] - Array of training examples.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def addTrainingData(params: AddTrainingDataParams): js.Promise[_] | Unit = js.native
  def addTrainingData(params: AddTrainingDataParams, callback: Callback[TrainingQuery]): js.Promise[_] | Unit = js.native
  /*************************
    * collections
    ************************/
  /**
    * Create a collection.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {string} params.name - The name of the collection to be created.
    * @param {string} [params.description] - A description of the collection.
    * @param {string} [params.configuration_id] - The ID of the configuration in which the collection is to be created.
    * @param {string} [params.language] - The language of the documents stored in the collection, in the form of an ISO
    * 639-1 language code.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def createCollection(params: CreateCollectionParams): js.Promise[_] | Unit = js.native
  def createCollection(params: CreateCollectionParams, callback: Callback[Collection]): js.Promise[_] | Unit = js.native
  /*************************
    * configurations
    ************************/
  /**
    * Add configuration.
    *
    * Creates a new configuration.
    *
    * If the input configuration contains the **configuration_id**, **created**, or **updated** properties, then they are
    * ignored and overridden by the system, and an error is not returned so that the overridden fields do not need to be
    * removed when copying a configuration.
    *
    * The configuration can contain unrecognized JSON fields. Any such fields are ignored and do not generate an error.
    * This makes it easier to use newer configuration files with older versions of the API and the service. It also makes
    * it possible for the tooling to add additional metadata and information to the configuration.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {string} params.name - The name of the configuration.
    * @param {string} [params.description] - The description of the configuration, if available.
    * @param {Conversions} [params.conversions] - Document conversion settings.
    * @param {Enrichment[]} [params.enrichments] - An array of document enrichment settings for the configuration.
    * @param {NormalizationOperation[]} [params.normalizations] - Defines operations that can be used to transform the
    * final output JSON into a normalized form. Operations are executed in the order that they appear in the array.
    * @param {Source} [params.source] - Object containing source parameters for the configuration.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def createConfiguration(params: CreateConfigurationParams): js.Promise[_] | Unit = js.native
  def createConfiguration(params: CreateConfigurationParams, callback: Callback[Configuration]): js.Promise[_] | Unit = js.native
  /*************************
    * credentials
    ************************/
  /**
    * Create credentials.
    *
    * Creates a set of credentials to connect to a remote source. Created credentials are used in a configuration to
    * associate a collection with the remote source.
    *
    * **Note:** All credentials are sent over an encrypted connection and encrypted at rest.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {string} [params.source_type] - The source that this credentials object connects to.
    * -  `box` indicates the credentials are used to connect an instance of Enterprise Box.
    * -  `salesforce` indicates the credentials are used to connect to Salesforce.
    * -  `sharepoint` indicates the credentials are used to connect to Microsoft SharePoint Online.
    * -  `web_crawl` indicates the credentials are used to perform a web crawl.
    * =  `cloud_object_storage` indicates the credentials are used to connect to an IBM Cloud Object Store.
    * @param {CredentialDetails} [params.credential_details] - Object containing details of the stored credentials.
    *
    * Obtain credentials for your source from the administrator of the source.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def createCredentials(params: CreateCredentialsParams): js.Promise[_] | Unit = js.native
  def createCredentials(params: CreateCredentialsParams, callback: Callback[Credentials]): js.Promise[_] | Unit = js.native
  /*************************
    * environments
    ************************/
  /**
    * Create an environment.
    *
    * Creates a new environment for private data. An environment must be created before collections can be created.
    *
    * **Note**: You can create only one environment for private data per service instance. An attempt to create another
    * environment results in an error.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.name - Name that identifies the environment.
    * @param {string} [params.description] - Description of the environment.
    * @param {string} [params.size] - Size of the environment. In the Lite plan the default and only accepted value is
    * `LT`, in all other plans the default is `S`.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def createEnvironment(params: CreateEnvironmentParams): js.Promise[_] | Unit = js.native
  def createEnvironment(params: CreateEnvironmentParams, callback: Callback[Environment]): js.Promise[_] | Unit = js.native
  /*************************
    * eventsAndFeedback
    ************************/
  /**
    * Create event.
    *
    * The **Events** API can be used to create log entries that are associated with specific queries. For example, you
    * can record which documents in the results set were \"clicked\" by a user and when that click occured.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.type - The event type to be created.
    * @param {EventData} params.data - Query event data object.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def createEvent(params: CreateEventParams): js.Promise[_] | Unit = js.native
  def createEvent(params: CreateEventParams, callback: Callback[CreateEventResponse]): js.Promise[_] | Unit = js.native
  /*************************
    * queryModifications
    ************************/
  /**
    * Create or update expansion list.
    *
    * Create or replace the Expansion list for this collection. The maximum number of expanded terms per collection is
    * `500`.
    * The current expansion list is replaced with the uploaded content.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {string} params.collection_id - The ID of the collection.
    * @param {Expansion[]} params.expansions - An array of query expansion definitions.
    *
    *  Each object in the **expansions** array represents a term or set of terms that will be expanded into other terms.
    * Each expansion object can be configured as bidirectional or unidirectional. Bidirectional means that all terms are
    * expanded to all other terms in the object. Unidirectional means that a set list of terms can be expanded into a
    * second list of terms.
    *
    *  To create a bi-directional expansion specify an **expanded_terms** array. When found in a query, all items in the
    * **expanded_terms** array are then expanded to the other items in the same array.
    *
    *  To create a uni-directional expansion, specify both an array of **input_terms** and an array of
    * **expanded_terms**. When items in the **input_terms** array are present in a query, they are expanded using the
    * items listed in the **expanded_terms** array.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def createExpansions(params: CreateExpansionsParams): js.Promise[_] | Unit = js.native
  def createExpansions(params: CreateExpansionsParams, callback: Callback[Expansions]): js.Promise[_] | Unit = js.native
  /*************************
    * gatewayConfiguration
    ************************/
  /**
    * Create Gateway.
    *
    * Create a gateway configuration to use with a remotely installed gateway.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {string} [params.name] - User-defined name.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def createGateway(params: CreateGatewayParams): js.Promise[_] | Unit = js.native
  def createGateway(params: CreateGatewayParams, callback: Callback[Gateway]): js.Promise[_] | Unit = js.native
  /**
    * Create stopword list.
    *
    * Upload a custom stopword list to use with the specified collection.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {string} params.collection_id - The ID of the collection.
    * @param {NodeJS.ReadableStream|FileObject|Buffer} params.stopword_file - The content of the stopword list to ingest.
    * @param {string} params.stopword_filename - The filename for stopword_file.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def createStopwordList(params: CreateStopwordListParams): js.Promise[_] | Unit = js.native
  def createStopwordList(params: CreateStopwordListParams, callback: Callback[TokenDictStatusResponse]): js.Promise[_] | Unit = js.native
  /**
    * Create tokenization dictionary.
    *
    * Upload a custom tokenization dictionary to use with the specified collection.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {string} params.collection_id - The ID of the collection.
    * @param {TokenDictRule[]} [params.tokenization_rules] - An array of tokenization rules. Each rule contains, the
    * original `text` string, component `tokens`, any alternate character set `readings`, and which `part_of_speech` the
    * text is from.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def createTokenizationDictionary(params: CreateTokenizationDictionaryParams): js.Promise[_] | Unit = js.native
  def createTokenizationDictionary(params: CreateTokenizationDictionaryParams, callback: Callback[TokenDictStatusResponse]): js.Promise[_] | Unit = js.native
  /**
    * Add example to training data query.
    *
    * Adds a example to this training data query.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {string} params.collection_id - The ID of the collection.
    * @param {string} params.query_id - The ID of the query used for training.
    * @param {string} [params.document_id] - The document ID associated with this training example.
    * @param {string} [params.cross_reference] - The cross reference associated with this training example.
    * @param {number} [params.relevance] - The relevance of the training example.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def createTrainingExample(params: CreateTrainingExampleParams): js.Promise[_] | Unit = js.native
  def createTrainingExample(params: CreateTrainingExampleParams, callback: Callback[TrainingExample]): js.Promise[_] | Unit = js.native
  /**
    * Delete all training data.
    *
    * Deletes all training data from a collection.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {string} params.collection_id - The ID of the collection.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def deleteAllTrainingData(params: DeleteAllTrainingDataParams): js.Promise[_] | Unit = js.native
  def deleteAllTrainingData(params: DeleteAllTrainingDataParams, callback: Callback[Empty]): js.Promise[_] | Unit = js.native
  /**
    * Delete a collection.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {string} params.collection_id - The ID of the collection.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def deleteCollection(params: DeleteCollectionParams): js.Promise[_] | Unit = js.native
  def deleteCollection(params: DeleteCollectionParams, callback: Callback[DeleteCollectionResponse]): js.Promise[_] | Unit = js.native
  /**
    * Delete a configuration.
    *
    * The deletion is performed unconditionally. A configuration deletion request succeeds even if the configuration is
    * referenced by a collection or document ingestion. However, documents that have already been submitted for
    * processing continue to use the deleted configuration. Documents are always processed with a snapshot of the
    * configuration as it existed at the time the document was submitted.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {string} params.configuration_id - The ID of the configuration.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def deleteConfiguration(params: DeleteConfigurationParams): js.Promise[_] | Unit = js.native
  def deleteConfiguration(params: DeleteConfigurationParams, callback: Callback[DeleteConfigurationResponse]): js.Promise[_] | Unit = js.native
  /**
    * Delete credentials.
    *
    * Deletes a set of stored credentials from your Discovery instance.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {string} params.credential_id - The unique identifier for a set of source credentials.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def deleteCredentials(params: DeleteCredentialsParams): js.Promise[_] | Unit = js.native
  def deleteCredentials(params: DeleteCredentialsParams, callback: Callback[DeleteCredentials]): js.Promise[_] | Unit = js.native
  /**
    * Delete a document.
    *
    * If the given document ID is invalid, or if the document is not found, then the a success response is returned (HTTP
    * status code `200`) with the status set to 'deleted'.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {string} params.collection_id - The ID of the collection.
    * @param {string} params.document_id - The ID of the document.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def deleteDocument(params: DeleteDocumentParams): js.Promise[_] | Unit = js.native
  def deleteDocument(params: DeleteDocumentParams, callback: Callback[DeleteDocumentResponse]): js.Promise[_] | Unit = js.native
  /**
    * Delete environment.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def deleteEnvironment(params: DeleteEnvironmentParams): js.Promise[_] | Unit = js.native
  def deleteEnvironment(params: DeleteEnvironmentParams, callback: Callback[DeleteEnvironmentResponse]): js.Promise[_] | Unit = js.native
  /**
    * Delete the expansion list.
    *
    * Remove the expansion information for this collection. The expansion list must be deleted to disable query expansion
    * for a collection.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {string} params.collection_id - The ID of the collection.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def deleteExpansions(params: DeleteExpansionsParams): js.Promise[_] | Unit = js.native
  def deleteExpansions(params: DeleteExpansionsParams, callback: Callback[Empty]): js.Promise[_] | Unit = js.native
  /**
    * Delete Gateway.
    *
    * Delete the specified gateway configuration.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {string} params.gateway_id - The requested gateway ID.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def deleteGateway(params: DeleteGatewayParams): js.Promise[_] | Unit = js.native
  def deleteGateway(params: DeleteGatewayParams, callback: Callback[GatewayDelete]): js.Promise[_] | Unit = js.native
  /**
    * Delete a custom stopword list.
    *
    * Delete a custom stopword list from the collection. After a custom stopword list is deleted, the default list is
    * used for the collection.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {string} params.collection_id - The ID of the collection.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def deleteStopwordList(params: DeleteStopwordListParams): js.Promise[_] | Unit = js.native
  def deleteStopwordList(params: DeleteStopwordListParams, callback: Callback[Empty]): js.Promise[_] | Unit = js.native
  /**
    * Delete tokenization dictionary.
    *
    * Delete the tokenization dictionary from the collection.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {string} params.collection_id - The ID of the collection.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def deleteTokenizationDictionary(params: DeleteTokenizationDictionaryParams): js.Promise[_] | Unit = js.native
  def deleteTokenizationDictionary(params: DeleteTokenizationDictionaryParams, callback: Callback[Empty]): js.Promise[_] | Unit = js.native
  /**
    * Delete a training data query.
    *
    * Removes the training data query and all associated examples from the training data set.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {string} params.collection_id - The ID of the collection.
    * @param {string} params.query_id - The ID of the query used for training.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def deleteTrainingData(params: DeleteTrainingDataParams): js.Promise[_] | Unit = js.native
  def deleteTrainingData(params: DeleteTrainingDataParams, callback: Callback[Empty]): js.Promise[_] | Unit = js.native
  /**
    * Delete example for training data query.
    *
    * Deletes the example document with the given ID from the training data query.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {string} params.collection_id - The ID of the collection.
    * @param {string} params.query_id - The ID of the query used for training.
    * @param {string} params.example_id - The ID of the document as it is indexed.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def deleteTrainingExample(params: DeleteTrainingExampleParams): js.Promise[_] | Unit = js.native
  def deleteTrainingExample(params: DeleteTrainingExampleParams, callback: Callback[Empty]): js.Promise[_] | Unit = js.native
  /*************************
    * userData
    ************************/
  /**
    * Delete labeled data.
    *
    * Deletes all data associated with a specified customer ID. The method has no effect if no data is associated with
    * the customer ID.
    *
    * You associate a customer ID with data by passing the **X-Watson-Metadata** header with a request that passes data.
    * For more information about personal data and customer IDs, see [Information
    * security](https://cloud.ibm.com/docs/services/discovery?topic=discovery-information-security#information-security).
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
    * queries
    ************************/
  /**
    * Long environment queries.
    *
    * Complex queries might be too long for a standard method query. By using this method, you can construct longer
    * queries. However, these queries may take longer to complete than the standard method. For details, see the
    * [Discovery service
    * documentation](https://cloud.ibm.com/docs/services/discovery?topic=discovery-query-concepts#query-concepts).
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {string} [params.filter] - A cacheable query that excludes documents that don't mention the query content.
    * Filter searches are better for metadata-type searches and for assessing the concepts in the data set.
    * @param {string} [params.query] - A query search returns all documents in your data set with full enrichments and
    * full text, but with the most relevant documents listed first. Use a query search when you want to find the most
    * relevant search results. You cannot use **natural_language_query** and **query** at the same time.
    * @param {string} [params.natural_language_query] - A natural language query that returns relevant documents by
    * utilizing training data and natural language understanding. You cannot use **natural_language_query** and **query**
    * at the same time.
    * @param {boolean} [params.passages] - A passages query that returns the most relevant passages from the results.
    * @param {string} [params.aggregation] - An aggregation search that returns an exact answer by combining query search
    * with filters. Useful for applications to build lists, tables, and time series. For a full list of possible
    * aggregations, see the Query reference.
    * @param {number} [params.count] - Number of results to return.
    * @param {string} [params.return_fields] - A comma-separated list of the portion of the document hierarchy to return.
    * @param {number} [params.offset] - The number of query results to skip at the beginning. For example, if the total
    * number of results that are returned is 10 and the offset is 8, it returns the last two results.
    * @param {string} [params.sort] - A comma-separated list of fields in the document to sort on. You can optionally
    * specify a sort direction by prefixing the field with `-` for descending or `+` for ascending. Ascending is the
    * default sort direction if no prefix is specified. This parameter cannot be used in the same query as the **bias**
    * parameter.
    * @param {boolean} [params.highlight] - When true, a highlight field is returned for each result which contains the
    * fields which match the query with `<em></em>` tags around the matching query terms.
    * @param {string} [params.passages_fields] - A comma-separated list of fields that passages are drawn from. If this
    * parameter not specified, then all top-level fields are included.
    * @param {number} [params.passages_count] - The maximum number of passages to return. The search returns fewer
    * passages if the requested total is not found. The default is `10`. The maximum is `100`.
    * @param {number} [params.passages_characters] - The approximate number of characters that any one passage will have.
    * @param {boolean} [params.deduplicate] - When `true`, and used with a Watson Discovery News collection, duplicate
    * results (based on the contents of the **title** field) are removed. Duplicate comparison is limited to the current
    * query only; **offset** is not considered. This parameter is currently Beta functionality.
    * @param {string} [params.deduplicate_field] - When specified, duplicate results based on the field specified are
    * removed from the returned results. Duplicate comparison is limited to the current query only, **offset** is not
    * considered. This parameter is currently Beta functionality.
    * @param {string} [params.collection_ids] - A comma-separated list of collection IDs to be queried against. Required
    * when querying multiple collections, invalid when performing a single collection query.
    * @param {boolean} [params.similar] - When `true`, results are returned based on their similarity to the document IDs
    * specified in the **similar.document_ids** parameter.
    * @param {string} [params.similar_document_ids] - A comma-separated list of document IDs to find similar documents.
    *
    * **Tip:** Include the **natural_language_query** parameter to expand the scope of the document similarity search
    * with the natural language query. Other query parameters, such as **filter** and **query**, are subsequently applied
    * and reduce the scope.
    * @param {string} [params.similar_fields] - A comma-separated list of field names that are used as a basis for
    * comparison to identify similar documents. If not specified, the entire document is used for comparison.
    * @param {string} [params.bias] - Field which the returned results will be biased against. The specified field must
    * be either a **date** or **number** format. When a **date** type field is specified returned results are biased
    * towards field values closer to the current date. When a **number** type field is specified, returned results are
    * biased towards higher field values. This parameter cannot be used in the same query as the **sort** parameter.
    * @param {boolean} [params.logging_opt_out] - If `true`, queries are not stored in the Discovery **Logs** endpoint.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def federatedQuery(params: FederatedQueryParams): js.Promise[_] | Unit = js.native
  def federatedQuery(params: FederatedQueryParams, callback: Callback[QueryResponse]): js.Promise[_] | Unit = js.native
  /**
    * Query multiple collection system notices.
    *
    * Queries for notices (errors or warnings) that might have been generated by the system. Notices are generated when
    * ingesting documents and performing relevance training. See the [Discovery service
    * documentation](https://cloud.ibm.com/docs/services/discovery?topic=discovery-query-concepts#query-concepts) for
    * more details on the query language.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {string[]} params.collection_ids - A comma-separated list of collection IDs to be queried against.
    * @param {string} [params.filter] - A cacheable query that excludes documents that don't mention the query content.
    * Filter searches are better for metadata-type searches and for assessing the concepts in the data set.
    * @param {string} [params.query] - A query search returns all documents in your data set with full enrichments and
    * full text, but with the most relevant documents listed first. Use a query search when you want to find the most
    * relevant search results. You cannot use **natural_language_query** and **query** at the same time.
    * @param {string} [params.natural_language_query] - A natural language query that returns relevant documents by
    * utilizing training data and natural language understanding. You cannot use **natural_language_query** and **query**
    * at the same time.
    * @param {string} [params.aggregation] - An aggregation search that returns an exact answer by combining query search
    * with filters. Useful for applications to build lists, tables, and time series. For a full list of possible
    * aggregations, see the Query reference.
    * @param {number} [params.count] - Number of results to return. The maximum for the **count** and **offset** values
    * together in any one query is **10000**.
    * @param {string[]} [params.return_fields] - A comma-separated list of the portion of the document hierarchy to
    * return.
    * @param {number} [params.offset] - The number of query results to skip at the beginning. For example, if the total
    * number of results that are returned is 10 and the offset is 8, it returns the last two results. The maximum for the
    * **count** and **offset** values together in any one query is **10000**.
    * @param {string[]} [params.sort] - A comma-separated list of fields in the document to sort on. You can optionally
    * specify a sort direction by prefixing the field with `-` for descending or `+` for ascending. Ascending is the
    * default sort direction if no prefix is specified.
    * @param {boolean} [params.highlight] - When true, a highlight field is returned for each result which contains the
    * fields which match the query with `<em></em>` tags around the matching query terms.
    * @param {string} [params.deduplicate_field] - When specified, duplicate results based on the field specified are
    * removed from the returned results. Duplicate comparison is limited to the current query only, **offset** is not
    * considered. This parameter is currently Beta functionality.
    * @param {boolean} [params.similar] - When `true`, results are returned based on their similarity to the document IDs
    * specified in the **similar.document_ids** parameter.
    * @param {string[]} [params.similar_document_ids] - A comma-separated list of document IDs to find similar documents.
    *
    * **Tip:** Include the **natural_language_query** parameter to expand the scope of the document similarity search
    * with the natural language query. Other query parameters, such as **filter** and **query**, are subsequently applied
    * and reduce the scope.
    * @param {string[]} [params.similar_fields] - A comma-separated list of field names that are used as a basis for
    * comparison to identify similar documents. If not specified, the entire document is used for comparison.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def federatedQueryNotices(params: FederatedQueryNoticesParams): js.Promise[_] | Unit = js.native
  def federatedQueryNotices(params: FederatedQueryNoticesParams, callback: Callback[QueryNoticesResponse]): js.Promise[_] | Unit = js.native
  /**
    * Get collection details.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {string} params.collection_id - The ID of the collection.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def getCollection(params: GetCollectionParams): js.Promise[_] | Unit = js.native
  def getCollection(params: GetCollectionParams, callback: Callback[Collection]): js.Promise[_] | Unit = js.native
  /**
    * Get configuration details.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {string} params.configuration_id - The ID of the configuration.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def getConfiguration(params: GetConfigurationParams): js.Promise[_] | Unit = js.native
  def getConfiguration(params: GetConfigurationParams, callback: Callback[Configuration]): js.Promise[_] | Unit = js.native
  /**
    * View Credentials.
    *
    * Returns details about the specified credentials.
    *
    *  **Note:** Secure credential information such as a password or SSH key is never returned and must be obtained from
    * the source system.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {string} params.credential_id - The unique identifier for a set of source credentials.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def getCredentials(params: GetCredentialsParams): js.Promise[_] | Unit = js.native
  def getCredentials(params: GetCredentialsParams, callback: Callback[Credentials]): js.Promise[_] | Unit = js.native
  /**
    * Get document details.
    *
    * Fetch status details about a submitted document. **Note:** this operation does not return the document itself.
    * Instead, it returns only the document's processing status and any notices (warnings or errors) that were generated
    * when the document was ingested. Use the query API to retrieve the actual document content.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {string} params.collection_id - The ID of the collection.
    * @param {string} params.document_id - The ID of the document.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def getDocumentStatus(params: GetDocumentStatusParams): js.Promise[_] | Unit = js.native
  def getDocumentStatus(params: GetDocumentStatusParams, callback: Callback[DocumentStatus]): js.Promise[_] | Unit = js.native
  /**
    * Get environment info.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def getEnvironment(params: GetEnvironmentParams): js.Promise[_] | Unit = js.native
  def getEnvironment(params: GetEnvironmentParams, callback: Callback[Environment]): js.Promise[_] | Unit = js.native
  /**
    * List Gateway Details.
    *
    * List information about the specified gateway.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {string} params.gateway_id - The requested gateway ID.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def getGateway(params: GetGatewayParams): js.Promise[_] | Unit = js.native
  def getGateway(params: GetGatewayParams, callback: Callback[Gateway]): js.Promise[_] | Unit = js.native
  /**
    * Percentage of queries with an associated event.
    *
    * The percentage of queries using the **natural_language_query** parameter that have a corresponding \"click\" event
    * over a specified time window.  This metric requires having integrated event tracking in your application using the
    * **Events** API.
    *
    * @param {Object} [params] - The parameters to send to the service.
    * @param {string} [params.start_time] - Metric is computed from data recorded after this timestamp; must be in
    * `YYYY-MM-DDThh:mm:ssZ` format.
    * @param {string} [params.end_time] - Metric is computed from data recorded before this timestamp; must be in
    * `YYYY-MM-DDThh:mm:ssZ` format.
    * @param {string} [params.result_type] - The type of result to consider when calculating the metric.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def getMetricsEventRate(): js.Promise[_] | Unit = js.native
  def getMetricsEventRate(params: GetMetricsEventRateParams): js.Promise[_] | Unit = js.native
  def getMetricsEventRate(params: GetMetricsEventRateParams, callback: Callback[MetricResponse]): js.Promise[_] | Unit = js.native
  /**
    * Number of queries over time.
    *
    * Total number of queries using the **natural_language_query** parameter over a specific time window.
    *
    * @param {Object} [params] - The parameters to send to the service.
    * @param {string} [params.start_time] - Metric is computed from data recorded after this timestamp; must be in
    * `YYYY-MM-DDThh:mm:ssZ` format.
    * @param {string} [params.end_time] - Metric is computed from data recorded before this timestamp; must be in
    * `YYYY-MM-DDThh:mm:ssZ` format.
    * @param {string} [params.result_type] - The type of result to consider when calculating the metric.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def getMetricsQuery(): js.Promise[_] | Unit = js.native
  def getMetricsQuery(params: GetMetricsQueryParams): js.Promise[_] | Unit = js.native
  def getMetricsQuery(params: GetMetricsQueryParams, callback: Callback[MetricResponse]): js.Promise[_] | Unit = js.native
  /**
    * Number of queries with an event over time.
    *
    * Total number of queries using the **natural_language_query** parameter that have a corresponding \"click\" event
    * over a specified time window. This metric requires having integrated event tracking in your application using the
    * **Events** API.
    *
    * @param {Object} [params] - The parameters to send to the service.
    * @param {string} [params.start_time] - Metric is computed from data recorded after this timestamp; must be in
    * `YYYY-MM-DDThh:mm:ssZ` format.
    * @param {string} [params.end_time] - Metric is computed from data recorded before this timestamp; must be in
    * `YYYY-MM-DDThh:mm:ssZ` format.
    * @param {string} [params.result_type] - The type of result to consider when calculating the metric.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def getMetricsQueryEvent(): js.Promise[_] | Unit = js.native
  def getMetricsQueryEvent(params: GetMetricsQueryEventParams): js.Promise[_] | Unit = js.native
  def getMetricsQueryEvent(params: GetMetricsQueryEventParams, callback: Callback[MetricResponse]): js.Promise[_] | Unit = js.native
  /**
    * Number of queries with no search results over time.
    *
    * Total number of queries using the **natural_language_query** parameter that have no results returned over a
    * specified time window.
    *
    * @param {Object} [params] - The parameters to send to the service.
    * @param {string} [params.start_time] - Metric is computed from data recorded after this timestamp; must be in
    * `YYYY-MM-DDThh:mm:ssZ` format.
    * @param {string} [params.end_time] - Metric is computed from data recorded before this timestamp; must be in
    * `YYYY-MM-DDThh:mm:ssZ` format.
    * @param {string} [params.result_type] - The type of result to consider when calculating the metric.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def getMetricsQueryNoResults(): js.Promise[_] | Unit = js.native
  def getMetricsQueryNoResults(params: GetMetricsQueryNoResultsParams): js.Promise[_] | Unit = js.native
  def getMetricsQueryNoResults(params: GetMetricsQueryNoResultsParams, callback: Callback[MetricResponse]): js.Promise[_] | Unit = js.native
  /**
    * Most frequent query tokens with an event.
    *
    * The most frequent query tokens parsed from the **natural_language_query** parameter and their corresponding
    * \"click\" event rate within the recording period (queries and events are stored for 30 days). A query token is an
    * individual word or unigram within the query string.
    *
    * @param {Object} [params] - The parameters to send to the service.
    * @param {number} [params.count] - Number of results to return. The maximum for the **count** and **offset** values
    * together in any one query is **10000**.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def getMetricsQueryTokenEvent(): js.Promise[_] | Unit = js.native
  def getMetricsQueryTokenEvent(params: GetMetricsQueryTokenEventParams): js.Promise[_] | Unit = js.native
  def getMetricsQueryTokenEvent(params: GetMetricsQueryTokenEventParams, callback: Callback[MetricTokenResponse]): js.Promise[_] | Unit = js.native
  /**
    * Get stopword list status.
    *
    * Returns the current status of the stopword list for the specified collection.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {string} params.collection_id - The ID of the collection.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def getStopwordListStatus(params: GetStopwordListStatusParams): js.Promise[_] | Unit = js.native
  def getStopwordListStatus(params: GetStopwordListStatusParams, callback: Callback[TokenDictStatusResponse]): js.Promise[_] | Unit = js.native
  /**
    * Get tokenization dictionary status.
    *
    * Returns the current status of the tokenization dictionary for the specified collection.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {string} params.collection_id - The ID of the collection.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def getTokenizationDictionaryStatus(params: GetTokenizationDictionaryStatusParams): js.Promise[_] | Unit = js.native
  def getTokenizationDictionaryStatus(params: GetTokenizationDictionaryStatusParams, callback: Callback[TokenDictStatusResponse]): js.Promise[_] | Unit = js.native
  /**
    * Get details about a query.
    *
    * Gets details for a specific training data query, including the query string and all examples.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {string} params.collection_id - The ID of the collection.
    * @param {string} params.query_id - The ID of the query used for training.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def getTrainingData(params: GetTrainingDataParams): js.Promise[_] | Unit = js.native
  def getTrainingData(params: GetTrainingDataParams, callback: Callback[TrainingQuery]): js.Promise[_] | Unit = js.native
  /**
    * Get details for training data example.
    *
    * Gets the details for this training example.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {string} params.collection_id - The ID of the collection.
    * @param {string} params.query_id - The ID of the query used for training.
    * @param {string} params.example_id - The ID of the document as it is indexed.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def getTrainingExample(params: GetTrainingExampleParams): js.Promise[_] | Unit = js.native
  def getTrainingExample(params: GetTrainingExampleParams, callback: Callback[TrainingExample]): js.Promise[_] | Unit = js.native
  /**
    * List collection fields.
    *
    * Gets a list of the unique fields (and their types) stored in the index.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {string} params.collection_id - The ID of the collection.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def listCollectionFields(params: ListCollectionFieldsParams): js.Promise[_] | Unit = js.native
  def listCollectionFields(params: ListCollectionFieldsParams, callback: Callback[ListCollectionFieldsResponse]): js.Promise[_] | Unit = js.native
  /**
    * List collections.
    *
    * Lists existing collections for the service instance.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {string} [params.name] - Find collections with the given name.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def listCollections(params: ListCollectionsParams): js.Promise[_] | Unit = js.native
  def listCollections(params: ListCollectionsParams, callback: Callback[ListCollectionsResponse]): js.Promise[_] | Unit = js.native
  /**
    * List configurations.
    *
    * Lists existing configurations for the service instance.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {string} [params.name] - Find configurations with the given name.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def listConfigurations(params: ListConfigurationsParams): js.Promise[_] | Unit = js.native
  def listConfigurations(params: ListConfigurationsParams, callback: Callback[ListConfigurationsResponse]): js.Promise[_] | Unit = js.native
  /**
    * List credentials.
    *
    * List all the source credentials that have been created for this service instance.
    *
    *  **Note:**  All credentials are sent over an encrypted connection and encrypted at rest.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def listCredentials(params: ListCredentialsParams): js.Promise[_] | Unit = js.native
  def listCredentials(params: ListCredentialsParams, callback: Callback[CredentialsList]): js.Promise[_] | Unit = js.native
  /**
    * List environments.
    *
    * List existing environments for the service instance.
    *
    * @param {Object} [params] - The parameters to send to the service.
    * @param {string} [params.name] - Show only the environment with the given name.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def listEnvironments(): js.Promise[_] | Unit = js.native
  def listEnvironments(params: ListEnvironmentsParams): js.Promise[_] | Unit = js.native
  def listEnvironments(params: ListEnvironmentsParams, callback: Callback[ListEnvironmentsResponse]): js.Promise[_] | Unit = js.native
  /**
    * Get the expansion list.
    *
    * Returns the current expansion list for the specified collection. If an expansion list is not specified, an object
    * with empty expansion arrays is returned.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {string} params.collection_id - The ID of the collection.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def listExpansions(params: ListExpansionsParams): js.Promise[_] | Unit = js.native
  def listExpansions(params: ListExpansionsParams, callback: Callback[Expansions]): js.Promise[_] | Unit = js.native
  /**
    * List fields across collections.
    *
    * Gets a list of the unique fields (and their types) stored in the indexes of the specified collections.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {string[]} params.collection_ids - A comma-separated list of collection IDs to be queried against.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def listFields(params: ListFieldsParams): js.Promise[_] | Unit = js.native
  def listFields(params: ListFieldsParams, callback: Callback[ListCollectionFieldsResponse]): js.Promise[_] | Unit = js.native
  /**
    * List Gateways.
    *
    * List the currently configured gateways.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def listGateways(params: ListGatewaysParams): js.Promise[_] | Unit = js.native
  def listGateways(params: ListGatewaysParams, callback: Callback[GatewayList]): js.Promise[_] | Unit = js.native
  /**
    * List training data.
    *
    * Lists the training data for the specified collection.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {string} params.collection_id - The ID of the collection.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def listTrainingData(params: ListTrainingDataParams): js.Promise[_] | Unit = js.native
  def listTrainingData(params: ListTrainingDataParams, callback: Callback[TrainingDataSet]): js.Promise[_] | Unit = js.native
  /**
    * List examples for a training data query.
    *
    * List all examples for this training data query.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {string} params.collection_id - The ID of the collection.
    * @param {string} params.query_id - The ID of the query used for training.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def listTrainingExamples(params: ListTrainingExamplesParams): js.Promise[_] | Unit = js.native
  def listTrainingExamples(params: ListTrainingExamplesParams, callback: Callback[TrainingExampleList]): js.Promise[_] | Unit = js.native
  /**
    * Long collection queries.
    *
    * Complex queries might be too long for a standard method query. By using this method, you can construct longer
    * queries. However, these queries may take longer to complete than the standard method. For details, see the
    * [Discovery service
    * documentation](https://cloud.ibm.com/docs/services/discovery?topic=discovery-query-concepts#query-concepts).
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {string} params.collection_id - The ID of the collection.
    * @param {string} [params.filter] - A cacheable query that excludes documents that don't mention the query content.
    * Filter searches are better for metadata-type searches and for assessing the concepts in the data set.
    * @param {string} [params.query] - A query search returns all documents in your data set with full enrichments and
    * full text, but with the most relevant documents listed first. Use a query search when you want to find the most
    * relevant search results. You cannot use **natural_language_query** and **query** at the same time.
    * @param {string} [params.natural_language_query] - A natural language query that returns relevant documents by
    * utilizing training data and natural language understanding. You cannot use **natural_language_query** and **query**
    * at the same time.
    * @param {boolean} [params.passages] - A passages query that returns the most relevant passages from the results.
    * @param {string} [params.aggregation] - An aggregation search that returns an exact answer by combining query search
    * with filters. Useful for applications to build lists, tables, and time series. For a full list of possible
    * aggregations, see the Query reference.
    * @param {number} [params.count] - Number of results to return.
    * @param {string} [params.return_fields] - A comma-separated list of the portion of the document hierarchy to return.
    * @param {number} [params.offset] - The number of query results to skip at the beginning. For example, if the total
    * number of results that are returned is 10 and the offset is 8, it returns the last two results.
    * @param {string} [params.sort] - A comma-separated list of fields in the document to sort on. You can optionally
    * specify a sort direction by prefixing the field with `-` for descending or `+` for ascending. Ascending is the
    * default sort direction if no prefix is specified. This parameter cannot be used in the same query as the **bias**
    * parameter.
    * @param {boolean} [params.highlight] - When true, a highlight field is returned for each result which contains the
    * fields which match the query with `<em></em>` tags around the matching query terms.
    * @param {string} [params.passages_fields] - A comma-separated list of fields that passages are drawn from. If this
    * parameter not specified, then all top-level fields are included.
    * @param {number} [params.passages_count] - The maximum number of passages to return. The search returns fewer
    * passages if the requested total is not found. The default is `10`. The maximum is `100`.
    * @param {number} [params.passages_characters] - The approximate number of characters that any one passage will have.
    * @param {boolean} [params.deduplicate] - When `true`, and used with a Watson Discovery News collection, duplicate
    * results (based on the contents of the **title** field) are removed. Duplicate comparison is limited to the current
    * query only; **offset** is not considered. This parameter is currently Beta functionality.
    * @param {string} [params.deduplicate_field] - When specified, duplicate results based on the field specified are
    * removed from the returned results. Duplicate comparison is limited to the current query only, **offset** is not
    * considered. This parameter is currently Beta functionality.
    * @param {string} [params.collection_ids] - A comma-separated list of collection IDs to be queried against. Required
    * when querying multiple collections, invalid when performing a single collection query.
    * @param {boolean} [params.similar] - When `true`, results are returned based on their similarity to the document IDs
    * specified in the **similar.document_ids** parameter.
    * @param {string} [params.similar_document_ids] - A comma-separated list of document IDs to find similar documents.
    *
    * **Tip:** Include the **natural_language_query** parameter to expand the scope of the document similarity search
    * with the natural language query. Other query parameters, such as **filter** and **query**, are subsequently applied
    * and reduce the scope.
    * @param {string} [params.similar_fields] - A comma-separated list of field names that are used as a basis for
    * comparison to identify similar documents. If not specified, the entire document is used for comparison.
    * @param {string} [params.bias] - Field which the returned results will be biased against. The specified field must
    * be either a **date** or **number** format. When a **date** type field is specified returned results are biased
    * towards field values closer to the current date. When a **number** type field is specified, returned results are
    * biased towards higher field values. This parameter cannot be used in the same query as the **sort** parameter.
    * @param {boolean} [params.logging_opt_out] - If `true`, queries are not stored in the Discovery **Logs** endpoint.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def query(params: QueryParams): js.Promise[_] | Unit = js.native
  def query(params: QueryParams, callback: Callback[QueryResponse]): js.Promise[_] | Unit = js.native
  /**
    * Knowledge Graph entity query.
    *
    * See the [Knowledge Graph documentation](https://cloud.ibm.com/docs/services/discovery?topic=discovery-kg#kg) for
    * more details.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {string} params.collection_id - The ID of the collection.
    * @param {string} [params.feature] - The entity query feature to perform. Supported features are `disambiguate` and
    * `similar_entities`.
    * @param {QueryEntitiesEntity} [params.entity] - A text string that appears within the entity text field.
    * @param {QueryEntitiesContext} [params.context] - Entity text to provide context for the queried entity and rank
    * based on that association. For example, if you wanted to query the city of London in England your query would look
    * for `London` with the context of `England`.
    * @param {number} [params.count] - The number of results to return. The default is `10`. The maximum is `1000`.
    * @param {number} [params.evidence_count] - The number of evidence items to return for each result. The default is
    * `0`. The maximum number of evidence items per query is 10,000.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def queryEntities(params: QueryEntitiesParams): js.Promise[_] | Unit = js.native
  def queryEntities(params: QueryEntitiesParams, callback: Callback[QueryEntitiesResponse]): js.Promise[_] | Unit = js.native
  /**
    * Search the query and event log.
    *
    * Searches the query and event log to find query sessions that match the specified criteria. Searching the **logs**
    * endpoint uses the standard Discovery query syntax for the parameters that are supported.
    *
    * @param {Object} [params] - The parameters to send to the service.
    * @param {string} [params.filter] - A cacheable query that excludes documents that don't mention the query content.
    * Filter searches are better for metadata-type searches and for assessing the concepts in the data set.
    * @param {string} [params.query] - A query search returns all documents in your data set with full enrichments and
    * full text, but with the most relevant documents listed first. Use a query search when you want to find the most
    * relevant search results. You cannot use **natural_language_query** and **query** at the same time.
    * @param {number} [params.count] - Number of results to return. The maximum for the **count** and **offset** values
    * together in any one query is **10000**.
    * @param {number} [params.offset] - The number of query results to skip at the beginning. For example, if the total
    * number of results that are returned is 10 and the offset is 8, it returns the last two results. The maximum for the
    * **count** and **offset** values together in any one query is **10000**.
    * @param {string[]} [params.sort] - A comma-separated list of fields in the document to sort on. You can optionally
    * specify a sort direction by prefixing the field with `-` for descending or `+` for ascending. Ascending is the
    * default sort direction if no prefix is specified.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def queryLog(): js.Promise[_] | Unit = js.native
  def queryLog(params: QueryLogParams): js.Promise[_] | Unit = js.native
  def queryLog(params: QueryLogParams, callback: Callback[LogQueryResponse]): js.Promise[_] | Unit = js.native
  /**
    * Query system notices.
    *
    * Queries for notices (errors or warnings) that might have been generated by the system. Notices are generated when
    * ingesting documents and performing relevance training. See the [Discovery service
    * documentation](https://cloud.ibm.com/docs/services/discovery?topic=discovery-query-concepts#query-concepts) for
    * more details on the query language.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {string} params.collection_id - The ID of the collection.
    * @param {string} [params.filter] - A cacheable query that excludes documents that don't mention the query content.
    * Filter searches are better for metadata-type searches and for assessing the concepts in the data set.
    * @param {string} [params.query] - A query search returns all documents in your data set with full enrichments and
    * full text, but with the most relevant documents listed first. Use a query search when you want to find the most
    * relevant search results. You cannot use **natural_language_query** and **query** at the same time.
    * @param {string} [params.natural_language_query] - A natural language query that returns relevant documents by
    * utilizing training data and natural language understanding. You cannot use **natural_language_query** and **query**
    * at the same time.
    * @param {boolean} [params.passages] - A passages query that returns the most relevant passages from the results.
    * @param {string} [params.aggregation] - An aggregation search that returns an exact answer by combining query search
    * with filters. Useful for applications to build lists, tables, and time series. For a full list of possible
    * aggregations, see the Query reference.
    * @param {number} [params.count] - Number of results to return. The maximum for the **count** and **offset** values
    * together in any one query is **10000**.
    * @param {string[]} [params.return_fields] - A comma-separated list of the portion of the document hierarchy to
    * return.
    * @param {number} [params.offset] - The number of query results to skip at the beginning. For example, if the total
    * number of results that are returned is 10 and the offset is 8, it returns the last two results. The maximum for the
    * **count** and **offset** values together in any one query is **10000**.
    * @param {string[]} [params.sort] - A comma-separated list of fields in the document to sort on. You can optionally
    * specify a sort direction by prefixing the field with `-` for descending or `+` for ascending. Ascending is the
    * default sort direction if no prefix is specified.
    * @param {boolean} [params.highlight] - When true, a highlight field is returned for each result which contains the
    * fields which match the query with `<em></em>` tags around the matching query terms.
    * @param {string[]} [params.passages_fields] - A comma-separated list of fields that passages are drawn from. If this
    * parameter not specified, then all top-level fields are included.
    * @param {number} [params.passages_count] - The maximum number of passages to return. The search returns fewer
    * passages if the requested total is not found.
    * @param {number} [params.passages_characters] - The approximate number of characters that any one passage will have.
    * @param {string} [params.deduplicate_field] - When specified, duplicate results based on the field specified are
    * removed from the returned results. Duplicate comparison is limited to the current query only, **offset** is not
    * considered. This parameter is currently Beta functionality.
    * @param {boolean} [params.similar] - When `true`, results are returned based on their similarity to the document IDs
    * specified in the **similar.document_ids** parameter.
    * @param {string[]} [params.similar_document_ids] - A comma-separated list of document IDs to find similar documents.
    *
    * **Tip:** Include the **natural_language_query** parameter to expand the scope of the document similarity search
    * with the natural language query. Other query parameters, such as **filter** and **query**, are subsequently applied
    * and reduce the scope.
    * @param {string[]} [params.similar_fields] - A comma-separated list of field names that are used as a basis for
    * comparison to identify similar documents. If not specified, the entire document is used for comparison.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def queryNotices(params: QueryNoticesParams): js.Promise[_] | Unit = js.native
  def queryNotices(params: QueryNoticesParams, callback: Callback[QueryNoticesResponse]): js.Promise[_] | Unit = js.native
  /**
    * Knowledge Graph relationship query.
    *
    * See the [Knowledge Graph documentation](https://cloud.ibm.com/docs/services/discovery?topic=discovery-kg#kg) for
    * more details.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {string} params.collection_id - The ID of the collection.
    * @param {QueryRelationsEntity[]} [params.entities] - An array of entities to find relationships for.
    * @param {QueryEntitiesContext} [params.context] - Entity text to provide context for the queried entity and rank
    * based on that association. For example, if you wanted to query the city of London in England your query would look
    * for `London` with the context of `England`.
    * @param {string} [params.sort] - The sorting method for the relationships, can be `score` or `frequency`.
    * `frequency` is the number of unique times each entity is identified. The default is `score`. This parameter cannot
    * be used in the same query as the **bias** parameter.
    * @param {QueryRelationsFilter} [params.filter] -
    * @param {number} [params.count] - The number of results to return. The default is `10`. The maximum is `1000`.
    * @param {number} [params.evidence_count] - The number of evidence items to return for each result. The default is
    * `0`. The maximum number of evidence items per query is 10,000.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def queryRelations(params: QueryRelationsParams): js.Promise[_] | Unit = js.native
  def queryRelations(params: QueryRelationsParams, callback: Callback[QueryRelationsResponse]): js.Promise[_] | Unit = js.native
  /*************************
    * testYourConfigurationOnADocument
    ************************/
  /**
    * Test configuration.
    *
    * Runs a sample document through the default or your configuration and returns diagnostic information designed to
    * help you understand how the document was processed. The document is not added to the index.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {string} [params.configuration] - The configuration to use to process the document. If this part is
    * provided, then the provided configuration is used to process the document. If the **configuration_id** is also
    * provided (both are present at the same time), then request is rejected. The maximum supported configuration size is
    * 1 MB. Configuration parts larger than 1 MB are rejected.
    * See the `GET /configurations/{configuration_id}` operation for an example configuration.
    * @param {NodeJS.ReadableStream|FileObject|Buffer} [params.file] - The content of the document to ingest. The maximum
    * supported file size when adding a file to a collection is 50 megabytes, the maximum supported file size when
    * testing a confiruration is 1 megabyte. Files larger than the supported size are rejected.
    * @param {string} [params.filename] - The filename for file.
    * @param {string} [params.file_content_type] - The content type of file.
    * @param {string} [params.metadata] - If you're using the Data Crawler to upload your documents, you can test a
    * document against the type of metadata that the Data Crawler might send. The maximum supported metadata file size is
    * 1 MB. Metadata parts larger than 1 MB are rejected.
    * Example:  ``` {
    *   "Creator": "Johnny Appleseed",
    *   "Subject": "Apples"
    * } ```.
    * @param {string} [params.step] - Specify to only run the input document through the given step instead of running
    * the input document through the entire ingestion workflow. Valid values are `convert`, `enrich`, and `normalize`.
    * @param {string} [params.configuration_id] - The ID of the configuration to use to process the document. If the
    * **configuration** form part is also provided (both are present at the same time), then the request will be
    * rejected.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def testConfigurationInEnvironment(params: TestConfigurationInEnvironmentParams): js.Promise[_] | Unit = js.native
  def testConfigurationInEnvironment(params: TestConfigurationInEnvironmentParams, callback: Callback[TestDocument]): js.Promise[_] | Unit = js.native
  /**
    * Update a collection.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {string} params.collection_id - The ID of the collection.
    * @param {string} params.name - The name of the collection.
    * @param {string} [params.description] - A description of the collection.
    * @param {string} [params.configuration_id] - The ID of the configuration in which the collection is to be updated.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def updateCollection(params: UpdateCollectionParams): js.Promise[_] | Unit = js.native
  def updateCollection(params: UpdateCollectionParams, callback: Callback[Collection]): js.Promise[_] | Unit = js.native
  /**
    * Update a configuration.
    *
    * Replaces an existing configuration.
    *   * Completely replaces the original configuration.
    *   * The **configuration_id**, **updated**, and **created** fields are accepted in the request, but they are
    * ignored, and an error is not generated. It is also acceptable for users to submit an updated configuration with
    * none of the three properties.
    *   * Documents are processed with a snapshot of the configuration as it was at the time the document was submitted
    * to be ingested. This means that already submitted documents will not see any updates made to the configuration.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {string} params.configuration_id - The ID of the configuration.
    * @param {string} params.name - The name of the configuration.
    * @param {string} [params.description] - The description of the configuration, if available.
    * @param {Conversions} [params.conversions] - Document conversion settings.
    * @param {Enrichment[]} [params.enrichments] - An array of document enrichment settings for the configuration.
    * @param {NormalizationOperation[]} [params.normalizations] - Defines operations that can be used to transform the
    * final output JSON into a normalized form. Operations are executed in the order that they appear in the array.
    * @param {Source} [params.source] - Object containing source parameters for the configuration.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def updateConfiguration(params: UpdateConfigurationParams): js.Promise[_] | Unit = js.native
  def updateConfiguration(params: UpdateConfigurationParams, callback: Callback[Configuration]): js.Promise[_] | Unit = js.native
  /**
    * Update credentials.
    *
    * Updates an existing set of source credentials.
    *
    * **Note:** All credentials are sent over an encrypted connection and encrypted at rest.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {string} params.credential_id - The unique identifier for a set of source credentials.
    * @param {string} [params.source_type] - The source that this credentials object connects to.
    * -  `box` indicates the credentials are used to connect an instance of Enterprise Box.
    * -  `salesforce` indicates the credentials are used to connect to Salesforce.
    * -  `sharepoint` indicates the credentials are used to connect to Microsoft SharePoint Online.
    * -  `web_crawl` indicates the credentials are used to perform a web crawl.
    * =  `cloud_object_storage` indicates the credentials are used to connect to an IBM Cloud Object Store.
    * @param {CredentialDetails} [params.credential_details] - Object containing details of the stored credentials.
    *
    * Obtain credentials for your source from the administrator of the source.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def updateCredentials(params: UpdateCredentialsParams): js.Promise[_] | Unit = js.native
  def updateCredentials(params: UpdateCredentialsParams, callback: Callback[Credentials]): js.Promise[_] | Unit = js.native
  /**
    * Update a document.
    *
    * Replace an existing document or add a document with a specified **document_id**. Starts ingesting a document with
    * optional metadata.
    *
    * **Note:** When uploading a new document with this method it automatically replaces any document stored with the
    * same **document_id** if it exists.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {string} params.collection_id - The ID of the collection.
    * @param {string} params.document_id - The ID of the document.
    * @param {NodeJS.ReadableStream|FileObject|Buffer} [params.file] - The content of the document to ingest. The maximum
    * supported file size when adding a file to a collection is 50 megabytes, the maximum supported file size when
    * testing a confiruration is 1 megabyte. Files larger than the supported size are rejected.
    * @param {string} [params.filename] - The filename for file.
    * @param {string} [params.file_content_type] - The content type of file.
    * @param {string} [params.metadata] - If you're using the Data Crawler to upload your documents, you can test a
    * document against the type of metadata that the Data Crawler might send. The maximum supported metadata file size is
    * 1 MB. Metadata parts larger than 1 MB are rejected.
    * Example:  ``` {
    *   "Creator": "Johnny Appleseed",
    *   "Subject": "Apples"
    * } ```.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def updateDocument(params: UpdateDocumentParams): js.Promise[_] | Unit = js.native
  def updateDocument(params: UpdateDocumentParams, callback: Callback[DocumentAccepted]): js.Promise[_] | Unit = js.native
  /**
    * Update an environment.
    *
    * Updates an environment. The environment's **name** and  **description** parameters can be changed. You must specify
    * a **name** for the environment.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {string} [params.name] - Name that identifies the environment.
    * @param {string} [params.description] - Description of the environment.
    * @param {string} [params.size] - Size that the environment should be increased to. Environment size cannot be
    * modified when using a Lite plan. Environment size can only increased and not decreased.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def updateEnvironment(params: UpdateEnvironmentParams): js.Promise[_] | Unit = js.native
  def updateEnvironment(params: UpdateEnvironmentParams, callback: Callback[Environment]): js.Promise[_] | Unit = js.native
  /**
    * Change label or cross reference for example.
    *
    * Changes the label or cross reference query for this training data example.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.environment_id - The ID of the environment.
    * @param {string} params.collection_id - The ID of the collection.
    * @param {string} params.query_id - The ID of the query used for training.
    * @param {string} params.example_id - The ID of the document as it is indexed.
    * @param {string} [params.cross_reference] - The example to add.
    * @param {number} [params.relevance] - The relevance value for this example.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def updateTrainingExample(params: UpdateTrainingExampleParams): js.Promise[_] | Unit = js.native
  def updateTrainingExample(params: UpdateTrainingExampleParams, callback: Callback[TrainingExample]): js.Promise[_] | Unit = js.native
}

