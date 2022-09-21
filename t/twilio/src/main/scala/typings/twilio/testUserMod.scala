package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testUserMod {
  
  @JSImport("twilio/lib/rest/studio/v2/flow/testUser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/studio/v2/flow/testUser", "FlowTestUserContext")
  @js.native
  open class FlowTestUserContext protected () extends StObject {
    /**
      * Initialize the FlowTestUserContext
      *
      * @param version - Version of the resource
      * @param sid - Unique identifier of the flow.
      */
    def this(version: typings.twilio.studioV2Mod.^, sid: String) = this()
    
    /**
      * fetch a FlowTestUserInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[FlowTestUserInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ FlowTestUserInstance, Any]): js.Promise[FlowTestUserInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a FlowTestUserInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: FlowTestUserInstanceUpdateOptions): js.Promise[FlowTestUserInstance] = js.native
    def update(
      opts: FlowTestUserInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ FlowTestUserInstance, Any]
    ): js.Promise[FlowTestUserInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/studio/v2/flow/testUser", "FlowTestUserInstance")
  @js.native
  open class FlowTestUserInstance protected () extends SerializableClass {
    /**
      * Initialize the FlowTestUserContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - Unique identifier of the flow.
      */
    def this(version: typings.twilio.studioV2Mod.^, payload: FlowTestUserPayload, sid: String) = this()
    
    /* private */ var _proxy: FlowTestUserContext = js.native
    
    /**
      * fetch a FlowTestUserInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[FlowTestUserInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[FlowTestUserInstance] = js.native
    
    var sid: String = js.native
    
    var testUsers: js.Array[String] = js.native
    
    /**
      * update a FlowTestUserInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: FlowTestUserInstanceUpdateOptions): js.Promise[FlowTestUserInstance] = js.native
    def update(
      opts: FlowTestUserInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[FlowTestUserInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the FlowTestUserList
    *
    * @param version - Version of the resource
    * @param sid - Unique identifier of the flow.
    */
  inline def FlowTestUserList(version: typings.twilio.studioV2Mod.^, sid: String): FlowTestUserListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("FlowTestUserList")(version.asInstanceOf[js.Any], sid.asInstanceOf[js.Any])).asInstanceOf[FlowTestUserListInstance]
  
  @JSImport("twilio/lib/rest/studio/v2/flow/testUser", "FlowTestUserPage")
  @js.native
  open class FlowTestUserPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.studioV2Mod.^, 
          FlowTestUserPayload, 
          FlowTestUserResource, 
          FlowTestUserInstance
        ] {
    /**
      * Initialize the FlowTestUserPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.studioV2Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: FlowTestUserSolution
    ) = this()
    
    /**
      * Build an instance of FlowTestUserInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: FlowTestUserPayload): FlowTestUserInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property testUsers - List of test user identities that can test draft versions of the flow.
    */
  trait FlowTestUserInstanceUpdateOptions extends StObject {
    
    var testUsers: String | js.Array[String]
  }
  object FlowTestUserInstanceUpdateOptions {
    
    inline def apply(testUsers: String | js.Array[String]): FlowTestUserInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal(testUsers = testUsers.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlowTestUserInstanceUpdateOptions]
    }
    
    extension [Self <: FlowTestUserInstanceUpdateOptions](x: Self) {
      
      inline def setTestUsers(value: String | js.Array[String]): Self = StObject.set(x, "testUsers", value.asInstanceOf[js.Any])
      
      inline def setTestUsersVarargs(value: String*): Self = StObject.set(x, "testUsers", js.Array(value*))
    }
  }
  
  @js.native
  trait FlowTestUserListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): FlowTestUserContext = js.native
    
    /**
      * Constructs a flow_test_user
      */
    def get(): FlowTestUserContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait FlowTestUserPayload
    extends StObject
       with FlowTestUserResource
       with TwilioResponsePayload
  object FlowTestUserPayload {
    
    inline def apply(
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      test_users: js.Array[String],
      uri: String,
      url: String
    ): FlowTestUserPayload = {
      val __obj = js.Dynamic.literal(first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], test_users = test_users.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlowTestUserPayload]
    }
  }
  
  trait FlowTestUserResource extends StObject {
    
    var sid: String
    
    var test_users: js.Array[String]
    
    var url: String
  }
  object FlowTestUserResource {
    
    inline def apply(sid: String, test_users: js.Array[String], url: String): FlowTestUserResource = {
      val __obj = js.Dynamic.literal(sid = sid.asInstanceOf[js.Any], test_users = test_users.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlowTestUserResource]
    }
    
    extension [Self <: FlowTestUserResource](x: Self) {
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setTest_users(value: js.Array[String]): Self = StObject.set(x, "test_users", value.asInstanceOf[js.Any])
      
      inline def setTest_usersVarargs(value: String*): Self = StObject.set(x, "test_users", js.Array(value*))
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait FlowTestUserSolution extends StObject {
    
    var sid: js.UndefOr[String] = js.undefined
  }
  object FlowTestUserSolution {
    
    inline def apply(): FlowTestUserSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlowTestUserSolution]
    }
    
    extension [Self <: FlowTestUserSolution](x: Self) {
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSidUndefined: Self = StObject.set(x, "sid", js.undefined)
    }
  }
}
