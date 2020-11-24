package typings.webpackBlocksDevServer.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RewritesObject extends js.Object {
  
  var from: RegExp = js.native
  
  var to: String | RewritesToFunction = js.native
}
object RewritesObject {
  
  @scala.inline
  def apply(from: RegExp, to: String | RewritesToFunction): RewritesObject = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[RewritesObject]
  }
  
  @scala.inline
  implicit class RewritesObjectOps[Self <: RewritesObject] (val x: Self) extends AnyVal {
    
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
    def setFrom(value: RegExp): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToFunction1(value: /* context */ ContextObject => String): Self = this.set("to", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTo(value: String | RewritesToFunction): Self = this.set("to", value.asInstanceOf[js.Any])
  }
}
