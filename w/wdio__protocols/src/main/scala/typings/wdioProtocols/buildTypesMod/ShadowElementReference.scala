package typings.wdioProtocols.buildTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<@wdio/protocols.@wdio/protocols/build/types.ShadowElementReferenceId, string> */
trait ShadowElementReference extends StObject {
  
  var `shadow-6066-11e4-a52e-4f735466cecf`: String
}
object ShadowElementReference {
  
  inline def apply(`shadow-6066-11e4-a52e-4f735466cecf`: String): ShadowElementReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("shadow-6066-11e4-a52e-4f735466cecf")(`shadow-6066-11e4-a52e-4f735466cecf`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowElementReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShadowElementReference] (val x: Self) extends AnyVal {
    
    inline def `setShadow-6066-11e4-a52e-4f735466cecf`(value: String): Self = StObject.set(x, "shadow-6066-11e4-a52e-4f735466cecf", value.asInstanceOf[js.Any])
  }
}
