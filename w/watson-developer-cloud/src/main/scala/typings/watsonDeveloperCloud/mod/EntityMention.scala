package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An object describing a contextual entity mention. */
@js.native
trait EntityMention extends StObject {
  
  /** The name of the intent. */
  var intent: String = js.native
  
  /** An array of zero-based character offsets that indicate where the entity mentions begin and end in the input text. */
  var location: js.Array[Double] = js.native
  
  /** The text of the user input example. */
  var text: String = js.native
}
object EntityMention {
  
  @scala.inline
  def apply(intent: String, location: js.Array[Double], text: String): EntityMention = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityMention]
  }
  
  @scala.inline
  implicit class EntityMentionMutableBuilder[Self <: EntityMention] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIntent(value: String): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: js.Array[Double]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationVarargs(value: Double*): Self = StObject.set(x, "location", js.Array(value :_*))
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
