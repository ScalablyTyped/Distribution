package typings.vsoNodeApi.coreInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemporaryDataDTO extends StObject {
  
  var expirationSeconds: Double
  
  var origin: String
  
  var value: js.Any
}
object TemporaryDataDTO {
  
  @scala.inline
  def apply(expirationSeconds: Double, origin: String, value: js.Any): TemporaryDataDTO = {
    val __obj = js.Dynamic.literal(expirationSeconds = expirationSeconds.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemporaryDataDTO]
  }
  
  @scala.inline
  implicit class TemporaryDataDTOMutableBuilder[Self <: TemporaryDataDTO] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpirationSeconds(value: Double): Self = StObject.set(x, "expirationSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
