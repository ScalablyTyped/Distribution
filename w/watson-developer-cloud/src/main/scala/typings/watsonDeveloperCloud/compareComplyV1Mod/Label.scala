package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A pair of `nature` and `party` objects. The `nature` object identifies the effect of the element on the identified `party`, and the `party` object identifies the affected party. */
@js.native
trait Label extends StObject {
  
  /** The identified `nature` of the element. */
  var nature: String = js.native
  
  /** The identified `party` of the element. */
  var party: String = js.native
}
object Label {
  
  @scala.inline
  def apply(nature: String, party: String): Label = {
    val __obj = js.Dynamic.literal(nature = nature.asInstanceOf[js.Any], party = party.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
  
  @scala.inline
  implicit class LabelMutableBuilder[Self <: Label] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNature(value: String): Self = StObject.set(x, "nature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParty(value: String): Self = StObject.set(x, "party", value.asInstanceOf[js.Any])
  }
}
