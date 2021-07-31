package typings.tabris.anon

import org.scalablytyped.runtime.StringDictionary
import typings.tabris.tabrisStrings.create
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<tabris.tabris/ClientMock.ClientCreateCall> */
trait PartialClientCreateCall extends StObject {
  
  var id: js.UndefOr[String] = js.undefined
  
  var op: js.UndefOr[create] = js.undefined
  
  var properties: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object PartialClientCreateCall {
  
  @scala.inline
  def apply(): PartialClientCreateCall = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClientCreateCall]
  }
  
  @scala.inline
  implicit class PartialClientCreateCallMutableBuilder[Self <: PartialClientCreateCall] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setOp(value: create): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpUndefined: Self = StObject.set(x, "op", js.undefined)
    
    @scala.inline
    def setProperties(value: StringDictionary[js.Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
