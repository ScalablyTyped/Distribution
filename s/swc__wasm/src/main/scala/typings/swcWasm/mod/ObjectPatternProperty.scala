package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.swcWasm.mod.KeyValuePatternProperty
  - typings.swcWasm.mod.AssignmentPatternProperty
  - typings.swcWasm.mod.RestElement
*/
trait ObjectPatternProperty extends StObject
object ObjectPatternProperty {
  
  inline def AssignmentPatternProperty(key: Identifier, span: Span): typings.swcWasm.mod.AssignmentPatternProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssignmentPatternProperty")
    __obj.asInstanceOf[typings.swcWasm.mod.AssignmentPatternProperty]
  }
  
  inline def KeyValuePatternProperty(key: PropertyName, value: Pattern): typings.swcWasm.mod.KeyValuePatternProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("KeyValuePatternProperty")
    __obj.asInstanceOf[typings.swcWasm.mod.KeyValuePatternProperty]
  }
  
  inline def RestElement(argument: Pattern, rest: Span, span: Span): typings.swcWasm.mod.RestElement = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RestElement")
    __obj.asInstanceOf[typings.swcWasm.mod.RestElement]
  }
}
