package typings.watsonDeveloperCloud.sdkMod

import typings.watsonDeveloperCloud.v1GeneratedMod.Options
import typings.watsonDeveloperCloud.v1GeneratedMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The IBM Watson&trade; Discovery Service is a cognitive search and content analytics engine that you can add to applications to identify patterns, trends and actionable insights to drive better decision-making. Securely unify structured and unstructured data with pre-enriched content, and use a simplified query language to eliminate the need for manual filtering of results.
  */
@JSImport("watson-developer-cloud/sdk", "DiscoveryV1")
@js.native
class DiscoveryV1 protected () extends ^ {
  /**
    * Construct a DiscoveryV1 object.
    *
    * @param {Object} options - Options for the service.
    * @param {string} options.version - The API version date to use with the service, in "YYYY-MM-DD" format. Whenever the API is changed in a backwards incompatible way, a new minor version of the API is released. The service uses the API version for the date you specify, or the most recent version before that date. Note that you should not programmatically specify the current date at runtime, in case the API has been updated since your application's release. Instead, specify a version date that is compatible with your application, and don't change it until your application is ready for a later version.
    * @param {string} [options.url] - The base url to use when contacting the service (e.g. 'https://gateway.watsonplatform.net/discovery/api'). The base url may differ between Bluemix regions.
    * @param {string} [options.username] - The username used to authenticate with the service. Username and password credentials are only required to run your application locally or outside of Bluemix. When running on Bluemix, the credentials will be automatically loaded from the `VCAP_SERVICES` environment variable.
    * @param {string} [options.password] - The password used to authenticate with the service. Username and password credentials are only required to run your application locally or outside of Bluemix. When running on Bluemix, the credentials will be automatically loaded from the `VCAP_SERVICES` environment variable.
    * @param {string} [options.iam_access_token] - An IAM access token fully managed by the application. Responsibility falls on the application to refresh the token, either before it expires or reactively upon receiving a 401 from the service, as any requests made with an expired token will fail.
    * @param {string} [options.iam_apikey] - An API key that can be used to request IAM tokens. If this API key is provided, the SDK will manage the token and handle the refreshing.
    * @param {string} [options.iam_url] - An optional URL for the IAM service API. Defaults to 'https://iam.bluemix.net/identity/token'.
    * @param {boolean} [options.use_unauthenticated] - Set to `true` to avoid including an authorization header. This option may be useful for requests that are proxied.
    * @param {Object} [options.headers] - Default headers that shall be included with every request to the service.
    * @param {boolean} [options.headers.X-Watson-Learning-Opt-Out] - Set to `true` to opt-out of data collection. By default, all IBM Watson services log requests and their results. Logging is done only to improve the services for future users. The logged data is not shared or made public. If you are concerned with protecting the privacy of users' personal information or otherwise do not want your requests to be logged, you can opt out of logging.
    * @constructor
    * @returns {DiscoveryV1}
    * @throws {Error}
    */
  def this(options: Options) = this()
}
object DiscoveryV1 {
  
  @JSImport("watson-developer-cloud/sdk", "DiscoveryV1")
  @js.native
  val ^ : js.Any = js.native
  
  /** Constants for the `addDocument` operation. */
  object AddDocumentConstants {
    
    /** The content type of file. */
    @JSImport("watson-developer-cloud/sdk", "DiscoveryV1.AddDocumentConstants.FileContentType")
    @js.native
    object FileContentType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.v1GeneratedMod.AddDocumentConstants.FileContentType & String
          ] = js.native
      
      /* "application/json" */ val APPLICATION_JSON: typings.watsonDeveloperCloud.v1GeneratedMod.AddDocumentConstants.FileContentType.APPLICATION_JSON & String = js.native
      
      /* "application/msword" */ val APPLICATION_MSWORD: typings.watsonDeveloperCloud.v1GeneratedMod.AddDocumentConstants.FileContentType.APPLICATION_MSWORD & String = js.native
      
      /* "application/pdf" */ val APPLICATION_PDF: typings.watsonDeveloperCloud.v1GeneratedMod.AddDocumentConstants.FileContentType.APPLICATION_PDF & String = js.native
      
