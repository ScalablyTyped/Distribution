package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Example. */
trait Example extends StObject {
  
  /** The timestamp for creation of the object. */
  var created: js.UndefOr[String] = js.undefined
  
  /** An array of contextual entity mentions. */
  var mentions: js.UndefOr[js.Array[Mention]] = js.undefined
  
  /** The text of a user input example. This string must conform to the following restrictions: - It cannot contain carriage return, newline, or tab characters. - It cannot consist of only whitespace characters. - It must be no longer than 1024 characters. */
  var text: String
  
  /** The timestamp for the most recent update to the object. */
  var updated: js.UndefOr[String] = js.undefined
}
object Example {
  
  @scala.inline
  def apply(text: String): Example = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Example]
  }
  
  @scala.inline
  implicit class ExampleMutableBuilder[Self <: Example] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setMentions(value: js.Array[Mention]): Self = StObject.set(x, "mentions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMentionsUndefined: Self = StObject.set(x, "mentions", js.undefined)
    
    @scala.inline
    def setMentionsVarargs(value: Mention*): Self = StObject.set(x, "mentions", js.Array(value :_*))
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
  }
}
