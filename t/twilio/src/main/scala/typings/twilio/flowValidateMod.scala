package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flowValidateMod {
  
  @JSImport("twilio/lib/rest/studio/v2/flowValidate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/studio/v2/flowValidate", "FlowValidateInstance")
  @js.native
  open class FlowValidateInstance protected () extends SerializableClass {
    /**
      * Initialize the FlowValidateContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      */
    def this(version: typings.twilio.studioV2Mod.^, payload: FlowValidatePayload) = this()
    
    var valid: Boolean = js.native
  }
  
  /**
    * Initialize the FlowValidateList
    *
    * @param version - Version of the resource
    */
  inline def FlowValidateList(version: typings.twilio.studioV2Mod.^): FlowValidateListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("FlowValidateList")(version.asInstanceOf[js.Any]).asInstanceOf[FlowValidateListInstance]
  
  @JSImport("twilio/lib/rest/studio/v2/flowValidate", "FlowValidatePage")
  @js.native
  open class FlowValidatePage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.studioV2Mod.^, 
          FlowValidatePayload, 
          FlowValidateResource, 
          FlowValidateInstance
        ] {
    /**
      * Initialize the FlowValidatePage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.studioV2Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: FlowValidateSolution
    ) = this()
    
    /**
      * Build an instance of FlowValidateInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: FlowValidatePayload): FlowValidateInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait FlowValidateListInstance extends StObject {
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a FlowValidateInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: FlowValidateListInstanceUpdateOptions): js.Promise[FlowValidateInstance] = js.native
    def update(
      opts: FlowValidateListInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[FlowValidateInstance] = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property commitMessage - Description of change made in the revision
    * @property definition - JSON representation of flow definition
    * @property friendlyName - The string that you assigned to describe the Flow
    * @property status - The status of the Flow
    */
  trait FlowValidateListInstanceUpdateOptions extends StObject {
    
    var commitMessage: js.UndefOr[String] = js.undefined
    
    var definition: js.Object
    
    var friendlyName: String
    
    var status: FlowValidateStatus
  }
  object FlowValidateListInstanceUpdateOptions {
    
    inline def apply(definition: js.Object, friendlyName: String, status: FlowValidateStatus): FlowValidateListInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlowValidateListInstanceUpdateOptions]
    }
    
    extension [Self <: FlowValidateListInstanceUpdateOptions](x: Self) {
      
      inline def setCommitMessage(value: String): Self = StObject.set(x, "commitMessage", value.asInstanceOf[js.Any])
      
      inline def setCommitMessageUndefined: Self = StObject.set(x, "commitMessage", js.undefined)
      
      inline def setDefinition(value: js.Object): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: FlowValidateStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait FlowValidatePayload
    extends StObject
       with FlowValidateResource
       with TwilioResponsePayload
  object FlowValidatePayload {
    
    inline def apply(
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      uri: String,
      valid: Boolean
    ): FlowValidatePayload = {
      val __obj = js.Dynamic.literal(first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlowValidatePayload]
    }
  }
  
  trait FlowValidateResource extends StObject {
    
    var valid: Boolean
  }
  object FlowValidateResource {
    
    inline def apply(valid: Boolean): FlowValidateResource = {
      val __obj = js.Dynamic.literal(valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlowValidateResource]
    }
    
    extension [Self <: FlowValidateResource](x: Self) {
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
  
  trait FlowValidateSolution extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.draft
    - typings.twilio.twilioStrings.published
  */
  trait FlowValidateStatus extends StObject
  object FlowValidateStatus {
    
    inline def draft: typings.twilio.twilioStrings.draft = "draft".asInstanceOf[typings.twilio.twilioStrings.draft]
    
    inline def published: typings.twilio.twilioStrings.published = "published".asInstanceOf[typings.twilio.twilioStrings.published]
  }
}
