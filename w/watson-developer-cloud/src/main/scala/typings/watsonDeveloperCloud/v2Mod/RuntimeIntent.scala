package typings.watsonDeveloperCloud.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An intent identified in the user input. */
trait RuntimeIntent extends StObject {
  
  /** A decimal percentage that represents Watson's confidence in the intent. */
  var confidence: Double
  
  /** The name of the recognized intent. */
  var intent: String
}
object RuntimeIntent {
  
  @scala.inline
  def apply(confidence: Double, intent: String): RuntimeIntent = {
    val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeIntent]
  }
  
  @scala.inline
  implicit class RuntimeIntentMutableBuilder[Self <: RuntimeIntent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntent(value: String): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
  }
}
