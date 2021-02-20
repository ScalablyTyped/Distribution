package typings.vsoNodeApi.coreInterfacesMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemporaryDataCreatedDTO extends TemporaryDataDTO {
  
  var expirationDate: Date = js.native
  
  var id: String = js.native
  
  var url: String = js.native
}
object TemporaryDataCreatedDTO {
  
  @scala.inline
  def apply(
    expirationDate: Date,
    expirationSeconds: Double,
    id: String,
    origin: String,
    url: String,
    value: js.Any
  ): TemporaryDataCreatedDTO = {
    val __obj = js.Dynamic.literal(expirationDate = expirationDate.asInstanceOf[js.Any], expirationSeconds = expirationSeconds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemporaryDataCreatedDTO]
  }
  
  @scala.inline
  implicit class TemporaryDataCreatedDTOMutableBuilder[Self <: TemporaryDataCreatedDTO] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpirationDate(value: Date): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
