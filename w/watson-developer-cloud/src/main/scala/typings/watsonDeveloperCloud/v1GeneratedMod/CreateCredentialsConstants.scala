package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `createCredentials` operation. */
object CreateCredentialsConstants {
  
  @js.native
  sealed trait SourceType extends StObject
  /** The source that this credentials object connects to. -  `box` indicates the credentials are used to connect an instance of Enterprise Box. -  `salesforce` indicates the credentials are used to connect to Salesforce. -  `sharepoint` indicates the credentials are used to connect to Microsoft SharePoint Online. -  `web_crawl` indicates the credentials are used to perform a web crawl. =  `cloud_object_storage` indicates the credentials are used to connect to an IBM Cloud Object Store. */
  @JSImport("watson-developer-cloud/discovery/v1-generated", "CreateCredentialsConstants.SourceType")
  @js.native
  object SourceType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SourceType with String] = js.native
    
    @js.native
    sealed trait BOX extends SourceType
    /* "box" */ val BOX: typings.watsonDeveloperCloud.v1GeneratedMod.CreateCredentialsConstants.SourceType.BOX with String = js.native
    
    @js.native
    sealed trait CLOUD_OBJECT_STORAGE extends SourceType
    /* "cloud_object_storage" */ val CLOUD_OBJECT_STORAGE: typings.watsonDeveloperCloud.v1GeneratedMod.CreateCredentialsConstants.SourceType.CLOUD_OBJECT_STORAGE with String = js.native
    
    @js.native
    sealed trait SALESFORCE extends SourceType
    /* "salesforce" */ val SALESFORCE: typings.watsonDeveloperCloud.v1GeneratedMod.CreateCredentialsConstants.SourceType.SALESFORCE with String = js.native
    
    @js.native
    sealed trait SHAREPOINT extends SourceType
    /* "sharepoint" */ val SHAREPOINT: typings.watsonDeveloperCloud.v1GeneratedMod.CreateCredentialsConstants.SourceType.SHAREPOINT with String = js.native
    
    @js.native
    sealed trait WEB_CRAWL extends SourceType
    /* "web_crawl" */ val WEB_CRAWL: typings.watsonDeveloperCloud.v1GeneratedMod.CreateCredentialsConstants.SourceType.WEB_CRAWL with String = js.native
  }
}
