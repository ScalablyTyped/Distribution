package typings.vueRouter.mod

import typings.std.Element
import typings.std.ScrollToOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollPositionElement
  extends StObject
     with ScrollToOptions
     with ScrollPosition {
  
  /**
    * A valid CSS selector. Note some characters must be escaped in id selectors (https://mathiasbynens.be/notes/css-escapes).
    * @example
    * Here are a few examples:
    *
    * - `.title`
    * - `.content:first-child`
    * - `#marker`
    * - `#marker\~with\~symbols`
    * - `#marker.with.dot`: selects `class="with dot" id="marker"`, not `id="marker.with.dot"`
    *
    */
  var el: String | Element
}
object ScrollPositionElement {
  
  inline def apply(el: String | Element): ScrollPositionElement = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollPositionElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScrollPositionElement] (val x: Self) extends AnyVal {
    
    inline def setEl(value: String | Element): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
  }
}
