package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A JavaScript object holding an `animated` property. Used for many UI methods as a means of specifying some transition should be animated.
  */
@js.native
trait AnimatedOptions extends js.Object {
  
  /**
    * If `true`, animate a transition for the method/value change.
    * Note that for most uses cases the default is assumed to be `false`. The exceptions tend to be <Titanium.UI.Window> methods.
    */
  var animated: js.UndefOr[Boolean] = js.native
}
object AnimatedOptions {
  
  @scala.inline
  def apply(): AnimatedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimatedOptions]
  }
  
  @scala.inline
  implicit class AnimatedOptionsOps[Self <: AnimatedOptions] (val x: Self) extends AnyVal {
    
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
    def setAnimated(value: Boolean): Self = this.set("animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimated: Self = this.set("animated", js.undefined)
  }
}
