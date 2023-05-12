package typings.tonicUiReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitionScaleProps
  extends StObject
     with TransitionProps {
  
  var initialScale: js.UndefOr[Double] = js.undefined
}
object TransitionScaleProps {
  
  inline def apply(TransitionProps: TransitionProps): TransitionScaleProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, TransitionProps)
    __obj.asInstanceOf[TransitionScaleProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransitionScaleProps] (val x: Self) extends AnyVal {
    
    inline def setInitialScale(value: Double): Self = StObject.set(x, "initialScale", value.asInstanceOf[js.Any])
    
    inline def setInitialScaleUndefined: Self = StObject.set(x, "initialScale", js.undefined)
  }
}
