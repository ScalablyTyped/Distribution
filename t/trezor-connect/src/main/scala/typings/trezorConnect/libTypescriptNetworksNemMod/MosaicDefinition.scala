package typings.trezorConnect.libTypescriptNetworksNemMod

import typings.trezorConnect.anon.MosaicId
import typings.trezorConnect.anon.NameValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MosaicDefinition extends StObject {
  
  var description: String
  
  var id: MosaicID
  
  var levy: js.UndefOr[MosaicId] = js.undefined
  
  var properties: js.UndefOr[js.Array[NameValue]] = js.undefined
}
object MosaicDefinition {
  
  inline def apply(description: String, id: MosaicID): MosaicDefinition = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MosaicDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MosaicDefinition] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setId(value: MosaicID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLevy(value: MosaicId): Self = StObject.set(x, "levy", value.asInstanceOf[js.Any])
    
    inline def setLevyUndefined: Self = StObject.set(x, "levy", js.undefined)
    
    inline def setProperties(value: js.Array[NameValue]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPropertiesVarargs(value: NameValue*): Self = StObject.set(x, "properties", js.Array(value*))
  }
}
