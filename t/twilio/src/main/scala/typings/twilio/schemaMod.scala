package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.schemaVersionMod.SchemaVersionContext
import typings.twilio.schemaVersionMod.SchemaVersionListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schemaMod {
  
  @JSImport("twilio/lib/rest/events/v1/schema", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/events/v1/schema", "SchemaContext")
  @js.native
  open class SchemaContext protected () extends StObject {
    /**
      * Initialize the SchemaContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param id - The unique identifier of the schema.
      */
    def this(version: typings.twilio.eventsV1Mod.^, id: String) = this()
    
    /**
      * fetch a SchemaInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[SchemaInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ SchemaInstance, Any]): js.Promise[SchemaInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * @param sid - sid of instance
      */
    def versions(sid: String): SchemaVersionContext = js.native
    @JSName("versions")
    var versions_Original: SchemaVersionListInstance = js.native
  }
  
  @JSImport("twilio/lib/rest/events/v1/schema", "SchemaInstance")
  @js.native
  open class SchemaInstance protected () extends SerializableClass {
    /**
      * Initialize the SchemaContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param id - The unique identifier of the schema.
      */
    def this(version: typings.twilio.eventsV1Mod.^, payload: SchemaPayload, id: String) = this()
    
    /* private */ var _proxy: SchemaContext = js.native
    
    /**
      * fetch a SchemaInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[SchemaInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SchemaInstance] = js.native
    
    var id: String = js.native
    
    var latestVersion: Double = js.native
    
    var latestVersionDateCreated: js.Date = js.native
    
    var links: String = js.native
    
    var url: String = js.native
    
    /**
      * Access the versions
      */
    def versions(): SchemaVersionListInstance = js.native
  }
  
  /**
    * Initialize the SchemaList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    */
  inline def SchemaList(version: typings.twilio.eventsV1Mod.^): SchemaListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("SchemaList")(version.asInstanceOf[js.Any]).asInstanceOf[SchemaListInstance]
  
  @JSImport("twilio/lib/rest/events/v1/schema", "SchemaPage")
  @js.native
  open class SchemaPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.eventsV1Mod.^, SchemaPayload, SchemaResource, SchemaInstance] {
    /**
      * Initialize the SchemaPage
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.eventsV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: SchemaSolution
    ) = this()
    
    /**
      * Build an instance of SchemaInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: SchemaPayload): SchemaInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait SchemaListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): SchemaContext = js.native
    
    /**
      * Constructs a schema
      *
      * @param id - The unique identifier of the schema.
      */
    def get(id: String): SchemaContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait SchemaPayload
    extends StObject
       with SchemaResource
       with TwilioResponsePayload
  object SchemaPayload {
    
    inline def apply(
      first_page_uri: String,
      id: String,
      latest_version: Double,
      latest_version_date_created: js.Date,
      links: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      uri: String,
      url: String
    ): SchemaPayload = {
      val __obj = js.Dynamic.literal(first_page_uri = first_page_uri.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], latest_version = latest_version.asInstanceOf[js.Any], latest_version_date_created = latest_version_date_created.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SchemaPayload]
    }
  }
  
  trait SchemaResource extends StObject {
    
    var id: String
    
    var latest_version: Double
    
    var latest_version_date_created: js.Date
    
    var links: String
    
    var url: String
  }
  object SchemaResource {
    
    inline def apply(
      id: String,
      latest_version: Double,
      latest_version_date_created: js.Date,
      links: String,
      url: String
    ): SchemaResource = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], latest_version = latest_version.asInstanceOf[js.Any], latest_version_date_created = latest_version_date_created.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SchemaResource]
    }
    
    extension [Self <: SchemaResource](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLatest_version(value: Double): Self = StObject.set(x, "latest_version", value.asInstanceOf[js.Any])
      
      inline def setLatest_version_date_created(value: js.Date): Self = StObject.set(x, "latest_version_date_created", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait SchemaSolution extends StObject
}
