package typings.watsonDeveloperCloud.sdkMod

import typings.watsonDeveloperCloud.compareComplyV1Mod.Options
import typings.watsonDeveloperCloud.compareComplyV1Mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IBM Watson&trade; Compare and Comply analyzes governing documents to provide details about critical aspects of the documents.
  */
@JSImport("watson-developer-cloud/sdk", "CompareComplyV1")
@js.native
class CompareComplyV1 protected () extends ^ {
  /**
    * Construct a CompareComplyV1 object.
    *
    * @param {Object} options - Options for the service.
    * @param {string} options.version - The API version date to use with the service, in "YYYY-MM-DD" format. Whenever the API is changed in a backwards incompatible way, a new minor version of the API is released. The service uses the API version for the date you specify, or the most recent version before that date. Note that you should not programmatically specify the current date at runtime, in case the API has been updated since your application's release. Instead, specify a version date that is compatible with your application, and don't change it until your application is ready for a later version.
    * @param {string} [options.url] - The base url to use when contacting the service (e.g. 'https://gateway.watsonplatform.net/compare-comply/api'). The base url may differ between Bluemix regions.
    * @param {string} [options.iam_access_token] - An IAM access token fully managed by the application. Responsibility falls on the application to refresh the token, either before it expires or reactively upon receiving a 401 from the service, as any requests made with an expired token will fail.
    * @param {string} [options.iam_apikey] - An API key that can be used to request IAM tokens. If this API key is provided, the SDK will manage the token and handle the refreshing.
    * @param {string} [options.iam_url] - An optional URL for the IAM service API. Defaults to 'https://iam.bluemix.net/identity/token'.
    * @param {boolean} [options.use_unauthenticated] - Set to `true` to avoid including an authorization header. This option may be useful for requests that are proxied.
    * @param {Object} [options.headers] - Default headers that shall be included with every request to the service.
    * @param {boolean} [options.headers.X-Watson-Learning-Opt-Out] - Set to `true` to opt-out of data collection. By default, all IBM Watson services log requests and their results. Logging is done only to improve the services for future users. The logged data is not shared or made public. If you are concerned with protecting the privacy of users' personal information or otherwise do not want your requests to be logged, you can opt out of logging.
    * @constructor
    * @returns {CompareComplyV1}
    * @throws {Error}
    */
  def this(options: Options) = this()
}
object CompareComplyV1 {
  
  @JSImport("watson-developer-cloud/sdk", "CompareComplyV1")
  @js.native
  val ^ : js.Any = js.native
  
  /** Constants for the `classifyElements` operation. */
  object ClassifyElementsConstants {
    
    /** The content type of file. */
    @JSImport("watson-developer-cloud/sdk", "CompareComplyV1.ClassifyElementsConstants.FileContentType")
    @js.native
    object FileContentType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.compareComplyV1Mod.ClassifyElementsConstants.FileContentType with String
          ] = js.native
      
      /* "application/msword" */ val APPLICATION_MSWORD: typings.watsonDeveloperCloud.compareComplyV1Mod.ClassifyElementsConstants.FileContentType.APPLICATION_MSWORD with String = js.native
      
      /* "application/pdf" */ val APPLICATION_PDF: typings.watsonDeveloperCloud.compareComplyV1Mod.ClassifyElementsConstants.FileContentType.APPLICATION_PDF with String = js.native
      
      /* "application/vnd.openxmlformats-officedocument.wordprocessingml.document" */ val APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT: typings.watsonDeveloperCloud.compareComplyV1Mod.ClassifyElementsConstants.FileContentType.APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT with String = js.native
      
      /* "image/bmp" */ val IMAGE_BMP: typings.watsonDeveloperCloud.compareComplyV1Mod.ClassifyElementsConstants.FileContentType.IMAGE_BMP with String = js.native
      
      /* "image/gif" */ val IMAGE_GIF: typings.watsonDeveloperCloud.compareComplyV1Mod.ClassifyElementsConstants.FileContentType.IMAGE_GIF with String = js.native
      
