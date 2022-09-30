package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.swcCore.typesMod.KeyValuePatternProperty
  - typings.swcCore.typesMod.AssignmentPatternProperty
  - typings.swcCore.typesMod.RestElement
*/
trait ObjectPatternProperty extends StObject
object ObjectPatternProperty {
  
  inline def AssignmentPatternProperty(key: Identifier, span: Span): typings.swcCore.typesMod.AssignmentPatternProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssignmentPatternProperty")
    __obj.asInstanceOf[typings.swcCore.typesMod.AssignmentPatternProperty]
  }
  
  inline def KeyValuePatternProperty(key: PropertyName, value: Pattern): typings.swcCore.typesMod.KeyValuePatternProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("KeyValuePatternProperty")
    __obj.asInstanceOf[typings.swcCore.typesMod.KeyValuePatternProperty]
  }
  
  inline def RestElement(argument: Pattern, rest: Span, span: Span): typings.swcCore.typesMod.RestElement = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RestElement")
    __obj.asInstanceOf[typings.swcCore.typesMod.RestElement]
  }
}
