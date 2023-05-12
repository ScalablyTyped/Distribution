package typings.svelte.anon

import typings.svelte.typesRuntimeInternalAnimationsMod.PositionRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait To extends StObject {
  
  var from: PositionRect
  
  var to: PositionRect
}
object To {
  
  inline def apply(from: PositionRect, to: PositionRect): To = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[To]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: To] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: PositionRect): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setTo(value: PositionRect): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
