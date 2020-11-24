package typings.twit.mod.Twitter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatchingRules extends js.Object {
  
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
  implicit class MatchingRulesOps[Self <: MatchingRules] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId_str(value: String): Self = this.set("id_str", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: Null): Self = this.set("tag", value.asInstanceOf[js.Any])
  }
}