      /* "image/jpeg" */ val IMAGE_JPEG: typings.watsonDeveloperCloud.compareComplyV1Mod.ClassifyElementsConstants.FileContentType.IMAGE_JPEG with String = js.native
      
      /* "image/png" */ val IMAGE_PNG: typings.watsonDeveloperCloud.compareComplyV1Mod.ClassifyElementsConstants.FileContentType.IMAGE_PNG with String = js.native
      
      /* "image/tiff" */ val IMAGE_TIFF: typings.watsonDeveloperCloud.compareComplyV1Mod.ClassifyElementsConstants.FileContentType.IMAGE_TIFF with String = js.native
    }
    
    /** The analysis model to be used by the service. For the **Element classification** and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing requests. */
    @JSImport("watson-developer-cloud/sdk", "CompareComplyV1.ClassifyElementsConstants.Model")
    @js.native
    object Model extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.compareComplyV1Mod.ClassifyElementsConstants.Model with String
          ] = js.native
      
      /* "contracts" */ val CONTRACTS: typings.watsonDeveloperCloud.compareComplyV1Mod.ClassifyElementsConstants.Model.CONTRACTS with String = js.native
      
      /* "tables" */ val TABLES: typings.watsonDeveloperCloud.compareComplyV1Mod.ClassifyElementsConstants.Model.TABLES with String = js.native
    }
  }
  
  /** Constants for the `compareDocuments` operation. */
  object CompareDocumentsConstants {
    
    /** The content type of file_1. */
    @JSImport("watson-developer-cloud/sdk", "CompareComplyV1.CompareDocumentsConstants.File1ContentType")
    @js.native
    object File1ContentType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File1ContentType with String
          ] = js.native
      
      /* "application/json" */ val APPLICATION_JSON: typings.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File1ContentType.APPLICATION_JSON with String = js.native
      
      /* "application/msword" */ val APPLICATION_MSWORD: typings.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File1ContentType.APPLICATION_MSWORD with String = js.native
      
      /* "application/pdf" */ val APPLICATION_PDF: typings.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File1ContentType.APPLICATION_PDF with String = js.native
      
      /* "application/vnd.openxmlformats-officedocument.wordprocessingml.document" */ val APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT: typings.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File1ContentType.APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT with String = js.native
      
      /* "image/bmp" */ val IMAGE_BMP: typings.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File1ContentType.IMAGE_BMP with String = js.native
      
      /* "image/gif" */ val IMAGE_GIF: typings.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File1ContentType.IMAGE_GIF with String = js.native
      
      /* "image/jpeg" */ val IMAGE_JPEG: typings.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File1ContentType.IMAGE_JPEG with String = js.native
      
      /* "image/png" */ val IMAGE_PNG: typings.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File1ContentType.IMAGE_PNG with String = js.native
      
      /* "image/tiff" */ val IMAGE_TIFF: typings.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File1ContentType.IMAGE_TIFF with String = js.native
    }
    
    /** The content type of file_2. */
    @JSImport("watson-developer-cloud/sdk", "CompareComplyV1.CompareDocumentsConstants.File2ContentType")
    @js.native
    object File2ContentType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File2ContentType with String
          ] = js.native
      
      /* "application/json" */ val APPLICATION_JSON: typings.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File2ContentType.APPLICATION_JSON with String = js.native
      
      /* "application/msword" */ val APPLICATION_MSWORD: typings.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File2ContentType.APPLICATION_MSWORD with String = js.native
      
      /* "application/pdf" */ val APPLICATION_PDF: typings.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File2ContentType.APPLICATION_PDF with String = js.native
      
      /* "application/vnd.openxmlformats-officedocument.wordprocessingml.document" */ val APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT: typings.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File2ContentType.APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT with String = js.native
      
      /* "image/bmp" */ val IMAGE_BMP: typings.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File2ContentType.IMAGE_BMP with String = js.native
      
      /* "image/gif" */ val IMAGE_GIF: typings.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File2ContentType.IMAGE_GIF with String = js.native
      
      /* "image/jpeg" */ val IMAGE_JPEG: typings.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File2ContentType.IMAGE_JPEG with String = js.native
      
      /* "image/png" */ val IMAGE_PNG: typings.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File2ContentType.IMAGE_PNG with String = js.native
      
      /* "image/tiff" */ val IMAGE_TIFF: typings.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File2ContentType.IMAGE_TIFF with String = js.native
    }
    
    /** The analysis model to be used by the service. For the **Element classification** and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing requests. */
    @JSImport("watson-developer-cloud/sdk", "CompareComplyV1.CompareDocumentsConstants.Model")
    @js.native
    object Model extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.Model with String
          ] = js.native
      
      /* "contracts" */ val CONTRACTS: typings.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.Model.CONTRACTS with String = js.native
      
      /* "tables" */ val TABLES: typings.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.Model.TABLES with String = js.native
    }
  }
  
  /** Constants for the `convertToHtml` operation. */
  object ConvertToHtmlConstants {
    
    /** The content type of file. */
    @JSImport("watson-developer-cloud/sdk", "CompareComplyV1.ConvertToHtmlConstants.FileContentType")
    @js.native
    object FileContentType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.compareComplyV1Mod.ConvertToHtmlConstants.FileContentType with String
          ] = js.native
      
      /* "application/msword" */ val APPLICATION_MSWORD: typings.watsonDeveloperCloud.compareComplyV1Mod.ConvertToHtmlConstants.FileContentType.APPLICATION_MSWORD with String = js.native
      
      /* "application/pdf" */ val APPLICATION_PDF: typings.watsonDeveloperCloud.compareComplyV1Mod.ConvertToHtmlConstants.FileContentType.APPLICATION_PDF with String = js.native
      
      /* "application/vnd.openxmlformats-officedocument.wordprocessingml.document" */ val APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT: typings.watsonDeveloperCloud.compareComplyV1Mod.ConvertToHtmlConstants.FileContentType.APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT with String = js.native
      
      /* "image/bmp" */ val IMAGE_BMP: typings.watsonDeveloperCloud.compareComplyV1Mod.ConvertToHtmlConstants.FileContentType.IMAGE_BMP with String = js.native
      
      /* "image/gif" */ val IMAGE_GIF: typings.watsonDeveloperCloud.compareComplyV1Mod.ConvertToHtmlConstants.FileContentType.IMAGE_GIF with String = js.native
      
      /* "image/jpeg" */ val IMAGE_JPEG: typings.watsonDeveloperCloud.compareComplyV1Mod.ConvertToHtmlConstants.FileContentType.IMAGE_JPEG with String = js.native
      
      /* "image/png" */ val IMAGE_PNG: typings.watsonDeveloperCloud.compareComplyV1Mod.ConvertToHtmlConstants.FileContentType.IMAGE_PNG with String = js.native
      
      /* "image/tiff" */ val IMAGE_TIFF: typings.watsonDeveloperCloud.compareComplyV1Mod.ConvertToHtmlConstants.FileContentType.IMAGE_TIFF with String = js.native
      
      /* "text/plain" */ val TEXT_PLAIN: typings.watsonDeveloperCloud.compareComplyV1Mod.ConvertToHtmlConstants.FileContentType.TEXT_PLAIN with String = js.native
    }
    
    /** The analysis model to be used by the service. For the **Element classification** and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing requests. */
    @JSImport("watson-developer-cloud/sdk", "CompareComplyV1.ConvertToHtmlConstants.Model")
    @js.native
    object Model extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.compareComplyV1Mod.ConvertToHtmlConstants.Model with String
          ] = js.native
      
      /* "contracts" */ val CONTRACTS: typings.watsonDeveloperCloud.compareComplyV1Mod.ConvertToHtmlConstants.Model.CONTRACTS with String = js.native
      
      /* "tables" */ val TABLES: typings.watsonDeveloperCloud.compareComplyV1Mod.ConvertToHtmlConstants.Model.TABLES with String = js.native
    }
  }
  
  /** Constants for the `createBatch` operation. */
  object CreateBatchConstants {
    
    /** The Compare and Comply method to run across the submitted input documents. */
    @JSImport("watson-developer-cloud/sdk", "CompareComplyV1.CreateBatchConstants.Function")
    @js.native
    object Function extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.compareComplyV1Mod.CreateBatchConstants.Function with String
          ] = js.native
      
      /* "element_classification" */ val ELEMENT_CLASSIFICATION: typings.watsonDeveloperCloud.compareComplyV1Mod.CreateBatchConstants.Function.ELEMENT_CLASSIFICATION with String = js.native
      
      /* "html_conversion" */ val HTML_CONVERSION: typings.watsonDeveloperCloud.compareComplyV1Mod.CreateBatchConstants.Function.HTML_CONVERSION with String = js.native
      
      /* "tables" */ val TABLES: typings.watsonDeveloperCloud.compareComplyV1Mod.CreateBatchConstants.Function.TABLES with String = js.native
    }
    
    /** The analysis model to be used by the service. For the **Element classification** and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing requests. */
    @JSImport("watson-developer-cloud/sdk", "CompareComplyV1.CreateBatchConstants.Model")
    @js.native
    object Model extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.compareComplyV1Mod.CreateBatchConstants.Model with String
          ] = js.native
      
      /* "contracts" */ val CONTRACTS: typings.watsonDeveloperCloud.compareComplyV1Mod.CreateBatchConstants.Model.CONTRACTS with String = js.native
      
      /* "tables" */ val TABLES: typings.watsonDeveloperCloud.compareComplyV1Mod.CreateBatchConstants.Model.TABLES with String = js.native
    }
  }
  
  /** Constants for the `deleteFeedback` operation. */
  object DeleteFeedbackConstants {
    
    /** The analysis model to be used by the service. For the **Element classification** and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing requests. */
    @JSImport("watson-developer-cloud/sdk", "CompareComplyV1.DeleteFeedbackConstants.Model")
    @js.native
    object Model extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.compareComplyV1Mod.DeleteFeedbackConstants.Model with String
          ] = js.native
      
      /* "contracts" */ val CONTRACTS: typings.watsonDeveloperCloud.compareComplyV1Mod.DeleteFeedbackConstants.Model.CONTRACTS with String = js.native
      
      /* "tables" */ val TABLES: typings.watsonDeveloperCloud.compareComplyV1Mod.DeleteFeedbackConstants.Model.TABLES with String = js.native
    }
  }
  
  /** Constants for the `extractTables` operation. */
  object ExtractTablesConstants {
    
    /** The content type of file. */
    @JSImport("watson-developer-cloud/sdk", "CompareComplyV1.ExtractTablesConstants.FileContentType")
    @js.native
    object FileContentType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.compareComplyV1Mod.ExtractTablesConstants.FileContentType with String
          ] = js.native
      
      /* "application/msword" */ val APPLICATION_MSWORD: typings.watsonDeveloperCloud.compareComplyV1Mod.ExtractTablesConstants.FileContentType.APPLICATION_MSWORD with String = js.native
      
      /* "application/pdf" */ val APPLICATION_PDF: typings.watsonDeveloperCloud.compareComplyV1Mod.ExtractTablesConstants.FileContentType.APPLICATION_PDF with String = js.native
      
      /* "application/vnd.openxmlformats-officedocument.wordprocessingml.document" */ val APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT: typings.watsonDeveloperCloud.compareComplyV1Mod.ExtractTablesConstants.FileContentType.APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT with String = js.native
      
      /* "image/bmp" */ val IMAGE_BMP: typings.watsonDeveloperCloud.compareComplyV1Mod.ExtractTablesConstants.FileContentType.IMAGE_BMP with String = js.native
      
      /* "image/gif" */ val IMAGE_GIF: typings.watsonDeveloperCloud.compareComplyV1Mod.ExtractTablesConstants.FileContentType.IMAGE_GIF with String = js.native
      
      /* "image/jpeg" */ val IMAGE_JPEG: typings.watsonDeveloperCloud.compareComplyV1Mod.ExtractTablesConstants.FileContentType.IMAGE_JPEG with String = js.native
      
      /* "image/png" */ val IMAGE_PNG: typings.watsonDeveloperCloud.compareComplyV1Mod.ExtractTablesConstants.FileContentType.IMAGE_PNG with String = js.native
      
      /* "image/tiff" */ val IMAGE_TIFF: typings.watsonDeveloperCloud.compareComplyV1Mod.ExtractTablesConstants.FileContentType.IMAGE_TIFF with String = js.native
      
      /* "text/plain" */ val TEXT_PLAIN: typings.watsonDeveloperCloud.compareComplyV1Mod.ExtractTablesConstants.FileContentType.TEXT_PLAIN with String = js.native
    }
    
    /** The analysis model to be used by the service. For the **Element classification** and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing requests. */
    @JSImport("watson-developer-cloud/sdk", "CompareComplyV1.ExtractTablesConstants.Model")
    @js.native
    object Model extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.compareComplyV1Mod.ExtractTablesConstants.Model with String
          ] = js.native
      
      /* "contracts" */ val CONTRACTS: typings.watsonDeveloperCloud.compareComplyV1Mod.ExtractTablesConstants.Model.CONTRACTS with String = js.native
      
      /* "tables" */ val TABLES: typings.watsonDeveloperCloud.compareComplyV1Mod.ExtractTablesConstants.Model.TABLES with String = js.native
    }
  }
  
  /** Constants for the `getFeedback` operation. */
  object GetFeedbackConstants {
    
    /** The analysis model to be used by the service. For the **Element classification** and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing requests. */
    @JSImport("watson-developer-cloud/sdk", "CompareComplyV1.GetFeedbackConstants.Model")
    @js.native
    object Model extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.compareComplyV1Mod.GetFeedbackConstants.Model with String
          ] = js.native
      
      /* "contracts" */ val CONTRACTS: typings.watsonDeveloperCloud.compareComplyV1Mod.GetFeedbackConstants.Model.CONTRACTS with String = js.native
      
      /* "tables" */ val TABLES: typings.watsonDeveloperCloud.compareComplyV1Mod.GetFeedbackConstants.Model.TABLES with String = js.native
    }
  }
  
  /* static member */
  @JSImport("watson-developer-cloud/sdk", "CompareComplyV1.URL")
  @js.native
  def URL: String = js.native
  @scala.inline
  def URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("URL")(x.asInstanceOf[js.Any])
  
  /** Constants for the `updateBatch` operation. */
  object UpdateBatchConstants {
    
    /** The action you want to perform on the specified batch-processing job. */
    @JSImport("watson-developer-cloud/sdk", "CompareComplyV1.UpdateBatchConstants.Action")
    @js.native
    object Action extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.compareComplyV1Mod.UpdateBatchConstants.Action with String
          ] = js.native
      
      /* "cancel" */ val CANCEL: typings.watsonDeveloperCloud.compareComplyV1Mod.UpdateBatchConstants.Action.CANCEL with String = js.native
      
      /* "rescan" */ val RESCAN: typings.watsonDeveloperCloud.compareComplyV1Mod.UpdateBatchConstants.Action.RESCAN with String = js.native
    }
    
    /** The analysis model to be used by the service. For the **Element classification** and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing requests. */
    @JSImport("watson-developer-cloud/sdk", "CompareComplyV1.UpdateBatchConstants.Model")
    @js.native
    object Model extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.compareComplyV1Mod.UpdateBatchConstants.Model with String
          ] = js.native
      
      /* "contracts" */ val CONTRACTS: typings.watsonDeveloperCloud.compareComplyV1Mod.UpdateBatchConstants.Model.CONTRACTS with String = js.native
      
      /* "tables" */ val TABLES: typings.watsonDeveloperCloud.compareComplyV1Mod.UpdateBatchConstants.Model.TABLES with String = js.native
    }
  }
}
