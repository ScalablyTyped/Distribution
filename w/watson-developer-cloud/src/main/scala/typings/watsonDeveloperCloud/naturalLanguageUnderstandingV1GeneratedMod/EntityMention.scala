package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** EntityMention. */
@js.native
trait EntityMention extends StObject {
  
  /** Character offsets indicating the beginning and end of the mention in the analyzed text. */
  var location: js.UndefOr[js.Array[Double]] = js.native
  
  /** Entity mention text. */
  var text: js.UndefOr[String] = js.native
}
object EntityMention {
  
  @scala.inline
  def apply(): EntityMention = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityMention]
  }
  
  @scala.inline
  implicit class EntityMentionMutableBuilder[Self <: EntityMention] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: js.Array[Double]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setLocationVarargs(value: Double*): Self = StObject.set(x, "location", js.Array(value :_*))
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
