package typings.webprogbaseConsoleView

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("webprogbase-console-view", "ConsoleBrowser")
  @js.native
  open class ConsoleBrowser () extends StObject {
    
    def open(serverPort: Double): Unit = js.native
    
    def sendRequest(req: Request): Unit = js.native
  }
  
  @JSImport("webprogbase-console-view", "InputForm")
  @js.native
  open class InputForm protected () extends StObject {
    def this(nextState: String, fieldsObject: FormFields) = this()
    
    // if  private members aren't defined, typescript allows assigning anything to InputForm
    /* private */ var members: Any = js.native
  }
  
  @JSImport("webprogbase-console-view", "Request")
  @js.native
  /* private */ open class Request () extends StObject {
    
    var data: BasicObject[Any] | Null = js.native
    
    var state: String = js.native
  }
  
  @JSImport("webprogbase-console-view", "Response")
  @js.native
  /* private */ open class Response () extends StObject {
    
    def redirect(toState: String): Unit = js.native
    def redirect(toState: String, data: BasicObject[Any]): Unit = js.native
    
    def send(text: String): Unit = js.native
    def send(text: String, statesOrForm: InputForm): Unit = js.native
    def send(text: String, statesOrForm: StateLinks): Unit = js.native
  }
  
  @JSImport("webprogbase-console-view", "ServerApp")
  @js.native
  open class ServerApp () extends StObject {
    
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
    
    inline def apply(description: String): FormFieldDescriptor = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormFieldDescriptor]
    }
    
    extension [Self <: FormFieldDescriptor](x: Self) {
      
      inline def setAuto(value: String): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
      
      inline def setAutoUndefined: Self = StObject.set(x, "auto", js.undefined)
      
      inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    }
  }
  
  type FormFields = BasicObject[String | FormFieldDescriptor]
  
  type ServerAppHandler = js.Function2[/* req */ Request, /* res */ Response, Unit]
  
  trait StateLinkDescriptor extends StObject {
    
    var data: BasicObject[Any]
    
    var description: String
  }
  object StateLinkDescriptor {
    
    inline def apply(data: BasicObject[Any], description: String): StateLinkDescriptor = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateLinkDescriptor]
    }
    
    extension [Self <: StateLinkDescriptor](x: Self) {
      
      inline def setData(value: BasicObject[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    }
  }
  
  type StateLinks = BasicObject[String | StateLinkDescriptor]
}
