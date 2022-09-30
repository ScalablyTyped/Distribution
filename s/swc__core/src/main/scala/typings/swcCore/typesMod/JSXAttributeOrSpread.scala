package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.swcCore.typesMod.JSXAttribute
  - typings.swcCore.typesMod.SpreadElement
*/
trait JSXAttributeOrSpread extends StObject
object JSXAttributeOrSpread {
  
  inline def JSXAttribute(name: JSXAttributeName, span: Span): typings.swcCore.typesMod.JSXAttribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXAttribute")
    __obj.asInstanceOf[typings.swcCore.typesMod.JSXAttribute]
  }
  
  inline def SpreadElement(arguments: Expression, spread: Span): typings.swcCore.typesMod.SpreadElement = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], spread = spread.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SpreadElement")
    __obj.asInstanceOf[typings.swcCore.typesMod.SpreadElement]
  }
}
