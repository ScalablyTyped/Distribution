package typings.tonicUiReact.mod

import typings.tonicUiReact.tonicUiReactStrings.down
import typings.tonicUiReact.tonicUiReactStrings.left
import typings.tonicUiReact.tonicUiReactStrings.right
import typings.tonicUiReact.tonicUiReactStrings.up
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitionSlideProps
  extends StObject
     with TransitionProps {
  
  var direction: js.UndefOr[up | down | left | right] = js.undefined
}
object TransitionSlideProps {
  
  inline def apply(TransitionProps: TransitionProps): TransitionSlideProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, TransitionProps)
    __obj.asInstanceOf[TransitionSlideProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransitionSlideProps] (val x: Self) extends AnyVal {
    
    inline def setDirection(value: up | down | left | right): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
  }
}
