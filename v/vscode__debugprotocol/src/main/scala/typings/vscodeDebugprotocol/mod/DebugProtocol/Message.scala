package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A structured message object. Used to return errors from requests. */
trait Message extends StObject {
  
  /** A format string for the message. Embedded variables have the form `{name}`.
  			If variable name starts with an underscore character, the variable does not contain user data (PII) and can be safely used for telemetry purposes.
  		*/
  var format: String
  
  /** Unique identifier for the message. */
  var id: Double
  
  /** If true send to telemetry. */
  var sendTelemetry: js.UndefOr[Boolean] = js.undefined
  
  /** If true show user. */
  var showUser: js.UndefOr[Boolean] = js.undefined
  
  /** A url where additional information about this message can be found. */
  var url: js.UndefOr[String] = js.undefined
  
  /** A label that is presented to the user as the UI for opening the url. */
  var urlLabel: js.UndefOr[String] = js.undefined
  
  /** An object used as a dictionary for looking up the variables in the format string. */
  var variables: js.UndefOr[StringDictionary[String]] = js.undefined
}
object Message {
  
  inline def apply(format: String, id: Double): Message = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSendTelemetry(value: Boolean): Self = StObject.set(x, "sendTelemetry", value.asInstanceOf[js.Any])
    
    inline def setSendTelemetryUndefined: Self = StObject.set(x, "sendTelemetry", js.undefined)
    
    inline def setShowUser(value: Boolean): Self = StObject.set(x, "showUser", value.asInstanceOf[js.Any])
    
    inline def setShowUserUndefined: Self = StObject.set(x, "showUser", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlLabel(value: String): Self = StObject.set(x, "urlLabel", value.asInstanceOf[js.Any])
    
    inline def setUrlLabelUndefined: Self = StObject.set(x, "urlLabel", js.undefined)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setVariables(value: StringDictionary[String]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    inline def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
  }
}
