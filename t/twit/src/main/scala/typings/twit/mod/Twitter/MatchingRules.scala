package typings.twit.mod.Twitter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatchingRules extends StObject {
  
  var id: Double = js.native
  
  var id_str: String = js.native
  
  var tag: Null = js.native
}
object MatchingRules {
  
  @scala.inline
  def apply(id: Double, id_str: String, tag: Null): MatchingRules = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], id_str = id_str.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchingRules]
  }
  
  @scala.inline
  implicit class MatchingRulesMutableBuilder[Self <: MatchingRules] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId_str(value: String): Self = StObject.set(x, "id_str", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: Null): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
