package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AstWalkOptions extends StObject {
  
  var goChildren: Boolean
  
  var stopWalking: Boolean
}
object AstWalkOptions {
  
  inline def apply(goChildren: Boolean, stopWalking: Boolean): AstWalkOptions = {
    val __obj = js.Dynamic.literal(goChildren = goChildren.asInstanceOf[js.Any], stopWalking = stopWalking.asInstanceOf[js.Any])
    __obj.asInstanceOf[AstWalkOptions]
  }
  
  extension [Self <: AstWalkOptions](x: Self) {
    
    inline def setGoChildren(value: Boolean): Self = StObject.set(x, "goChildren", value.asInstanceOf[js.Any])
    
    inline def setStopWalking(value: Boolean): Self = StObject.set(x, "stopWalking", value.asInstanceOf[js.Any])
  }
}
