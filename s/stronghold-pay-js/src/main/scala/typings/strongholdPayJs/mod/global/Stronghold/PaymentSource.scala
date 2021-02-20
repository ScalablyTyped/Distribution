package typings.strongholdPayJs.mod.global.Stronghold

import typings.strongholdPayJs.strongholdPayJsStrings.bank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentSource extends StObject {
  
  var id: String = js.native
  
  var label: String = js.native
  
  var `type`: bank = js.native
}
object PaymentSource {
  
  @scala.inline
  def apply(id: String, label: String, `type`: bank): PaymentSource = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentSource]
  }
  
  @scala.inline
  implicit class PaymentSourceMutableBuilder[Self <: PaymentSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: bank): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
