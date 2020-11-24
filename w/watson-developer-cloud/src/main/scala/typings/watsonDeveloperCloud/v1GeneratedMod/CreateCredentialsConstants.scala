package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `createCredentials` operation. */
@JSImport("watson-developer-cloud/discovery/v1-generated", "CreateCredentialsConstants")
@js.native
object CreateCredentialsConstants extends js.Object {
  
  @js.native
  sealed trait SourceType extends js.Object
  /** The source that this credentials object connects to. -  `box` indicates the credentials are used to connect an instance of Enterprise Box. -  `salesforce` indicates the credentials are used to connect to Salesforce. -  `sharepoint` indicates the credentials are used to connect to Microsoft SharePoint Online. -  `web_crawl` indicates the credentials are used to perform a web crawl. =  `cloud_object_storage` indicates the credentials are used to connect to an IBM Cloud Object Store. */
  @js.native
  object SourceType extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SourceType with String] = js.native
    
    @js.native
    sealed trait BOX extends SourceType
    /* "box" */ @js.native
    object BOX extends TopLevel[BOX with String]
    
    @js.native
    sealed trait CLOUD_OBJECT_STORAGE extends SourceType
    /* "cloud_object_storage" */ @js.native
    object CLOUD_OBJECT_STORAGE extends TopLevel[CLOUD_OBJECT_STORAGE with String]
    
    @js.native
    sealed trait SALESFORCE extends SourceType
    /* "salesforce" */ @js.native
    object SALESFORCE extends TopLevel[SALESFORCE with String]
    
    @js.native
    sealed trait SHAREPOINT extends SourceType
    /* "sharepoint" */ @js.native
    object SHAREPOINT extends TopLevel[SHAREPOINT with String]
    
    @js.native
    sealed trait WEB_CRAWL extends SourceType
    /* "web_crawl" */ @js.native
    object WEB_CRAWL extends TopLevel[WEB_CRAWL with String]
  }
}
