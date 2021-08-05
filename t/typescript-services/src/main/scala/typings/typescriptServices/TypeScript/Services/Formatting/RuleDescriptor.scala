package typings.typescriptServices.TypeScript.Services.Formatting

import typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleDescriptor extends StObject {
  
  var LeftTokenRange: TokenRange
  
  var RightTokenRange: TokenRange
}
object RuleDescriptor {
  
  inline def apply(LeftTokenRange: TokenRange, RightTokenRange: TokenRange): RuleDescriptor = {
    val __obj = js.Dynamic.literal(LeftTokenRange = LeftTokenRange.asInstanceOf[js.Any], RightTokenRange = RightTokenRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleDescriptor]
  }
  
  extension [Self <: RuleDescriptor](x: Self) {
    
    inline def setLeftTokenRange(value: TokenRange): Self = StObject.set(x, "LeftTokenRange", value.asInstanceOf[js.Any])
    
    inline def setRightTokenRange(value: TokenRange): Self = StObject.set(x, "RightTokenRange", value.asInstanceOf[js.Any])
  }
}
