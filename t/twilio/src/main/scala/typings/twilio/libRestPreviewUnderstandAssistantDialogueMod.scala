package typings.twilio

import typings.twilio.anon.Sid
import typings.twilio.libRestPreviewUnderstandMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewUnderstandAssistantDialogueMod {
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/dialogue", "DialogueContextImpl")
  @js.native
  open class DialogueContextImpl protected ()
    extends StObject
       with DialogueContext {
    def this(_version: default, assistantSid: String, sid: String) = this()
    
    /* protected */ var _solution: DialogueContextSolution = js.native
    
    /* protected */ var _uri: String = js.native
    
    /* protected */ var _version: default = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/dialogue", "DialogueInstance")
  @js.native
  open class DialogueInstance protected () extends StObject {
    def this(_version: default, payload: DialogueResource, assistantSid: String) = this()
    def this(_version: default, payload: DialogueResource, assistantSid: String, sid: String) = this()
    
    /* protected */ var _context: js.UndefOr[DialogueContext] = js.native
    
    /* private */ def _proxy: Any = js.native
    
    /* protected */ var _solution: DialogueContextSolution = js.native
    
    /* protected */ var _version: default = js.native
    
    /**
      * The unique ID of the Account that created this Field.
      */
    var accountSid: String = js.native
    
    /**
      * The unique ID of the parent Assistant.
      */
    var assistantSid: String = js.native
    
    /**
      * The dialogue memory object as json
      */
    var data: Any = js.native
    
    /**
      * Fetch a DialogueInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed DialogueInstance
      */
    def fetch(): js.Promise[DialogueInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[DialogueInstance] = js.native
    
    /**
      * The unique ID of the Dialogue
      */
    var sid: String = js.native
    
    /**
      * Provide a user-friendly representation
      *
      * @returns Object
      */
    def toJSON(): Sid = js.native
    
    var url: String = js.native
  }
  
  @js.native
  trait DialogueListInstance extends StObject {
    
    def apply(sid: String): DialogueContext = js.native
    
    var _solution: DialogueSolution = js.native
    
    var _uri: String = js.native
    
    var _version: default = js.native
    
    def get(sid: String): DialogueContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  object DialogueListInstance {
    
    @JSImport("twilio/lib/rest/preview/understand/assistant/dialogue", "DialogueListInstance")
    @js.native
    def apply(version: default, assistantSid: String): DialogueListInstance = js.native
  }
  
  @js.native
  trait DialogueContext extends StObject {
    
    /**
      * Fetch a DialogueInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed DialogueInstance
      */
    def fetch(): js.Promise[DialogueInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[DialogueInstance], Any]): js.Promise[DialogueInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait DialogueContextSolution extends StObject {
    
    var assistantSid: String
    
    var sid: String
  }
  object DialogueContextSolution {
    
    inline def apply(assistantSid: String, sid: String): DialogueContextSolution = {
      val __obj = js.Dynamic.literal(assistantSid = assistantSid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[DialogueContextSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DialogueContextSolution] (val x: Self) extends AnyVal {
      
      inline def setAssistantSid(value: String): Self = StObject.set(x, "assistantSid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait DialogueResource extends StObject {
    
    var account_sid: String
    
    var assistant_sid: String
    
    var data: Any
    
    var sid: String
    
    var url: String
  }
  object DialogueResource {
    
    inline def apply(account_sid: String, assistant_sid: String, data: Any, sid: String, url: String): DialogueResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], assistant_sid = assistant_sid.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[DialogueResource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DialogueResource] (val x: Self) extends AnyVal {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAssistant_sid(value: String): Self = StObject.set(x, "assistant_sid", value.asInstanceOf[js.Any])
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait DialogueSolution extends StObject {
    
    var assistantSid: String
  }
  object DialogueSolution {
    
    inline def apply(assistantSid: String): DialogueSolution = {
      val __obj = js.Dynamic.literal(assistantSid = assistantSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[DialogueSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DialogueSolution] (val x: Self) extends AnyVal {
      
      inline def setAssistantSid(value: String): Self = StObject.set(x, "assistantSid", value.asInstanceOf[js.Any])
    }
  }
}
