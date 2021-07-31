package typings.stripe.anon

import typings.stripe.mod.customerTaxIds.TaxIdType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  /**
    * Type of the tax ID, one of au_abn, eu_vat, in_gst, no_vat, or nz_gst.
    */
  var `type`: TaxIdType
  
  /**
    * Value of the tax ID.
    */
  var value: String
}
object Type {
  
  @scala.inline
  def apply(`type`: TaxIdType, value: String): Type = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  @scala.inline
  implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TaxIdType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
