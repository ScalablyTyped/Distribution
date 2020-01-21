package typings.watsonDeveloperCloud.compareComplyV1Mod

import typings.ibmCloudSdkCore.mod.BaseService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IBM Watson&trade; Compare and Comply analyzes governing documents to provide details about critical aspects of the documents.
  */
@js.native
trait CompareComplyV1 extends BaseService {
  /*************************
    * feedback
    ************************/
  /**
    * Add feedback.
    *
    * Adds feedback in the form of _labels_ from a subject-matter expert (SME) to a governing document.
    * **Important:** Feedback is not immediately incorporated into the training model, nor is it guaranteed to be
    * incorporated at a later date. Instead, submitted feedback is used to suggest future updates to the training model.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {FeedbackDataInput} params.feedback_data - Feedback data for submission.
    * @param {string} [params.user_id] - An optional string identifying the user.
    * @param {string} [params.comment] - An optional comment on or description of the feedback.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def addFeedback(params: AddFeedbackParams): js.Promise[_] | Unit = js.native
  def addFeedback(params: AddFeedbackParams, callback: Callback[FeedbackReturn]): js.Promise[_] | Unit = js.native
  /*************************
    * elementClassification
    ************************/
  /**
    * Classify the elements of a document.
    *
    * Analyzes the structural and semantic elements of a document.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {NodeJS.ReadableStream|FileObject|Buffer} params.file - The document to classify.
    * @param {string} [params.file_content_type] - The content type of file.
    * @param {string} [params.model] - The analysis model to be used by the service. For the **Element classification**
    * and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default
    * is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing
    * requests.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def classifyElements(params: ClassifyElementsParams): js.Promise[_] | Unit = js.native
  def classifyElements(params: ClassifyElementsParams, callback: Callback[ClassifyReturn]): js.Promise[_] | Unit = js.native
  /*************************
    * comparison
    ************************/
  /**
    * Compare two documents.
    *
    * Compares two input documents. Documents must be in the same format.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {NodeJS.ReadableStream|FileObject|Buffer} params.file_1 - The first document to compare.
    * @param {NodeJS.ReadableStream|FileObject|Buffer} params.file_2 - The second document to compare.
    * @param {string} [params.file_1_content_type] - The content type of file_1.
    * @param {string} [params.file_2_content_type] - The content type of file_2.
    * @param {string} [params.file_1_label] - A text label for the first document.
    * @param {string} [params.file_2_label] - A text label for the second document.
    * @param {string} [params.model] - The analysis model to be used by the service. For the **Element classification**
    * and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default
    * is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing
    * requests.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def compareDocuments(params: CompareDocumentsParams): js.Promise[_] | Unit = js.native
  def compareDocuments(params: CompareDocumentsParams, callback: Callback[CompareReturn]): js.Promise[_] | Unit = js.native
  /*************************
    * hTMLConversion
    ************************/
  /**
    * Convert document to HTML.
    *
    * Converts a document to HTML.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {NodeJS.ReadableStream|FileObject|Buffer} params.file - The document to convert.
    * @param {string} params.filename - The filename for file.
    * @param {string} [params.file_content_type] - The content type of file.
    * @param {string} [params.model] - The analysis model to be used by the service. For the **Element classification**
    * and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default
    * is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing
    * requests.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def convertToHtml(params: ConvertToHtmlParams): js.Promise[_] | Unit = js.native
  def convertToHtml(params: ConvertToHtmlParams, callback: Callback[HTMLReturn]): js.Promise[_] | Unit = js.native
  /*************************
    * batches
    ************************/
  /**
    * Submit a batch-processing request.
    *
    * Run Compare and Comply methods over a collection of input documents.
    * **Important:** Batch processing requires the use of the [IBM Cloud Object Storage
    * service](https://cloud.ibm.com/docs/services/cloud-object-storage/about-cos.html#about-ibm-cloud-object-storage).
    * The use of IBM Cloud Object Storage with Compare and Comply is discussed at [Using batch
    * processing](https://cloud.ibm.com/docs/services/compare-comply/batching.html#before-you-batch).
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params._function - The Compare and Comply method to run across the submitted input documents.
    * @param {NodeJS.ReadableStream|FileObject|Buffer} params.input_credentials_file - A JSON file containing the input
    * Cloud Object Storage credentials. At a minimum, the credentials must enable `READ` permissions on the bucket
    * defined by the `input_bucket_name` parameter.
    * @param {string} params.input_bucket_location - The geographical location of the Cloud Object Storage input bucket
    * as listed on the **Endpoint** tab of your Cloud Object Storage instance; for example, `us-geo`, `eu-geo`, or
    * `ap-geo`.
    * @param {string} params.input_bucket_name - The name of the Cloud Object Storage input bucket.
    * @param {NodeJS.ReadableStream|FileObject|Buffer} params.output_credentials_file - A JSON file that lists the Cloud
    * Object Storage output credentials. At a minimum, the credentials must enable `READ` and `WRITE` permissions on the
    * bucket defined by the `output_bucket_name` parameter.
    * @param {string} params.output_bucket_location - The geographical location of the Cloud Object Storage output bucket
    * as listed on the **Endpoint** tab of your Cloud Object Storage instance; for example, `us-geo`, `eu-geo`, or
    * `ap-geo`.
    * @param {string} params.output_bucket_name - The name of the Cloud Object Storage output bucket.
    * @param {string} [params.model] - The analysis model to be used by the service. For the **Element classification**
    * and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default
    * is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing
    * requests.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def createBatch(params: CreateBatchParams): js.Promise[_] | Unit = js.native
  def createBatch(params: CreateBatchParams, callback: Callback[BatchStatus]): js.Promise[_] | Unit = js.native
  /**
    * Delete a specified feedback entry.
    *
    * Deletes a feedback entry with a specified `feedback_id`.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.feedback_id - A string that specifies the feedback entry to be deleted from the document.
    * @param {string} [params.model] - The analysis model to be used by the service. For the **Element classification**
    * and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default
    * is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing
    * requests.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def deleteFeedback(params: DeleteFeedbackParams): js.Promise[_] | Unit = js.native
  def deleteFeedback(params: DeleteFeedbackParams, callback: Callback[FeedbackDeleted]): js.Promise[_] | Unit = js.native
  /*************************
    * tables
    ************************/
  /**
    * Extract a document's tables.
    *
    * Analyzes the tables in a document.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {NodeJS.ReadableStream|FileObject|Buffer} params.file - The document on which to run table extraction.
    * @param {string} [params.file_content_type] - The content type of file.
    * @param {string} [params.model] - The analysis model to be used by the service. For the **Element classification**
    * and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default
    * is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing
    * requests.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def extractTables(params: ExtractTablesParams): js.Promise[_] | Unit = js.native
  def extractTables(params: ExtractTablesParams, callback: Callback[TableReturn]): js.Promise[_] | Unit = js.native
  /**
    * Get information about a specific batch-processing job.
    *
    * Gets information about a batch-processing job with a specified ID.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.batch_id - The ID of the batch-processing job whose information you want to retrieve.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def getBatch(params: GetBatchParams): js.Promise[_] | Unit = js.native
  def getBatch(params: GetBatchParams, callback: Callback[BatchStatus]): js.Promise[_] | Unit = js.native
  /**
    * List a specified feedback entry.
    *
    * Lists a feedback entry with a specified `feedback_id`.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.feedback_id - A string that specifies the feedback entry to be included in the output.
    * @param {string} [params.model] - The analysis model to be used by the service. For the **Element classification**
    * and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default
    * is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing
    * requests.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def getFeedback(params: GetFeedbackParams): js.Promise[_] | Unit = js.native
  def getFeedback(params: GetFeedbackParams, callback: Callback[GetFeedback]): js.Promise[_] | Unit = js.native
  /**
    * List submitted batch-processing jobs.
    *
    * Lists batch-processing jobs submitted by users.
    *
    * @param {Object} [params] - The parameters to send to the service.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def listBatches(): js.Promise[_] | Unit = js.native
  def listBatches(params: ListBatchesParams): js.Promise[_] | Unit = js.native
  def listBatches(params: ListBatchesParams, callback: Callback[Batches]): js.Promise[_] | Unit = js.native
  /**
    * List the feedback in a document.
    *
    * Lists the feedback in a document.
    *
    * @param {Object} [params] - The parameters to send to the service.
    * @param {string} [params.feedback_type] - An optional string that filters the output to include only feedback with
    * the specified feedback type. The only permitted value is `element_classification`.
    * @param {string} [params.before] - An optional string in the format `YYYY-MM-DD` that filters the output to include
    * only feedback that was added before the specified date.
    * @param {string} [params.after] - An optional string in the format `YYYY-MM-DD` that filters the output to include
    * only feedback that was added after the specified date.
    * @param {string} [params.document_title] - An optional string that filters the output to include only feedback from
    * the document with the specified `document_title`.
    * @param {string} [params.model_id] - An optional string that filters the output to include only feedback with the
    * specified `model_id`. The only permitted value is `contracts`.
    * @param {string} [params.model_version] - An optional string that filters the output to include only feedback with
    * the specified `model_version`.
    * @param {string} [params.category_removed] - An optional string in the form of a comma-separated list of categories.
    * If this is specified, the service filters the output to include only feedback that has at least one category from
    * the list removed.
    * @param {string} [params.category_added] - An optional string in the form of a comma-separated list of categories.
    * If this is specified, the service filters the output to include only feedback that has at least one category from
    * the list added.
    * @param {string} [params.category_not_changed] - An optional string in the form of a comma-separated list of
    * categories. If this is specified, the service filters the output to include only feedback that has at least one
    * category from the list unchanged.
    * @param {string} [params.type_removed] - An optional string of comma-separated `nature`:`party` pairs. If this is
    * specified, the service filters the output to include only feedback that has at least one `nature`:`party` pair from
    * the list removed.
    * @param {string} [params.type_added] - An optional string of comma-separated `nature`:`party` pairs. If this is
    * specified, the service filters the output to include only feedback that has at least one `nature`:`party` pair from
    * the list removed.
    * @param {string} [params.type_not_changed] - An optional string of comma-separated `nature`:`party` pairs. If this
    * is specified, the service filters the output to include only feedback that has at least one `nature`:`party` pair
    * from the list unchanged.
    * @param {number} [params.page_limit] - An optional integer specifying the number of documents that you want the
    * service to return.
    * @param {string} [params.cursor] - An optional string that returns the set of documents after the previous set. Use
    * this parameter with the `page_limit` parameter.
    * @param {string} [params.sort] - An optional comma-separated list of fields in the document to sort on. You can
    * optionally specify the sort direction by prefixing the value of the field with `-` for descending order or `+` for
    * ascending order (the default). Currently permitted sorting fields are `created`, `user_id`, and `document_title`.
    * @param {boolean} [params.include_total] - An optional boolean value. If specified as `true`, the `pagination`
    * object in the output includes a value called `total` that gives the total count of feedback created.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def listFeedback(): js.Promise[_] | Unit = js.native
  def listFeedback(params: ListFeedbackParams): js.Promise[_] | Unit = js.native
  def listFeedback(params: ListFeedbackParams, callback: Callback[FeedbackList]): js.Promise[_] | Unit = js.native
  /**
    * Update a pending or active batch-processing job.
    *
    * Updates a pending or active batch-processing job. You can rescan the input bucket to check for new documents or
    * cancel a job.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.batch_id - The ID of the batch-processing job you want to update.
    * @param {string} params.action - The action you want to perform on the specified batch-processing job.
    * @param {string} [params.model] - The analysis model to be used by the service. For the **Element classification**
    * and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default
    * is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing
    * requests.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def updateBatch(params: UpdateBatchParams): js.Promise[_] | Unit = js.native
  def updateBatch(params: UpdateBatchParams, callback: Callback[BatchStatus]): js.Promise[_] | Unit = js.native
}

