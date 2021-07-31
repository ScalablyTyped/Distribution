package typings.tabris.anon

import org.scalablytyped.runtime.StringDictionary
import typings.tabris.tabrisStrings.call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<tabris.tabris/ClientMock.ClientCallCall> */
trait PartialClientCallCall extends StObject {
  
  var id: js.UndefOr[String] = js.undefined
  
  var method: js.UndefOr[String] = js.undefined
  
  var op: js.UndefOr[call] = js.undefined
  
  var parameters: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}
object PartialClientCallCall {
  
  @scala.inline
  def apply(): PartialClientCallCall = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClientCallCall]
  }
  
  @scala.inline
  implicit class PartialClientCallCallMutableBuilder[Self <: PartialClientCallCall] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setOp(value: call): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpUndefined: Self = StObject.set(x, "op", js.undefined)
    
    @scala.inline
    def setParameters(value: StringDictionary[js.Any]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
  }
}
