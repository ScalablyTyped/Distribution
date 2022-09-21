package typings.twilio

import typings.twilio.dayMod.DayContext
import typings.twilio.dayMod.DayListInstance
import typings.twilio.exportCustomJobMod.ExportCustomJobListInstance
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.jobMod.JobListInstance
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exportMod {
  
  @JSImport("twilio/lib/rest/bulkexports/v1/export", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/bulkexports/v1/export", "ExportContext")
  @js.native
  open class ExportContext protected () extends StObject {
    /**
      * Initialize the ExportContext
      *
      * @param version - Version of the resource
      * @param resourceType - The type of communication – Messages, Calls, Conferences, and Participants
      */
    def this(version: typings.twilio.bulkexportsV1Mod.^, resourceType: String) = this()
    
    /**
      * @param sid - sid of instance
      */
    def days(sid: String): DayContext = js.native
    @JSName("days")
    var days_Original: DayListInstance = js.native
    
    var exportCustomJobs: ExportCustomJobListInstance = js.native
    
    /**
      * fetch a ExportInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ExportInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ ExportInstance, Any]): js.Promise[ExportInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/bulkexports/v1/export", "ExportInstance")
  @js.native
  open class ExportInstance protected () extends SerializableClass {
    /**
      * Initialize the ExportContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param resourceType - The type of communication – Messages, Calls, Conferences, and Participants
      */
    def this(version: typings.twilio.bulkexportsV1Mod.^, payload: ExportPayload, resourceType: String) = this()
    
    /* private */ var _proxy: ExportContext = js.native
    
    /**
      * Access the days
      */
    def days(): DayListInstance = js.native
    
    /**
      * Access the exportCustomJobs
      */
    def exportCustomJobs(): ExportCustomJobListInstance = js.native
    
    /**
      * fetch a ExportInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ExportInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ExportInstance] = js.native
    
    var links: String = js.native
    
    var resourceType: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the ExportList
    *
    * @param version - Version of the resource
    */
  inline def ExportList(version: typings.twilio.bulkexportsV1Mod.^): ExportListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("ExportList")(version.asInstanceOf[js.Any]).asInstanceOf[ExportListInstance]
  
  @JSImport("twilio/lib/rest/bulkexports/v1/export", "ExportPage")
  @js.native
  open class ExportPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.bulkexportsV1Mod.^, ExportPayload, ExportResource, ExportInstance] {
    /**
      * Initialize the ExportPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.bulkexportsV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: ExportSolution
    ) = this()
    
    /**
      * Build an instance of ExportInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: ExportPayload): ExportInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait ExportListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): ExportContext = js.native
    
    /**
      * Constructs a export
      *
      * @param resourceType - The type of communication – Messages, Calls, Conferences, and Participants
      */
    def get(resourceType: String): ExportContext = js.native
    
    var jobs: js.UndefOr[JobListInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait ExportPayload
    extends StObject
       with ExportResource
       with TwilioResponsePayload
  object ExportPayload {
    
    inline def apply(
      first_page_uri: String,
      links: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      resource_type: String,
      uri: String,
      url: String
    ): ExportPayload = {
      val __obj = js.Dynamic.literal(first_page_uri = first_page_uri.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], resource_type = resource_type.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportPayload]
    }
  }
  
  trait ExportResource extends StObject {
    
    var links: String
    
    var resource_type: String
    
    var url: String
  }
  object ExportResource {
    
    inline def apply(links: String, resource_type: String, url: String): ExportResource = {
      val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], resource_type = resource_type.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportResource]
    }
    
    extension [Self <: ExportResource](x: Self) {
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setResource_type(value: String): Self = StObject.set(x, "resource_type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExportSolution extends StObject
}
