package typings.victory.anon

import typings.victory.mod.AnimationStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Before extends StObject {
  
  var before: js.UndefOr[js.Function1[/* datum */ js.Any, AnimationStyle]] = js.native
  
  var duration: js.UndefOr[Double] = js.native
}
object Before {
  
  @scala.inline
  def apply(): Before = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Before]
  }
  
  @scala.inline
  implicit class BeforeMutableBuilder[Self <: Before] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBefore(value: /* datum */ js.Any => AnimationStyle): Self = StObject.set(x, "before", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
  }
}
