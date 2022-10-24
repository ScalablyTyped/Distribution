package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetIdAny extends StObject {
  
  var target: IdAny
}
object TargetIdAny {
  
  inline def apply(target: IdAny): TargetIdAny = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetIdAny]
  }
  
  extension [Self <: TargetIdAny](x: Self) {
    
    inline def setTarget(value: IdAny): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
