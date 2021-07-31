package typings.wixUiCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreetAddress extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var number: js.UndefOr[String] = js.undefined
}
object StreetAddress {
  
  @scala.inline
  def apply(): StreetAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreetAddress]
  }
  
  @scala.inline
  implicit class StreetAddressMutableBuilder[Self <: StreetAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
  }
}
