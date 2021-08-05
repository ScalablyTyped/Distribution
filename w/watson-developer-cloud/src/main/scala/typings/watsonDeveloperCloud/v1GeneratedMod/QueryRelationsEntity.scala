package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** QueryRelationsEntity. */
trait QueryRelationsEntity extends StObject {
  
  /** If false, implicit querying is performed. The default is `false`. */
  var exact: js.UndefOr[Boolean] = js.undefined
  
  /** Entity text content. */
  var text: js.UndefOr[String] = js.undefined
  
  /** The type of the specified entity. */
  var `type`: js.UndefOr[String] = js.undefined
}
object QueryRelationsEntity {
  
  inline def apply(): QueryRelationsEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryRelationsEntity]
  }
  
  extension [Self <: QueryRelationsEntity](x: Self) {
    
    inline def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    inline def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
