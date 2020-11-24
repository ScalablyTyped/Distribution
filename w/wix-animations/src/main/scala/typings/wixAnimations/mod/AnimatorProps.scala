package typings.wixAnimations.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimatorProps extends js.Object {
  
  var childClassName: js.UndefOr[String] = js.native
  
  var children: ReactNode = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var dataHook: js.UndefOr[String] = js.native
  
  var debug: js.UndefOr[Boolean] = js.native
  
  var delay: js.UndefOr[Delay] = js.native
  
  var height: js.UndefOr[Boolean | Double | (js.Function1[/* element */ js.Any, Double])] = js.native
  
  var opacity: js.UndefOr[Boolean] = js.native
  
  var scale: js.UndefOr[Boolean] = js.native
  
  var sequence: js.UndefOr[Sequence | Boolean] = js.native
  
  var show: js.UndefOr[Boolean] = js.native
  
  var timing: js.UndefOr[Timing] = js.native
  
  var translate: js.UndefOr[Translate | Boolean | String] = js.native
  
  var width: js.UndefOr[Boolean | Double | (js.Function1[/* element */ js.Any, Double])] = js.native
}
object AnimatorProps {
  
  @scala.inline
  def apply(): AnimatorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimatorProps]
  }
  
  @scala.inline
  implicit class AnimatorPropsOps[Self <: AnimatorProps] (val x: Self) extends AnyVal {
    
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
    def setChildClassName(value: String): Self = this.set("childClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildClassName: Self = this.set("childClassName", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDataHook(value: String): Self = this.set("dataHook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataHook: Self = this.set("dataHook", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setDelay(value: Delay): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setHeightFunction1(value: /* element */ js.Any => Double): Self = this.set("height", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeight(value: Boolean | Double | (js.Function1[/* element */ js.Any, Double])): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setOpacity(value: Boolean): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setScale(value: Boolean): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setSequence(value: Sequence | Boolean): Self = this.set("sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSequence: Self = this.set("sequence", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setTiming(value: Timing): Self = this.set("timing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTiming: Self = this.set("timing", js.undefined)
    
    @scala.inline
    def setTranslate(value: Translate | Boolean | String): Self = this.set("translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslate: Self = this.set("translate", js.undefined)
    
    @scala.inline
    def setWidthFunction1(value: /* element */ js.Any => Double): Self = this.set("width", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWidth(value: Boolean | Double | (js.Function1[/* element */ js.Any, Double])): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
