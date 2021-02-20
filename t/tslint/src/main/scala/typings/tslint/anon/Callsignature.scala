package typings.tslint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Callsignature extends StObject {
  
  var `call-signature`: String = js.native
  
  var `index-signature`: String = js.native
  
  var parameter: String = js.native
  
  var `property-declaration`: String = js.native
  
  var `variable-declaration`: String = js.native
}
object Callsignature {
  
  @scala.inline
  def apply(
    `call-signature`: String,
    `index-signature`: String,
    parameter: String,
    `property-declaration`: String,
    `variable-declaration`: String
  ): Callsignature = {
    val __obj = js.Dynamic.literal(parameter = parameter.asInstanceOf[js.Any])
    __obj.updateDynamic("call-signature")(`call-signature`.asInstanceOf[js.Any])
    __obj.updateDynamic("index-signature")(`index-signature`.asInstanceOf[js.Any])
    __obj.updateDynamic("property-declaration")(`property-declaration`.asInstanceOf[js.Any])
    __obj.updateDynamic("variable-declaration")(`variable-declaration`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Callsignature]
  }
  
  @scala.inline
  implicit class CallsignatureMutableBuilder[Self <: Callsignature] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setCall-signature`(value: String): Self = StObject.set(x, "call-signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setIndex-signature`(value: String): Self = StObject.set(x, "index-signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameter(value: String): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setProperty-declaration`(value: String): Self = StObject.set(x, "property-declaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setVariable-declaration`(value: String): Self = StObject.set(x, "variable-declaration", value.asInstanceOf[js.Any])
  }
}
