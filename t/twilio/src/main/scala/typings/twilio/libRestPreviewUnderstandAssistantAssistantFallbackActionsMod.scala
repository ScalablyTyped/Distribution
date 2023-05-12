package typings.twilio

import typings.twilio.anon.AssistantSid
import typings.twilio.libRestPreviewUnderstandMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewUnderstandAssistantAssistantFallbackActionsMod {
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/assistantFallbackActions", "AssistantFallbackActionsContextImpl")
  @js.native
  open class AssistantFallbackActionsContextImpl protected ()
    extends StObject
       with AssistantFallbackActionsContext {
    def this(_version: default, assistantSid: String) = this()
    
    /* protected */ var _solution: AssistantFallbackActionsContextSolution = js.native
    
    /* protected */ var _uri: String = js.native
    
    /* protected */ var _version: default = js.native
    
    def update(
      params: js.Function2[
          /* error */ js.Error | Null, 
          /* item */ js.UndefOr[AssistantFallbackActionsInstance], 
          Any
        ],
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* item */ js.UndefOr[AssistantFallbackActionsInstance], 
          Any
        ]
    ): js.Promise[AssistantFallbackActionsInstance] = js.native
    def update(
      params: Unit,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* item */ js.UndefOr[AssistantFallbackActionsInstance], 
          Any
        ]
    ): js.Promise[AssistantFallbackActionsInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/assistantFallbackActions", "AssistantFallbackActionsInstance")
  @js.native
  open class AssistantFallbackActionsInstance protected () extends StObject {
    def this(_version: default, payload: AssistantFallbackActionsResource, assistantSid: String) = this()
    
    /* protected */ var _context: js.UndefOr[AssistantFallbackActionsContext] = js.native
    
    /* private */ def _proxy: Any = js.native
    
    /* protected */ var _solution: AssistantFallbackActionsContextSolution = js.native
    
    /* protected */ var _version: default = js.native
    
    var accountSid: String = js.native
    
    var assistantSid: String = js.native
    
    var data: Any = js.native
    
    /**
      * Fetch a AssistantFallbackActionsInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed AssistantFallbackActionsInstance
      */
    def fetch(): js.Promise[AssistantFallbackActionsInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[AssistantFallbackActionsInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      *
      * @returns Object
      */
    def toJSON(): AssistantSid = js.native
    
    /**
      * Update a AssistantFallbackActionsInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed AssistantFallbackActionsInstance
      */
    def update(): js.Promise[AssistantFallbackActionsInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[AssistantFallbackActionsInstance] = js.native
    /**
      * Update a AssistantFallbackActionsInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed AssistantFallbackActionsInstance
      */
    def update(params: AssistantFallbackActionsContextUpdateOptions): js.Promise[AssistantFallbackActionsInstance] = js.native
    def update(
      params: AssistantFallbackActionsContextUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]
    ): js.Promise[AssistantFallbackActionsInstance] = js.native
    
    var url: String = js.native
  }
  
  @js.native
  trait AssistantFallbackActionsListInstance extends StObject {
    
    def apply(): AssistantFallbackActionsContext = js.native
    
    var _solution: AssistantFallbackActionsSolution = js.native
    
    var _uri: String = js.native
    
    var _version: default = js.native
    
    def get(): AssistantFallbackActionsContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  object AssistantFallbackActionsListInstance {
    
    @JSImport("twilio/lib/rest/preview/understand/assistant/assistantFallbackActions", "AssistantFallbackActionsListInstance")
    @js.native
    def apply(version: default, assistantSid: String): AssistantFallbackActionsListInstance = js.native
  }
  
  @js.native
  trait AssistantFallbackActionsContext extends StObject {
    
    /**
      * Fetch a AssistantFallbackActionsInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed AssistantFallbackActionsInstance
      */
    def fetch(): js.Promise[AssistantFallbackActionsInstance] = js.native
    def fetch(
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* item */ js.UndefOr[AssistantFallbackActionsInstance], 
          Any
        ]
    ): js.Promise[AssistantFallbackActionsInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * Update a AssistantFallbackActionsInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed AssistantFallbackActionsInstance
      */
    def update(): js.Promise[AssistantFallbackActionsInstance] = js.native
    def update(
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* item */ js.UndefOr[AssistantFallbackActionsInstance], 
          Any
        ]
    ): js.Promise[AssistantFallbackActionsInstance] = js.native
    /**
      * Update a AssistantFallbackActionsInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed AssistantFallbackActionsInstance
      */
    def update(params: AssistantFallbackActionsContextUpdateOptions): js.Promise[AssistantFallbackActionsInstance] = js.native
    def update(
      params: AssistantFallbackActionsContextUpdateOptions,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* item */ js.UndefOr[AssistantFallbackActionsInstance], 
          Any
        ]
    ): js.Promise[AssistantFallbackActionsInstance] = js.native
  }
  
  trait AssistantFallbackActionsContextSolution extends StObject {
    
    var assistantSid: String
  }
  object AssistantFallbackActionsContextSolution {
    
    inline def apply(assistantSid: String): AssistantFallbackActionsContextSolution = {
      val __obj = js.Dynamic.literal(assistantSid = assistantSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssistantFallbackActionsContextSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AssistantFallbackActionsContextSolution] (val x: Self) extends AnyVal {
      
      inline def setAssistantSid(value: String): Self = StObject.set(x, "assistantSid", value.asInstanceOf[js.Any])
    }
  }
  
  trait AssistantFallbackActionsContextUpdateOptions extends StObject {
    
    /**  */
    var fallbackActions: js.UndefOr[Any] = js.undefined
  }
  object AssistantFallbackActionsContextUpdateOptions {
    
    inline def apply(): AssistantFallbackActionsContextUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssistantFallbackActionsContextUpdateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AssistantFallbackActionsContextUpdateOptions] (val x: Self) extends AnyVal {
      
      inline def setFallbackActions(value: Any): Self = StObject.set(x, "fallbackActions", value.asInstanceOf[js.Any])
      
      inline def setFallbackActionsUndefined: Self = StObject.set(x, "fallbackActions", js.undefined)
    }
  }
  
  trait AssistantFallbackActionsResource extends StObject {
    
    var account_sid: String
    
    var assistant_sid: String
    
    var data: Any
    
    var url: String
  }
  object AssistantFallbackActionsResource {
    
    inline def apply(account_sid: String, assistant_sid: String, data: Any, url: String): AssistantFallbackActionsResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], assistant_sid = assistant_sid.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssistantFallbackActionsResource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AssistantFallbackActionsResource] (val x: Self) extends AnyVal {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAssistant_sid(value: String): Self = StObject.set(x, "assistant_sid", value.asInstanceOf[js.Any])
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait AssistantFallbackActionsSolution extends StObject {
    
    var assistantSid: String
  }
  object AssistantFallbackActionsSolution {
    
    inline def apply(assistantSid: String): AssistantFallbackActionsSolution = {
      val __obj = js.Dynamic.literal(assistantSid = assistantSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssistantFallbackActionsSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AssistantFallbackActionsSolution] (val x: Self) extends AnyVal {
      
      inline def setAssistantSid(value: String): Self = StObject.set(x, "assistantSid", value.asInstanceOf[js.Any])
    }
  }
}
