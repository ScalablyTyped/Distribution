package typings.typeorm.anon

import typings.typeorm.typeormStrings.from
import typings.typeorm.typeormStrings.join
import typings.typeorm.typeormStrings.other
import typings.typeorm.typeormStrings.select
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Metadata extends StObject {
  
  var metadata: js.UndefOr[typings.typeorm.entityMetadataMod.EntityMetadata] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var subQuery: js.UndefOr[String] = js.undefined
  
  var tablePath: js.UndefOr[String] = js.undefined
  
  var target: js.UndefOr[js.Function | String] = js.undefined
  
  var `type`: from | select | join | other
}
object Metadata {
  
  inline def apply(`type`: from | select | join | other): Metadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
  
  extension [Self <: Metadata](x: Self) {
    
    inline def setMetadata(value: typings.typeorm.entityMetadataMod.EntityMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSubQuery(value: String): Self = StObject.set(x, "subQuery", value.asInstanceOf[js.Any])
    
    inline def setSubQueryUndefined: Self = StObject.set(x, "subQuery", js.undefined)
    
    inline def setTablePath(value: String): Self = StObject.set(x, "tablePath", value.asInstanceOf[js.Any])
    
    inline def setTablePathUndefined: Self = StObject.set(x, "tablePath", js.undefined)
    
    inline def setTarget(value: js.Function | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setType(value: from | select | join | other): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
