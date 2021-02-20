package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PullAdditionalObjectLiteralResolutionData extends StObject {
  
  var membersContextTypeSymbols: js.Array[PullTypeSymbol] = js.native
}
object PullAdditionalObjectLiteralResolutionData {
  
  @scala.inline
  def apply(membersContextTypeSymbols: js.Array[PullTypeSymbol]): PullAdditionalObjectLiteralResolutionData = {
    val __obj = js.Dynamic.literal(membersContextTypeSymbols = membersContextTypeSymbols.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullAdditionalObjectLiteralResolutionData]
  }
  
  @scala.inline
  implicit class PullAdditionalObjectLiteralResolutionDataMutableBuilder[Self <: PullAdditionalObjectLiteralResolutionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMembersContextTypeSymbols(value: js.Array[PullTypeSymbol]): Self = StObject.set(x, "membersContextTypeSymbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersContextTypeSymbolsVarargs(value: PullTypeSymbol*): Self = StObject.set(x, "membersContextTypeSymbols", js.Array(value :_*))
  }
}