      /* "application/vnd.openxmlformats-officedocument.wordprocessingml.document" */ val APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT: typings.watsonDeveloperCloud.v1GeneratedMod.AddDocumentConstants.FileContentType.APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT & String = js.native
      
      /* "application/xhtml+xml" */ val APPLICATION_XHTML_XML: typings.watsonDeveloperCloud.v1GeneratedMod.AddDocumentConstants.FileContentType.APPLICATION_XHTML_XML & String = js.native
      
      /* "text/html" */ val TEXT_HTML: typings.watsonDeveloperCloud.v1GeneratedMod.AddDocumentConstants.FileContentType.TEXT_HTML & String = js.native
    }
  }
  
  /** Constants for the `createCollection` operation. */
  object CreateCollectionConstants {
    
    /** The language of the documents stored in the collection, in the form of an ISO 639-1 language code. */
    @JSImport("watson-developer-cloud/sdk", "DiscoveryV1.CreateCollectionConstants.Language")
    @js.native
    object Language extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.v1GeneratedMod.CreateCollectionConstants.Language & String
          ] = js.native
      
      /* "ar" */ val AR: typings.watsonDeveloperCloud.v1GeneratedMod.CreateCollectionConstants.Language.AR & String = js.native
      
      /* "de" */ val DE: typings.watsonDeveloperCloud.v1GeneratedMod.CreateCollectionConstants.Language.DE & String = js.native
      
      /* "en" */ val EN: typings.watsonDeveloperCloud.v1GeneratedMod.CreateCollectionConstants.Language.EN & String = js.native
      
      /* "es" */ val ES: typings.watsonDeveloperCloud.v1GeneratedMod.CreateCollectionConstants.Language.ES & String = js.native
      
      /* "fr" */ val FR: typings.watsonDeveloperCloud.v1GeneratedMod.CreateCollectionConstants.Language.FR & String = js.native
      
      /* "it" */ val IT: typings.watsonDeveloperCloud.v1GeneratedMod.CreateCollectionConstants.Language.IT & String = js.native
      
      /* "ja" */ val JA: typings.watsonDeveloperCloud.v1GeneratedMod.CreateCollectionConstants.Language.JA & String = js.native
      
      /* "ko" */ val KO: typings.watsonDeveloperCloud.v1GeneratedMod.CreateCollectionConstants.Language.KO & String = js.native
      
      /* "nl" */ val NL: typings.watsonDeveloperCloud.v1GeneratedMod.CreateCollectionConstants.Language.NL & String = js.native
      
      /* "pt" */ val PT: typings.watsonDeveloperCloud.v1GeneratedMod.CreateCollectionConstants.Language.PT & String = js.native
      
      /* "zh-CN" */ val ZH_CN: typings.watsonDeveloperCloud.v1GeneratedMod.CreateCollectionConstants.Language.ZH_CN & String = js.native
    }
  }
  
  /** Constants for the `createCredentials` operation. */
  object CreateCredentialsConstants {
    
    /** The source that this credentials object connects to. -  `box` indicates the credentials are used to connect an instance of Enterprise Box. -  `salesforce` indicates the credentials are used to connect to Salesforce. -  `sharepoint` indicates the credentials are used to connect to Microsoft SharePoint Online. -  `web_crawl` indicates the credentials are used to perform a web crawl. =  `cloud_object_storage` indicates the credentials are used to connect to an IBM Cloud Object Store. */
    @JSImport("watson-developer-cloud/sdk", "DiscoveryV1.CreateCredentialsConstants.SourceType")
    @js.native
    object SourceType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.v1GeneratedMod.CreateCredentialsConstants.SourceType & String
          ] = js.native
      
      /* "box" */ val BOX: typings.watsonDeveloperCloud.v1GeneratedMod.CreateCredentialsConstants.SourceType.BOX & String = js.native
      
      /* "cloud_object_storage" */ val CLOUD_OBJECT_STORAGE: typings.watsonDeveloperCloud.v1GeneratedMod.CreateCredentialsConstants.SourceType.CLOUD_OBJECT_STORAGE & String = js.native
      
      /* "salesforce" */ val SALESFORCE: typings.watsonDeveloperCloud.v1GeneratedMod.CreateCredentialsConstants.SourceType.SALESFORCE & String = js.native
      
      /* "sharepoint" */ val SHAREPOINT: typings.watsonDeveloperCloud.v1GeneratedMod.CreateCredentialsConstants.SourceType.SHAREPOINT & String = js.native
      
      /* "web_crawl" */ val WEB_CRAWL: typings.watsonDeveloperCloud.v1GeneratedMod.CreateCredentialsConstants.SourceType.WEB_CRAWL & String = js.native
    }
  }
  
  /** Constants for the `createEnvironment` operation. */
  object CreateEnvironmentConstants {
    
    /** Size of the environment. In the Lite plan the default and only accepted value is `LT`, in all other plans the default is `S`. */
    @JSImport("watson-developer-cloud/sdk", "DiscoveryV1.CreateEnvironmentConstants.Size")
    @js.native
    object Size extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.v1GeneratedMod.CreateEnvironmentConstants.Size & String
          ] = js.native
      
      /* "L" */ val L: typings.watsonDeveloperCloud.v1GeneratedMod.CreateEnvironmentConstants.Size.L & String = js.native
      
      /* "LT" */ val LT: typings.watsonDeveloperCloud.v1GeneratedMod.CreateEnvironmentConstants.Size.LT & String = js.native
      
      /* "M" */ val M: typings.watsonDeveloperCloud.v1GeneratedMod.CreateEnvironmentConstants.Size.M & String = js.native
      
      /* "ML" */ val ML: typings.watsonDeveloperCloud.v1GeneratedMod.CreateEnvironmentConstants.Size.ML & String = js.native
      
      /* "MS" */ val MS: typings.watsonDeveloperCloud.v1GeneratedMod.CreateEnvironmentConstants.Size.MS & String = js.native
      
      /* "S" */ val S: typings.watsonDeveloperCloud.v1GeneratedMod.CreateEnvironmentConstants.Size.S & String = js.native
      
      /* "XL" */ val XL: typings.watsonDeveloperCloud.v1GeneratedMod.CreateEnvironmentConstants.Size.XL & String = js.native
      
      /* "XS" */ val XS: typings.watsonDeveloperCloud.v1GeneratedMod.CreateEnvironmentConstants.Size.XS & String = js.native
      
      /* "XXL" */ val XXL: typings.watsonDeveloperCloud.v1GeneratedMod.CreateEnvironmentConstants.Size.XXL & String = js.native
      
      /* "XXXL" */ val XXXL: typings.watsonDeveloperCloud.v1GeneratedMod.CreateEnvironmentConstants.Size.XXXL & String = js.native
    }
  }
  
  /** Constants for the `createEvent` operation. */
  object CreateEventConstants {
    
    /** The event type to be created. */
    @JSImport("watson-developer-cloud/sdk", "DiscoveryV1.CreateEventConstants.Type")
    @js.native
    object Type extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.watsonDeveloperCloud.v1GeneratedMod.CreateEventConstants.Type & String] = js.native
      
      /* "click" */ val CLICK: typings.watsonDeveloperCloud.v1GeneratedMod.CreateEventConstants.Type.CLICK & String = js.native
    }
  }
  
  /** Constants for the `getMetricsEventRate` operation. */
  object GetMetricsEventRateConstants {
    
    /** The type of result to consider when calculating the metric. */
    @JSImport("watson-developer-cloud/sdk", "DiscoveryV1.GetMetricsEventRateConstants.ResultType")
    @js.native
    object ResultType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.v1GeneratedMod.GetMetricsEventRateConstants.ResultType & String
          ] = js.native
      
      /* "document" */ val DOCUMENT: typings.watsonDeveloperCloud.v1GeneratedMod.GetMetricsEventRateConstants.ResultType.DOCUMENT & String = js.native
    }
  }
  
  /** Constants for the `getMetricsQuery` operation. */
  object GetMetricsQueryConstants {
    
    /** The type of result to consider when calculating the metric. */
    @JSImport("watson-developer-cloud/sdk", "DiscoveryV1.GetMetricsQueryConstants.ResultType")
    @js.native
    object ResultType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.v1GeneratedMod.GetMetricsQueryConstants.ResultType & String
          ] = js.native
      
      /* "document" */ val DOCUMENT: typings.watsonDeveloperCloud.v1GeneratedMod.GetMetricsQueryConstants.ResultType.DOCUMENT & String = js.native
    }
  }
  
  /** Constants for the `getMetricsQueryEvent` operation. */
  object GetMetricsQueryEventConstants {
    
    /** The type of result to consider when calculating the metric. */
    @JSImport("watson-developer-cloud/sdk", "DiscoveryV1.GetMetricsQueryEventConstants.ResultType")
    @js.native
    object ResultType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.v1GeneratedMod.GetMetricsQueryEventConstants.ResultType & String
          ] = js.native
      
      /* "document" */ val DOCUMENT: typings.watsonDeveloperCloud.v1GeneratedMod.GetMetricsQueryEventConstants.ResultType.DOCUMENT & String = js.native
    }
  }
  
  /** Constants for the `getMetricsQueryNoResults` operation. */
  object GetMetricsQueryNoResultsConstants {
    
    /** The type of result to consider when calculating the metric. */
    @JSImport("watson-developer-cloud/sdk", "DiscoveryV1.GetMetricsQueryNoResultsConstants.ResultType")
    @js.native
    object ResultType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.v1GeneratedMod.GetMetricsQueryNoResultsConstants.ResultType & String
          ] = js.native
      
      /* "document" */ val DOCUMENT: typings.watsonDeveloperCloud.v1GeneratedMod.GetMetricsQueryNoResultsConstants.ResultType.DOCUMENT & String = js.native
    }
  }
  
  /** Constants for the `queryRelations` operation. */
  object QueryRelationsConstants {
    
    /** The sorting method for the relationships, can be `score` or `frequency`. `frequency` is the number of unique times each entity is identified. The default is `score`. This parameter cannot be used in the same query as the **bias** parameter. */
    @JSImport("watson-developer-cloud/sdk", "DiscoveryV1.QueryRelationsConstants.Sort")
    @js.native
    object Sort extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.v1GeneratedMod.QueryRelationsConstants.Sort & String
          ] = js.native
      
      /* "frequency" */ val FREQUENCY: typings.watsonDeveloperCloud.v1GeneratedMod.QueryRelationsConstants.Sort.FREQUENCY & String = js.native
      
      /* "score" */ val SCORE: typings.watsonDeveloperCloud.v1GeneratedMod.QueryRelationsConstants.Sort.SCORE & String = js.native
    }
  }
  
  /** Constants for the `testConfigurationInEnvironment` operation. */
  object TestConfigurationInEnvironmentConstants {
    
    /** The content type of file. */
    @JSImport("watson-developer-cloud/sdk", "DiscoveryV1.TestConfigurationInEnvironmentConstants.FileContentType")
    @js.native
    object FileContentType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.v1GeneratedMod.TestConfigurationInEnvironmentConstants.FileContentType & String
          ] = js.native
      
      /* "application/json" */ val APPLICATION_JSON: typings.watsonDeveloperCloud.v1GeneratedMod.TestConfigurationInEnvironmentConstants.FileContentType.APPLICATION_JSON & String = js.native
      
      /* "application/msword" */ val APPLICATION_MSWORD: typings.watsonDeveloperCloud.v1GeneratedMod.TestConfigurationInEnvironmentConstants.FileContentType.APPLICATION_MSWORD & String = js.native
      
      /* "application/pdf" */ val APPLICATION_PDF: typings.watsonDeveloperCloud.v1GeneratedMod.TestConfigurationInEnvironmentConstants.FileContentType.APPLICATION_PDF & String = js.native
      
      /* "application/vnd.openxmlformats-officedocument.wordprocessingml.document" */ val APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT: typings.watsonDeveloperCloud.v1GeneratedMod.TestConfigurationInEnvironmentConstants.FileContentType.APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT & String = js.native
      
      /* "application/xhtml+xml" */ val APPLICATION_XHTML_XML: typings.watsonDeveloperCloud.v1GeneratedMod.TestConfigurationInEnvironmentConstants.FileContentType.APPLICATION_XHTML_XML & String = js.native
      
      /* "text/html" */ val TEXT_HTML: typings.watsonDeveloperCloud.v1GeneratedMod.TestConfigurationInEnvironmentConstants.FileContentType.TEXT_HTML & String = js.native
    }
    
    /** Specify to only run the input document through the given step instead of running the input document through the entire ingestion workflow. Valid values are `convert`, `enrich`, and `normalize`. */
    @JSImport("watson-developer-cloud/sdk", "DiscoveryV1.TestConfigurationInEnvironmentConstants.Step")
    @js.native
    object Step extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.v1GeneratedMod.TestConfigurationInEnvironmentConstants.Step & String
          ] = js.native
      
      /* "enrichments_output" */ val ENRICHMENTS_OUTPUT: typings.watsonDeveloperCloud.v1GeneratedMod.TestConfigurationInEnvironmentConstants.Step.ENRICHMENTS_OUTPUT & String = js.native
      
      /* "html_input" */ val HTML_INPUT: typings.watsonDeveloperCloud.v1GeneratedMod.TestConfigurationInEnvironmentConstants.Step.HTML_INPUT & String = js.native
      
      /* "html_output" */ val HTML_OUTPUT: typings.watsonDeveloperCloud.v1GeneratedMod.TestConfigurationInEnvironmentConstants.Step.HTML_OUTPUT & String = js.native
      
      /* "json_normalizations_output" */ val JSON_NORMALIZATIONS_OUTPUT: typings.watsonDeveloperCloud.v1GeneratedMod.TestConfigurationInEnvironmentConstants.Step.JSON_NORMALIZATIONS_OUTPUT & String = js.native
      
      /* "json_output" */ val JSON_OUTPUT: typings.watsonDeveloperCloud.v1GeneratedMod.TestConfigurationInEnvironmentConstants.Step.JSON_OUTPUT & String = js.native
      
      /* "normalizations_output" */ val NORMALIZATIONS_OUTPUT: typings.watsonDeveloperCloud.v1GeneratedMod.TestConfigurationInEnvironmentConstants.Step.NORMALIZATIONS_OUTPUT & String = js.native
    }
  }
  
  /* static member */
  @JSImport("watson-developer-cloud/sdk", "DiscoveryV1.URL")
  @js.native
  def URL: String = js.native
  inline def URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("URL")(x.asInstanceOf[js.Any])
  
  /** Constants for the `updateCredentials` operation. */
  object UpdateCredentialsConstants {
    
    /** The source that this credentials object connects to. -  `box` indicates the credentials are used to connect an instance of Enterprise Box. -  `salesforce` indicates the credentials are used to connect to Salesforce. -  `sharepoint` indicates the credentials are used to connect to Microsoft SharePoint Online. -  `web_crawl` indicates the credentials are used to perform a web crawl. =  `cloud_object_storage` indicates the credentials are used to connect to an IBM Cloud Object Store. */
    @JSImport("watson-developer-cloud/sdk", "DiscoveryV1.UpdateCredentialsConstants.SourceType")
    @js.native
    object SourceType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.v1GeneratedMod.UpdateCredentialsConstants.SourceType & String
          ] = js.native
      
      /* "box" */ val BOX: typings.watsonDeveloperCloud.v1GeneratedMod.UpdateCredentialsConstants.SourceType.BOX & String = js.native
      
      /* "cloud_object_storage" */ val CLOUD_OBJECT_STORAGE: typings.watsonDeveloperCloud.v1GeneratedMod.UpdateCredentialsConstants.SourceType.CLOUD_OBJECT_STORAGE & String = js.native
      
      /* "salesforce" */ val SALESFORCE: typings.watsonDeveloperCloud.v1GeneratedMod.UpdateCredentialsConstants.SourceType.SALESFORCE & String = js.native
      
      /* "sharepoint" */ val SHAREPOINT: typings.watsonDeveloperCloud.v1GeneratedMod.UpdateCredentialsConstants.SourceType.SHAREPOINT & String = js.native
      
      /* "web_crawl" */ val WEB_CRAWL: typings.watsonDeveloperCloud.v1GeneratedMod.UpdateCredentialsConstants.SourceType.WEB_CRAWL & String = js.native
    }
  }
  
  /** Constants for the `updateDocument` operation. */
  object UpdateDocumentConstants {
    
    /** The content type of file. */
    @JSImport("watson-developer-cloud/sdk", "DiscoveryV1.UpdateDocumentConstants.FileContentType")
    @js.native
    object FileContentType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.v1GeneratedMod.UpdateDocumentConstants.FileContentType & String
          ] = js.native
      
      /* "application/json" */ val APPLICATION_JSON: typings.watsonDeveloperCloud.v1GeneratedMod.UpdateDocumentConstants.FileContentType.APPLICATION_JSON & String = js.native
      
      /* "application/msword" */ val APPLICATION_MSWORD: typings.watsonDeveloperCloud.v1GeneratedMod.UpdateDocumentConstants.FileContentType.APPLICATION_MSWORD & String = js.native
      
      /* "application/pdf" */ val APPLICATION_PDF: typings.watsonDeveloperCloud.v1GeneratedMod.UpdateDocumentConstants.FileContentType.APPLICATION_PDF & String = js.native
      
      /* "application/vnd.openxmlformats-officedocument.wordprocessingml.document" */ val APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT: typings.watsonDeveloperCloud.v1GeneratedMod.UpdateDocumentConstants.FileContentType.APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT & String = js.native
      
      /* "application/xhtml+xml" */ val APPLICATION_XHTML_XML: typings.watsonDeveloperCloud.v1GeneratedMod.UpdateDocumentConstants.FileContentType.APPLICATION_XHTML_XML & String = js.native
      
      /* "text/html" */ val TEXT_HTML: typings.watsonDeveloperCloud.v1GeneratedMod.UpdateDocumentConstants.FileContentType.TEXT_HTML & String = js.native
    }
  }
  
  /** Constants for the `updateEnvironment` operation. */
  object UpdateEnvironmentConstants {
    
    /** Size that the environment should be increased to. Environment size cannot be modified when using a Lite plan. Environment size can only increased and not decreased. */
    @JSImport("watson-developer-cloud/sdk", "DiscoveryV1.UpdateEnvironmentConstants.Size")
    @js.native
    object Size extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.v1GeneratedMod.UpdateEnvironmentConstants.Size & String
          ] = js.native
      
      /* "L" */ val L: typings.watsonDeveloperCloud.v1GeneratedMod.UpdateEnvironmentConstants.Size.L & String = js.native
      
      /* "M" */ val M: typings.watsonDeveloperCloud.v1GeneratedMod.UpdateEnvironmentConstants.Size.M & String = js.native
      
      /* "ML" */ val ML: typings.watsonDeveloperCloud.v1GeneratedMod.UpdateEnvironmentConstants.Size.ML & String = js.native
      
      /* "MS" */ val MS: typings.watsonDeveloperCloud.v1GeneratedMod.UpdateEnvironmentConstants.Size.MS & String = js.native
      
      /* "S" */ val S: typings.watsonDeveloperCloud.v1GeneratedMod.UpdateEnvironmentConstants.Size.S & String = js.native
      
      /* "XL" */ val XL: typings.watsonDeveloperCloud.v1GeneratedMod.UpdateEnvironmentConstants.Size.XL & String = js.native
      
      /* "XXL" */ val XXL: typings.watsonDeveloperCloud.v1GeneratedMod.UpdateEnvironmentConstants.Size.XXL & String = js.native
      
      /* "XXXL" */ val XXXL: typings.watsonDeveloperCloud.v1GeneratedMod.UpdateEnvironmentConstants.Size.XXXL & String = js.native
    }
  }
}
