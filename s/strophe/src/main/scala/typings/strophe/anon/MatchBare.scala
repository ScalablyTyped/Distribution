package typings.strophe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatchBare extends js.Object {
  
  var matchBare: Boolean = js.native
}
object MatchBare {
  
  @scala.inline
  def apply(matchBare: Boolean): MatchBare = {
    val __obj = js.Dynamic.literal(matchBare = matchBare.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchBare]
  }
  
  @scala.inline
  implicit class MatchBareOps[Self <: MatchBare] (val x: Self) extends AnyVal {
    
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
    def setMatchBare(value: Boolean): Self = this.set("matchBare", value.asInstanceOf[js.Any])
  }
}
