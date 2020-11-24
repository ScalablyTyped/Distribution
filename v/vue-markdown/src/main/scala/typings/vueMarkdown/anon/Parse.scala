package typings.vueMarkdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parse extends js.Object {
  
  var State: js.Any = js.native
  
  var parse: js.Any = js.native
  
  var ruler: After = js.native
  
  var tokenize: js.Any = js.native
}
object Parse {
  
  @scala.inline
  def apply(State: js.Any, parse: js.Any, ruler: After, tokenize: js.Any): Parse = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any], parse = parse.asInstanceOf[js.Any], ruler = ruler.asInstanceOf[js.Any], tokenize = tokenize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parse]
  }
  
  @scala.inline
  implicit class ParseOps[Self <: Parse] (val x: Self) extends AnyVal {
    
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
    def setState(value: js.Any): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParse(value: js.Any): Self = this.set("parse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuler(value: After): Self = this.set("ruler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenize(value: js.Any): Self = this.set("tokenize", value.asInstanceOf[js.Any])
  }
}
