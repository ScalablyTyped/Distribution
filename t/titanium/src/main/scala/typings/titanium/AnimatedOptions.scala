package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A JavaScript object holding an `animated` property. Used for many UI methods as a means of specifying some transition should be animated.
  */
@js.native
trait AnimatedOptions extends StObject {
  
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
  implicit class AnimatedOptionsMutableBuilder[Self <: AnimatedOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
  }
}
