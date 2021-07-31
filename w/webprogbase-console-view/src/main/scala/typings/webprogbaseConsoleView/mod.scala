package typings.webprogbaseConsoleView

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("webprogbase-console-view", "ConsoleBrowser")
  @js.native
  class ConsoleBrowser () extends StObject {
    
    def open(serverPort: Double): Unit = js.native
    
    def sendRequest(req: Request): Unit = js.native
  }
  
  @JSImport("webprogbase-console-view", "InputForm")
  @js.native
  class InputForm protected () extends StObject {
    def this(nextState: String, fieldsObject: FormFields) = this()
    
    // if  private members aren't defined, typescript allows assigning anything to InputForm
    var members: js.Any = js.native
  }
  
  @JSImport("webprogbase-console-view", "Request")
  @js.native
  class Request protected () extends StObject {
    
    var data: BasicObject[js.Any] | Null = js.native
    
    var state: String = js.native
  }
  
  @JSImport("webprogbase-console-view", "Response")
  @js.native
  class Response protected () extends StObject {
    
    def redirect(toState: String): Unit = js.native
    def redirect(toState: String, data: BasicObject[js.Any]): Unit = js.native
    
    def send(text: String): Unit = js.native
    def send(text: String, statesOrForm: InputForm): Unit = js.native
    def send(text: String, statesOrForm: StateLinks): Unit = js.native
  }
  
  @JSImport("webprogbase-console-view", "ServerApp")
  @js.native
  class ServerApp () extends StObject {
    
    /**
      * Start listening for new clients' connections
      * @param port port number where server will listen for new connections
      */
    def listen(port: Double): Unit = js.native
    
    /**
      * Register a request handler function for the state
      * @param stateName name of the state
      * @param handler state request handler function
      */
    def use(stateName: String, handler: ServerAppHandler): Unit = js.native
  }
  
  type BasicObject[T] = StringDictionary[T]
  
  trait FormFieldDescriptor extends StObject {
    
    var default: js.UndefOr[String] = js.undefined
    
    var auto: js.UndefOr[String] = js.undefined
    
    var description: String
  }
  object FormFieldDescriptor {
    
    @scala.inline
    def apply(description: String): FormFieldDescriptor = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormFieldDescriptor]
    }
    
    @scala.inline
    implicit class FormFieldDescriptorMutableBuilder[Self <: FormFieldDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuto(value: String): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoUndefined: Self = StObject.set(x, "auto", js.undefined)
      
      @scala.inline
      def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    }
  }
  
  type FormFields = BasicObject[String | FormFieldDescriptor]
  
  type ServerAppHandler = js.Function2[/* req */ Request, /* res */ Response, Unit]
  
  trait StateLinkDescriptor extends StObject {
    
    var data: BasicObject[js.Any]
    
    var description: String
  }
  object StateLinkDescriptor {
    
    @scala.inline
    def apply(data: BasicObject[js.Any], description: String): StateLinkDescriptor = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateLinkDescriptor]
    }
    
    @scala.inline
    implicit class StateLinkDescriptorMutableBuilder[Self <: StateLinkDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: BasicObject[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    }
  }
  
  type StateLinks = BasicObject[String | StateLinkDescriptor]
}
