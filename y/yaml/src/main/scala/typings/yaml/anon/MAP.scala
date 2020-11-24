package typings.yaml.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MAP extends js.Object {
  
  /** Default: `'tag:yaml.org,2002:map'` */
  var MAP: String = js.native
  
  /** Default: `'tag:yaml.org,2002:seq'` */
  var SEQ: String = js.native
  
  /** Default: `'tag:yaml.org,2002:str'` */
  var STR: String = js.native
}
object MAP {
  
  @scala.inline
  def apply(MAP: String, SEQ: String, STR: String): MAP = {
    val __obj = js.Dynamic.literal(MAP = MAP.asInstanceOf[js.Any], SEQ = SEQ.asInstanceOf[js.Any], STR = STR.asInstanceOf[js.Any])
    __obj.asInstanceOf[MAP]
  }
  
  @scala.inline
  implicit class MAPOps[Self <: MAP] (val x: Self) extends AnyVal {
    
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
    def setMAP(value: String): Self = this.set("MAP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSEQ(value: String): Self = this.set("SEQ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSTR(value: String): Self = this.set("STR", value.asInstanceOf[js.Any])
  }
}
