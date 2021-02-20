package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A JavaScript object holding `animated` and `duration` properties. Used on iOS For [TablewView](Titanium.UI.TableView) and [ListView](Titanium.UI.ListView) content offset transitions.
  */
@js.native
trait AnimatedWithDurationOptions extends AnimatedOptions {
  
  /**
    * The duration in `milliseconds` for animation
    */
  var duration: js.UndefOr[Double] = js.native
}
object AnimatedWithDurationOptions {
  
  @scala.inline
  def apply(): AnimatedWithDurationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimatedWithDurationOptions]
  }
  
  @scala.inline
  implicit class AnimatedWithDurationOptionsMutableBuilder[Self <: AnimatedWithDurationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
  }
}
