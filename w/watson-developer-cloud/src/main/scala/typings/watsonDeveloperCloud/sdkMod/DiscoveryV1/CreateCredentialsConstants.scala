package typings.watsonDeveloperCloud.sdkMod.DiscoveryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for the `createCredentials` operation. */
@JSImport("watson-developer-cloud/sdk", "DiscoveryV1.CreateCredentialsConstants")
@js.native
object CreateCredentialsConstants extends js.Object {
  /** The source that this credentials object connects to. -  `box` indicates the credentials are used to connect an instance of Enterprise Box. -  `salesforce` indicates the credentials are used to connect to Salesforce. -  `sharepoint` indicates the credentials are used to connect to Microsoft SharePoint Online. -  `web_crawl` indicates the credentials are used to perform a web crawl. =  `cloud_object_storage` indicates the credentials are used to connect to an IBM Cloud Object Store. */
  @js.native
  object SourceType extends js.Object {
    /* "box" */ val BOX: typings.watsonDeveloperCloud.v1GeneratedMod.CreateCredentialsConstants.SourceType.BOX with String = js.native
    /* "cloud_object_storage" */ val CLOUD_OBJECT_STORAGE: typings.watsonDeveloperCloud.v1GeneratedMod.CreateCredentialsConstants.SourceType.CLOUD_OBJECT_STORAGE with String = js.native
    /* "salesforce" */ val SALESFORCE: typings.watsonDeveloperCloud.v1GeneratedMod.CreateCredentialsConstants.SourceType.SALESFORCE with String = js.native
    /* "sharepoint" */ val SHAREPOINT: typings.watsonDeveloperCloud.v1GeneratedMod.CreateCredentialsConstants.SourceType.SHAREPOINT with String = js.native
    /* "web_crawl" */ val WEB_CRAWL: typings.watsonDeveloperCloud.v1GeneratedMod.CreateCredentialsConstants.SourceType.WEB_CRAWL with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.watsonDeveloperCloud.v1GeneratedMod.CreateCredentialsConstants.SourceType with String
      ] = js.native
  }
  
}

