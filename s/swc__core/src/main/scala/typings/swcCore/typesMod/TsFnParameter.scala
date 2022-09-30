package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.swcCore.typesMod.BindingIdentifier
  - typings.swcCore.typesMod.ArrayPattern
  - typings.swcCore.typesMod.RestElement
  - typings.swcCore.typesMod.ObjectPattern
*/
trait TsFnParameter extends StObject
object TsFnParameter {
  
  inline def ArrayPattern(elements: js.Array[js.UndefOr[Pattern]], optional: Boolean, span: Span): typings.swcCore.typesMod.ArrayPattern = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayPattern")
    __obj.asInstanceOf[typings.swcCore.typesMod.ArrayPattern]
  }
  
  inline def BindingIdentifier(optional: Boolean, span: Span, value: String): typings.swcCore.typesMod.BindingIdentifier = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typings.swcCore.typesMod.BindingIdentifier]
  }
  
  inline def ObjectPattern(optional: Boolean, properties: js.Array[ObjectPatternProperty], span: Span): typings.swcCore.typesMod.ObjectPattern = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectPattern")
    __obj.asInstanceOf[typings.swcCore.typesMod.ObjectPattern]
  }
  
  inline def RestElement(argument: Pattern, rest: Span, span: Span): typings.swcCore.typesMod.RestElement = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RestElement")
    __obj.asInstanceOf[typings.swcCore.typesMod.RestElement]
  }
}
