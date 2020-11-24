package typings.tweenjs.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TweenStep extends js.Object {
  
  var d: Double = js.native
  
  var ease: js.Function = js.native
  
  var index: Double = js.native
  
  var next: TweenStep = js.native
  
  var passive: Boolean = js.native
  
  var prev: TweenStep = js.native
  
  var props: TweenProps = js.native
  
  var t: Double = js.native
}
object TweenStep {
  
  @scala.inline
  def apply(
    d: Double,
    ease: js.Function,
    index: Double,
    next: TweenStep,
    passive: Boolean,
    prev: TweenStep,
    props: TweenProps,
    t: Double
  ): TweenStep = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], ease = ease.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], passive = passive.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[TweenStep]
  }
  
  @scala.inline
  implicit class TweenStepOps[Self <: TweenStep] (val x: Self) extends AnyVal {
    
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
    def setEase(value: js.Function): Self = this.set("ease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: TweenStep): Self = this.set("next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassive(value: Boolean): Self = this.set("passive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrev(value: TweenStep): Self = this.set("prev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProps(value: TweenProps): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setT(value: Double): Self = this.set("t", value.asInstanceOf[js.Any])
  }
}
