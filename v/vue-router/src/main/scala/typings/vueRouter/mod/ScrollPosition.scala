package typings.vueRouter.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vueRouter.mod.ScrollPositionCoordinates
  - typings.vueRouter.mod.ScrollPositionElement
*/
trait ScrollPosition extends StObject
object ScrollPosition {
  
  inline def ScrollPositionCoordinates(): typings.vueRouter.mod.ScrollPositionCoordinates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.vueRouter.mod.ScrollPositionCoordinates]
  }
  
  inline def ScrollPositionElement(el: String | Element): typings.vueRouter.mod.ScrollPositionElement = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vueRouter.mod.ScrollPositionElement]
  }
}
