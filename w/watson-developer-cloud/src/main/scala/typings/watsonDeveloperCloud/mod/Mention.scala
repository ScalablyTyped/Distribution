package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A mention of a contextual entity. */
trait Mention extends StObject {
  
  /** The name of the entity. */
  var entity: String
  
  /** An array of zero-based character offsets that indicate where the entity mentions begin and end in the input text. */
  var location: js.Array[Double]
}
object Mention {
  
  @scala.inline
  def apply(entity: String, location: js.Array[Double]): Mention = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mention]
  }
  
  @scala.inline
  implicit class MentionMutableBuilder[Self <: Mention] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntity(value: String): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: js.Array[Double]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationVarargs(value: Double*): Self = StObject.set(x, "location", js.Array(value :_*))
  }
}
