package typings.videoReact.mod

import typings.videoReact.videoReactStrings.`left-bottom`
import typings.videoReact.videoReactStrings.`left-top`
import typings.videoReact.videoReactStrings.`right-bottom`
import typings.videoReact.videoReactStrings.`right-top`
import typings.videoReact.videoReactStrings.center
import typings.videoReact.videoReactStrings.left
import typings.videoReact.videoReactStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BigPlayButtonProps extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * Determines the position of the big play button.
    */
  var position: js.UndefOr[
    center | left | `left-top` | `left-bottom` | right | `right-top` | `right-bottom`
  ] = js.undefined
}
object BigPlayButtonProps {
  
  inline def apply(): BigPlayButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BigPlayButtonProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BigPlayButtonProps] (val x: Self) extends AnyVal {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setPosition(value: center | left | `left-top` | `left-bottom` | right | `right-top` | `right-bottom`): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
