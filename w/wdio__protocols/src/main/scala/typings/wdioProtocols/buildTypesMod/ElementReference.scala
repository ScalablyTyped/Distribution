package typings.wdioProtocols.buildTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<@wdio/protocols.@wdio/protocols/build/types.ElementReferenceId, string> */
trait ElementReference extends StObject {
  
  var `element-6066-11e4-a52e-4f735466cecf`: String
}
object ElementReference {
  
  inline def apply(`element-6066-11e4-a52e-4f735466cecf`: String): ElementReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("element-6066-11e4-a52e-4f735466cecf")(`element-6066-11e4-a52e-4f735466cecf`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElementReference] (val x: Self) extends AnyVal {
    
    inline def `setElement-6066-11e4-a52e-4f735466cecf`(value: String): Self = StObject.set(x, "element-6066-11e4-a52e-4f735466cecf", value.asInstanceOf[js.Any])
  }
}
