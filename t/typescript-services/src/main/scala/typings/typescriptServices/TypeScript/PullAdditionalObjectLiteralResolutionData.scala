package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PullAdditionalObjectLiteralResolutionData extends StObject {
  
  var membersContextTypeSymbols: js.Array[PullTypeSymbol]
}
object PullAdditionalObjectLiteralResolutionData {
  
  inline def apply(membersContextTypeSymbols: js.Array[PullTypeSymbol]): PullAdditionalObjectLiteralResolutionData = {
    val __obj = js.Dynamic.literal(membersContextTypeSymbols = membersContextTypeSymbols.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullAdditionalObjectLiteralResolutionData]
  }
  
  extension [Self <: PullAdditionalObjectLiteralResolutionData](x: Self) {
    
    inline def setMembersContextTypeSymbols(value: js.Array[PullTypeSymbol]): Self = StObject.set(x, "membersContextTypeSymbols", value.asInstanceOf[js.Any])
    
    inline def setMembersContextTypeSymbolsVarargs(value: PullTypeSymbol*): Self = StObject.set(x, "membersContextTypeSymbols", js.Array(value*))
  }
}
