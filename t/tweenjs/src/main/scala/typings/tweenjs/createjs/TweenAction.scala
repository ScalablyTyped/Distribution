package typings.tweenjs.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TweenAction extends js.Object {
  
  var d: Double = js.native
  
  var funct: js.Function = js.native
  
  var next: TweenAction = js.native
  
  var params: js.Array[_] = js.native
  
  var prev: TweenAction = js.native
  
  var scope: js.Any = js.native
  
  var t: Double = js.native
}
object TweenAction {
  
  @scala.inline
  def apply(
    d: Double,
    funct: js.Function,
    next: TweenAction,
    params: js.Array[_],
    prev: TweenAction,
    scope: js.Any,
    t: Double
  ): TweenAction = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], funct = funct.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[TweenAction]
  }
  
  @scala.inline
  implicit class TweenActionOps[Self <: TweenAction] (val x: Self) extends AnyVal {
    
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
    def setD(value: Double): Self = this.set("d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunct(value: js.Function): Self = this.set("funct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: TweenAction): Self = this.set("next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsVarargs(value: js.Any*): Self = this.set("params", js.Array(value :_*))
    
    @scala.inline
    def setParams(value: js.Array[_]): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrev(value: TweenAction): Self = this.set("prev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: js.Any): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setT(value: Double): Self = this.set("t", value.asInstanceOf[js.Any])
  }
}
