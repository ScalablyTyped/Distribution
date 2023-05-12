package typings.twilio

import typings.twilio.anon.AssistantSid
import typings.twilio.libRestPreviewUnderstandMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewUnderstandAssistantAssistantInitiationActionsMod {
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/assistantInitiationActions", "AssistantInitiationActionsContextImpl")
  @js.native
  open class AssistantInitiationActionsContextImpl protected ()
    extends StObject
       with AssistantInitiationActionsContext {
    def this(_version: default, assistantSid: String) = this()
    
    /* protected */ var _solution: AssistantInitiationActionsContextSolution = js.native
    
    /* protected */ var _uri: String = js.native
    
    /* protected */ var _version: default = js.native
    
    def update(
      params: js.Function2[
          /* error */ js.Error | Null, 
          /* item */ js.UndefOr[AssistantInitiationActionsInstance], 
          Any
        ],
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* item */ js.UndefOr[AssistantInitiationActionsInstance], 
          Any
        ]
    ): js.Promise[AssistantInitiationActionsInstance] = js.native
    def update(
      params: Unit,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* item */ js.UndefOr[AssistantInitiationActionsInstance], 
          Any
        ]
    ): js.Promise[AssistantInitiationActionsInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/assistantInitiationActions", "AssistantInitiationActionsInstance")
  @js.native
  open class AssistantInitiationActionsInstance protected () extends StObject {
    def this(_version: default, payload: AssistantInitiationActionsResource, assistantSid: String) = this()
    
    /* protected */ var _context: js.UndefOr[AssistantInitiationActionsContext] = js.native
    
    /* private */ def _proxy: Any = js.native
    
    /* protected */ var _solution: AssistantInitiationActionsContextSolution = js.native
    
    /* protected */ var _version: default = js.native
    
    var accountSid: String = js.native
    
    var assistantSid: String = js.native
    
    var data: Any = js.native
    
    /**
      * Fetch a AssistantInitiationActionsInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed AssistantInitiationActionsInstance
      */
    def fetch(): js.Promise[AssistantInitiationActionsInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[AssistantInitiationActionsInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      *
      * @returns Object
      */
    def toJSON(): AssistantSid = js.native
    
    /**
      * Update a AssistantInitiationActionsInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed AssistantInitiationActionsInstance
      */
    def update(): js.Promise[AssistantInitiationActionsInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[AssistantInitiationActionsInstance] = js.native
    /**
      * Update a AssistantInitiationActionsInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed AssistantInitiationActionsInstance
      */
    def update(params: AssistantInitiationActionsContextUpdateOptions): js.Promise[AssistantInitiationActionsInstance] = js.native
    def update(
      params: AssistantInitiationActionsContextUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]
    ): js.Promise[AssistantInitiationActionsInstance] = js.native
    
    var url: String = js.native
  }
  
  @js.native
  trait AssistantInitiationActionsListInstance extends StObject {
    
    def apply(): AssistantInitiationActionsContext = js.native
    
    var _solution: AssistantInitiationActionsSolution = js.native
    
    var _uri: String = js.native
    
    var _version: default = js.native
    
    def get(): AssistantInitiationActionsContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  object AssistantInitiationActionsListInstance {
    
    @JSImport("twilio/lib/rest/preview/understand/assistant/assistantInitiationActions", "AssistantInitiationActionsListInstance")
    @js.native
    def apply(version: default, assistantSid: String): AssistantInitiationActionsListInstance = js.native
  }
  
  @js.native
  trait AssistantInitiationActionsContext extends StObject {
    
    /**
      * Fetch a AssistantInitiationActionsInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed AssistantInitiationActionsInstance
      */
    def fetch(): js.Promise[AssistantInitiationActionsInstance] = js.native
    def fetch(
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* item */ js.UndefOr[AssistantInitiationActionsInstance], 
          Any
        ]
    ): js.Promise[AssistantInitiationActionsInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * Update a AssistantInitiationActionsInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed AssistantInitiationActionsInstance
      */
    def update(): js.Promise[AssistantInitiationActionsInstance] = js.native
    def update(
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* item */ js.UndefOr[AssistantInitiationActionsInstance], 
          Any
        ]
    ): js.Promise[AssistantInitiationActionsInstance] = js.native
    /**
      * Update a AssistantInitiationActionsInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed AssistantInitiationActionsInstance
      */
    def update(params: AssistantInitiationActionsContextUpdateOptions): js.Promise[AssistantInitiationActionsInstance] = js.native
    def update(
      params: AssistantInitiationActionsContextUpdateOptions,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* item */ js.UndefOr[AssistantInitiationActionsInstance], 
          Any
        ]
    ): js.Promise[AssistantInitiationActionsInstance] = js.native
  }
  
  trait AssistantInitiationActionsContextSolution extends StObject {
    
    var assistantSid: String
  }
  object AssistantInitiationActionsContextSolution {
    
    inline def apply(assistantSid: String): AssistantInitiationActionsContextSolution = {
      val __obj = js.Dynamic.literal(assistantSid = assistantSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssistantInitiationActionsContextSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AssistantInitiationActionsContextSolution] (val x: Self) extends AnyVal {
      
      inline def setAssistantSid(value: String): Self = StObject.set(x, "assistantSid", value.asInstanceOf[js.Any])
    }
  }
  
  trait AssistantInitiationActionsContextUpdateOptions extends StObject {
    
    /**  */
    var initiationActions: js.UndefOr[Any] = js.undefined
  }
  object AssistantInitiationActionsContextUpdateOptions {
    
    inline def apply(): AssistantInitiationActionsContextUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssistantInitiationActionsContextUpdateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AssistantInitiationActionsContextUpdateOptions] (val x: Self) extends AnyVal {
      
      inline def setInitiationActions(value: Any): Self = StObject.set(x, "initiationActions", value.asInstanceOf[js.Any])
      
      inline def setInitiationActionsUndefined: Self = StObject.set(x, "initiationActions", js.undefined)
    }
  }
  
  trait AssistantInitiationActionsResource extends StObject {
    
    var account_sid: String
    
    var assistant_sid: String
    
    var data: Any
    
    var url: String
  }
  object AssistantInitiationActionsResource {
    
    inline def apply(account_sid: String, assistant_sid: String, data: Any, url: String): AssistantInitiationActionsResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], assistant_sid = assistant_sid.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssistantInitiationActionsResource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AssistantInitiationActionsResource] (val x: Self) extends AnyVal {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAssistant_sid(value: String): Self = StObject.set(x, "assistant_sid", value.asInstanceOf[js.Any])
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait AssistantInitiationActionsSolution extends StObject {
    
    var assistantSid: String
  }
  object AssistantInitiationActionsSolution {
    
    inline def apply(assistantSid: String): AssistantInitiationActionsSolution = {
      val __obj = js.Dynamic.literal(assistantSid = assistantSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssistantInitiationActionsSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AssistantInitiationActionsSolution] (val x: Self) extends AnyVal {
      
      inline def setAssistantSid(value: String): Self = StObject.set(x, "assistantSid", value.asInstanceOf[js.Any])
    }
  }
}
