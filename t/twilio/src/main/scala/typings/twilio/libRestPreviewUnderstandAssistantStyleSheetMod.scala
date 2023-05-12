package typings.twilio

import typings.twilio.anon.AssistantSid
import typings.twilio.libRestPreviewUnderstandMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewUnderstandAssistantStyleSheetMod {
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/styleSheet", "StyleSheetContextImpl")
  @js.native
  open class StyleSheetContextImpl protected ()
    extends StObject
       with StyleSheetContext {
    def this(_version: default, assistantSid: String) = this()
    
    /* protected */ var _solution: StyleSheetContextSolution = js.native
    
    /* protected */ var _uri: String = js.native
    
    /* protected */ var _version: default = js.native
    
    def update(
      params: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[StyleSheetInstance], Any],
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[StyleSheetInstance], Any]
    ): js.Promise[StyleSheetInstance] = js.native
    def update(
      params: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[StyleSheetInstance], Any]
    ): js.Promise[StyleSheetInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/styleSheet", "StyleSheetInstance")
  @js.native
  open class StyleSheetInstance protected () extends StObject {
    def this(_version: default, payload: StyleSheetResource, assistantSid: String) = this()
    
    /* protected */ var _context: js.UndefOr[StyleSheetContext] = js.native
    
    /* private */ def _proxy: Any = js.native
    
    /* protected */ var _solution: StyleSheetContextSolution = js.native
    
    /* protected */ var _version: default = js.native
    
    /**
      * The unique ID of the Account that created this Assistant
      */
    var accountSid: String = js.native
    
    /**
      * The unique ID of the Assistant
      */
    var assistantSid: String = js.native
    
    /**
      * The JSON style sheet object
      */
    var data: Any = js.native
    
    /**
      * Fetch a StyleSheetInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed StyleSheetInstance
      */
    def fetch(): js.Promise[StyleSheetInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[StyleSheetInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      *
      * @returns Object
      */
    def toJSON(): AssistantSid = js.native
    
    /**
      * Update a StyleSheetInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed StyleSheetInstance
      */
    def update(): js.Promise[StyleSheetInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[StyleSheetInstance] = js.native
    /**
      * Update a StyleSheetInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed StyleSheetInstance
      */
    def update(params: StyleSheetContextUpdateOptions): js.Promise[StyleSheetInstance] = js.native
    def update(
      params: StyleSheetContextUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]
    ): js.Promise[StyleSheetInstance] = js.native
    
    var url: String = js.native
  }
  
  @js.native
  trait StyleSheetListInstance extends StObject {
    
    def apply(): StyleSheetContext = js.native
    
    var _solution: StyleSheetSolution = js.native
    
    var _uri: String = js.native
    
    var _version: default = js.native
    
    def get(): StyleSheetContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  object StyleSheetListInstance {
    
    @JSImport("twilio/lib/rest/preview/understand/assistant/styleSheet", "StyleSheetListInstance")
    @js.native
    def apply(version: default, assistantSid: String): StyleSheetListInstance = js.native
  }
  
  @js.native
  trait StyleSheetContext extends StObject {
    
    /**
      * Fetch a StyleSheetInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed StyleSheetInstance
      */
    def fetch(): js.Promise[StyleSheetInstance] = js.native
    def fetch(
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[StyleSheetInstance], Any]
    ): js.Promise[StyleSheetInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * Update a StyleSheetInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed StyleSheetInstance
      */
    def update(): js.Promise[StyleSheetInstance] = js.native
    def update(
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[StyleSheetInstance], Any]
    ): js.Promise[StyleSheetInstance] = js.native
    /**
      * Update a StyleSheetInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed StyleSheetInstance
      */
    def update(params: StyleSheetContextUpdateOptions): js.Promise[StyleSheetInstance] = js.native
    def update(
      params: StyleSheetContextUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[StyleSheetInstance], Any]
    ): js.Promise[StyleSheetInstance] = js.native
  }
  
  trait StyleSheetContextSolution extends StObject {
    
    var assistantSid: String
  }
  object StyleSheetContextSolution {
    
    inline def apply(assistantSid: String): StyleSheetContextSolution = {
      val __obj = js.Dynamic.literal(assistantSid = assistantSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyleSheetContextSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StyleSheetContextSolution] (val x: Self) extends AnyVal {
      
      inline def setAssistantSid(value: String): Self = StObject.set(x, "assistantSid", value.asInstanceOf[js.Any])
    }
  }
  
  trait StyleSheetContextUpdateOptions extends StObject {
    
    /** The JSON Style sheet string */
    var styleSheet: js.UndefOr[Any] = js.undefined
  }
  object StyleSheetContextUpdateOptions {
    
    inline def apply(): StyleSheetContextUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyleSheetContextUpdateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StyleSheetContextUpdateOptions] (val x: Self) extends AnyVal {
      
      inline def setStyleSheet(value: Any): Self = StObject.set(x, "styleSheet", value.asInstanceOf[js.Any])
      
      inline def setStyleSheetUndefined: Self = StObject.set(x, "styleSheet", js.undefined)
    }
  }
  
  trait StyleSheetResource extends StObject {
    
    var account_sid: String
    
    var assistant_sid: String
    
    var data: Any
    
    var url: String
  }
  object StyleSheetResource {
    
    inline def apply(account_sid: String, assistant_sid: String, data: Any, url: String): StyleSheetResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], assistant_sid = assistant_sid.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyleSheetResource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StyleSheetResource] (val x: Self) extends AnyVal {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAssistant_sid(value: String): Self = StObject.set(x, "assistant_sid", value.asInstanceOf[js.Any])
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait StyleSheetSolution extends StObject {
    
    var assistantSid: String
  }
  object StyleSheetSolution {
    
    inline def apply(assistantSid: String): StyleSheetSolution = {
      val __obj = js.Dynamic.literal(assistantSid = assistantSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyleSheetSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StyleSheetSolution] (val x: Self) extends AnyVal {
      
      inline def setAssistantSid(value: String): Self = StObject.set(x, "assistantSid", value.asInstanceOf[js.Any])
    }
  }
}
