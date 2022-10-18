package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `updateCredentials` operation. */
object UpdateCredentialsConstants {
  
  @js.native
  sealed trait SourceType extends StObject
  /** The source that this credentials object connects to. -  `box` indicates the credentials are used to connect an instance of Enterprise Box. -  `salesforce` indicates the credentials are used to connect to Salesforce. -  `sharepoint` indicates the credentials are used to connect to Microsoft SharePoint Online. -  `web_crawl` indicates the credentials are used to perform a web crawl. =  `cloud_object_storage` indicates the credentials are used to connect to an IBM Cloud Object Store. */
  @JSImport("watson-developer-cloud/discovery/v1-generated", "UpdateCredentialsConstants.SourceType")
  @js.native
  object SourceType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SourceType & String] = js.native
    
    @js.native
    sealed trait BOX
      extends StObject
         with SourceType
    /* "box" */ val BOX: typings.watsonDeveloperCloud.discoveryV1GeneratedMod.UpdateCredentialsConstants.SourceType.BOX & String = js.native
    
    @js.native
    sealed trait CLOUD_OBJECT_STORAGE
      extends StObject
         with SourceType
    /* "cloud_object_storage" */ val CLOUD_OBJECT_STORAGE: typings.watsonDeveloperCloud.discoveryV1GeneratedMod.UpdateCredentialsConstants.SourceType.CLOUD_OBJECT_STORAGE & String = js.native
    
    @js.native
    sealed trait SALESFORCE
      extends StObject
         with SourceType
    /* "salesforce" */ val SALESFORCE: typings.watsonDeveloperCloud.discoveryV1GeneratedMod.UpdateCredentialsConstants.SourceType.SALESFORCE & String = js.native
    
    @js.native
    sealed trait SHAREPOINT
      extends StObject
         with SourceType
    /* "sharepoint" */ val SHAREPOINT: typings.watsonDeveloperCloud.discoveryV1GeneratedMod.UpdateCredentialsConstants.SourceType.SHAREPOINT & String = js.native
    
    @js.native
    sealed trait WEB_CRAWL
      extends StObject
         with SourceType
    /* "web_crawl" */ val WEB_CRAWL: typings.watsonDeveloperCloud.discoveryV1GeneratedMod.UpdateCredentialsConstants.SourceType.WEB_CRAWL & String = js.native
  }
}
