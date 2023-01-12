package typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Utterance. */
trait Utterance extends StObject {
  
  /** An utterance contributed by a user in the conversation that is to be analyzed. The utterance can contain multiple sentences. */
  var text: String
  
  /** A string that identifies the user who contributed the utterance specified by the `text` parameter. */
  var user: js.UndefOr[String] = js.undefined
}
object Utterance {
  
  inline def apply(text: String): Utterance = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Utterance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Utterance] (val x: Self) extends AnyVal {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
